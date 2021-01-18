package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Task;

@Repository
public interface TaskDao extends CrudRepository<Task, Integer>{

}
