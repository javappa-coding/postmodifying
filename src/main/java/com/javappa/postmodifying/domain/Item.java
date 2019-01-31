package com.javappa.postmodifying.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item extends AbstractEntity<Long> {

	@Column(length = 255)
	private String name;

	@Column(length = 4000)
	private String description;

	@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(name = "items_users", joinColumns = { @JoinColumn(name = "items_id") }, inverseJoinColumns = {
			@JoinColumn(name = "users_id") })
	private Set<User> users = new HashSet<User>();

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}