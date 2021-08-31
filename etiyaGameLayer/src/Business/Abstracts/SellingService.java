package Business.Abstracts;

import java.util.List;

import Entities.Concretes.Selling;

public interface SellingService {
	
	List<Selling> getAll();
	
	void campaingSales(Selling selling);
	void sales(Selling selling);

}
