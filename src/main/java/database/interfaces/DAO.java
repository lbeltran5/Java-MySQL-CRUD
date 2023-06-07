package database.interfaces;

import java.sql.*;
import java.util.*;

public interface DAO<T> {
    List<T> getAll() throws SQLException;
    T getById(int id) throws SQLException;
    int create(T entity) throws SQLException;
    int update(T entity) throws SQLException;
    int delete(int id) throws SQLException;
    int save(T entity) throws SQLException;
    int insert(T entity) throws SQLException;

}


