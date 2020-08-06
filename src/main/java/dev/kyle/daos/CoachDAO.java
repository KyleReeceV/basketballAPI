package dev.kyle.daos;

import java.util.Set;

import dev.kyle.entities.Coach;

public interface CoachDAO {

	Coach createCoach(Coach c);
	
	Coach getCoachById(int id);
	Set<Coach> getAllCoachs();
	
	Coach updateCoach(Coach c);
	
	boolean deleteCoach(Coach c);
}
