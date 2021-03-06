package com.skilldistillery.csgoteams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	@RequestMapping(path="addTeam.do")
		public String addTeam(Team team, Model model) {
		Team newTeam = teamDao.addTeam(team);
		model.addAttribute("team", newTeam);
		
		return "show";
	}
	
	@RequestMapping(path="deleteTeam.do", method=RequestMethod.POST)
		public String deleteTeam(int id) {
		Boolean deleted = teamDao.deleteTeam(id);
		
		return "show";
	}
	
	@RequestMapping(path="update.do", method=RequestMethod.GET)
		public String update(Model model, int id) {
		Team team = teamDao.findById(id);
		model.addAttribute("team", team);
		
		return "update";
	}
	
	@RequestMapping(path="updateTeam.do", method=RequestMethod.POST)
		public String update(int id, Team team, Model model) {
		Team newTeam = teamDao.updateTeam(id, team);
		model.addAttribute("team", newTeam);
		return "show";
	}
	
	

	

}
