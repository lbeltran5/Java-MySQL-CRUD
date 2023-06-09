/* This class will provide common functionality which implements
 'DatabaseOperation' interface. It will handle database connectivity
 connection pooling, and exception handling.*/

package database.dao.jdbc;
import database.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAO implements DatabaseOperations {
    protected Connection connection;

    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ResultSet executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

    @Override
    public int executeUpdate(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(query);
    }
}
