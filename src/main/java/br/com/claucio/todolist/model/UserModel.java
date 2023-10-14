package br.com.claucio.todolist.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_user")
public class UserModel {
    

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    private String name;
    private String username;
    private String password;


}
