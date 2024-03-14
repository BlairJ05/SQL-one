package com.example.demoEvent.event;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Event {
    @Id
    @SequenceGenerator(
            name= "event_sequence",
            sequenceName= "event_sequence",
            allocationSize= 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "event_sequence"
    )
    private Long id;
    private String eventName;
    private String contactInfo;
    private LocalDate eventDate;


    public Event() {
    }

    public Event(Long id, String eventName, String contactInfo, LocalDate eventDate) {
        this.id = id;
        this.eventName = eventName;
        this.contactInfo = contactInfo;
        this.eventDate = eventDate;

    }

    public Event(String eventName, String contactInfo, LocalDate eventDate) {
        this.eventName = eventName;
        this.contactInfo = contactInfo;
        this.eventDate = eventDate;

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getEventName() {

        return eventName;
    }

    public void setEventName(String eventName) {

        this.eventName = eventName;
    }

    public String getContactInfo() {

        return contactInfo;
    }

    public void getContactInfo(String contactInfo) {

        this.contactInfo = contactInfo;
    }

    public LocalDate getEventDate() {

        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {

        this.eventDate = eventDate;
    }


    @Override
    public String toString() {
        return "event{" +
                "id=" + id +
                ", event name='" + eventName + '\'' +
                ", contact info='" + contactInfo + '\'' +
                ", event date=" + eventDate +
                '}';
    }

    public void setContactInfo(String contactInfo) {
    }
}