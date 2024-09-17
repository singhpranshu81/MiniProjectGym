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

import com.mph.Gym.entity.Subscriber;
import com.mph.Gym.service.SubscriberService;


@RestController
@RequestMapping("/gym/subscriber")
public class SubscriberController {
	  @Autowired
		private SubscriberService   subscriberService;
	  @PostMapping("/add")
		public ResponseEntity<Subscriber> createEmployee(@RequestBody Subscriber t) {
		  subscriberService.addSubscriber(t);
			return ResponseEntity.ok(t);
		}

		@GetMapping("/all")
		public ResponseEntity<List<Subscriber>> getAllEmployee() {
			List<Subscriber> l = subscriberService.getSubscriber();
			return ResponseEntity.ok(l);
		}

		@PutMapping("/update/{id}")
		public ResponseEntity<Subscriber> updateEmployee(@PathVariable int id,@RequestBody Subscriber t) {
			Subscriber up = subscriberService.updateSubscriber(id, t);
			return ResponseEntity.ok(up);
		}

		@DeleteMapping("delete/{eid}")
		public ResponseEntity<String> deleteEmployee(@PathVariable int eid) {
			subscriberService.deleteSubscriber(eid);
			return ResponseEntity.ok("Employee " + eid + "deleted..");
		}
		@GetMapping("/find/{id}")
		public ResponseEntity<Optional<Subscriber> > getEmployee(@PathVariable int id) {
			Optional<Subscriber>  t = subscriberService.getSubscriberById(id);
			return ResponseEntity.ok(t);
		}
}
