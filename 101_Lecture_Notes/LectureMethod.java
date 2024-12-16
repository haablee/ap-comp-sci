/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        greeting("Poop");
        greeting("Poppy");
        greeting("Poopy");
        greeting("PPoppi");
        
        System.out.println();
        
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        System.out.println();
        
        double pay = raiseSalary(1000.42, 14);
        System.out.println(pay);
        
        pay = raiseSalary(52000.78, 5);
        System.out.println(pay);
        
        pay = raiseSalary(pay, 2);
        System.out.println(pay);
    }
	
	
	public static void greeting(String name){
	    System.out.println("Hello " + name);
	}
	
	
	public static double raiseSalary(double salary, int percent){
	    double raisedSalary = salary + (salary * (percent/100.0));
	    return raisedSalary;
	}
	
	
	public static void printAnimal(){
	    System.out.println("        |\\      _,,,---,,_");
        System.out.println("ZZZzz  /,`.-'`'    -.  ;-;;,_");
        System.out.println("      |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("     '---''(_/--'  `-'\\_)");
        System.out.println();
	}
	
}