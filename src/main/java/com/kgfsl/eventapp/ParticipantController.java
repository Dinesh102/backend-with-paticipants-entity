package com.kgfsl.eventapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/participants")
public class ParticipantController {

    @Autowired
    private ParticpantService particpantService;

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<Participants>> all() {
        return new ResponseEntity<>(particpantService.getAll(), HttpStatus.OK);
        // return new ResponseEntity<>(particpantService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody Participants particpant, UriComponentsBuilder ucBuilder) {
        particpantService.save(particpant);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(particpant.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }
}