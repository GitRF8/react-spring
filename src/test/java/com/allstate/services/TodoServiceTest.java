package com.allstate.services;

import com.allstate.entities.Todo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 2/17/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class TodoServiceTest {
    @Autowired
    private TodoService todoService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateNewTodo() throws Exception {
        Todo todo = this.todoService.create("raf is awesome");
        assertEquals(4, todo.getId());
        assertEquals("raf is awesome", todo.getText());
        assertFalse(todo.isCompleted());
    }

    @Test
    public void shouldFindWithId() throws Exception {
        Todo todo = this.todoService.findById(2);
        assertEquals(2, todo.getId());
        assertEquals("this is Rafs todo", todo.getText());
        assertFalse(todo.isCompleted());
    }

    @Test
    public void shouldFindWithText() throws Exception {
        Todo before = this.todoService.create("easyy");
        Todo after = this.todoService.findByText("easyy");
        assertEquals("easyy", after.getText());
        assertEquals(4, after.getId());
    }
}
