package repository.dentist;

import model.Dentist;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Service
public class DentistRe implements IDentistRe {

@Override
    public List findAll() {
        List<Dentist> dentistReList = new ArrayList<>();
        Connection connection = ConnectionDB.getconnection();
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall("select *from dentist");
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                Dentist dentistRe = new Dentist(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phone")

                );
                dentistReList.add(dentistRe);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDB.closeConnection(connection);
        }
        return dentistReList;
    }

    @Override
    public void update(Dentist dentist) {
        Connection connection = ConnectionDB.getconnection();
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall("update dentist set name=?,gender=?,address = ?,phone=? where id=? ");
            callableStatement.setString(1, dentist.getName());
            callableStatement.setString(2, dentist.getGender());
            callableStatement.setString(3, dentist.getPhone());
            callableStatement.setInt(4, dentist.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Dentist findById(Integer id) {
        Connection connection = ConnectionDB.getconnection();
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall("select * from dentist where id=?");
            callableStatement.setInt(1, (Integer) id);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                Dentist dentistRe = new Dentist(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getString("phone")
                );
                return dentistRe;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDB.closeConnection(connection);
        }
        return null;
    }


}
