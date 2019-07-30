package Employee;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
//create Employee class create the employee with the personal and professional details
public class CreateEmployee 
{
	//declarethe variables for the Employee to store the Employee details
	protected int Employee_Id;
	private int age;
	private String Employee_Name,project;
	private String Designation,Address,branch;
	private String Skills,mailId,Gender;
	private int Salary;
	
	Scanner sc=new Scanner(System.in);
	 ArrayList<String[]> Employee_Db=new ArrayList<String[]>(100);
	 
	/*personal details store the values into the employee array and it add to the list
	 * each employee is created then it will add to the list*/
	public ArrayList<String[]> PersonalDetails() 
	{
		int initial2=0;
		System.out.println("Enter the Personal Details of Employee:");
		String[] Employee=new String[10];
		//for loop for the get the user input in runtime and stored in String Array
		
		for(int initial=0;initial<Employee.length; initial++)
		{
			try {
			if(initial==0){
				System.out.println("Enter the Employee_name:");
				Employee_Name=sc.next();
				Employee[initial]=Employee_Name;
			}
			if(initial==1){
				try {
				System.out.println("Enter the Employee_age:");
				age=sc.nextInt();
				if(age<=0) {
					throw new CustomException();
				}
				}
				catch(CustomException e){
				System.out.println("aga is not nagative or zero");
				break;
				}
				Employee[initial]=Integer.toString(age);
				}
			if(initial==2){
				System.out.println("Enter the mailId of Employee:");
				mailId=sc.next();
				Employee[initial]=mailId;
				}
			if(initial==3){
				System.out.println("Enter the Address of Employee:");
				Address=sc.next();
				Employee[initial]=Address;
			}
			if(initial==4)
			{
				System.out.println("Enter the Gender of Employee:");
				Gender=sc.next();
				Employee[initial]=Gender;
				
				}
			if(initial==5)
			{
				System.out.println("Enter the Professional Details of Employee");
				System.out.println("Enter the Employee_id:");
				Employee_Id=sc.nextInt();
				Employee[initial]=Integer.toString(Employee_Id);
			}
			if(initial==6)
			{
				System.out.println("Enter the Designation:");
				Designation=sc.next();
				Employee[initial]=Designation;
				}
			if(initial==7)
			{
				System.out.println("Enter the Skills of Employee:");
				Skills=sc.next();
				Employee[initial]=Skills;
				}
			if(initial==8)
			{
				System.out.println("Enter the Project Employee is Working On:");
				project=sc.next();
				Employee[initial]=project;
				}
			if(initial==9) {
			System.out.println("Enter the Salary of Employee:");
			Salary=sc.nextInt();
			Employee[initial]=Integer.toString(Salary);
			}
			}
			catch(InputMismatchException e)
			{
				System.out.println(" Wrong datatype! Enter the integers");
				System.out.println("Employee is not Created");
				CreateEmployee createEmp=new CreateEmployee();
				createEmp.PersonalDetails();
				break;
			}
		}
		for(String str2:Employee)
		{
			if(str2!=null)
			{
				initial2++;
			}
		}
		if(initial2==10) {
		Employee_Db.add(Employee);
		System.out.println("Employee is successfully Created");
		}
		return Employee_Db;
		}
	
}