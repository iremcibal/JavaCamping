package Ders4_2.Concrete;

import Ders4_2.Abstracts.IPlayer;
import Ders4_2.Entities.Player;
import Ders4_2.Services.IPlayerCheckServices;

public class PlayerManager implements IPlayer {
    private IPlayerCheckServices playerCheckServices;

    public PlayerManager(IPlayerCheckServices playerCheckServices) {
        this.playerCheckServices = playerCheckServices;
    }
    @Override
    public void add(Player player) throws Exception{
        if(playerCheckServices.realPlayer(player)){
            System.out.println("Yeni oyuncu eklendi:" + player.getName());
        }else {
            System.out.println("Kayıt edilemedi.");
        }
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu sistemden silindi: " + player.getName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu güncellendi: " + player.getName());
    }
}
