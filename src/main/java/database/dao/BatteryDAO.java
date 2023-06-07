package database.dao;


import database.interfaces.*;
import database.model.*;

import java.sql.*;
import java.util.*;

public class BatteryDAO implements BatteryInterfaceDao {
    @Override
    public List<BatteryModel> getAll() throws SQLException {
        return null;
    }

    @Override
    public BatteryModel getById(int id) throws SQLException {
        return null;
    }

    @Override
    public int create(BatteryModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int update(BatteryModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }

    @Override
    public int save(BatteryModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int insert(BatteryModel entity) throws SQLException {
        return 0;
    }
}
