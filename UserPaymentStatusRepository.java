package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DTO.UserPaymentStatusDTO;
import com.example.entity.UserPaymentStatus;

@Repository
public interface UserPaymentStatusRepository extends JpaRepository{
	Optional<UserPaymentStatus> findByUserId(Long id);

}