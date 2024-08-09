package com.library_project.library.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library_project.library.Entities.Booking;

public interface BookingRepository extends JpaRepository<Integer, Booking> {

}