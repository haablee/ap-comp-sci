/* 
    Lecture note example - Classes
*/
package pkg;

//Global Variables
public class Car{
    String model;
    String color;
    int horsePower;
    double topSpeed;
    boolean isElectric;
    
    //Constructors
    public Car(){
        model = "cybertruck";
        color = "black";
        horsePower = 600;
        topSpeed = 115.22;
        isElectric = true;
    }
    
    public Car(String m, String c, double s){
        model = m;
        color = c;
        topSpeed = s;
        horsePower = 500;
        isElectric = false;
    }
    
    //Methods
    public void vroom(){
        int count = 0;
        while(count < topSpeed){
            System.out.println(model + " goes vroom");
            count = count + 10;
        }
    }
    
}