package com.mph.Gym.service;

import java.util.List;
import java.util.Optional;

import com.mph.Gym.entity.Subscriber;


public interface SubscriberService {
	   public void addSubscriber(Subscriber t);
	   public List<Subscriber> getSubscriber();
	   public Optional<Subscriber> getSubscriberById(int id);
	   public Subscriber updateSubscriber(int id,Subscriber t);
	   public void deleteSubscriber(int eid);
}
