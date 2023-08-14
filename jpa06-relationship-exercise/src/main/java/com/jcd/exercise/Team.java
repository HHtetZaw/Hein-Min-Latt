package com.jcd.exercise;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "team")
public class Team implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false , length = 60)
	private String name;
	
	@Column(nullable = false )
	private Double networth;
	
	@Column(length = 60)
	private String  sponsors;
	
	@OneToMany(mappedBy = "team")
	private List<Player> player ;
	
	@ManyToMany 
	private List<Match>match;
	
}
