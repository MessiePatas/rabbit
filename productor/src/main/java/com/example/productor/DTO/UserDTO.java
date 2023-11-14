package com.example.productor.DTO;

import lombok.Data;

@Data
public class UserDTO {


    private int id;
    private String firstName;
    private String lastName;

    public UserDTO(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public UserDTO() {
    }
}
