package Business.Abstracts;

import java.util.List;

import Entities.Concretes.Campaing;

public interface CampaingService {

	List<Campaing> getAll();
	
	void add( Campaing campaing);
	void update(Campaing campaing);
	void delete(Campaing campaing);
}
