package dev.kyle.app;

import io.javalin.Javalin;

public class App {
	Javalin app = Javalin.create().start(7000);
}
