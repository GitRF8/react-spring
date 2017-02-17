package com.allstate.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by localadmin on 2/17/17.
 */
@Entity
@Table(name = "todos")
@Data
public class Todo {

//    public Todo() {
//    }

    public Todo(String text) {
        this.text = text;
    }

    @Id
    @GeneratedValue
    private int id;

    @Version
    private int version;

    @NotNull
    private String text;

    @NotNull
    private boolean completed;

    @CreationTimestamp
    private Date created;

    @UpdateTimestamp
    private Date modified;
}
