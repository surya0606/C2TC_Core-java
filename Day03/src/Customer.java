
public class Customer {
	private int customerid;
	private String customername;
	private String customercity;
	
	Customer(){
		System.out.println("user defined constructor");
	}
	//method/function
	void display() {
		System.out.println(customerid+" "+customername+" "+customercity);
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	//@Override
	/*public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customercity="
				+ customercity + ", getCustomerid()=" + getCustomerid() + ", getCustomername()=" + getCustomername()
				+ ", getCustomercity()=" + getCustomercity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}*/
	
	
	
	

	
}
