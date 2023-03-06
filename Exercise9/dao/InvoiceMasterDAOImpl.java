package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.InvoiceMasterDTO;

public class InvoiceMasterDAOImpl extends InvoiceMasterDAO implements Cloneable{
	public InvoiceMasterDTO findByInvoiceNo(int number) {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from invoice_master where invoiceno=?");
		ps.setInt(1, number);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			InvoiceMasterDTO invoicedto=new InvoiceMasterDTO();
			invoicedto.setInvoiceno(rs.getInt("invoiceno"));
			invoicedto.setDate(rs.getString("date"));
			invoicedto.setCustomerid(rs.getInt("customerid"));
			invoicedto.setInvoiceno(number);
			return invoicedto;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}
	
	public Collection<InvoiceMasterDTO> findAll(){
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_master");
			List<InvoiceMasterDTO> invoiceMaster=new ArrayList<InvoiceMasterDTO>();
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				InvoiceMasterDTO invoicemasterdto=new InvoiceMasterDTO();
				invoicemasterdto.setInvoiceno(rs.getInt("invoiceno"));
				invoicemasterdto.setDate(rs.getString("date"));
				invoicemasterdto.setCustomerid(rs.getInt("customerid"));
				invoiceMaster.add(invoicemasterdto);
				
			}
			return invoiceMaster;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	
	public int update(InvoiceMasterDTO invoicedto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoiceno=invoicedto.getInvoiceno();
			PreparedStatement ps=con.prepareStatement("select * from invoice_master where invoiceno=?");
			ps.setInt(1, invoiceno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update invoice_master set invoiceno=?,date=?,customerid=? where invoiceno=?");
				ps.setInt(1, invoicedto.getInvoiceno());
				ps.setString(2, invoicedto.getDate());
				ps.setInt(3, invoicedto.getCustomerid());
				ps.setInt(4, invoicedto.getInvoiceno());
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
	
	public void delete(InvoiceMasterDTO imdto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoiceno = imdto.getInvoiceno();
			PreparedStatement ps=con.prepareStatement("DELETE FROM invoice_master WHERE invoiceno = ?");
			ps.setInt(1, invoiceno);
			int n = ps.executeUpdate();
			if (n == 0) {
			    System.out.println("invoiceno does not exist");
			} else {
			    System.out.println("invoice deleted");
			}
			DBUtility.closeConnection(null);
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
		
		}
	}
    public static void main(String[] args) {
		
    	InvoiceMasterDAOImpl invoiceMaster=new InvoiceMasterDAOImpl();
     	System.out.println(invoiceMaster.findByInvoiceNo(121));
    	System.out.println(invoiceMaster.findAll());
     	System.out.println();
     
     	
     	InvoiceMasterDTO invoiceMasterDTO = invoiceMaster.findByInvoiceNo(121);
     	invoiceMasterDTO.setCustomerid(24);
		int n=invoiceMaster.update(invoiceMasterDTO);
		System.out.println(n);
		System.out.println(invoiceMaster.findAll());
		
//		invoiceMaster.delete(invoiceMaster.findByInvoiceNo(111));;
//		System.out.println(invoiceMaster.findAll());
		
	}
}
