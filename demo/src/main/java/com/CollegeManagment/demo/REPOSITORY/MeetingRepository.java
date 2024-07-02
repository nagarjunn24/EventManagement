package com.CollegeManagment.demo.REPOSITORY;
import com.CollegeManagment.demo.ENTITY.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository<Meeting> extends JpaRepository<Meeting, Long> {
    com.CollegeManagment.demo.ENTITY.Meeting saveAll(com.CollegeManagment.demo.ENTITY.Meeting meeting);
}
