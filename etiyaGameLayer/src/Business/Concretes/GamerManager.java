package Business.Concretes;

import java.util.List;

import Business.Abstracts.GamerService;
import DataAccess.Abstracts.GamerDao;
import Entities.Concretes.Gamer;

public class GamerManager implements GamerService {

	GamerDao gamerDao;
	
	public GamerManager(GamerDao gamerDao) {
		super();
		this.gamerDao = gamerDao;
	}

	@Override
	public List<Gamer> getAll() {
		return this.gamerDao.getAll();
	}

	@Override
	public void add(Gamer gamer) {
		this.gamerDao.add(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		this.gamerDao.update(gamer);
	}

	@Override
	public void delete(Gamer gamer) {
		this.gamerDao.delete(gamer);
	}

}
