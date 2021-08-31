package Business.Concretes;

import Business.Abstracts.GameCalculateService;
import Business.Abstracts.GamePlayService;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class GamePlayManager implements GamePlayService {

	GameCalculateService gameCalculateService;
	
	public GamePlayManager(GameCalculateService gameCalculateService) {
		super();
		this.gameCalculateService = gameCalculateService;
	}
	@Override
	public void gamesPlay(Gamer gamer, Game game) {

		this.gameCalculateService.calculate(gamer, game);
		
		
	}

	
}
