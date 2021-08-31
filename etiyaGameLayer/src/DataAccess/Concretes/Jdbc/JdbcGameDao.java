package DataAccess.Concretes.Jdbc;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.GameDao;
import Entities.Concretes.Game;

public class JdbcGameDao implements GameDao{

	List<Game> games = new ArrayList<Game>();

	@Override
	public List<Game> getAll() {
		
		return this.games;
	}

	@Override
	public void add(Game entity) {
	
		System.out.println("Jdbc gameDao ile eklendi..");
		this.games.add(entity);
		
	}

	@Override
	public void update(Game entity) {
	
		System.out.println("Jdbc gameDao ile güncellendi..");
	}

	@Override
	public void delete(Game entity) {
		
		System.out.println("Jdbc gameDao ile silindi..");
		
	}
	

}
