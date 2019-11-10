package com.notes.service;

import java.util.List;

import com.notes.model.NotesModel;

public interface INoteService {

	List<NotesModel> findAll();
	
}
