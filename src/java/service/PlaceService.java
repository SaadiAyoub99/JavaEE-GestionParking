/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Place;
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
public class PlaceService implements IDao<Place>{

    private SectionService ss = new SectionService();
    @Override
    public boolean create(Place p) {
        String sql = "insert into place values (null, ?, false, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);          
            ps.setString(1, p.getNumero());
            ps.setString(2, p.getCode_section());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    @Override
    public boolean delete(Place p) {
         String sql = "delete from place where id  = ?";
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
    public boolean update(Place p) {
        String sql = "update place set numero = ?, etat = ?, code_section = ? where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNumero());
            ps.setString(3, p.getEtat());
            ps.setString(4, p.getCode_section());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    
    public void librer (int id){
        String sql = "update place set etat = false where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();       
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }

    }
    
    public void occupe (int id){
        String sql = "update place set etat = true where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();       
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }

    }
    @Override
    public Place findById(int id) {
               Place a = null;
        String sql = "select * from place where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Place(rs.getInt("id"), rs.getString("numero"), rs.getString("etat"), rs.getString("code_section"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Place> findAll() {
        List<Place> places = new ArrayList<Place>();

        String sql = "select * from place";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                places.add(new Place(rs.getInt("id"), rs.getString("numero"), rs.getString("etat"), rs.getString("code_section")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return places;
    }
    }
    
