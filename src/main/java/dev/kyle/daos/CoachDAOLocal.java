package dev.kyle.daos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import dev.kyle.entities.Coach;

public class CoachDAOLocal implements CoachDAO {

	private static CoachDAO cDao = null;
	private CoachDAOLocal() {}
	public static CoachDAO getCoachDAO() {
		if(cDao == null) {
			cDao = new CoachDAOLocal();
		}
		return cDao;
	}
	
	private Map<Integer,Coach> coach_table = new HashMap<Integer,Coach>();
	private int count = 1;
	
	public Coach createCoach(Coach c) {
		c.setId(count);
		count++;
		coach_table.put(c.getId(), c);
		return c;
	}
	public Coach getCoachById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Set<Coach> getAllCoachs() {
		// TODO Auto-generated method stub
		return null;
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
