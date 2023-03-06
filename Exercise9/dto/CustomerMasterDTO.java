package dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable,Comparable<InvoiceTransactionDTO>{
    private int invoiceNo; 
   private int customerId;
   private String customerName;
   private String customerAddress;
   
   public CustomerMasterDTO() {
	
}

public CustomerMasterDTO(int customerId, String customerName, String customerAddress) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

@Override
public String toString() {
	return "CustomerMasterDTO [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + "]";
}

@Override
public int hashCode() {
	return Objects.hash(customerAddress, customerId, customerName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomerMasterDTO other = (CustomerMasterDTO) obj;
	return Objects.equals(customerAddress, other.customerAddress) && Objects.equals(customerId, other.customerId)
			&& Objects.equals(customerName, other.customerName);
}

@Override
public int compareTo(InvoiceTransactionDTO o) {
	// TODO Auto-generated method stub
	return 0;
}
   

}
