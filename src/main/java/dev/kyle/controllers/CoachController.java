package dev.kyle.controllers;


import java.util.Set;
import dev.kyle.entities.Coach;
import dev.kyle.services.CoachService;
import dev.kyle.services.CoachServiceImpl;
import io.javalin.http.Handler;
import com.google.gson.Gson;

public class CoachController {
	
	public static CoachService cserv = new CoachServiceImpl();
	private static Gson gson = new Gson();
	
	public static Handler createCoach = (ctx)->{
		Coach c = gson.fromJson(ctx.body(), Coach.class);
		try {
			c = cserv.createCoach(c);
			ctx.result(gson.toJson(c));
			ctx.status(201);
		}catch(Exception e) {
			ctx.result("Creation Failed");
			ctx.status(500);
		}
	};
  
	public static Handler getCoachById = (ctx) -> {
		String strCid = ctx.pathParam("cid");
		int intCid = Integer.parseInt(strCid);
		Coach c = cserv.getCoachById(intCid);
		String json = gson.toJson(c);
		
		ctx.result(json);
		ctx.status(200);
	};
	
	public static Handler getAllCoaches = (ctx) -> {
		Set<Coach> coaches = cserv.getAllCoachs();
		String json = gson.toJson(coaches);
		
		String getByName = ctx.queryParam("coachname");
		if (getByName != null) {
			Coach c = cserv.getCoachByName(getByName);
			ctx.result(gson.toJson(c));
		} else {
			ctx.result(json);
		}
	};
	
	public static Handler updateCoach = (ctx)->{
		String coachJson = ctx.body();
		Coach coach = gson.fromJson(coachJson, Coach.class);
		cserv.updateCoach(coach);	
		ctx.result(gson.toJson(coach));
	};
	
}
