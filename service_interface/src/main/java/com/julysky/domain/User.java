package com.julysky.domain;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.Id;import lombok.Data;/** * Created by haoyifen on 2017/5/31 21:09. */@Entity@Datapublic class User {	@Id @GeneratedValue private Long id;	private String name;	private Integer age;	private User() {}	public User(String name, Integer age) {		this.name = name;		this.age = age;	}}