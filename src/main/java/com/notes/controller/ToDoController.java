package com.notes.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import com.notes.model.NotesListViewModel;
import com.notes.model.NotesModel;
import com.notes.repository.ToDoRepository;
import com.notes.service.INoteService;


@Controller
public class ToDoController {

	
	@Autowired
	private ToDoRepository toDoRepository;
	
	
	public  ToDoController() {
		// TODO Auto-generated constructor stub
	}
	 @RequestMapping("/")
	    public String index(Model model) {
	        ArrayList<NotesModel> todoList = (ArrayList<NotesModel>) toDoRepository.findAll();
	        //model.addAttribute("items", todoList);
	        model.addAttribute("newitem", new NotesModel());
	        model.addAttribute("items", new NotesListViewModel(todoList));
	        return "index";
	    }

	    @RequestMapping("/add")
	    public String addTodo(@ModelAttribute NotesModel requestItem) {
	        NotesModel item = new NotesModel(requestItem.getCategory(), requestItem.getName());
	        toDoRepository.save(item);
	        return "redirect:/";
	    }

	    @RequestMapping("/update")
	    public String updateTodo(@ModelAttribute NotesListViewModel requestItems) {
	        for (NotesModel requestItem : requestItems.getTodoList() ) {
	             NotesModel item = new NotesModel(requestItem.getCategory(), requestItem.getName());
	             item.setComplete(requestItem.isComplete());
	             item.setId(requestItem.getId());
	             toDoRepository.save(item);
	        }
	        return "redirect:/";
	    }
}
