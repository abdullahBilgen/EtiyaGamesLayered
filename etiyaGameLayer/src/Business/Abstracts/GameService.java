package Business.Abstracts;

import java.util.List;

import Entities.Concretes.Game;

public interface GameService {

	List<Game> getAll();
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	
}
