package Ders4_2.Concrete;

import Ders4_2.Abstracts.ISale;
import Ders4_2.Entities.Campaign;
import Ders4_2.Entities.Game;
import Ders4_2.Entities.Player;

public class SaleManager implements ISale {

    @Override
    public void buy(Player player, Game game) {
        System.out.println(player.getName() + player.getSurName() + game.getGameName() + " oyununu satın aldı.");
    }

    @Override
    public void buy2(Player player, Game game, Campaign campaign) {
        System.out.println(player.getName() + player.getSurName() +
                game.getGameName() +
                campaign.getCampaignName() +
                "kampanyasından yararlanarak oyununu satın aldı.");
    }

}
