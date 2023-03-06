package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.CustomerMasterDTO;


public class CustomerMasterDAOImpl extends CustomerMasterDAO implements Cloneable{
	public CustomerMasterDTO findByCustomerId(int number) {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from customer_master where customerid=?");
		ps.setInt(1, number);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			CustomerMasterDTO  customerdto= new CustomerMasterDTO();
			customerdto.setCustomerId(rs.getInt("customerid"));
			customerdto.setCustomerName(rs.getString("customername"));
			customerdto.setCustomerAddress(rs.getString("customeraddress"));
			customerdto.setCustomerId(number);
			return customerdto;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}
	public CustomerMasterDTO findByCustomerName(String name) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer_master where customername=?");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				CustomerMasterDTO  customerdto= new CustomerMasterDTO();
				customerdto.setCustomerId(rs.getInt("customerid"));
				customerdto.setCustomerName(rs.getString("customername"));
				customerdto.setCustomerAddress(rs.getString("customeraddress"));
				customerdto.setCustomerName(name);
				return customerdto;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	
	public Collection<CustomerMasterDTO> findAll(){
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer_master");
			List<CustomerMasterDTO > customerMaster=new ArrayList<CustomerMasterDTO>();
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CustomerMasterDTO customerMasterdto=new CustomerMasterDTO ();
				customerMasterdto.setCustomerId(rs.getInt("customerid"));
				customerMasterdto.setCustomerName(rs.getString("customername"));
				customerMasterdto.setCustomerAddress(rs.getString("customeraddress"));
				customerMaster.add(customerMasterdto);
				
			}
			return customerMaster;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	
	public int update(CustomerMasterDTO customerdto) {
		try {
			Connection con=DBUtility.getConnection();
			int customerid=customerdto.getCustomerId();
			PreparedStatement ps=con.prepareStatement("select * from customer_master where customerid=?");
			ps.setInt(1, customerid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update customer_master set customerid=?,customername=?,customeraddress=? where customerid=?");
				ps.setInt(1, customerdto.getCustomerId());
				ps.setString(2, customerdto.getCustomerName());
				ps.setString(3,customerdto.getCustomerAddress());
				ps.setInt(4, customerdto.getCustomerId());
				int n=ps.executeUpdate();
				DBUtility.closeConnection(null);
				return n;
			}
			else {
				return 0;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
			
			DBUtility.closeConnection(e);
			return 0;
		}
		
	}
	
	public void deleteCustomer(CustomerMasterDTO customerdto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoiceno = customerdto.getCustomerId();
			PreparedStatement ps=con.prepareStatement("DELETE FROM customer_master WHERE customerid = ?");
			ps.setInt(1, invoiceno);
			int n = ps.executeUpdate();
			if (n == 0) {
			    System.out.println("customer does not exist");
			} else {
			    System.out.println("customer deleted");
			}
			DBUtility.closeConnection(null);
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
		
		}
	}
    public static void main(String[] args) {
		
    	CustomerMasterDAOImpl customerMaster=new CustomerMasterDAOImpl();
     	System.out.println(customerMaster.findByCustomerId(32));
     	System.out.println(customerMaster.findByCustomerName("ram"));
    	System.out.println(customerMaster.findAll());
     	System.out.println();
     
     	
     	CustomerMasterDTO customerMasterDTO = customerMaster.findByCustomerId(1321);
     	customerMasterDTO.setCustomerName("hariram");
		int n=customerMaster.update(customerMasterDTO);
		System.out.println(n);
		System.out.println(customerMaster.findAll());
		
		customerMaster.deleteCustomer(customerMaster.findByCustomerId(12));;
		System.out.println(customerMaster.findAll());
		
	}
	
}
