package database.dao;

import com.solvd.laba.database.interfacedao.*;
import com.solvd.laba.database.model.*;

import java.sql.*;
import java.util.*;

public class BrandDAO implements BrandInterfaceDao {
    public BrandDAO() {
        super();
    }

    @Override
    public List<BrandModel> getAll() throws SQLException {
        return null;
    }

    @Override
    public BrandModel getById(int id) throws SQLException {
        return null;
    }

    @Override
    public int create(BrandModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int update(BrandModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }

    @Override
    public int save(BrandModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int insert(BrandModel entity) throws SQLException {
        return 0;
    }
}

