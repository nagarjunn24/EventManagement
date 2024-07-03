package com.CollegeManagment.demo.REPOSITORY;

import com.CollegeManagment.demo.ENTITY.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}
