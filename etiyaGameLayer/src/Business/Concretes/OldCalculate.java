package Business.Concretes;

import Business.Abstracts.GameCalculateService;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class OldCalculate implements GameCalculateService {

	@Override
	public double calculate(Gamer gamer, Game game) {
		if(2021-gamer.getDogumTarihi()>70) {
			System.out.println("Ya�l�s�n�z Puan�n ;Tamam�n� Al�rs�n�z : " + game.getGamePoint()*0.9);
			return game.getGamePoint()*0.9;
		}
		else
		{
			System.out.println("Ya�l� De�ilsiniz");
			return 0;
		}
	}
	
	

}
