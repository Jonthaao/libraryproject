package com.library_project.library.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library_project.library.Entities.Books;

public interface BooksRepository extends JpaRepository<Integer, Books> {

}