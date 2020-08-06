package dev.kyle.services;

import java.util.Set;

import dev.kyle.entities.Coach;

public interface CoachService {
	
	Coach getCoachById(int id);
	Set<Coach> getAllCoachs();
	Coach getCoachByName(String name);

}
