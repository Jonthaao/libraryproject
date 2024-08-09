package com.library_project.library.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library_project.library.Entities.Stock;

public interface StockRepository extends JpaRepository<Integer, Stock> {

}
