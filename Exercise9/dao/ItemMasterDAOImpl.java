package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import database.DBUtility;
import dto.ItemMasterDTO;

public class ItemMasterDAOImpl extends ItemMasterDAO implements Cloneable{
	private static ItemMasterDAOImpl itemMasterDao;
	public static ItemMasterDAOImpl getUserDAOImplObject() {
		if(itemMasterDao==null) {
			itemMasterDao=new ItemMasterDAOImpl();
			return itemMasterDao;
		}
		else {
			return itemMasterDao.createClone();
		}
	}
	private ItemMasterDAOImpl createClone() {
		if(itemMasterDao!=null) {
			try{
				return (ItemMasterDAOImpl)super.clone();
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	private ItemMasterDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public ItemMasterDTO findByItemNo(int number) {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from item_master where itemno=?");
		ps.setInt(1, number);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			ItemMasterDTO itemdto=new ItemMasterDTO();
			itemdto.setItemname(rs.getString("itemname"));
			itemdto.setItemprice(rs.getInt("itemprice"));
			itemdto.setUnit(rs.getString("itemunit"));
			itemdto.setItemno(number);
			return itemdto;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}
	public ItemMasterDTO findByItemName(String itemname) {
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from item_master where itemname=?");
			ps.setString(1, itemname);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ItemMasterDTO itemdto=new ItemMasterDTO();
				itemdto.setItemname(rs.getString("itemname"));
				itemdto.setItemprice(rs.getInt("itemprice"));
				itemdto.setUnit(rs.getString("itemunit"));
				itemdto.setItemname(itemname);
				return itemdto;
			}
			else {
				return null;
			}
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}
	public Collection<ItemMasterDTO> findAll(){
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from item_master");
			List<ItemMasterDTO> itemMaster=new ArrayList<ItemMasterDTO>();
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ItemMasterDTO itemdto=new ItemMasterDTO();
				itemdto.setItemno(rs.getInt("itemno"));
				itemdto.setItemname(rs.getString("itemname"));
				itemdto.setItemprice(rs.getInt("itemprice"));
				itemdto.setUnit(rs.getString("itemunit"));
				itemMaster.add(itemdto);
				
			}
			return itemMaster;
			}catch(Exception e) {
				DBUtility.closeConnection(e);
				return null;
			}
	}

	public int update(ItemMasterDTO itemdto) {
		try {
			Connection con=DBUtility.getConnection();
			int itemno=itemdto.getItemno();
			PreparedStatement ps=con.prepareStatement("select * from item_master where itemno=?");
			ps.setInt(1, itemno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update item_master set itemname=?,itemprice=?,itemunit=? where itemno=?");
				ps.setString(1, itemdto.getItemname());
				ps.setInt(2, itemdto.getItemprice());
				ps.setString(3, itemdto.getUnit());
				ps.setInt(4, itemdto.getItemno());
				
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
	public  void deleteItem(ItemMasterDTO itemdto) {
		try {
			Connection con=DBUtility.getConnection();
			int itemno = itemdto.getItemno();
			PreparedStatement ps=con.prepareStatement("DELETE FROM item_master WHERE itemno = ?");
			ps.setInt(1, itemno);
			int n = ps.executeUpdate();
			if (n == 0) {
			    System.out.println("item does not exist");
			} else {
			    System.out.println("item deleted");
			}
			DBUtility.closeConnection(null);
		
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
		
		}
	}
	
	public static void main(String[] args) {
		
		ItemMasterDAOImpl itemMaster=new ItemMasterDAOImpl();
     	System.out.println(itemMaster.findByItemNo(1));
     	System.out.println(itemMaster.findByItemName("iphone"));
     	System.out.println(itemMaster.findAll());
     	
     	ItemMasterDTO itemDTO = itemMaster.findByItemNo(1);
     	itemDTO.setUnit("32");
		int n=itemMaster.update(itemDTO);
		System.out.println(n);
		
		ItemMasterDTO item = itemMaster.findByItemNo(2);
		itemMaster.deleteItem(item);
		System.out.println(itemMaster.findAll());
		
	}
}
