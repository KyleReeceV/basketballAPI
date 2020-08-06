package dev.kyle.controllers;

import com.google.gson.Gson;

import dev.kyle.entities.Player;
import dev.kyle.services.PlayerService;
import dev.kyle.services.PlayerServiceImpl;
import io.javalin.http.Handler;

public class PlayerController {
	static private Gson gson = new Gson();
	static private PlayerService pServ = new PlayerServiceImpl();
	
	public static Handler createPlayer = (ctx)->{
		Player p = gson.fromJson(ctx.body(), Player.class);
		try {
			p = pServ.createPlayer(p);
			ctx.result(gson.toJson(p));
			ctx.status(201);
		}catch(Exception e) {
			ctx.result("Creation Failed");
			ctx.status(500);
		}
	};
}
