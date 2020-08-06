package dev.kyle.controllers;


import dev.kyle.entities.Coach;
import dev.kyle.services.CoachService;
import dev.kyle.services.CoachServiceImpl;
import io.javalin.http.Handler;
import com.google.gson.Gson;

public class CoachController {
	static private Gson gson = new Gson();
	static private CoachService cServ = new CoachServiceImpl();
	
	public static Handler createCoach = (ctx)->{
		Coach c = gson.fromJson(ctx.body(), Coach.class);
		try {
			c = cServ.createCoach(c);
			ctx.result(gson.toJson(c));
			ctx.status(201);
		}catch(Exception e) {
			ctx.result("Creation Failed");
			ctx.status(500);
		}
	};
}
