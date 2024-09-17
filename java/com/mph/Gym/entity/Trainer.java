package com.mph.Gym.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {
	@Id
	private int tid;
	private String name;
	private String email;
    private String gender;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int tid, String name, String email, String gender) {
		super();
		this.tid = tid;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
    
//    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL )
//	private List<Subscriber> subscriber;

}
