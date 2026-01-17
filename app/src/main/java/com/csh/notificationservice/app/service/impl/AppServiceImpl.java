package com.csh.notificationservice.app.service.impl;

import com.csh.notificationservice.app.config.RabbitMQProperties;
import com.csh.notificationservice.app.model.Email;
import com.csh.notificationservice.app.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppServiceImpl implements AppService {
    private final RabbitTemplate rabbitTemplate;
    private final RabbitMQProperties rabbitMQProperties;

    @Override
    public void sendEmail(Email email) {
        rabbitTemplate.convertAndSend(rabbitMQProperties.getExchange(), rabbitMQProperties.getRoutingKey(), email);
    }
}
