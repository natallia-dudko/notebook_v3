package edu.examples.java_classes.input.command.impl;

import java.util.List;
import java.util.Scanner;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

public class ConsoleFindItemByContent implements Command {

	NotebookLogic logic = new NotebookLogic();
	NotebookOutput notebookOutput = new NotebookOutput();
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute() {
		System.out.println("----------------------------------");
		System.out.println("Найти записи в блокноте");

		
		System.out.println("Введите название или содержание для поиска:");
		String title = sc.nextLine();
		
		List<Note> result = logic.find(title);
		
		if (result!=null) {
			notebookOutput.print("Запись найдена", result);
		
		} else {
			System.out.println("Запись не найдена");
		}
		
		System.out.println("----------------------------------");
	}
	
	

}
