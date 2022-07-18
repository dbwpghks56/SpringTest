package com.kosta.myapp.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Table(name = "test2")
@Builder
@Entity
public class testVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tNO;
	
	private String tname;
}
