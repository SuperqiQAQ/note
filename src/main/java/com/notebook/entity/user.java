package com.notebook.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="User")
public class user  {
	@Id
    @GeneratedValue
    private Long id;
    @Column(name = "created")
    private Long created = System.currentTimeMillis();
    @Column(name = "name")
	private String name;
    @Column(name = "age")
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString(){
		return "User{"+ "name =" +name+" age = "+age+"}" ;
	}

}
