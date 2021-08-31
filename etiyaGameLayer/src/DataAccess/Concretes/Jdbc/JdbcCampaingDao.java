package DataAccess.Concretes.Jdbc;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.CampaingDao;
import Entities.Concretes.Campaing;

public class JdbcCampaingDao implements CampaingDao {

	List<Campaing> campaings = new ArrayList<Campaing>();
	
	@Override
	public List<Campaing> getAll() {
		// TODO Auto-generated method stub
		return this.campaings;
	}

	@Override
	public void add(Campaing entity) {
		System.out.println("Jdbc campaingDao ile eklendi..");
		this.campaings.add(entity);
		
	}

	@Override
	public void update(Campaing entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaing entity) {
		// TODO Auto-generated method stub
		
	}

}
