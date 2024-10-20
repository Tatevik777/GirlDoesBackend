package by.tatevik.week4.entity;

import by.tatevik.week4.Swimmable;

public class Ship implements Swimmable {
    @Override
    public void swim() {
        shipGetsTechService();
        System.out.println("Кораблик поплыл!");

    }
    private void shipGetsTechService(){
        System.out.println("Кораблик прошёл техническую проверку и готов к отплытию!");
    }
}
