package com.mph.Gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mph.Gym.entity.Subscriber;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer>{
	@Modifying
	@Query("update Subscriber u set u.sname = ?1, u.semail = ?2  where u.sid = ?3")
	public Subscriber updateById(String name, String email, int userId);

}
