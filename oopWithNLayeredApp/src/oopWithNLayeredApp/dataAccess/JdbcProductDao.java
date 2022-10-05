package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim koodları buraya yazılır... SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
