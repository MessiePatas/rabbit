package com.example.productor;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import com.example.productor.DTO.UserDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;




@Service
public class Productor {

    RabbitTemplate rabbitTemplate;

    public Productor(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Productor.class);

    public void enviarMensaje(UserDTO userDTO){
        LOGGER.info(String.format("Json message sent -> %s", userDTO.toString()));

        rabbitTemplate.convertAndSend("filaTienda","compras", userDTO);

    }
}
