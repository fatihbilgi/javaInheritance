package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim koodları buraya yazılır... SQL
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
