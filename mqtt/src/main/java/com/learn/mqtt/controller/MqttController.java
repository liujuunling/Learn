package com.learn.mqtt.controller;

import com.learn.mqtt.config.MqttGateways;
import com.learn.mqtt.config.MqttSenderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttController {


    static MqttSenderConfig mqttSenderConfig;

    @Autowired
    private MqttGateways mqttGateway;

    @RequestMapping(value = "/test/sendMqtt",method = RequestMethod.POST)
    public String sendMqtt(String  sendData){
        mqttGateway.sendToMqtt(sendData,"jqr");
        return "OK";
    }

    @RequestMapping(value = "/test/addListenTopic",method = RequestMethod.POST)
    public String addListenTopic(String[] topics){
        mqttSenderConfig.addListenTopic(topics);
        return "ok";
    }



}
