package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

public abstract class LevelDAO extends AbstractDAO {

    private static int    idColumnIndex    = 1;
    private static int    nameColumnIndex  = 2;

    public Example getLevelById(int id) throws SQLException {
        final CallableStatement callStatement = prepareCall("call getLevel("+ id +")");
        Example example = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }
}
