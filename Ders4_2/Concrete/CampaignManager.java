package Ders4_2.Concrete;

import Ders4_2.Abstracts.ICampaign;
import Ders4_2.Entities.Campaign;

public class CampaignManager implements ICampaign {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Yeni kampanya eklendi: " + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanya silindi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " Kampanya güncellendi.");
    }
}
