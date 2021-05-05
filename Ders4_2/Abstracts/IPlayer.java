package Ders4_2.Abstracts;

import Ders4_2.Entities.Player;

public interface IPlayer {
    void add(Player player) throws Exception;
    void delete(Player player);
    void update(Player player);

}
