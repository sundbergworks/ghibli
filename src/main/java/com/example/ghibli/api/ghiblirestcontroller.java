package com.example.ghibli.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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


}
