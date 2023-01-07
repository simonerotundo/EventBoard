package it.sad.students.eventboard;

import it.sad.students.eventboard.persistenza.DBManager;
import it.sad.students.eventboard.persistenza.model.Event;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventBoardApplication.class, args);


		//DemoData demoData=new DemoData();

	}

}
