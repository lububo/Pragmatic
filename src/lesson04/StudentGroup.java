package lesson04;

public class StudentGroup {
	String groupSubject; // – специалност на студентите в групата
	Student[] students; // – Масив със Студенти в групата
	int freePlaces; // – свободни места в групата

	// Класът да дефинира следните конструктори:
	// -конструктор по подразбиране който създава места за 5 студента в групата
	// (инициализира полето students с нов масив от 5 елемента) и задава
	// стойност
	// 5 на полето freePlaces

	public StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	// -констуктор StudentGroup(String subject) които първо извиква конструктора
	// по подразбиране и задава стойност на полето groupSubject
	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	// Класът да дефинира следните методи:
	// -метод void addStudent(Student s) който добавя студент към групата
	// (добавя го към масива на следващата празна позиция)
	// ако специалността на студента съвпада с тази на групата, и разбира се,
	// ако има свободни места.
	// След добавяне на студент към групата да се намалят свободните места в
	// групата.
	void addStudent(Student s) {
		int index =0;
		if (students.length-1 < 5) {
			students[index] = new Student();
			
			index++;

		}
		s = new Student();

	}

	// -метод void emptyGroup() който освобождава всички места в групата (задава
	// нов празен масив за полето students) и задава стойност 5 за полето
	// freePlaces.
	void emptyGroup() {
		students = new Student[5];

	}

	// -метод theBestStudent() - Връща името на студента с най-висок успех в
	// групата.
	String theBestStudent(Student student, double grade, String name) {
		for (Student st : students) {
			if (student.grade > st.grade) {
				return student.name + "Has the highest grade";
			}
		}
		return student.name + "Has the highest grade";

	}

	// -метод printStudentsInGroup() - Изкарва информация (Име, успех, ...)за
	// всички студент в курса.
	void printStudentsInGroup() {

		for (Student st : students) {
			System.out.println(" St name: " + st.name + " St age: " + st.age + " St grade: " + st.grade);

		}

	}

}
