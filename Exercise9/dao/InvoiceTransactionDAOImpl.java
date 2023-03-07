package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.InvoiceTransactionDTO;


public class InvoiceTransactionDAOImpl extends InvoiceTransactionDAO implements Cloneable{
	private static InvoiceTransactionDAOImpl invoiceTransactionDao;
	public static InvoiceTransactionDAOImpl getUserDAOImplObject() {
		if(invoiceTransactionDao==null) {
			invoiceTransactionDao=new InvoiceTransactionDAOImpl();
			return invoiceTransactionDao;
		}
		else {
			return invoiceTransactionDao.createClone();
		}
	}
	private InvoiceTransactionDAOImpl createClone() {
		if(invoiceTransactionDao!=null) {
			try{
				return (InvoiceTransactionDAOImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private InvoiceTransactionDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public InvoiceTransactionDTO findByInvoiceNo(int number) {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from invoice_transaction where invoiceno=?");
		ps.setInt(1, number);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			InvoiceTransactionDTO invoiceTransactionDTO=new InvoiceTransactionDTO();
			invoiceTransactionDTO.setInvoiceNo(rs.getInt("invoiceno"));
			invoiceTransactionDTO.setItemNo(rs.getInt("itemNo"));
			invoiceTransactionDTO.setItemQty(rs.getInt("itemQty"));
			invoiceTransactionDTO.setInvoiceNo(number);
			return invoiceTransactionDTO;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}
	public InvoiceTransactionDTO findByItemNo(int itemnumber) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_transaction where itemno=?");
			ps.setInt(1, itemnumber);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				InvoiceTransactionDTO invoiceTransactionDTO=new InvoiceTransactionDTO();
				invoiceTransactionDTO.setInvoiceNo(rs.getInt("invoiceno"));
				invoiceTransactionDTO.setItemNo(rs.getInt("itemNo"));
				invoiceTransactionDTO.setItemQty(rs.getInt("itemQty"));
				invoiceTransactionDTO.setItemNo(itemnumber);
				return invoiceTransactionDTO;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	public Collection<InvoiceTransactionDTO> findAll(){
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from invoice_transaction");
			List<InvoiceTransactionDTO> invoiceTransaction=new ArrayList<InvoiceTransactionDTO>();
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				InvoiceTransactionDTO invoiceTransactionDTO=new InvoiceTransactionDTO();
				invoiceTransactionDTO.setInvoiceNo(rs.getInt("invoiceno"));
				invoiceTransactionDTO.setItemNo(rs.getInt("itemNo"));
				invoiceTransactionDTO.setItemQty(rs.getInt("itemQty"));
				invoiceTransaction.add(invoiceTransactionDTO);
			}
			return invoiceTransaction;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}

	public int update(InvoiceTransactionDTO invoicedto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoiceno=invoicedto.getInvoiceNo();
			PreparedStatement ps=con.prepareStatement("select * from invoice_transaction where invoiceno=?");
			ps.setInt(1, invoiceno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update invoice_transaction set invoiceno=?, itemno=? ,itemqty =? where invoiceno=?");
				ps.setInt(1, invoicedto.getInvoiceNo());
				ps.setInt(2, invoicedto.getItemNo());
				ps.setInt(3, invoicedto.getItemQty());
				ps.setInt(4, invoicedto.getInvoiceNo());
				
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
	public void deleteInvoiceTransaction(InvoiceTransactionDTO itdto) {
		try {
			Connection con=DBUtility.getConnection();
			int invoiceno = itdto.getInvoiceNo();
			PreparedStatement ps=con.prepareStatement("DELETE FROM invoice_transaction WHERE invoiceno = ?");
			ps.setInt(1, invoiceno );
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
		
		InvoiceTransactionDAOImpl invoiceTransaction=new InvoiceTransactionDAOImpl();
     	System.out.println(invoiceTransaction.findByInvoiceNo(111));
     	System.out.println(invoiceTransaction.findByItemNo(1));
     
     	
     	InvoiceTransactionDTO invoiceTransactionDTO = invoiceTransaction.findByInvoiceNo(112);
     	invoiceTransactionDTO.setItemQty(1);
		int n=invoiceTransaction.update(invoiceTransactionDTO);
		System.out.println(n);
		System.out.println(invoiceTransaction.findAll());
		

//		invoiceTransaction.deleteInvoiceTransaction(invoiceTransaction.findByInvoiceNo(112));;
//		System.out.println(invoiceTransaction.findAll());
		
	}

}
