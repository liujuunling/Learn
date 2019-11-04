package com.learn.mqtt.server;

import com.learn.mqtt.util.ResultUtil;
import org.springframework.stereotype.Service;

@Service
public interface MqttReceiveServer {

    ResultUtil handlerMqttMessage(String topic,String jsonData);


}
