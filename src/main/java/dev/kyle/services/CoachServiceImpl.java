package dev.kyle.services;

import java.util.Set;
import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.entities.Coach;

public class CoachServiceImpl implements CoachService {
	private CoachDAO cdao = CoachDAOLocal.getCoachDAO();
	
	public Coach createCoach(Coach c) {
		return cdao.createCoach(c);
  }
  
	public Coach getCoachById(int id) {
		return cdao.getCoachById(id);
	}
  
	public Set<Coach> getAllCoachs() {
		return cdao.getAllCoachs();
	}

	public Coach getCoachByName(String name) {		
		for(Coach c : cdao.getAllCoachs()) {
			if(c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

}
