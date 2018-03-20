package com.kgfsl.eventapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgfsl.eventapp.Event;

@Repository("participantRepository")
public interface ParticpantRepo extends JpaRepository<Participants, Long> {

}