package com.example.repository;

import java.util.Collection;
import java.util.Optional;

import com.example.DTO.SubscriptionPlanDTO;
import com.example.entity.SubscriptionPlan;

public interface SubscriptionPlanRepository {

	Collection<SubscriptionPlanDTO> findAll();

	Optional<SubscriptionPlan> findById(Long subscriptionId);

	SubscriptionPlan save(SubscriptionPlan subcription);

}
