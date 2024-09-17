package com.mph.Gym.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.Gym.entity.Trainer;
import com.mph.Gym.service.TrainerService;

@RestController
@RequestMapping("/gym/trainer")
public class TrainerController {
  @Autowired
	private TrainerService trainerService ;
  
  @PostMapping("/add")
	public ResponseEntity<Trainer> createEmployee(@RequestBody Trainer t) {
	  trainerService.addTrainer(t);
		return ResponseEntity.ok(t);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Trainer>> getAllEmployee() {
		List<Trainer> l = trainerService.getAllTrainer();
		return ResponseEntity.ok(l);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Trainer> updateEmployee(@PathVariable int id,@RequestBody Trainer t) {
		Trainer up = trainerService.updateTrainer(id, t);
		return ResponseEntity.ok(up);
	}

	@DeleteMapping("delete/{eid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int eid) {
		trainerService.deleteTrainer(eid);
		return ResponseEntity.ok("Employee " + eid + "deleted..");
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Trainer> > getEmployee(@PathVariable int id) {
		Optional<Trainer>  t = trainerService.getTrainerById(id);
		return ResponseEntity.ok(t);
	}
}
