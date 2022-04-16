package com.skilldistillery.csgoteams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.csgoteams.data.CSGOTeamDAO;
import com.skilldistillery.csgoteams.entities.Team;

@Controller
public class CSGOTeamController {
	
	@Autowired
	private CSGOTeamDAO teamDao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		List<Team> teams = teamDao.findAll();
		for(Team tlist : teams) {
		model.addAttribute("teams", teams);
		}
		return "home";
	}
	
	@RequestMapping(path="getTeam.do")
		public String showTeam(Integer id, Model model) {
		Team team = teamDao.findById(id);
		model.addAttribute("team", team);
		
		return "show";
	}
	
	
}
