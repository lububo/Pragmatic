package lesson05;

public class Person {

	protected String name;
	protected int age;
	protected boolean isMan;
	
	Person(){
		name="Ivo";
		age=21;
		isMan = true;
	
	
//		– Метод showPersonInfo, който показва информация за човека
//		(изписва на конзолата стойността на всичките му полета по
//		подходящ начин)
			
	}
	
	void showPersonInfo(){
		System.out.println( "The name is: "+name +" Age is: "+age+" Is this person a man? "+isMan);
		
		
	}
	
}
