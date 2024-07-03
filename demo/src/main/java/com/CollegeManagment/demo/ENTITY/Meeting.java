package com.CollegeManagment.demo.ENTITY;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "meetings")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meeting_name", nullable = false)
    private String meetingName;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private MeetingType type;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Time time;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters
    public enum MeetingType {
        ONLINE,
        OFFLINE
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(MeetingType type) {
        this.type = type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
