package goit.module131;

import goit.module131.note.Note;
import goit.module131.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module131Application {

    public static void main(String[] args) {
        SpringApplication.run(Module131Application.class, args);
//        NoteService noteService=new NoteService();
//        noteService.add(new Note());
//        System.out.println("noteService.listAll() = " + noteService.listAll());
    }

}
