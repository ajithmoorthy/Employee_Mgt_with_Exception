package Employee;

import java.util.ArrayList;
import java.util.Scanner;
//this class implement the concept of polymorphism
public class Search {
	Scanner sc=new Scanner(System.in);
	/*Search Employee function is search the employee details based on the name and  get the user_input .
	 * if its matches print the matched employee details with same name
	*/
	public void Search(ArrayList<String[]> employe) 
	{
		int count=0;
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
			System.out.println("Enter the Employee Name to find the Employee");
			String EmployeeName=sc.next();
		for(int initial1=0; initial1<employe.size(); initial1++)
			{
				String[] TempEmp=employe.get(initial1);
				///check the employee name equals to user input name
				try {
				if(TempEmp[0].equals(EmployeeName))
					{
					count++;
					for(int initial=0; initial<TempEmp.length; initial++)
					{
						if(initial==0)
						{
							System.out.println("Personal Details");
							System.out.println("EmployeeName:\t"+TempEmp[initial]);
						}
						if(initial==1)
						{
							System.out.println("Age:\t\t"+TempEmp[initial]);
						}
						if(initial==2)
						{
							System.out.println("Email:\t\t"+TempEmp[initial]);
						}
						if(initial==3)
						{
							System.out.println("Address:\t"+TempEmp[initial]);
						}
						if(initial==4)
						{
							System.out.println("Gender:\t\t"+TempEmp[initial]);
						}
						if(initial==5)
						{
							System.out.println("Professional Details");
							System.out.println("EmployeeId:\t"+TempEmp[initial]);
						}
						if(initial==6)
						{
							System.out.println("Designation:\t"+TempEmp[initial]);
						}
						if(initial==7)
						{
							System.out.println("Skills:\t\t"+TempEmp[initial]);
						}
						if(initial==8)
						{
							System.out.println("Project:\t"+TempEmp[initial]);
						}
						if(initial==9)
						{
							System.out.println("salary:\t\t"+TempEmp[initial]);
						}
					}
					System.out.println("===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===");
					}
			}
			catch(NullPointerException e)
			{
				System.out.println("Employee is not available");
			}
			}
		if(count==0) {
			System.out.println("Wrong input for Name or Employee not available");
		}
		
	}
		  }
	/*Search Employee function is search the employee details based on the Designation and  get the user_input .
	 * if its matches print the matched employee details with same Designation
	*/

	public void Search(ArrayList<String[]> employe,String Designation) 
	{
		int count=0;
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
		for(int initial1=0; initial1<employe.size(); initial1++)
			{
				String[] TempEmp=employe.get(initial1);
				///check the designation name equals to user input designation
				try {
				if(TempEmp[6].equals(Designation))
					{
					count++;
					for(int initial=0; initial<TempEmp.length; initial++)
					{
						if(initial==0)
						{
							System.out.println("Personal Details");
							System.out.println("EmployeeName:\t"+TempEmp[initial]);
						}
						if(initial==1)
						{
							System.out.println("Age:\t\t"+TempEmp[initial]);
						}
						if(initial==2)
						{
							System.out.println("Email:\t\t"+TempEmp[initial]);
						}
						if(initial==3)
						{
							System.out.println("Address:\t"+TempEmp[initial]);
						}
						if(initial==4)
						{
							System.out.println("Gender:\t\t"+TempEmp[initial]);
						}
						if(initial==5)
						{
							System.out.println("Professional Details");
							System.out.println("EmployeeId:\t"+TempEmp[initial]);
						}
						if(initial==6)
						{
							System.out.println("Designation:\t"+TempEmp[initial]);
						}
						if(initial==7)
						{
							System.out.println("Skills:\t\t"+TempEmp[initial]);
						}
						if(initial==8)
						{
							System.out.println("Project:\t"+TempEmp[initial]);
						}
						if(initial==9)
						{
							System.out.println("salary:\t\t"+TempEmp[initial]);
						}
					}
					System.out.println("===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===");
					}
			}
				catch(NullPointerException e) {
					System.out.println("Employee is not available");
				}
				
			}
		if(count==0) {
			System.out.println("Wrong input for Designation or Employee not available");
		}
	}
		  }


}
