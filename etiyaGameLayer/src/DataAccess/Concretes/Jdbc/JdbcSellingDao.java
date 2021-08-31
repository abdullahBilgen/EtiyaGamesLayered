package DataAccess.Concretes.Jdbc;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.SellingDao;
import Entities.Concretes.Selling;

public class JdbcSellingDao implements SellingDao {
	
	List<Selling> sellings = new ArrayList<Selling>();

	@Override
	public List<Selling> getAll() {
		
		System.out.println("JdbcSellingDao ile listelendi : ");
		
		return this.sellings;
	}

	@Override
	public void add(Selling entity) {
		System.out.println("JdbcSellingDao ile eklendi : " + entity.getGame().getName() + " oyununu " + entity.getGamer().getIsim() + " oyuncusu " 
				+ entity.getGame().getUnitPrice() + "TL ye aldý");
		
		this.sellings.add(entity);
	}

	@Override
	public void update(Selling entity) {
		System.out.println("JdbcSellingDao ile güncellendi..");
		
	}

	@Override
	public void delete(Selling entity) {
		System.out.println("JdbcSellingDao ile silindi..");
	}

	@Override
	public void campaingSellingAdd(Selling selling) {
		System.out.println("JdbcSellingDao ile eklendi : " + selling.getGame().getName() + " oyununu " + selling.getGamer().getIsim() + " oyuncusu " 
	+ selling.getCampaingPrice() + " Tl ye aldý..");
		
	}

}
