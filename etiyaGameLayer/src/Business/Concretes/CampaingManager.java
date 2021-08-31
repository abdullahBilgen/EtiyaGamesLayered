package Business.Concretes;

import java.util.List;

import Business.Abstracts.CampaingService;
import DataAccess.Abstracts.CampaingDao;
import Entities.Concretes.Campaing;

public class CampaingManager implements CampaingService {

	CampaingDao campaingDao;
	
	public CampaingManager(CampaingDao campaingDao) {
		super();
		this.campaingDao = campaingDao;
	}

	@Override
	public List<Campaing> getAll() {
		return this.campaingDao.getAll();
	}

	@Override
	public void add(Campaing campaing) {
		this.campaingDao.add(campaing);
	}

	@Override
	public void update(Campaing campaing) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaing campaing) {
		// TODO Auto-generated method stub
		
	}

}
