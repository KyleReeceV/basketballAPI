package dev.kyle.app;

import dev.kyle.controllers.CoachController;
import dev.kyle.controllers.PlayerController;
import io.javalin.Javalin;

public class App {
	
	public static void main(String[] args) {
		Javalin app = Javalin.create(config ->{     // pass in a lambda that describes HOW to create the app
			
			//config.enableCorsForAllOrigins();
			config.addStaticFiles("/frontend");
			
		}).start(7000);
	
	app.put("/coaches", CoachController.updateCoach);
	
	app.put("/coaches/:id/playerss", PlayerController.updatePlayer);
	
	
	
}
