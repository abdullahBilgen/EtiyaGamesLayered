package Business.Concretes;

import Business.Abstracts.GameCalculateService;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class ManCalculateGameManager implements GameCalculateService {
		
	@Override
	public double calculate(Gamer gamer, Game game) {
		if(2021-gamer.getDogumTarihi()<=70) {
			System.out.println(gamer.getIsim() + "Oyuncuus Yetiþkin bir erkek" + game.getName() + "Oyunun puanýnýn %70 ini alýr. Puan : " + game.getGamePoint() 
			+ "Puanýnýz : " + game.getGamePoint()*0.7);
			return game.getGamePoint()*0.7;
		}
		else
		{
			System.out.println("Yetiþkin Deðilsiniz");
			return 0;
		}		
	}
}

	

