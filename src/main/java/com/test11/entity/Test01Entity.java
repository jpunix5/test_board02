package com.test11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="test01")
@Data
public class Test01Entity {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//DB에서 사용하는 AUTO_INCREMENT 를 사용 하여 값 할당
	private long idx;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="writer")
	private String writer;
	
	@Column(name="id_num")
	private long id_num;

	public Test01Entity() {
		super();
	}
}
