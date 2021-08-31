package DataAccess.Concretes.Hibernate;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.SellingDao;
import Entities.Concretes.Selling;

public class HibernateSellingDao implements SellingDao {
	
	List<Selling> sellings = new ArrayList<Selling>();

	@Override
	public List<Selling> getAll() {
		System.out.println("HibernateSellingDao ile listelendi : ");
		return this.sellings;
	}

	@Override
	public void add(Selling entity) {
		System.out.println(" HibernateSellingDao ile eklendi : " + entity.getGame().getName() + "o yununu " + entity.getGamer().getIsim()
				+ " oyunncusu " + entity.getGame().getUnitPrice() + "TL ye aldý..");
		
		this.sellings.add(entity);
		
	}

	@Override
	public void update(Selling entity) {
		System.out.println("HibernateSellingDao ile Güncellendi");
		
	}

	@Override
	public void delete(Selling entity) {
		System.out.println("HibernateSellingDao ile silindi..");
		
	}

	@Override
	public void campaingSellingAdd(Selling selling) {
		System.out.println("HibernateSellingDao ile eklendi : " + selling.getGame().getName() + " oyununu " + selling.getGamer().getIsim() + " oyuncusu "
	        + selling.getCampaing().getCampaignName() + " kampanya ile " + selling.getGame().getUnitPrice() + " TL yerine " 
				+ selling.getCampaingPrice() + "TL ye aldý.") ;
		
		this.sellings.add(selling);
		
	}
	

}
