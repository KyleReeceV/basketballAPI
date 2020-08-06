package dev.kyle.daos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dev.kyle.entities.Coach;

public class CoachDAOLocal implements CoachDAO {
	
	private static CoachDAOLocal dao = null;
	
	private CoachDAOLocal() {};
	
	public static CoachDAOLocal getCoachDAO() {
		if(dao == null) {
			dao = new CoachDAOLocal();
			return dao;
		} else {
			return dao;
		}
	}
	
	private Map<Integer,Coach> coach_table = new HashMap<Integer,Coach>();
	private int count = 1;
	
	public Coach createCoach(Coach c) {
		// TODO Auto-generated method stub
		return null;
	}
	public Coach getCoachById(int id) {
		return coach_table.get(id);
	}
	public Set<Coach> getAllCoachs() {
		coach_table.values();
		Set<Coach> coaches = new HashSet<Coach>(coach_table.values());
		return coaches;
	}
	public Coach updateCoach(Coach c) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteCoach(Coach c) {
		// TODO Auto-generated method stub
		return false;
	}

}
