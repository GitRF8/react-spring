package com.allstate.repositories;

import com.allstate.entities.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by localadmin on 2/17/17.
 */
public interface ITodoRepository extends CrudRepository<Todo, Integer> {
    Todo findByText(String text);
}
