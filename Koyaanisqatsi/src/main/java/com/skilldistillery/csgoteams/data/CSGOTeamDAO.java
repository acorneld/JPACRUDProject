package com.skilldistillery.csgoteams.data;

import java.util.List;

import com.skilldistillery.csgoteams.entities.Team;

public interface CSGOTeamDAO {

	
	Team findById(int teamId);
	
	List<Team> findAll();
}
