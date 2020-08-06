package dev.kyle.app;

import dev.kyle.controllers.PlayerController;
import dev.kyle.controllers.CoachController;
import io.javalin.Javalin;

public class App {
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7000);
		app.post("/players", PlayerController.createPlayer);
		app.post("/coaches", CoachController.createCoach);
	}
	
}
