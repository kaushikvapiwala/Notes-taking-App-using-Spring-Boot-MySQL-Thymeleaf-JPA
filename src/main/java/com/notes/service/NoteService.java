package com.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.model.NotesModel;
import com.notes.repository.ToDoRepository;

@Service
public class NoteService implements INoteService {

	@Autowired
	private ToDoRepository repository;
	
	@Override
	public List<NotesModel> findAll() {
		// TODO Auto-generated method stub
		return (List<NotesModel>) repository.findAll();
	}
	
}
