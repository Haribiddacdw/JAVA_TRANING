package dto;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransactionDTO implements Serializable,Comparable<InvoiceTransactionDTO>{
    private int invoiceNo;
    private int itemNo;
    private int itemQty;
    
	public InvoiceTransactionDTO(int invoiceNo, int itemNo, int itemQty) {
		super();
		this.invoiceNo = invoiceNo;
		this.itemNo = itemNo;
		this.itemQty = itemQty;
	}
	public InvoiceTransactionDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	@Override
	public String toString() {
		return "InvoiceTrainsDTO [invoiceNo=" + invoiceNo + ", itemNo=" + itemNo + ", itemQty=" + itemQty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(invoiceNo, itemNo, itemQty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransactionDTO other = (InvoiceTransactionDTO) obj;
		return Objects.equals(invoiceNo, other.invoiceNo) && Objects.equals(itemNo, other.itemNo)
				&& Objects.equals(itemQty, other.itemQty);
	}
	@Override
	public int compareTo(InvoiceTransactionDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
