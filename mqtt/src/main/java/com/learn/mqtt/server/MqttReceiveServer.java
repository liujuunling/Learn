package com.learn.mqtt.server;

import com.learn.mqtt.util.Json;
import org.springframework.stereotype.Service;

@Service
public interface MqttReceiveServer {

    Json handlerMqttMessage(String topic, String jsonData);


}
