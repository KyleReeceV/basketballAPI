package dev.kyle.controllers;

import dev.kyle.entities.Player;
import io.javalin.http.Handler;

public class PlayerController {
	
	public static Handler updatePlayer = (ctx)->{
		Player player = gson.fromJson(ctx.body(), Player.class);
		pServ.updatePlayer(player);
		String json = gson.toJson(player);
		ctx.result(json);
	};

}
