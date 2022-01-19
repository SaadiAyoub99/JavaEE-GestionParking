/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Park;
import connexion.Connexion;
import dao.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ParkService implements IDao<Park>{

    @Override
    public boolean create(Park p) {
         String sql = "insert into park values (null, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, p.getNom_park());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
  System.out.println("error");
        }
        return false;
    }

    @Override
    public boolean delete(Park p) {
          String sql = "delete from park where id  = ?";
       try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, p.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean update(Park p) {
        String sql = "update park set nom_park = ? where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, p.getNom_park());
            ps.setInt(2, p.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Park findById(int id) {
        Park p = null;
        String sql = "select * from park where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Park (rs.getInt("id"), rs.getString("nom_park"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Park> findAll() {
       List<Park> parks = new ArrayList<Park>();

        String sql = "select * from park";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                parks.add(new Park(rs.getInt("id"), rs.getString("nom_park")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return parks;
    }
    
    
}
