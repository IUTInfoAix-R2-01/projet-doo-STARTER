package Exercice3;

public class Employee {
	// private instance variable, not accessible from outside this class
		private int id;
		private String firstName;
		private String lastName ;
		private int salary;
		
		// Constructors (overloaded)
		public Employee() // 1st (default) constructor
		{}
		
		public Employee(int i, String f, String l, int s)
		{
			this.id = i ;
			this.firstName = f ;
			this.lastName = l ;
			this.salary = s ;
		}
	
		
		@Override
		public String toString()
		{
			return "Employee[numéro =" + id  + " prénom =" + firstName + " nom  = " + lastName + " salaire = " + salary + "]";
		}
	
	
}
