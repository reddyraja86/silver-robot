package com.kafka.demo.SpringKafkaDemo.Producer;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

@Data
@AllArgsConstructor
public class MyEventHandler implements EventHandler {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MyEventHandler.class);
    private KafkaTemplate<String, String> kafkaTemplate;
    private String topicName;

    @Override
    public void onOpen() throws Exception {

    }

    @Override
    public void onClosed() throws Exception {

    }

    @Override
    public void onMessage(String event, MessageEvent messageEvent) throws Exception {
        LOGGER.info(String.format("PUBLISH DATA -> %s", messageEvent.getData()));
        kafkaTemplate.send(topicName, messageEvent.getData());
    }

    @Override
    public void onComment(String comment) throws Exception {

    }

    @Override
    public void onError(Throwable t) {

    }
}
