package com.jcd.exercise;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "match")
public class Match implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false )
	private LocalDateTime matchDate;
	
	@Column(nullable = false , length = 60 , unique = true)
	private String stadiumName;
	
	@Column(nullable = false)
	private String refereeName;
	
	@ManyToMany(cascade = CascadeType.PERSIST , mappedBy = "match")
	private List<Team>team;
	

}
