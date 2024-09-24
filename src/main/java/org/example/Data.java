package org.example;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Game> gameList = new ArrayList<>();

    static{
        // Añadir 15 juegos a la lista con el año incluido
        gameList.add(new Game("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 2017));
        gameList.add(new Game("God of War", "PlayStation 4", 2018));
        gameList.add(new Game("Red Dead Redemption 2", "Xbox One", 2018));
        gameList.add(new Game("Minecraft", "PC", 2011));
        gameList.add(new Game("Fortnite", "PC", 2017));
        gameList.add(new Game("The Witcher 3: Wild Hunt", "PC", 2015));
        gameList.add(new Game("Super Mario Odyssey", "Nintendo Switch", 2017));
        gameList.add(new Game("Hollow Knight", "Nintendo Switch", 2018));
        gameList.add(new Game("Overwatch", "PC", 2016));
        gameList.add(new Game("Cyberpunk 2077", "PC", 2020));
        gameList.add(new Game("Halo Infinite", "Xbox Series X", 2021));
        gameList.add(new Game("Among Us", "PC", 2018));
        gameList.add(new Game("Apex Legends", "PlayStation 4", 2019));
        gameList.add(new Game("Animal Crossing: New Horizons", "Nintendo Switch", 2020));
        gameList.add(new Game("Final Fantasy VII Remake", "PlayStation 4", 2020));
    }
}
