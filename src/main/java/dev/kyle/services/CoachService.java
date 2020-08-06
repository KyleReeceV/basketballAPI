package dev.kyle.services;

import dev.kyle.entities.Coach;
import java.util.Set;

public interface CoachService {

	Coach createCoach(Coach c);

	Coach getCoachById(int id);
	Set<Coach> getAllCoachs();
	Coach getCoachByName(String name);

	Coach updateCoach(Coach coach);
	boolean deleteCoach(Coach c);
	boolean deleteCoachById(int id);

}
