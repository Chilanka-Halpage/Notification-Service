package com.csh.notificationservice.app.service;

import com.csh.notificationservice.app.model.Email;

public interface AppService {
    void sendEmail(Email email);
}
