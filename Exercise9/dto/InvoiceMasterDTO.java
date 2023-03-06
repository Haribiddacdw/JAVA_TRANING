package dto;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceMasterDTO implements Serializable,Comparable<InvoiceMasterDTO> {
	private int invoiceno;
	private String date;
	private int customerid;
	public InvoiceMasterDTO() {
		
	}
	public InvoiceMasterDTO(int invoiceno, String date, int customerid) {
		
		this.invoiceno = invoiceno;
		this.date = date;
		this.customerid = customerid;
	}
	
	public int getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	@Override
	public String toString() {
		return "InvoiceMasterDTO [invoiceno=" + invoiceno + ", date=" + date + ", customerid=" + customerid + "]";
	}
	
	@Override
	public int compareTo(InvoiceMasterDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(customerid, date, invoiceno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMasterDTO other = (InvoiceMasterDTO) obj;
		return customerid == other.customerid && Objects.equals(date, other.date) && invoiceno == other.invoiceno;
	}
	
	
	
}
