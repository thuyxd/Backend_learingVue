package com.thuynt_app.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "task_name")
	private String task_name;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;
	
	@Column(name = "start_date")
	private String start_date;
	
	@Column(name = "end_date")
	private String end_date;

	public Task() {
		super();
	}

	public Task(String task_name, String description, boolean published, String start_date, String end_date) {
		super();
		this.id = id;
		this.task_name = task_name;
		this.description = description;
		this.published = published;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", task_name=" + task_name + ", description=" + description + ", published="
				+ published + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	

}
