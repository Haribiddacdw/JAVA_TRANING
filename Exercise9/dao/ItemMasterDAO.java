package dao;

import java.util.Collection;

import dto.ItemMasterDTO;

public abstract class ItemMasterDAO {
	public abstract ItemMasterDTO findByItemNo(int number);
	public abstract ItemMasterDTO findByItemName(String itemname);
	public abstract Collection<ItemMasterDTO> findAll();
	public abstract int update(ItemMasterDTO itemdto);
	public abstract  void deleteItem(ItemMasterDTO itemdto);
}
