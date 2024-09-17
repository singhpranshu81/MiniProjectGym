package com.mph.Gym.service;

import java.util.List;
import java.util.Optional;

import com.mph.Gym.entity.Trainer;

public interface TrainerService {
   public void addTrainer(Trainer t);
   public List<Trainer> getAllTrainer();
   public Optional<Trainer>  getTrainerById(int id);
   public Trainer updateTrainer(int id,Trainer t);
   public void deleteTrainer(int eid);
}
