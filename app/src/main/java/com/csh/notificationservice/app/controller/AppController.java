package com.csh.notificationservice.app.controller;

import com.csh.notificationservice.app.model.Email;
import com.csh.notificationservice.app.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/app")
public class AppController {
    private final AppService appService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody Email email) {
        appService.sendEmail(email);
        return ResponseEntity.ok().build();
    }
}
