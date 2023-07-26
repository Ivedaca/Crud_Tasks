package com.crudtasks.rest.Repository;

import com.crudtasks.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Task, Long> {
}
