package org.example.todolist.repository;

import org.example.todolist.entity.Task;
import org.example.todolist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
