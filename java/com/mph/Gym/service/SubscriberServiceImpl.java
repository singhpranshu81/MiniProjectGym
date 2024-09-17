package com.mph.Gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.Gym.entity.Subscriber;
import com.mph.Gym.repository.SubscriberRepository;

@Service
@Transactional
public class SubscriberServiceImpl implements SubscriberService {
	@Autowired
  private  SubscriberRepository subscriberRepository ;
	@Override
	public void addSubscriber(Subscriber t) {
		subscriberRepository.save(t);
		
	}

	@Override
	public List<Subscriber> getSubscriber() {
		
		return subscriberRepository.findAll();
	}

	@Override
	public Optional<Subscriber> getSubscriberById(int id) {
		
		return subscriberRepository.findById(id);
	}

	@Override
	public Subscriber updateSubscriber(int id,Subscriber t) {
		
		return subscriberRepository.updateById(t.getSname(), t.getSemail(), id);
	}

	@Override
	public void deleteSubscriber(int eid) {
		subscriberRepository.deleteById(eid);
	}

	
}
