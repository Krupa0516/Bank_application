import java.util.Scanner;

public class Bankinfo {
	
	
	public Account[] create() {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter how many objects do uh want");
		int n=sc.nextInt();
		Account accarr[]=new Account[n];
		
		for (int i=0;i<accarr.length;i++)
		{
			System.out.println("Enter account no");
			int accNo=sc.nextInt();
			
			System.out.println("Enter customer name");
			String custname=sc.next();
			
			System.out.println("Enter Account bal");
			int accbal=sc.nextInt();
			
			System.out.println("Enter password");
			int password=sc.nextInt();
			
			Account aobj=new Account(accNo,custname,accbal,password);
			accarr[i]=aobj;
			
		}
		return accarr;
	}
	public void display(Account[] aobj) {
		
		for(int i=0;i<aobj.length;i++) {
			
			System.out.println("---------------------------------------");
			System.out.println("Account no:"+aobj[i].getAccno());
			System.out.println("Customer name:"+aobj[i].getCustname());
			System.out.println("Account balance:"+aobj[i].getAccbal());
			System.out.println("Password :"+aobj[i].getPassword());
			
			
		}
	}
	
	public Account searchAccount(Account aobj[],int search) {
		
        Account temp=null;
		for (int i=0;i<aobj.length;i++) {
			
			if(aobj[i].getAccno()==search) {
				temp=aobj[i];
			}
			
		}
		return temp;
	}
	
	public void withdrawal(Account temp,int wamt) {
		
		int currbal=temp.getAccbal();
		int rembal=currbal-wamt;
		temp.setAccbal(rembal);
		System.out.println("After transaction current balance is:"+temp.getAccbal());
		
	}
	
	public void deposit(Account temp,int damt) {
		
		temp.setAccbal(temp.getAccbal()+damt);
	}
	
}
