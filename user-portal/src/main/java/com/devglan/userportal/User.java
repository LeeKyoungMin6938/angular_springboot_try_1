package com.devglan.userportal;

import javax.persistence.*;

@Entity //엔티티 클래스임을 지정하며, 테이블과 매핑된다.
@Table(name = "user") //엔티티가 매핑될 테이블을 지정하고, 생략시 엔티티 클래스 이름과
//같은 테이블로 매핑된다. 
public class User {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY) //primary key를 의미. IDENTITY는 기본 키 생성을 데이터베이스에 위임하는 방법이다.
	private int id;
	@Column //속성(attribute). 열(Column)을 의미함.
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
