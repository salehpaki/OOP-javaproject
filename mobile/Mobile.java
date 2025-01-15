
package mobile;

import java.util.Scanner;

public abstract class Mobile {
    public int card1;
    public int credit_card1=400000;
    public int prize;
    abstract void set(int a,String b,String c,int d,String e,String f,int g,String h);
     void creditcard()
    {
        Scanner n=new Scanner(System.in);
         do{
                System.out.println("Please Swip your card and enter the code:");
                int code=n.nextInt();
                card1=code;
                 if(code==19689)
                {
                    int re=credit_card1-prize;
                System.out.println("Your return prize is "+re); 
                }
                else
                {
                    System.out.println("Sorry wrong input");
                }
            }while(card1!=19689);
    }
}
