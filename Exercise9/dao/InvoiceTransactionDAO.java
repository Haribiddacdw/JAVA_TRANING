package dao;

import java.util.Collection;

import dto.InvoiceTransactionDTO;

public abstract class InvoiceTransactionDAO {
	public abstract InvoiceTransactionDTO findByInvoiceNo(int number);
	public abstract InvoiceTransactionDTO findByItemNo(int itemnumber);
	public abstract Collection<InvoiceTransactionDTO> findAll();
	public abstract int update(InvoiceTransactionDTO invoicedto);
	public abstract void deleteInvoiceTransaction(InvoiceTransactionDTO itdto);
	
}
