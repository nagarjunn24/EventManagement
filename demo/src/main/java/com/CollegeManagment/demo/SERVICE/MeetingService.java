package com.CollegeManagment.demo.SERVICE;
import com.CollegeManagment.demo.ENTITY.Meeting;
import com.CollegeManagment.demo.REPOSITORY.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    public Meeting saveMeeting(Meeting meeting) {
        return meetingRepository.saveAll(meeting);
    }

    public List<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }

    public void deleteMeeting(Long id) {
        meetingRepository.deleteById(id);
    }
}
