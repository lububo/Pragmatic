package lesson04;

public class Student {

	
	String name ;//– име на студента
	String subject;// - специалност
	double grade ;//- успех
	int yearInCollege ;//– курс
	int age ;//– години на студента
	boolean isDegree;//Degree – дали е завършил или не
	double money ;//– пари от стипендии
	
	//конструктори:
	Student(){
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	Student(String name, String subject, int age, double money){
		this();
	}
	//Класът да дефинира следните методи:
		void upYear(){ //който увеличава годината в колежа с единица, акостудента не е завършил, в противен случай извежда подходящо
						//съобщение. Ако след увеличаването годината стане 4, задава true на полето isDegree
		if (yearInCollege<4){
			yearInCollege++;
		}else if (yearInCollege==4){
			isDegree=true;
			System.out.println("Congrats you've graduated");
		}else{
			isDegree=true;
			System.out.println("Congrats you've graduated");
		}
//		– добавя сумата amount кум парите на студента, само ако успеха му е по-висок или равен
//		на минималния успех подаден като параметър (min) и ако възрастта му е под 30 години.
//		Метода връща текущите пари на студента (след евентуалното им увеличение
		}
		double receiveScholarship(double minGradeForSchollarship, double amount){
			if(grade >=minGradeForSchollarship && age <30){
				money +=amount;
				return money;
			}else if(grade < minGradeForSchollarship || age >= 30){
				System.out.println("You do not have the grade or you are too old for a scholarship ");
				System.out.println("Yur grade is: "+this.grade+" " + " Your age is: " + this.age);
			}
			return money;
		
		
		}
		
	
}
