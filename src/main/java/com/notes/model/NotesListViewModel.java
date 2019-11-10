package com.notes.model;

import java.util.ArrayList;

import javax.validation.Valid;


public class NotesListViewModel {
	@Valid
	private ArrayList<NotesModel> todoList = new ArrayList<NotesModel>();
	
	public NotesListViewModel() {
		
	}
	
	public NotesListViewModel(ArrayList<NotesModel> todoList) {
		this.todoList = todoList;
	}

	public ArrayList<NotesModel> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<NotesModel> todoList) {
		this.todoList = todoList;
	}
}
