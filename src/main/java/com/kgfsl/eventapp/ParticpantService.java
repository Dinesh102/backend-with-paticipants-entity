package com.kgfsl.eventapp;

import java.util.List;

import com.kgfsl.eventapp.Event;

public interface ParticpantService {

    public List<Participants> getAll();

    public Participants save(Participants participants);

    // public Event find(long id);

    // public void delete(Long id);

}