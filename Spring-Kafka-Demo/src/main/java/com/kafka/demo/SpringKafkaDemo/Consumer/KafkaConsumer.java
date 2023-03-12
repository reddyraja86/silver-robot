package com.kafka.demo.SpringKafkaDemo.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "group_id")
    public void consumeMessage(String eventMessage) {
        LOGGER.info(String.format(" CONSUME MESSAGE -> %s", eventMessage));
    }
}
