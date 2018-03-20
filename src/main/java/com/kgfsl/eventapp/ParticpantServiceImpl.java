package com.kgfsl.eventapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("participantService")
public class ParticpantServiceImpl implements ParticpantService {

    @Autowired
    private ParticpantRepo particpantRepo;

    @Override
    public List<Participants> getAll() {
        // TODO Auto-generated method stub
        return particpantRepo.findAll();
    }

    @Override
    public Participants save(Participants participants) {
        // TODO Auto-generated method stub
        return particpantRepo.saveAndFlush(participants);

    }
}

