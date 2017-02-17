package com.allstate.controllers;

import com.allstate.entities.Todo;
import com.allstate.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by localadmin on 2/17/17.
 */
@RestController
public class TodoController {
    private TodoService todoService;

    @Autowired
    public void setTodoService(TodoService todoService) {this.todoService = todoService;}

    @RequestMapping(value = "/todos/{id}", method = RequestMethod.GET)
    public Todo getTodoByTodoId(@PathVariable(name = "id") int id){
        System.out.println("id: " + id);
        return this.todoService.findById(id);
    }

    @RequestMapping(value="/todos", method = RequestMethod.POST)
    public Todo createTodo(@RequestBody String todoTitle) {
        System.out.println("todoTitle: " + todoTitle);
        return this.todoService.create(todoTitle);
    }
}
