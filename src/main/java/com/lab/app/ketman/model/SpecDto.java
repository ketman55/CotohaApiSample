package com.lab.app.ketman.model;

public class SpecDto {
	Double maxSpeed;
	Double acceleration;
	Double cornering;
	Double runaway;
	Double parallelRunning;

	public SpecDto() {
		maxSpeed = 0.5;
		acceleration = 0.5;
		cornering = 0.5;
		runaway = 0.5;
		parallelRunning = 0.5;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Double getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(Double acceleration) {
		this.acceleration = acceleration;
	}
	public Double getCornering() {
		return cornering;
	}
	public void setCornering(Double cornering) {
		this.cornering = cornering;
	}
	public Double getRunaway() {
		return runaway;
	}
	public void setRunaway(Double runaway) {
		this.runaway = runaway;
	}
	public Double getParallelRunning() {
		return parallelRunning;
	}
	public void setParallelRunning(Double parallelRunning) {
		this.parallelRunning = parallelRunning;
	}

	public void updateAllStatus(
			Double maxSpeed,
			Double acceleration,
			Double cornering,
			Double runaway,
			Double parallelRunning) {
		this.maxSpeed += maxSpeed;
		this.acceleration += acceleration;
		this.cornering += cornering;
		this.runaway += runaway;
		this.parallelRunning += parallelRunning;
	}
}
