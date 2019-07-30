package Employee;

import java.util.ArrayList;
/** fetch employee class is have the Fetch Employee constructor 
 * And this fetchEmployee class is inherited by the createEmployee class*/
public class FetchEmployee extends CreateEmployee  {
	// this constructor is implementing the fetching the details of employee based on the employee id 
	public FetchEmployee(ArrayList<String[]> employe) 
	{
		int count=0;
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
		System.out.println("Enter the Employee id to find the Employee");
		int Emp_id=sc.nextInt();
		for(int initial1=0; initial1<employe.size(); initial1++)
			{
				String[] TempEmp=employe.get(initial1);
				try {
				if(TempEmp[5].equals(Integer.toString(Emp_id)))
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
				catch(NullPointerException e){
					System.out.println("Employee is not available");
				}
			}
		if(count==0) {
			System.out.println("Wrong input for id or Employee is not available");
		}

	}
  }
		
}
