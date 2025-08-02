package com.example.spring_kadai_todo.service;

import org.springframework.stereotype.Service;

import com.example.spring_kadai_todo.repository.ToDoRepository;
import com.example.spring_kadai_todo.entity.ToDo;
import java.util.List;

@Service
public class ToDoService {
    private final ToDoRepository toDoRepository;

    // 依存性の注入(DI)を行う
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }
}
