package com.spring.model;

import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WorkSchedule")
public class WorkSchedule {
	@Id
	@GeneratedValue  
	@Column(name="workScheduleId")
	private Integer workScheduleId;
	
	@Column(name="day")
	private DayOfWeek day;
	
	@Column(name="startTime")
	private LocalTime startTime;
	
	@Column(name="endTime")
	private LocalTime endTime;
	
	@ManyToOne
    @JoinColumn(name="customerId", nullable=false)
	private Trainer trainer;
	
	public WorkSchedule() {}
	
	public WorkSchedule(Integer workScheduleId, DayOfWeek day, LocalTime startTime,
			LocalTime endTime, Trainer trainer) {
		super();
		this.workScheduleId = workScheduleId;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.trainer = trainer;
	}
	
	/* Start of getters & setters */
	public Integer getWorkScheduleId() {
		return workScheduleId;
	}
	public void setWorkScheduleId(Integer workScheduleId) {
		this.workScheduleId = workScheduleId;
	}
	public DayOfWeek getDay() {
		return day;
	}
	public void setDay(DayOfWeek day) {
		this.day = day;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	/* End of getters & setters */
}
