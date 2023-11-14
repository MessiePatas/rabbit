package com.example.demo;
import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerTienda {


    private static final Logger LOGGER = LoggerFactory.getLogger(ListenerTienda.class);

    @RabbitListener(queues = "Co.edu.unisabana.tienda")
    public void atenderCliente(UserDTO userDTO){
        LOGGER.info(String.format("Received JSON message -> %s", userDTO.toString()));




    }

}
