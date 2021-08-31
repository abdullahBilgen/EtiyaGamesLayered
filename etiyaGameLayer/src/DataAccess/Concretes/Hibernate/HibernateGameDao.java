package DataAccess.Concretes.Hibernate;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.GameDao;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class HibernateGameDao implements GameDao {

	List<Game> games = new ArrayList<Game>();

	@Override
	public List<Game> getAll() {
		
		return this.games;
	}

	@Override
	public void add(Game entity) {
	
		System.out.println("Hibernate gameDao ile eklendi..");
		this.games.add(entity);
		
	}

	@Override
	public void update(Game entity) {
	
		System.out.println("Hibernate gameDao ile güncellendi..");
	}

	@Override
	public void delete(Game entity) {
		
		System.out.println("Hibernate gameDao ile silindi..");
		
	}
	
	
}
