package Business.Concretes;

import Business.Abstracts.GameCalculateService;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class OldCalculate implements GameCalculateService {

	@Override
	public double calculate(Gamer gamer, Game game) {
		if(2021-gamer.getDogumTarihi()>70) {
			System.out.println("Yaþlýsýnýz Puanýn ;Tamamýný Alýrsýnýz : " + game.getGamePoint()*0.9);
			return game.getGamePoint()*0.9;
		}
		else
		{
			System.out.println("Yaþlý Deðilsiniz");
			return 0;
		}
	}
	
	

}
