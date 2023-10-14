package br.com.claucio.todolist.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.claucio.todolist.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,UUID>{
    
}
