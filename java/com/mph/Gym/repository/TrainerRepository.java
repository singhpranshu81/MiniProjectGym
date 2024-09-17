package com.mph.Gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mph.Gym.entity.Trainer;


@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
	@Modifying
	@Query("update Trainer u set u.name = ?1, u.email = ?2  where u.tid = ?3")
	public Trainer updateById(String name, String email, int userId);
}
