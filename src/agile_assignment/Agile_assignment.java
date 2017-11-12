
package agile_assignment;

import java.util.*;
public class Agile_assignment {
List<Employee> employee = Arrays.asList(new Employee("Ali","Busy","1111"),
                                        new Employee("Michelle","Available","1212"), 
                                        new Employee("Nene","Delivery","2121"));


    public void UpdateStatus(){
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Employee ID:");
        String code = scanner.nextLine();
         while(!code.matches("\\d{4}")||code.equals(" "))
        {
        System.out.print("Please enter only 4 digit number! \nPlease enter your Employee ID: ");
        code = scanner.nextLine();
        }
        while(!code.equals(employee.get(0).getDeliveryman_Code())&&!code.equals(employee.get(1).getDeliveryman_Code())&&!code.equals(employee.get(2).getDeliveryman_Code())){
            System.out.print("Please enter your Employee ID:");
            code = scanner.nextLine();
           while(!code.matches("\\d{4}")||code.equals(" "))
        {
        System.out.print("Please enter only 4 digit number! \nPlease enter your Employee ID: ");
        code = scanner.nextLine();
        }
        }
            
               
                for (int a=0;a<employee.size();a++)
                {
                 if (code.equals(employee.get(a).deliveryman_code))
                  {
                      
                     System.out.println("Welcome Back "+employee.get(a).deliveryman_name+" !");
                System.out.println("Your current status: "+employee.get(a).deliveryman_status);
                String name = employee.get(a).deliveryman_name;
                System.out.print("1.Please choose between 1-3 to update the status. \n1.Available \n2.Delivery \n3.Break \nYour choice:");
                String status = scanner.nextLine();
                
            
             while(!status.matches("\\d{1}")||status.equals(" "))
             {
             System.out.print("Invalid input! \n1.Please choose between 1-3 to update the status. \n1.Available \n2.Delivery \n3.Break \nYour choice:");
             status = scanner.nextLine();
             }
             
             if(status.equals("1")){
                 status = "Available";
             }else if(status.equals("2")){
                 status = "Delivery";
             }else if(status.equals("3")){
                 status = "Break";
             }
             
              Employee e = new Employee(name,status,code);
              System.out.println("You have successfully update your status.");
              System.out.println(e.toString());
              System.exit(0);
                          
                      }
                } 
               
            
                 
        
    
        
    }
    
    public static void main(String[] args) {
        Agile_assignment as = new Agile_assignment();
        as.UpdateStatus();
    }
    
}
