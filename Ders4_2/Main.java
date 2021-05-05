package Ders4_2;

import Ders4_2.Concrete.CampaignManager;
import Ders4_2.Concrete.GameManager;
import Ders4_2.Concrete.PlayerManager;
import Ders4_2.Concrete.SaleManager;
import Ders4_2.Entities.Campaign;
import Ders4_2.Entities.Game;
import Ders4_2.Entities.Player;
import Ders4_2.Services.PlayerCheckServices;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1= new Player(2,"irem","Balcı",1999,"42898957575");
        PlayerManager playerManager= new PlayerManager(new PlayerCheckServices());
        playerManager.add(player1);


        Game game1= new Game(1,"PUBG",50);
        GameManager gameManager=new GameManager();
        gameManager.add(game1);


        Campaign newPlayer = new Campaign(1,"newPlayer10",10);
        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(newPlayer);

        SaleManager saleManager= new SaleManager();
        saleManager.buy2(player1,game1,newPlayer);








    }
}