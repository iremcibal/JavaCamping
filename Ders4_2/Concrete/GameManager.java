package Ders4_2.Concrete;

import Ders4_2.Abstracts.IGame;
import Ders4_2.Entities.Game;

public class GameManager implements IGame {

    @Override
    public void add(Game game) {
        System.out.println("Yeni oyun eklendi: " + game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi: " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi: " + game.getGameName());
    }
}
