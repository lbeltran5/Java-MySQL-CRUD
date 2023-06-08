import database.ConnectionPool;
import database.dao.BrandDAO;
import database.model.BrandModel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Retrieve a connection from the connection pool
        Connection connection = ConnectionPool.getInstance().retrieve();
        // Create an instance of BrandDAO and pass the connection
        BrandDAO brandDAO = new BrandDAO(connection);

        try {
            // Get all brands
            List<BrandModel> brands = brandDAO.getAll();
            for (BrandModel brand : brands) {
                System.out.println(brand);
            }

            // Create a new brand
            BrandModel newBrand = new BrandModel(11, "Amigo"); // Replace 1 with the appropriate brandId value
            brandDAO.create(newBrand);

            // Update a brand
            BrandModel existingBrand = brandDAO.getById(10);
            existingBrand.setBrandName("MexicanPhone");
            brandDAO.update(existingBrand);

            // Delete a brand
            brandDAO.delete(12);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Put back the connection to the connection pool
            ConnectionPool.getInstance().putback(connection);
        }
    }
}
