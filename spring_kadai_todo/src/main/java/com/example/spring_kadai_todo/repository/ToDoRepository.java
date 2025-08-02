package com.example.spring_kadai_todo.repository;

import com.example.spring_kadai_todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
    // 全ToDoを取得
    List<ToDo> findAll();
}