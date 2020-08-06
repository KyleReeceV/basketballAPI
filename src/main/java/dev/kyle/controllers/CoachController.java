package dev.kyle.controllers;

import dev.kyle.entities.Coach;
import dev.kyle.services.CoachService;
import dev.kyle.services.CoachServiceImpl;
import io.javalin.http.Handler;
import com.google.gson.Gson;

public class CoachController {
	
	public static CoachService cserv = new CoachServiceImpl();
	private static Gson gson = new Gson();
	
	public static Handler updateCoach = (ctx)->{
		String coachJson = ctx.body();
		Coach coach = gson.fromJson(coachJson, Coach.class);
		cserv.updateCoach(coach);	
		ctx.result(gson.toJson(coach));
	};
	

}
