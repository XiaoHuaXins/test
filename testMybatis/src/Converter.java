import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Converter extends BaseTypeHandler<Boolean> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
        if(aBoolean){
            preparedStatement.setString(i,"男");
        }else {
            preparedStatement.setString(i,"女");
        }
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, String s) throws SQLException {
        if("男".equals(s)){
        return true;
        }
        else return false;
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        if("男".equals(resultSet.getString(i))){
            return true;
        }
        else return false;
    }


    @Override
    public Boolean getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        if("男".equals(callableStatement.getString(i))){
            return true;
        }
        else return false;
    }
    }

