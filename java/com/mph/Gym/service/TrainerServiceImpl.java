package com.mph.Gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.Gym.entity.Trainer;
import com.mph.Gym.repository.TrainerRepository;

@Service
@Transactional
public class TrainerServiceImpl implements TrainerService{
   @Autowired
	private TrainerRepository trainerRepository;
	
	@Override
	public void addTrainer(Trainer t) {
		trainerRepository.save(t);
	}

	@Override
	public List<Trainer> getAllTrainer() {
		
		return trainerRepository.findAll();
	}

	@Override
	public Optional<Trainer> getTrainerById(int id) {
		// TODO Auto-generated method stub
		return trainerRepository.findById(id);
	}

	@Override
	public Trainer updateTrainer(int id, Trainer t) {
		
		return trainerRepository.updateById(t.getName(), t.getEmail(), id);
	}

	@Override
	public void deleteTrainer(int eid) {
		// TODO Auto-generated method stub
		trainerRepository.deleteById(eid);
	}

}
