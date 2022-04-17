package com.skilldistillery.csgoteams.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.csgoteams.entities.Team;

@Service
@Transactional
public class CSGOTEAMDaoImpl implements CSGOTeamDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Team findById(int teamId) {

		return em.find(Team.class, teamId);
	}

	@Override
	public List<Team> findAll() {
		String jpql = "SELECT t FROM Team t";

		return em.createQuery(jpql, Team.class).getResultList();
	}

//	@Override
//	public Team create(Team team) {
//		// start a transaction
//		em.getTransaction().begin();
//
//		System.out.println("BEFORE: " + team);
//
//		em.persist(team);
//
//		System.out.println("AFTER: " + team);
//
//		em.flush();
//
//		// end a transaction
//		em.getTransaction().commit();
//		return team;
//	}

	@Override
	public Team addTeam(Team team) {
		em.persist(team);
		return team;
	}

}
