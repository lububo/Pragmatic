package lesson05;

public class Student extends Person{
	protected int score;
	
	Student(String name, int age, boolean isMan, int score){
		this.name=name;
		this.age=age;
		this.isMan=isMan;
		this.score=score;
	}
	void showStudentInfo(){
		System.out.println( "The name is: "+name +" Age is: "+age+" Is this person a man: "+isMan+ " Score: "+score);

	}

}
