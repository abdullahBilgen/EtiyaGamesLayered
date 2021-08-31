package DataAccess.Abstracts;

import Entities.Concretes.Selling;

public interface SellingDao extends EntityRepository<Selling> {

	void campaingSellingAdd(Selling selling);
}
