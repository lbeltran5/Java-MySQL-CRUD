import database.ConnectionPool;
import database.dao.DAO;
import database.dao.jdbc.BrandDAO;
import database.model.BrandModel;
import database.service.GenericService;
import database.service.implementation.BrandService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Retrieve a connection from the connection pool
        Connection connection = ConnectionPool.getInstance().retrieve();

        // Create an instance of the desired DAO for the specific table
        DAO<BrandModel> brandDAO = new BrandDAO(connection);

        // Create an instance of the desired service for the specific table
        GenericService<BrandModel> brandService = new BrandService(brandDAO);

        try {
            // Get all brands
            List<BrandModel> brands = brandDAO.getAll();
            for (BrandModel brand : brands) {
                System.out.println(brand);
            }

            // Create a new brand
            BrandModel newBrand = new BrandModel(13, "Pandora"); // Replace 1 with the appropriate brandId value
            brandService.create(newBrand);

            // Update a brand
            BrandModel existingBrand = brandDAO.getById(9);
            if (existingBrand != null) {
                existingBrand.setBrandName("Mega_Phone");
                brandService.update(existingBrand);
            } else {
                System.out.println("Brand not found!");
            }

            // Delete a brand
            brandDAO.delete(17);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Put back the connection to the connection pool
            ConnectionPool.getInstance().putback(connection);
        }
    }
}
