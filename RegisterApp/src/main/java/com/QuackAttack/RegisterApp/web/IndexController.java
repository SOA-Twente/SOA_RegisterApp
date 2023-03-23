package com.QuackAttack.RegisterApp.web;

import com.QuackAttack.RegisterApp.objects.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @PostMapping("/register")
    public HttpStatus register(User user) {

        // add to database


        // placeholder bool
        boolean success = true;

        // return status code
        if (success) {
            return HttpStatus.OK;
        } else {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }

    }


}
