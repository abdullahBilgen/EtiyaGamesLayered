package Business.Concretes;

import java.util.List;

import Business.Abstracts.GameService;
import DataAccess.Abstracts.GameDao;
import Entities.Concretes.Game;

public class GameManager implements GameService {

	GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public List<Game> getAll() {
		return this.gameDao.getAll();
	}

	@Override
	public void add(Game game) {
		
		this.gameDao.add(game);
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
	}

}
