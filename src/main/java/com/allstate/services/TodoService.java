package com.allstate.services;

import com.allstate.entities.Todo;
import com.allstate.repositories.ITodoRepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by localadmin on 2/17/17.
 */
@Service
public class TodoService {
    private ITodoRepository todoRepository;

    @Autowired
    public void setTodoRepository(ITodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(String text){
        Todo todo = new Todo(text);
        return this.todoRepository.save(todo);
    }

    public Todo findById(int id){
        return this.todoRepository.findOne(id);
    }

    public Todo findByText(String text) {
        return this.todoRepository.findByText(text);
    }
}
