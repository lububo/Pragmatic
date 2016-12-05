package lesson05;

public class ExecutePersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pete = new Person();
		Person kiti = new Person();
		
		Student stu = new Student("Stuard", 23, true, 77);
		Student meri = new Student("Meri", 21, false, 107);
		
		Employee dan = new Employee();
		Employee dom = new Employee();

//		stu.showStudentInfo();
//		meri.showStudentInfo();
//		meri.showPersonInfo();
		
		//Array of type Person created
		Person[] pers = new Person[6];
		
		pers[0]=pete;
		pers[1]=kiti;
		pers[2]=stu;
		pers[3]=meri;
		pers[4]=dan;
		pers[5]=dom;
		
		//showing oerson info to every object in the array 
		for(Person per : pers){
			per.showPersonInfo();
			
		}
		
		
		//calculating overtime of an employee
		
		System.out.println(dan.calculateOvertime(10));
		dan.name ="Daniel";
		dan.showEmployeeInfo();
		
		
		//Не знам как да направя т4 от домашното :( 
		
		
	}

}
