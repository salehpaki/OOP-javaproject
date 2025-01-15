
package mobile;

import java.util.Scanner;
import java.lang.String;

public class Rom {
      static  String email;
    static  int pass;
    static char run1;

    public static void main(String[] args)  {
     Scanner store=new Scanner(System.in);
        System.out.println("**********RS MOBILE MERKET**********");
        System.out.printf("1) ADMIN\n2) CUSTOMER\n");
        int a1=store.nextInt();
       
        User obj1=new User();
        Customer obj2=new Customer();
        
        switch(a1)
        {
            case 1:
            {
                
                System.out.print("NAME: ");
                String name1=store.next();
                
                System.out.print("PASSWORD: ");
                int pass1=store.nextInt();
                obj1.set(2,"h",name1, pass1,"r","r",4,"3");
                obj1.get();
                do{
                System.out.println("1) Want to buy any phone.");
                System.out.println("2) Want to delete any phone from the list.");
                System.out.println("3) Want to add any phone to the list.");
                System.out.println("4) Want to check the detail of any phone.");
                int en=store.nextInt();
                if(en==1)
                {
                    obj1.buy();
                }
                else if(en==2)
                {
                    obj1.delete();
                }
                else if(en==3)
                {
                    obj1.add();
                }
                else if(en==4)
                {
                    obj1.detail();
                }
                else
                {
                        System.out.println("Wrong input");
                }
                System.out.printf("\nWant to run again (Y/N)\n");
                char run=store.next().charAt(0);
                run1=run;
                }              
                while(run1=='Y'||run1=='y');
                System.out.println("***HAVE A NICE DAY SIR***");
                
            }break;
            case 2:
            {
               do{
                System.out.println("Do you want to\n1) register\n2) login\n");
                int log=store.nextInt();
                switch(log)
                {
                    case 1:
                    {
                
                System.out.print("ID: ");
                int id=store.nextInt();
                System.out.print("NAME: ");
                String name=store.next();
                System.out.print("EMAIL: ");
                String email=store.next();
                Rom.email=email;
                System.out.print("PASSWORD: ");
                int pass=store.nextInt();
                Rom.pass=pass;
                System.out.print("CITY: ");
                String city=store.next();
                System.out.print("COUNTRY: ");
                String country=store.next();
                System.out.print("PHONE NO: ");
                int phoneno=store.nextInt();
                System.out.print("ADDRESS: ");
                String address=store.next();
                obj2.set(id,name,email,pass,city,country,phoneno,address);
                
                System.out.println("1) Want to buy any phone.");
                System.out.println("2) Want to check the detail of any phone.");
                System.out.println("3) want to give reviews on a mobile.");
                int en1=store.nextInt(); 
                if(en1==1)
                {
                    obj2.buy();
                }
                else if(en1==2)
                {
                    obj2.detail();
                }           
                else if(en1==3)
                {
                    obj2.review();
                }
                
                else
                {
                        System.out.println("Wrong input");
                }
                
               
        }break;
          case 2:
          {
          
           System.out.println("**********Login**********");
              System.out.print("Email: ");
           String em=store.next();
              System.out.print("Password: ");
           int p=store.nextInt();
        if(p==pass && em.equals(email) )
        {
            
           System.out.println("1) Want to buy any phone.");
                System.out.println("2) Want to check the detail of any phone.");
                System.out.println("3) want to give reviews on a mobile.");
                int en1=store.nextInt(); 
                if(en1==1)
                {
                    obj2.buy();
                }
                else if(en1==2)
                {
                    obj2.detail();
                }

                else if(en1==3)
                {
                    obj2.review();
                }

                else
                {
                        System.out.println("Wrong input");
                }
                
                }              
                
        
        else
        {
            System.out.println("wrong input");
            System.exit(0);
            
        }
                    }break;
                }
               System.out.printf("\nWant to run again (Y/N)\n");
                char run=store.next().charAt(0);
                run1=run;
                }            
                while(run1=='Y'||run1=='y');
                System.out.println("***THANKS FOR COMMING***");   
            }break;
            
            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
            
        }
       
    }
    
}
