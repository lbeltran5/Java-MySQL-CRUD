package database.dao;

import com.solvd.laba.database.interfacedao.*;
import com.solvd.laba.database.model.*;

import java.sql.*;
import java.util.*;

public class CameraDAO implements CameraInterfaceDao {
    public CameraDAO() {
        super();
    }

    @Override
    public List<CameraModel> getAll() throws SQLException {
        return null;
    }

    @Override
    public CameraModel getById(int id) throws SQLException {
        return null;
    }

    @Override
    public int create(CameraModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int update(CameraModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }

    @Override
    public int save(CameraModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int insert(CameraModel entity) throws SQLException {
        return 0;
    }
}
