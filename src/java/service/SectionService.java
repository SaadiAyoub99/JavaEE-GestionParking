/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Section;
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
public class SectionService implements IDao<Section> {

    private ParkService ps = new ParkService();

    @Override
    public boolean create(Section p) {
        String sql = "insert into section values (null, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, p.getCode_section());
            ps.setString(2, p.getNom_park());
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
    public boolean delete(Section p) {
        String sql = "delete from section where id_section  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, p.getId_section());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean update(Section p) {
        String sql = "update section set code_section = ? where id_section  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, p.getCode_section());
            ps.setInt(2, p.getId_section());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Section findById(int id) {
        Section s = null;
        String sql = "select * from section where id_section  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Section(rs.getInt("id_section"), rs.getString("code_section"), rs.getString("nom_park"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Section> findAll() {
        List<Section> sections = new ArrayList<Section>();

        String sql = "select * from section";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sections.add(new Section(rs.getInt("id_section"), rs.getString("code_section"), rs.getString("nom_park")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return sections;
    }

}
