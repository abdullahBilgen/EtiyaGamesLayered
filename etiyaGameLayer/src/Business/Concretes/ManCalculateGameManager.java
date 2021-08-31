package Business.Concretes;

import Business.Abstracts.GameCalculateService;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class ManCalculateGameManager implements GameCalculateService {
		
	@Override
	public double calculate(Gamer gamer, Game game) {
		if(2021-gamer.getDogumTarihi()<=70) {
			System.out.println(gamer.getIsim() + "Oyuncuus Yeti�kin bir erkek" + game.getName() + "Oyunun puan�n�n %70 ini al�r. Puan : " + game.getGamePoint() 
			+ "Puan�n�z : " + game.getGamePoint()*0.7);
			return game.getGamePoint()*0.7;
		}
		else
		{
			System.out.println("Yeti�kin De�ilsiniz");
			return 0;
		}		
	}
}

	

