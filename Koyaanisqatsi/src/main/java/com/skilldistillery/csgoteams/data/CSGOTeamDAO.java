package com.skilldistillery.csgoteams.data;

import com.skilldistillery.csgoteams.entities.Team;

public interface CSGOTeamDAO {
	Team findById(int teamId);
}
