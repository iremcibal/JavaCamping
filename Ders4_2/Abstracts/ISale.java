package Ders4_2.Abstracts;

import Ders4_2.Entities.Campaign;
import Ders4_2.Entities.Game;
import Ders4_2.Entities.Player;

public interface ISale {
    void buy(Player player, Game game);
    void buy2(Player player, Game game, Campaign campaign);
}
