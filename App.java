import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
              
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("enter name:");
        String newName = myObj.nextLine();
        
        Student obj1 = new Student();
        obj1.setName(newName);
        //System.out.println(obj1.getName());
        
        String testname = obj1.getName();
        //System.out.println(testname);
        
        if(testname.isBlank()){
            System.out.println("Unknown");
        }
        else{
            System.out.println(testname);
        }
    }
}
