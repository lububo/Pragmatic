/*Да се създаде клас ComputerDemo, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
www.pragmatic.bg
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър да е лаптоп.
 На единия от двата компютъра да се задели памет 100 (чрез метода useMemory), 
 а на другия, да се смени операционната система (чрезметода changeOperationSystem), 
 след което да се изведат на екрана всичките полета на двата компютъра
 */
package lesson03;

public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc1 = new Computer();
		Computer pc2 = new Computer();

		System.out.println("pc1--------------");
		pc1.year = 1980;
		pc1.isNotebook=true;
		pc1.price=1000;
		pc1.freeMemory=4000;
		pc1.hardDiskMemory=500;
		pc1.operationSystem="Ubuntu";
		//извеждане навсичките полета на компютъра pc1
		System.out.println(	"pc1 basic stats year "+	pc1.year +	", isNotebook "	+pc1.isNotebook +", price "	+pc1.price+ ", free memory "  +pc1.freeMemory+ "MB"+ ", HDD "+ pc1.hardDiskMemory+"GB " + " OS: "+ pc1.operationSystem);
		//заделяне 100 мб памет
		pc1.useMemory(100.0);
		
		System.out.println("pc2--------------------------");
		pc2.year=2001;
		pc2.isNotebook = false;
		pc2.price=2500;
		pc2.freeMemory=32000;
		pc2. hardDiskMemory=2;
		pc2.operationSystem="Windows 10";
		//извеждане навсичките полета на компютъра pc2
		System.out.println(	"pc2 basic stats year "+	pc2.year +	", isNotebook "	+pc2.isNotebook +", price "	+pc2.price+ ", free memory "  +pc2.freeMemory+ "MB"+ ", HDD "+ pc2.hardDiskMemory +"TB "+ " OS: "+ pc2.operationSystem);

		//смяна на ОС
			pc2.changeOperationSystem("Unix");
	}

}
