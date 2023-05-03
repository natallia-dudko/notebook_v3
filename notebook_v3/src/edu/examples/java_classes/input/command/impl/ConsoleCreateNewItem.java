package edu.examples.java_classes.input.command.impl;

import java.util.Date;
import java.util.Scanner;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleCreateNewItem implements Command {

	
	NotebookLogic logic = new NotebookLogic();
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute() {

		System.out.println("----------------------------------");
		System.out.println("Создание записи в блокноте");
		
		
		System.out.println("Введите название:");
		String title = sc.nextLine();

		
		System.out.println("Введите содержание:");
		String content = sc.nextLine();
		
		
		System.out.println("Введите дату создания в формате dd/mm/yyyy:");
		String dateInput = sc.nextLine();
		
		Date date = new Date(dateInput);
		
		Note addNote = new Note(title, content, date);
		
		logic.add(addNote);
		System.out.println("Запись добавлена");
		System.out.println("----------------------------------");

	}

}
