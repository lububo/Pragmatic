package lesson04;

public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer asus = new Computer("Asus", 2019, 2500, 500, 16000);
		Computer dell = new Computer("Dell", 2015, 2500, 500, 16000);
		Computer china = new Computer("Yellow", 1988, 1000, 100, 1000);

		System.out.println("OS of china PC is " +china.operationSystem);
		System.out.println("exit code "+(asus.comparePrice(dell)));
	}

}
