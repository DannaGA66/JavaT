
package code.bro;

public class Switchp {
    public static void main(String[] args) {
      
        String day = "Monday";
        switch(day){
            case "Sunday": 
                System.out.println("Sunday1");
                break;
            case "Saturday": 
                System.out.println("Saturday--");
                break;
            case "tuesday": 
                System.out.println("tuesday03");
                break;
            case "thursday": 
                System.out.println("thursday.5");
                break;   
            case "friday": 
                System.out.println("friday55");
                break; 
            case "Monday": 
                System.out.println("Monday?");
                break; 
            default: System.out.println("not a day");    
        }
    }
    
}
