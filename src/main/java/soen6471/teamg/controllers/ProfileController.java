package soen6471.teamg.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import soen6471.teamg.models.Profile;

@RestController
public class ProfileController {
    @GetMapping("/profile")
    public Profile sample() {

        String raw = "{\"name\":\"Van Tuan Tran\",\"dob\":\"1990-01-01\",\"address\":\"Concordia University\",\"title\":\"Patient\",\"insurance\":true,\"previousVisits\":[{\"dateTime\":\"2020-05-30\",\"description\":\"Test for Corona virus\"},{\"dateTime\":\"2020-05-26\",\"description\":\"Flu, no medecine taken\"}]}";
        ObjectMapper mapper = new ObjectMapper();
        Profile profile = new Profile();
        try {
            profile = mapper.readValue(raw, Profile.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return profile;
    }
}