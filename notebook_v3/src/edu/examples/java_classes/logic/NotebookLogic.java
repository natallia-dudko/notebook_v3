package edu.examples.java_classes.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.examples.java_classes.dao.NoteBookDao;
import edu.examples.java_classes.entity.Note;

public class NotebookLogic {
	
	private final NoteBookDao dao = new NoteBookDao();
	
	public void add(Note n) {
		//NoteBookDao dao = new NoteBookDao();
		
		dao.save(n);
	}
	
	public void add(String title, String content) {
		//NoteBookDao dao = new NoteBookDao();
		Note n = new Note(title, content);
		
		dao.save(n);
	}
	
	public List<Note> find(String text){
		List<Note> result = new ArrayList<Note>();
		
		//NoteBookDao dao = new NoteBookDao();
		List<Note> myNotes = dao.allNotes();
		
		for(Note n : myNotes) {
			if(isTextInNote(n, text)) {
				result.add(n);
				return result;
			} 
			
		}
		return null;
		
		/*
		for(int i=0; i<myNotes.size(); i++) {
			Note n = myNotes.get(i);
		}
		*/
		
	}
	
	private boolean isTextInNote(Note n, String text) {
		return n.getTitle().contains(text) || n.getContent().contains(text);
	}
	
	
	public List<Note> find(Date date){
		List<Note> result = new ArrayList<Note>();
		
		//NoteBookDao dao = new NoteBookDao();
		List<Note> myNotes = dao.allNotes();
		
		for(Note n : myNotes) {
			if(n.getD().equals(date)) {
				result.add(n);
				return result;
			}
		}
		
		// ...d1.equals(d2);
		
		return null;
		
	}
	

	public List<Note> allNotes(){
		return dao.allNotes();
	}

}
