package com.skilldistillery.csgoteams.data;

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

}
