package com.mph.Gym.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Subscriber {
	@Id
        private int sid;
        private String sname;
        private String semail;
        
        @ManyToOne
        @JoinColumn(name="tid", referencedColumnName="TID")
        public Trainer trainer;
        
		public Subscriber() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Subscriber(int sid, String sname, String semail, Trainer trainer) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.semail = semail;
			this.trainer = trainer;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSemail() {
			return semail;
		}
		public void setSemail(String semail) {
			this.semail = semail;
		}
		public Trainer getTrainer() {
			return trainer;
		}
		public void setTrainer(Trainer trainer) {
			this.trainer = trainer;
		}
		@Override
		public String toString() {
			return "Subscriber [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", trainer=" + trainer + "]";
		}
        
        
}
