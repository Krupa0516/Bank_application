import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int accNo;
		Account aobj[]=null;
		Account temp=null;
		Bankinfo binfo=new Bankinfo();
		
		int ch=0;
		String str=null;
		
		do {
			
			System.out.println("1-create\n2-display\n3-search\n4-Transaction");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				aobj=binfo.create();
				break;
				
			case 2:
				binfo.display(aobj);
				break;
				
			case 3:
				System.out.println("Enter account number to search record");
				int accno=sc.nextInt();
				temp=binfo.searchAccount(aobj, accno);
				
				
				if(temp!=null) {
					System.out.println("Valid account");
				}
				else {
					System.out.println("Invalid account");
				}
				break;
				
			case 4:
				System.out.println("------------Transaction----------------");
				System.out.println("Enter account number");
				accNo=sc.nextInt();
				temp=binfo.searchAccount(aobj, accNo);
				
				if(temp!=null)
				{
					System.out.println("Enter transaction password");
					int password=sc.nextInt();
					
				if(temp.getPassword()==(password)) {
					
					System.out.println("enter your choice");
					System.out.println("1-withdraw\n2-Deposit");
					int ch2=sc.nextInt();
					
				if(ch2==1){
					
					System.out.println("Enter amount to withdraw");
					int amt=sc.nextInt();
					binfo.withdrawal(temp, amt);
				}
					
				
				else {
					
					System.out.println("Invalid password");
				}
				
				if(ch2==2) {
					
					System.out.println("Enter amount to deposit");
					int amt=sc.nextInt();
					binfo.deposit(temp, amt);
					
				}
				
				else {
					System.out.println("Invalid password");	
				}
				
				}
				break;
				}
				
				
			
			}
			System.out.println("Do ypu want to continue press yes or no");
			str=sc.next();
		}while(str.equals("yes"));
		System.out.println("-----------Thank you-----------");

}
	
}
