package DataAccess.Concretes.Jdbc;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.GamerDao;
import Entities.Concretes.Gamer;

public class JdbcGamerDao implements GamerDao {

	List<Gamer> gamers = new ArrayList<Gamer>();
	
	@Override
	public List<Gamer> getAll() {
		return this.gamers;
	}

	@Override
	public void add(Gamer entity) {
		
		System.out.println("Jdbc ile eklendi...");
		this.gamers.add(entity);
	}

	@Override
	public void update(Gamer entity) {
		System.out.println("Jdbc ile güncelle...");
	}

	@Override
	public void delete(Gamer entity) {
		System.out.println("Jdbc ile Silindi...");
	}

}
