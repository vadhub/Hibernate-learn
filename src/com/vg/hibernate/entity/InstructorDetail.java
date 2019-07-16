package com.vg.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "youtube-chennel")
	private String youtubeChennel;
	
	@Column(name = "hobby")
	private String hobby;
	
	public InstructorDetail() {}

	public InstructorDetail(String youtubeChennel, String hobby) {
		super();
		this.youtubeChennel = youtubeChennel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChennel() {
		return youtubeChennel;
	}

	public void setYoutubeChennel(String youtubeChennen) {
		this.youtubeChennel = youtubeChennen;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChennen=" + youtubeChennel + ", hobby=" + hobby + "]";
	}
	

}
