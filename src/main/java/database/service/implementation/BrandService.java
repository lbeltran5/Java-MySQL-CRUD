package database.service.implementation;

import database.dao.DAO;
import database.model.BrandModel;
import database.service.GenericService;

import java.sql.SQLException;
import java.util.List;

public class BrandService implements GenericService<BrandModel> {
    private final DAO<BrandModel> brandDAO;

    public BrandService(DAO<BrandModel> brandDAO) {
        this.brandDAO = brandDAO;
    }

    @Override
    public List<BrandModel> getAll() throws SQLException {
        return brandDAO.getAll();
    }

    @Override
    public void create(BrandModel entity) throws SQLException {
        brandDAO.create(entity);
    }

    @Override
    public void update(BrandModel entity) throws SQLException {
        brandDAO.update(entity);
    }

    @Override
    public void delete(int id) throws SQLException {
        brandDAO.delete(id);
    }

    @Override
    public BrandModel getById(int id) throws SQLException {
        return brandDAO.getById(id);
    }
}
