package com.skilldistillery.csgoteams.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer rank;

	@Column(name = "average_age")
	private float averageAge;

	private String coach;

	@Column(name = "star_player")
	private String starPlayer;

	public Team() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public float getAverageAge() {
		return averageAge;
	}

	public void setAverageAge(float averageAge) {
		this.averageAge = averageAge;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getStarPlayer() {
		return starPlayer;
	}

	public void setStarPlayer(String starPlayer) {
		this.starPlayer = starPlayer;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Team Id= " + id + ", Name= " + name + ", Rank= #" + rank + ", Average Age= " + averageAge + ", Coach= "
				+ coach + ", Star Player= " + starPlayer;
	}

}
