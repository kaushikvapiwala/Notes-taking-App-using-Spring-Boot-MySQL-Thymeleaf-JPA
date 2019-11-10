package com.notes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.notes.model.NotesModel;

@Repository
public interface ToDoRepository extends CrudRepository<NotesModel, Long> {

}
