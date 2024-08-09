package com.library_project.library.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library_project.library.Entities.Users;

public interface UsersRepository extends JpaRepository<Integer, Users> {

}
