/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Clone
 */
public class CustomerController {
     private CustomerModel customerModel;

    public CustomerController() throws ClassNotFoundException, SQLException {
       customerModel= new CustomerModel();
    }
//search customer
    public CustomerDto searchCustomer(String custId) throws SQLException{
        CustomerDto customerDto = customerModel.getCustomer(custId);
        return customerDto;
        
        
    }
     public CustomerDto getCustomer(String custId) throws SQLException{
        CustomerDto customerDto = customerModel.getCustomer(custId);
        return customerDto;
}

    public ArrayList<CustomerDto> getCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
