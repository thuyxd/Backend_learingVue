package com.thuynt_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuynt_app.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findByPublished(boolean published);

	Task save(Task task);

//	List<Task> findByTask_name(String task_name);

}
