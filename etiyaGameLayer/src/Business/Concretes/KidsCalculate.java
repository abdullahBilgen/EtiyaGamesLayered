package Business.Concretes;

import Business.Abstracts.GameCalculateService;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class KidsCalculate implements GameCalculateService{

	@Override
	public double calculate(Gamer gamer, Game game) {
			
		if(2021-gamer.getDogumTarihi()<18) {
			System.out.println("�ocuksunuz puan�n tamam�n� al�rs�n�z: " + game.getGamePoint());
			return game.getGamePoint();		}
		else
		{
			System.out.println("�ocuk De�ilsiniz.");
			return 0;
		}
	}

}
