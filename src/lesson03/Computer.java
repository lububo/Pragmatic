package lesson03;

public class Computer {
	int year;// – числова стойност показваща година на производство на компютъра
	double price;// – числова стойност (не е задължително да е цяло число)
					// показваща цената на компютъра
	boolean isNotebook;// – булева стойност – дали компютъра е преносим или не
	double freeMemory;// – числова стойност показваща размера на свободната
						// памет
	int hardDiskMemory;// – числова стойност за размера на хардиска
	String operationSystem;// – текстово поле за операционната система на
							// компютъра

	// Дефиниране на следните методи: changeOperationSystem; useMemory

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
