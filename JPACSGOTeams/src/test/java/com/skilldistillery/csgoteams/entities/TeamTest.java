package com.skilldistillery.csgoteams.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamTest {
	
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Team csgoteam;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPACSGOTeams");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		csgoteam = em.find(Team.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		csgoteam = null;
	
	}

	@Test
	void test_CSGOTeam_entity_mapping() {
		assertNotNull(csgoteam);
		assertEquals("TEST2", csgoteam.getName());
	}

}
