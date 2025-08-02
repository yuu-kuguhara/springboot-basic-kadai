package com.example.spring_kadai_todo.controller;

import org.springframework.stereotype.Controller;
import com.example.spring_kadai_todo.service.ToDoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;
import com.example.spring_kadai_todo.entity.ToDo;

@Controller
@RequestMapping("/todos")
public class ToDoController {
    private final ToDoService toDoServive;

    public ToDoController(ToDoService toDoServive) {
        this.toDoServive = toDoServive;
    }

    @GetMapping
    public String getAllToDos(Model model) {
        // 全ToDoを取得
        List<ToDo> todos = toDoServive.getAllToDos();
        // モデルにToDoリストを追加
        model.addAttribute("todos", todos);
        // ビュー名を返す
        return "todoView";
    }
}
