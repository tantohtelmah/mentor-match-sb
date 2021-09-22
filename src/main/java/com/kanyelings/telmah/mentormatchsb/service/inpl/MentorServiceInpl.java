package com.kanyelings.telmah.mentormatchsb.service.inpl;

import com.kanyelings.telmah.mentormatchsb.entity.MentorEntity;
import com.kanyelings.telmah.mentormatchsb.repository.MentorRepository;
import com.kanyelings.telmah.mentormatchsb.service.MentorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MentorServiceInpl implements MentorService {

    private final MentorRepository mentorRepository;

    @Override
    public List<MentorEntity> getAllMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public void addNewMentor(MentorEntity newMentor) {
        mentorRepository.save(newMentor);
    }
}
