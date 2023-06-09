package database.service;

import java.sql.*;
import java.util.*;

public interface GenericService<T> {
    List<T> getAll() throws SQLException;
    void create(T entity) throws SQLException;
    void update(T entity) throws SQLException;
    void delete(int id) throws SQLException;
    T getById(int id) throws SQLException;
}
