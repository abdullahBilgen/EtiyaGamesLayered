package DataAccess.Concretes.Hibernate;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.GamerDao;
import Entities.Concretes.Gamer;

public class HibernateGamerDao implements GamerDao{

	List<Gamer> gamers = new ArrayList<Gamer>();
	@Override
	public List<Gamer> getAll() {
		
		return this.gamers;
		
	}

	@Override
	public void add(Gamer entity) {
		
		this.gamers.add(entity);
		System.out.println("Hibernate gamerDao ile eklendi..");
		
	}

	@Override
	public void update(Gamer entity) {
		
		System.out.println("Hibernate gamerDao ile güncellendi..");
	}

	@Override
	public void delete(Gamer entity) {
		System.out.println("Hibernate gamerDao ile silindi..");
		
	}

}
