package com.skilldistillery.csgoteams.data;

import java.util.List;

import com.skilldistillery.csgoteams.entities.Team;

public interface CSGOTeamDAO {

	
	public Team findById(int teamId);
	
	public List<Team> findAll();

	public Team addTeam(Team t);
}
