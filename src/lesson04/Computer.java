
package lesson04;
public class Computer {
	int year;// – числова стойност показваща година на производство на компютъра
	double price;// – числова стойност (не е задължително да е цяло число)
					// показваща цената на компютъра
	boolean isNotebook;// – булева стойност – дали компютъра е преносим или не
	double freeMemory;// – числова стойност показваща размера на свободната памет
	String model;
	int hardDiskMemory;// – числова стойност за размера на хардиска
	String operationSystem;// – текстово поле за операционната система на
							// компютъра

	//Constructors
	
	Computer(){
		isNotebook=false;
		operationSystem="Win XP";
	}
	
	
	Computer(String model,int year, double price, int harDiskMemory, double freeMemory){
		this();
		this.model=model;
		this.year=year;
		this.price = price;
		this.hardDiskMemory=harDiskMemory;
		this.freeMemory=freeMemory;
	}
	Computer(String model, int year, double price, boolean isNotebook,int harDiskMemory, double freeMemory, String operationSystem){
		this.model=model;
		this.year=year;
		this.price = price;
		this.isNotebook=isNotebook;
		this.hardDiskMemory=harDiskMemory;
		this.freeMemory=freeMemory;
	}
	 
	
	
	// Дефиниране на следните методи: changeOperationSystem; useMemory
	
	//Метод за сравняване цните на 2 компютъра
	
	int comparePrice(Computer comp){
		if(this.price > comp.price){
			System.out.println("The price of our PC "+ this.model+ " is bigger");

			return -1;
		}else if(this.price < comp.price){
			System.out.println("The price of compared PC "+ comp.model+ " is bigger");
			return 1;
		}
		System.out.println("The prices of both PC are equal");
		return 0;
	}

	// Метод който сменя стойността на полето operationSystem със стойността подадена като параметър.
	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
		System.out.println("The new operation System is: " + operationSystem);

	}

	/*
	 * metod намалява свободната памет (freeMemory) със стойността подадена като аргумент. 
	 * Ако стойността на аргумента е по-голяма от свободната памет,
	 * извеждa съобщение "Not enough free memory!"
	 */
	void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Current free memoryis: "+freeMemory +" So Not enough free memory!");
		}else{ 
			freeMemory-=memory;
			System.out.println("Changed value of memory is: "+freeMemory + "MB");
		}

	}

}
