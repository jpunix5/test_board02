package com.test11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="test02")
@Data
public class Test02Entity {
	@Column(name="id_num")
	private int id_num;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="etc")
	private String etc;
}
