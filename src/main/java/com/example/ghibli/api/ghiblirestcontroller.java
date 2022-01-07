package com.example.ghibli.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ghiblirestcontroller {

    @GetMapping("/getAllFilms")
        String getAllFilms() throws JsonProcessingException {

        // Get call tp ghibli api , return as string

        // to make a get call we need a rest template object
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://ghibliapi.herokuapp.com/films";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

        return response.getBody();



    }
    @GetMapping("/getById/{id}")
    public String getFilmById(@PathVariable("id") String filmId) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://ghibliapi.herokuapp.com/films/" + filmId;
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

        return response.getBody();
    }

    @GetMapping("/getAllPeople")
    String getAllPeople() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://ghibliapi.herokuapp.com/people";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

        return response.getBody();

    }

    @GetMapping("/getByPersonId/{id}")
    public String getByPersonId(@PathVariable("id") String personId) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://ghibliapi.herokuapp.com/people/" + personId;
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

        return response.getBody();

    }


}
