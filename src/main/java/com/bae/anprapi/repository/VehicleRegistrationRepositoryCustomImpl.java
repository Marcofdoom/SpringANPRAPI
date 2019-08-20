package com.bae.anprapi.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.anprapi.model.VehicleRegistration;

@Repository
public class VehicleRegistrationRepositoryCustomImpl implements VehicleRegistrationRepositoryCustom {

	private EntityManager entityManager;

	@Autowired
	public VehicleRegistrationRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<VehicleRegistration> findANPR(String forenames, String surname, String homeAddress, Date dateOfBirth) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<VehicleRegistration> cq = cb.createQuery(VehicleRegistration.class);

		Root<VehicleRegistration> citizen = cq.from(VehicleRegistration.class);
		List<Predicate> predicates = new ArrayList<Predicate>();

		if (forenames != null && !forenames.trim().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("forenames")), forenames.toLowerCase()));
		}

		if (surname != null && !surname.trim().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("surname")), surname.toLowerCase()));
		}

		if (homeAddress != null && !homeAddress.trim().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("homeAddress")), homeAddress.toLowerCase()));
		}

		if (dateOfBirth != null && !dateOfBirth.toString().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("dateOfBirth")), dateOfBirth));
		}

		if (predicates.isEmpty()) {
			return new ArrayList<VehicleRegistration>();
		}

		cq.where(predicates.toArray(new Predicate[0]));

		TypedQuery<VehicleRegistration> query = entityManager.createQuery(cq);

		return query.getResultList();
	}
}