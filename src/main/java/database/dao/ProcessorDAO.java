package database.dao;

import com.solvd.laba.database.interfacedao.*;
import com.solvd.laba.database.model.*;

import java.sql.*;
import java.util.*;

public class ProcessorDAO implements ProcessorInterfaceDao {
    public ProcessorDAO() {
        super();
    }

    @Override
    public List<ProcessorModel> getAll() throws SQLException {
        return null;
    }

    @Override
    public ProcessorModel getById(int id) throws SQLException {
        return null;
    }

    @Override
    public int create(ProcessorModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int update(ProcessorModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }

    @Override
    public int save(ProcessorModel entity) throws SQLException {
        return 0;
    }

    @Override
    public int insert(ProcessorModel entity) throws SQLException {
        return 0;
    }
}
