
/*Week3 Day1 

Assignment1
===========
     Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.
*/
package org.system;

public class Desktop extends Computer{
	
	public void DesktopSize(int a) {
		
		System.out.println("The size of the desktop is: "+a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desktop1= new Desktop();
		desktop1.ComputerModel("856A001");
		desktop1.DesktopSize(38);

	}

}
