package dev.kyle.daos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dev.kyle.entities.Coach;

public class CoachDAOLocal {

	private static CoachDAOLocal dao = null;
	
	private Map<Integer,Coach> coach_table = new HashMap<Integer,Coach>();
	private int count = 1;

	private CoachDAOLocal() {};
	
	public static CoachDAOLocal getCoachDAO() {
		if(dao == null) {
			dao = new CoachDAOLocal();
			return dao;
		} else {
			return dao;
		}
	}
	
	
	
	public Coach updateCoach(Coach coach) {
		coach_table.put(coach.getId(), coach);
		return coach;
	}
}
