package lesson04;

public class College {

	public static void main(String[] args) {

		Student geri = new Student("Geri", "Biology", 21, 505.0);
		Student ivan = new Student("Ivan", "Biology", 21, 505.0);
		
		
		//Student mina = new Student("Mina", "Biology", 21, 505.0);
		StudentGroup biologyGroup = new StudentGroup("Biology");
		
		Student pesho = new Student("Pesho", "Math", 21, 1005.0);
		Student misho = new Student("Misho", "Math", 21, 1005.0);
		Student irina = new Student("Irina", "Math", 21, 1005.0);

		// Testing up.Year method
		geri.yearInCollege = 1;
		System.out.println(geri.yearInCollege);
		geri.upYear();
		geri.upYear();
		geri.upYear();
		geri.upYear();
		System.out.println(geri.yearInCollege);
		// up.Year method Works :)

		// testing method receiveScholarship
		System.out.println(ivan.money);
		ivan.receiveScholarship(5.5, 235.40);
		System.out.println(ivan.money);
		ivan.age = 30;
		ivan.receiveScholarship(3.0, 500);
		// receiveScholarship works

		
		//There is something Wrong i the method :( - does not add students to the array :(
		System.out.println("There are "+biologyGroup.freePlaces+" free places in "+biologyGroup.groupSubject +" Group");
		biologyGroup.addStudent(ivan);
		biologyGroup.addStudent(irina);
		biologyGroup.addStudent(misho);
		biologyGroup.addStudent(ivan);
		biologyGroup.addStudent(ivan);
		biologyGroup.addStudent(ivan);
		biologyGroup.addStudent(ivan);
		biologyGroup.addStudent(ivan);
		
		biologyGroup.emptyGroup();
		System.out.println("There are "+biologyGroup.freePlaces+" free places in "+biologyGroup.groupSubject +" Group");
		
		
		//Not working method again :(
		biologyGroup.theBestStudent(irina, 5.5);
		
		
	}

}
