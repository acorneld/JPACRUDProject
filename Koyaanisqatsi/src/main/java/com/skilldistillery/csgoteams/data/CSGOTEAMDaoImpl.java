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

	@Override
	public Boolean deleteTeam(int id) {
		boolean deleted = false;
		Team team = em.find(Team.class, id);
		if(team != null) {
			em.remove(team);
		}
		em.flush();
		deleted = !em.contains(team);
		return deleted;
	}
	
	@Override
	public Team updateTeam(int id, Team team) {
		Team updated = em.find(Team.class, id);
		updated.setName(team.getName());
		updated.setRank(team.getRank());
		updated.setAverageAge(team.getAverageAge());
		updated.setCoach(team.getCoach());
		updated.setStarPlayer(team.getStarPlayer());
		em.flush();
		return updated;
	}

}
