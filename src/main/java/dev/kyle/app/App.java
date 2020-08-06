package dev.kyle.app;

import dev.kyle.controllers.CoachController;
import dev.kyle.controllers.PlayerController;
import io.javalin.Javalin;

public class App {
	
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7000);

		app.get("/coaches/:cid", CoachController.getCoachById);
		app.get("/coaches", CoachController.getAllCoaches);
		
		app.get("/players/:pid", PlayerController.getPlayerById);
		app.get("players", PlayerController.getAllPlayers);
    
    app.post("/players", PlayerController.createPlayer);
		app.post("/coaches", CoachController.createCoach);
    
    app.put("/coaches", CoachController.updateCoach);
  	app.put("/coaches/:id/players", PlayerController.updatePlayer);
		
	}
}
