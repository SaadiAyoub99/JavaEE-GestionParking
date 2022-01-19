/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author HP
 */
public interface IDao <T>{
       public boolean create(T p);

	boolean delete(T p);

	boolean update(T p);

	T findById(int id);

	List<T> findAll();
    
    
}
