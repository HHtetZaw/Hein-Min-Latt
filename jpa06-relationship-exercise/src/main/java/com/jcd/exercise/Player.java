package com.jcd.exercise;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "player")
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, length = 30)
	private String name;
	
	@Column(nullable=false)
	private double weight;
	
	@Column(nullable=false)
	private double height;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = true)
	private double wage;
	
	@ManyToOne
	private Team team;
	
	public enum Role{
		Attacker , MiddleFielder , Defender , Goalkeeper
	}
	

}


