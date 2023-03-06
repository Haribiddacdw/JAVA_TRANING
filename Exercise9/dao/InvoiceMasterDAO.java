package dao;

import java.util.Collection;

import dto.InvoiceMasterDTO;

public abstract class InvoiceMasterDAO {
	public abstract InvoiceMasterDTO findByInvoiceNo(int number);
	public abstract Collection<InvoiceMasterDTO> findAll();
	public abstract int update(InvoiceMasterDTO invoicedto);
	public abstract void delete(InvoiceMasterDTO imdto);
}
