package Business.Abstracts;

import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public interface GameCalculateService {
	
	double calculate(Gamer gamer , Game game);

}
