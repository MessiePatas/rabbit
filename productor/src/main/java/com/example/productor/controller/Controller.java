package com.example.productor.controller;

import com.example.productor.DTO.UserDTO;
import com.example.productor.Productor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST )
public class Controller {

    private Productor jsonproductor;

    public Controller(Productor jsonproductor){

        this.jsonproductor= jsonproductor;
    }

    @PostMapping("/publicar")

    public ResponseEntity<String> enviarMensaje (@RequestBody UserDTO userDTO){
     jsonproductor.enviarMensaje(userDTO);
     return ResponseEntity.ok("json enviado a rabbit");
    }


}
