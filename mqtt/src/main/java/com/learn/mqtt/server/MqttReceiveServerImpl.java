package com.learn.mqtt.server;

import com.learn.mqtt.util.Json;
import org.springframework.stereotype.Service;

@Service
public class MqttReceiveServerImpl implements MqttReceiveServer {


    @Override
    public Json handlerMqttMessage(String topic, String jsonData) {
        //根据监听到的主题数据  进行业务处理
        System.out.println("this topic is ： "+topic+" ,this data : "+jsonData);
        return null;
    }
}
