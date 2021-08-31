package Business.Abstracts;

import java.util.List;
import Entities.Concretes.Gamer;

public interface GamerService {
	
	List<Gamer> getAll();
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);

}
