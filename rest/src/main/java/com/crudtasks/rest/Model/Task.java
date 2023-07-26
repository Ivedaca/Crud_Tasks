package com.crudtasks.rest.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TasksCrud")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String description;

}
