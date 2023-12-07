package Assignment.RabbitQM.consumer;

import Assignment.RabbitQM.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger logger = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consumeJsonMessage(User user) {
        logger.info(String.format("Json Message received: %s", user.toString()));
    }
}
