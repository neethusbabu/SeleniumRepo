/*Week3-Day1-assignment 3
 * Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.

*/


package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit(int a){
		
		System.out.println("Deposit interest rate for Axis bank is "+a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank AB1= new AxisBank();
		AB1.deposit(4);

	}

}
