package com.zaurtregulov.spring.hibernate.many_to_many.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "section")
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	@JoinTable(name="child_section",
			joinColumns = @JoinColumn(name="section_id"),
			inverseJoinColumns = @JoinColumn(name="child_id"))
	private List<Child> children;
	
	public void addChildToSection(Child child) {
		if (children == null) {
			children = new ArrayList<Child>();
		}
		children.add(child);
	}
	
	public List<Child> getChildren() {
		return children;
	}
	
	public Section() {

	}

	public Section(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Section [id=" + id + ", name=" + name + "]";
	}
}
