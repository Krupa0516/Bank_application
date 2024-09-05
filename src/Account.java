
public class Account {
	
	private int accno;
	private String custname;
	private int accbal;
	private int password;
	public Account(int accno, String custname, int accbal, int password) {
		
		this.accno = accno;
		this.custname = custname;
		this.accbal = accbal;
		this.password = password;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	

}
