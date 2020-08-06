package dev.kyle.controllers;

import com.google.gson.Gson;
import dev.kyle.entities.Player;
import dev.kyle.services.CoachService;
import dev.kyle.services.CoachServiceImpl;
import dev.kyle.services.PlayerService;
import dev.kyle.services.PlayerServiceImpl;
import io.javalin.http.Handler;
import java.util.Set;


public class PlayerController {
	
	private static Gson gson = new Gson();
	
	private static PlayerService pserv = new PlayerServiceImpl();

	public static Handler updatePlayer = (ctx)->{
		Player player = gson.fromJson(ctx.body(), Player.class);
		pserv.updatePlayer(player);
		String json = gson.toJson(player);
		ctx.result(json);
	};
	
		public static Handler createPlayer = (ctx)->{
		Player p = gson.fromJson(ctx.body(), Player.class);
		try {
			p = pserv.createPlayer(p);
			ctx.result(gson.toJson(p));
			ctx.status(201);
		}catch(Exception e) {
			ctx.result("Creation Failed");
			ctx.status(500);
    }
   };
	
	public static Handler getPlayerById = (ctx) -> {
		String strCid = ctx.pathParam("pid");
		int intCid = Integer.parseInt(strCid);
		Player p = pserv.getPlayerById(intCid);
		String json = gson.toJson(p);
		
		ctx.result(json);
		ctx.status(200);
	};
	
	public static Handler getAllPlayers = (ctx) -> {
		Set<Player> coaches = pserv.getAllPlayers();
		String json = gson.toJson(coaches);
		
		String getByName = ctx.queryParam("playername");
		if (getByName != null) {
			Player p = pserv.getPlayerByName(getByName);
			ctx.result(gson.toJson(p));
		} else {
			ctx.result(json);
		}
	};
}
