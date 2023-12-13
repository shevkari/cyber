package day10oct23ComparabaleaANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ascempid implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.getEmpid() - e2.getEmpid();
	}
}


class descempid implements Comparator<Employee>
{
	public int compare(Employee E1, Employee E2)
	{
		return E2.getEmpid()-E1.getEmpid();
	}
}


class aseName implements Comparator<Employee>
{
	public int compare(Employee E1, Employee E2)
	{
		return E1.getName().compareTo(E2.getName());
	}
}

class descName implements Comparator<Employee>
{
	public int compare(Employee E1, Employee E2)
	{
		return E2.getName().compareTo(E1.getName());
	}
}

public class AL {

	public static void main(String[] args) {

		List<Employee> al = new ArrayList<>();
		
		Employee emp1 = new Employee(2,"Rohit");
		Employee emp2 = new Employee(5,"Virat");
		Employee emp3 = new Employee(4,"Shikhar");
		Employee emp4 = new Employee(8,"SKY");
		
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		
		
		System.out.println(al);
		
		Collections.sort(al,new ascempid());
		
		System.out.println(al);
		
		Collections.sort(al, new descempid());
		System.out.println(al);
		
		Collections.sort(al, new aseName());
		System.out.println(al);
		
		Collections.sort(al, new descName());
		System.out.println(al);
	}

}




