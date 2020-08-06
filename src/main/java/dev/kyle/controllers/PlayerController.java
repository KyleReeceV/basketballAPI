package dev.kyle.controllers;

import java.util.Set;

import com.google.gson.Gson;

import dev.kyle.entities.Player;
import dev.kyle.services.PlayerService;
import dev.kyle.services.PlayerServiceImpl;
import io.javalin.http.Handler;

public class PlayerController {

	private static Gson gson = new Gson();
	
	private static PlayerService pserv = new PlayerServiceImpl();
	
	
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
