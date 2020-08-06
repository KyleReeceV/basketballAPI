package dev.kyle.services;

import dev.kyle.daos.CoachDAO;
import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.entities.Coach;

public class CoachServiceImpl implements CoachService {
	private CoachDAO cDao = CoachDAOLocal.getCoachDAO();
	
	public Coach createCoach(Coach c) {
		return cDao.createCoach(c);
	}

}
