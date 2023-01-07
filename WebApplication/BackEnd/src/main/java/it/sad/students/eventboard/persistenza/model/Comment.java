package it.sad.students.eventboard.persistenza.model;

import java.time.LocalDate;
import java.util.Date;

public class Comment {
    private Long id;
    private LocalDate date;
    private String message;

    //chiavi esterne
    private Long event;
    private Long person;

    public Comment() {
    }

    public Comment(Long id, LocalDate date, String message, Long person,Long event) {
        this.id = id;
        this.date = date;
        this.message = message;
        this.person = person;
        this.event = event;
    }

    public Long getEvent() {
        return event;
    }

    public void setEvent(Long event) {
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long person) {
        this.person = person;
    }
}
