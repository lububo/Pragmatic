package lesson05;

public class Employee extends Person {
	
	 protected double daySalary;
	
	public Employee() {
		name = "Stan";
		age=31;
		isMan=true;
		daySalary=350.35;
	
	}
	
	
	double calculateOvertime(double hours){
		if (this.age<18){
			this.daySalary +=0;
			System.out.println("No overtime is paied to this Employee");
			return this.daySalary;
		}else{
			double hourSalay;
			hourSalay = this.daySalary/8;
			this.daySalary= (hourSalay*hours)*1.5;
			return this.daySalary;
		}
		
	}
	
	void showEmployeeInfo(){
		System.out.println( "The name is: "+this.name +" Age is: "+this.age+" Is this person a man: "+this.isMan+ " Salary: "+this.daySalary);

	}
}
