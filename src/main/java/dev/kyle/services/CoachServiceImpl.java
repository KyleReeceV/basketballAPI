package dev.kyle.services;

import dev.kyle.daos.CoachDAO;
import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.daos.PlayerDAO;
import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Coach;

public class CoachServiceImpl {
	
	
	private static CoachDAO cdao = CoachDAOLocal.getCoachDAO(); // we already have our basic CRUD operations
	private static PlayerDAO pdao = PlayerDAOLocal.getPlayerDAO();
	
	public Coach updateCoach(Coach coach) {		
		return cdao.updateCoach(coach);
	}
	
	
	

}
