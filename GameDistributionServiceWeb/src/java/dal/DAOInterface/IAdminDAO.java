/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dal.DAOInterface;

import model.Admin;

/**
 *
 * @author ACER
 */
public interface IAdminDAO extends IDAO<Admin>{
    Admin get(int AdminID);
}
