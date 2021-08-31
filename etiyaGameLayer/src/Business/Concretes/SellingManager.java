package Business.Concretes;

import java.util.List;

import Business.Abstracts.SellingService;
import DataAccess.Abstracts.SellingDao;
import Entities.Concretes.Selling;

public class SellingManager implements SellingService {

	SellingDao sellingDao;
	
	public SellingManager(SellingDao sellingDao) {
		super();
		this.sellingDao = sellingDao;
	}

	@Override
	public List<Selling> getAll() {
		return this.sellingDao.getAll();
	}

	@Override
	public void campaingSales(Selling selling) {
		this.sellingDao.campaingSellingAdd(selling);
		
	}

	@Override
	public void sales(Selling selling) {
		this.sellingDao.add(selling);
		
	}

}
