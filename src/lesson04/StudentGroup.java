package lesson04;

public class StudentGroup {
	String groupSubject; //– специалност на студентите в групата
	Student [] students; //– Студенти в групата(масив от обекти от клас Student)
	int freePlaces; //– свободни места в групата
	
	//Класът да дефинира следните конструктори:
//		-конструктор по подразбиране който създава места за 5 студента в групата
//		(инициализира полето students с нов масив от 5 елемента) и задава стойност
//		5 на полето freePlaces
		
	public StudentGroup() {
		students = new Student[5];
		freePlaces=5;
	
	}
	
	
//	-констуктор StudentGroup(String subject) които първо извиква конструктора
//		по подразбиране и задава стойност на полето groupSubject
	public StudentGroup(String subject){
		this();
		this.groupSubject=subject;
	}
	
//	Класът да дефинира следните методи:
//		-метод void addStudent(Student s) който добавя студент към групата (добавя го към масива на следващата празна позиция)
//		ако специалността на студента съвпада с тази на групата, и разбира се, ако има свободни места.
//		След добавяне на студент към групата да се намалят свободните места в групата.
		void addStudent(Student s){
			if(students.length <5){
				students[0]=new Student();
				
			}
		 s = new Student();
			
		}

	
//		-метод void emptyGroup() който освобождава всички места в групата (задава
//		нов празен масив за полето students) и задава стойност 5 за полето
//		freePlaces.
	
//		-метод theBestStudent() - Връща името на студента с най-висок успех в
//		групата.
		String theBestStudent(Student name){
			
			return ();
			
		}
	
	
//		-метод printStudentsInGroup() - Изкарва информация (Име, успех, ...)за
//		всички студент в курса.

		


}
