package Employee;

import java.util.ArrayList;

abstract class Initial  {
public ArrayList<String[]> values()
{
	ArrayList<String[]> Employee_Db=new ArrayList<String[]>(100);
	String Employee1[]={"1132","ajith","21","trainee","java","20000"};
	String Employee2[]={"1130","rishav","23","HR","leadership","28000"};
	Employee_Db.add(Employee1);
	Employee_Db.add(Employee1);
	return Employee_Db;
}
}
