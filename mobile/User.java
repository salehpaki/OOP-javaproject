
package mobile;
import java.util.Scanner;

public class User extends Mobile {
    protected String name;
    protected int pass;
    int prize1;
    @Override
    void set(int a, String b, String c, int d, String e, String f, int g, String h)
    {
        name=c;
        pass=d;
               
    }
    void get()
    {
        if("romail".equals(name) && pass==123 ||"saleh".equals(name) && pass==123 )
        {
            System.out.printf("***Welcome %s***\n",name);
        }
        else
        {
            System.out.println("wrong input");
            System.exit(0);
           
        }
    }
   
    void buy()
    {
      Scanner store=new Scanner(System.in);
        System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
               
                int mob=store.nextInt();
                switch(mob)
                {
                    case 1:
                    {
                        System.out.println("**********Samsung**********");
                        System.out.printf("1) GalaxyA135G\n2) GalaxyA03\n3) GalaxyA03Core\n");
                        int m1=store.nextInt();
                        switch(m1)
                        {
                            case 1:
                            {
                               
                                prize1=25000;
                               
                                Samsung obj3=new Samsung();
                                obj3.GalaxyA135G();
                                         System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
               
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                                 
                            }break;
                            case 2:
                            {
                                prize1=31000;
                               
                                Samsung obj3=new Samsung();
                                obj3.GalaxyA03();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 3:
                            {
                                prize1=25000;
                               
                                Samsung obj3=new Samsung();
                                obj3.GalaxyA03Core();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    case 2:
                    {
                        System.out.println("**********Apple**********");
                        System.out.printf("1) IPHONE12PROMAX \n2) IPHONE11PROMAX\n3) IPHONEXS\n");
                        int m2=store.nextInt();
                        switch(m2)
                        {
                            case 1:
                            {
                                prize1=129999;
                               
                                Apple obj2=new Apple();
                                obj2.IPHONE12PROMAX();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
              super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 2:
                            {
                                prize1=111999;
                                Apple obj2=new Apple();
                                obj2.IPHONE11PROMAX();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 3:
                            {
                                prize1=100000;
                               
                                Apple obj2=new Apple();
                                obj2.IPHONEXS();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
               super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    case 3:
                    {
                        System.out.println("**********Huawei**********");
                        System.out.printf("1) NOVA9PRO\n2) MATE40E\n3) Y7a\n");
                        int m3=store.nextInt();
                        switch(m3)
                        {
                            case 1:
                            {
                                prize1=92999;
                               
                                Huawei obj4=new Huawei();
                                obj4.NOVA9PRO();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
               super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 2:
                            {
                                prize1=114999;
                               
                                Huawei obj4=new Huawei();
                                obj4.MATE40E();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
               super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 3:
                            {
                                prize1=35999;
                               
                                Huawei obj4=new Huawei();
                                obj4.Y7a();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                     case 4:
                    {
                        System.out.println("**********Infinix**********");
                        System.out.printf("1) ZEROXPRO\n2) ZERO8\n3) NOTE11\n");
                        int m4=store.nextInt();
                        switch(m4)
                        {
                            case 1:
                            {
                                prize1=49999;
                               
                                Infinix obj4=new Infinix();
                                obj4.ZEROXPRO();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
               super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 2:
                            {
                                int prize1=36999;
                               
                                Infinix obj4=new Infinix();
                                obj4.ZERO8();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 3:
                            {
                                prize1=28999;
                               
                                Infinix obj4=new Infinix();
                                obj4.NOTE11();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                       case 5:
                    {
                        System.out.println("**********Lenovo**********");
                        System.out.printf("1) Q3T\n2) C21Y\n3) C25S\n");
                        int m5=store.nextInt();
                        switch(m5)
                        {
                            case 1:
                            {
                                prize1=24999;
                               
                                Lenovo obj5=new Lenovo();
                                obj5.Q3T();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
            super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 2:
                            {
                                prize1=34999;
                               
                                Lenovo obj5=new Lenovo();
                                obj5.C21Y();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            case 3:
                            {
                                prize1=34999;
                               
                                Lenovo obj5=new Lenovo();
                                obj5.C25S();
                                   System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                      case 6:
                    {
                        System.out.println("**********Motorola**********");
                        System.out.printf("1) G31\n2) E30\n3) G80\n");
                        int m6=store.nextInt();
                        switch(m6)
                        {
                            case 1:
                            {
                                prize1=38999;
                                Motorola obj6=new Motorola();
                                obj6.G31();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                               
                            }break;
                            case 2:
                            {
                                prize1=30999;
                                Motorola obj6=new Motorola();
                                obj6.E30();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 3:
                            {
                                prize1=40999;
                                Motorola obj6=new Motorola();
                                obj6.G80();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                     case 7:
                    {
                        System.out.println("**********Nokia**********");
                        System.out.printf("1) X100\n2) G300\n3) T20\n");
                        int m7=store.nextInt();
                        switch(m7)
                        {
                            case 1:
                            {
                                prize1=44999;
                                Nokia obj7=new Nokia();
                                obj7.X100();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 2:
                            {
                                prize1=33999;
                                Nokia obj7=new Nokia();
                                obj7.G300();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 3:
                            {
                                prize1=374000;
                                Nokia obj7=new Nokia();
                                obj7.T20();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
              super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                     case 8:
                    {
                       
                        System.out.println("**********Oppo**********");
                        System.out.printf("1) AS\n2) A16\n3) A11K\n");
                        int m8=store.nextInt();
                        switch(m8)
                        {
                            case 1:
                            {
                                prize1=24999;
                                Oppo obj8=new Oppo();
                                obj8.AS();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 2:
                            {
                                prize1=27000;
                                Oppo obj8=new Oppo();
                                obj8.A16();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 3:
                            {
                                prize1=21800;
                                Oppo obj8=new Oppo();
                                obj8.A11K();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
              super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    case 9:
                    {
                        System.out.println("**********Realme**********");
                        System.out.printf("1) Q3T\n2) C21Y\n3) C25S\n");
                        int m9=store.nextInt();
                        switch(m9)
                        {
                            case 1:
                            {
                                prize1=24999;
                                Realme obj9=new Realme();
                                obj9.Q3T();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 2:
                            {
                                prize1=34999;
                                Realme obj9=new Realme();
                                obj9.C21Y();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 3:
                            {
                                prize1=34999;
                                Realme obj9=new Realme();
                                obj9.C25S();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                   
                   
                     
                     
                   
                    case 10:
                    {
                        System.out.println("**********vivo**********");
                        System.out.printf("1) Y15A\n2) T1\n3) Y71T\n");
                        int m10=store.nextInt();
                        switch(m10)
                        {
                            case 1:
                            {
                                prize1=36999;
                                vivo obj10=new vivo();
                                obj10.Y15A();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 2:
                            {
                                prize1=36999;
                                vivo obj10=new vivo();
                                obj10.T1();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 3:
                            {
                                prize1=31999;
                                vivo obj10=new vivo();
                                obj10.Y71T();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
               super.prize=prize1;
                super.creditcard();
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;    
                }
           
    }
    void delete()
    {
        Scanner store=new Scanner(System.in);
        System.out.println("Which phone you want to remove");
        String mob1=store.next();
        switch(mob1)
        {
            case "samsung":
            {
                System.out.printf("2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "apple":
            {
                System.out.printf("1) Samsung\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "huawei":
            {
                System.out.printf("1) Samsung\n2) Apple\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "infinix":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "lenovo":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "motorola":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "nokia":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n8) Oppo\n9) Realme\n10) Vivo\n");
            }break;
            case "oppo":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n9) Realme\n10) Vivo\n");
            }break;
            case "realme":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n10) Vivo\n");
            }break;
            case "vivo":
            {
                System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n");
            }break;
            default:
        {
        System.out.println("Sorry wrong input");
    }break;
        }
       
        System.out.println("Phone has been removed");
    }
    void add()
    {
       
        Scanner store=new Scanner(System.in);
       
        System.out.println("Which phone you want to add");
        String mob2=store.next();
         System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n11) %s",mob2);
       
    }
    void detail()
    {
        Scanner store=new Scanner(System.in);
        System.out.printf("1) Samsung\n2) Apple\n3) Huawei\n4) Infinix\n5) Lenovo\n6) Motorola\n7) Nokia\n8) Oppo\n9) Realme\n10) Vivo\n");
               
                int mob=store.nextInt();
                switch(mob)
                {
                    case 1:
                    {
                        System.out.println("**********Samsung**********");
                        System.out.printf("1) GalaxyA135G\n2) GalaxyA03\n3) GalaxyA03Core\n");
                        int m1=store.nextInt();
                        switch(m1)
                        {
                            case 1:
                            {
                               
                               
                               
                                Samsung obj3=new Samsung();
                                obj3.GalaxyA135G();
                                     
                                 
                            }break;
                            case 2:
                            {
                               
                               
                                Samsung obj3=new Samsung();
                                obj3.GalaxyA03();
       
                            }break;
                            case 3:
                            {
                               
                               
                                Samsung obj3=new Samsung();
                                obj3.GalaxyA03Core();
       
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    case 2:
                    {
                        System.out.println("**********Apple**********");
                        System.out.printf("1) IPHONE12PROMAX \n2) IPHONE11PROMAX\n3) IPHONEXS\n");
                        int m2=store.nextInt();
                        switch(m2)
                        {
                            case 1:
                            {
                               
                               
                                Apple obj2=new Apple();
                                obj2.IPHONE12PROMAX();
       
                            }break;
                            case 2:
                            {
                               
                                Apple obj2=new Apple();
                                obj2.IPHONE11PROMAX();
   
                            }break;
                            case 3:
                            {
                               
                                Apple obj2=new Apple();
                                obj2.IPHONEXS();
     
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    case 3:
                    {
                        System.out.println("**********Huawei**********");
                        System.out.printf("1) NOVA9PRO\n2) MATE40E\n3) Y7a\n");
                        int m3=store.nextInt();
                        switch(m3)
                        {
                            case 1:
                            {
                               
                                Huawei obj4=new Huawei();
                                obj4.NOVA9PRO();
       
                            }break;
                            case 2:
                            {
                               
                                Huawei obj4=new Huawei();
                                obj4.MATE40E();
         
                            }break;
                            case 3:
                            {
                               
                                Huawei obj4=new Huawei();
                                obj4.Y7a();
     
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                     case 4:
                    {
                        System.out.println("**********Infinix**********");
                        System.out.printf("1) ZEROXPRO\n2) ZERO8\n3) NOTE11\n");
                        int m4=store.nextInt();
                        switch(m4)
                        {
                            case 1:
                            {
                               
                                Infinix obj4=new Infinix();
                                obj4.ZEROXPRO();
           
                            }break;
                            case 2:
                            {
                               
                               
                                Infinix obj4=new Infinix();
                                obj4.ZERO8();
         
                            }break;
                            case 3:
                            {
                               
                                Infinix obj4=new Infinix();
                                obj4.NOTE11();
     
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                       case 5:
                    {
                        System.out.println("**********Lenovo**********");
                        System.out.printf("1) Q3T\n2) C21Y\n3) C25S\n");
                        int m5=store.nextInt();
                        switch(m5)
                        {
                            case 1:
                            {
                               
                               
                                Lenovo obj5=new Lenovo();
                                obj5.Q3T();
           
                            }break;
                            case 2:
                            {
                               
                                Lenovo obj5=new Lenovo();
                                obj5.C21Y();
     
                            }break;
                            case 3:
                            {
                               
                                Lenovo obj5=new Lenovo();
                                obj5.C25S();
     
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                      case 6:
                    {
                        System.out.println("**********Motorola**********");
                        System.out.printf("1) G31\n2) E30\n3) G80\n");
                        int m6=store.nextInt();
                        switch(m6)
                        {
                            case 1:
                            {
                                Motorola obj6=new Motorola();
                                obj6.G31();
                     

                               
                            }break;
                            case 2:
                            {
                                Motorola obj6=new Motorola();
                                obj6.E30();
         

                            }break;
                            case 3:
                            {
                                Motorola obj6=new Motorola();
                                obj6.G80();
 

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                     case 7:
                    {
                        System.out.println("**********Nokia**********");
                        System.out.printf("1) X100\n2) G300\n3) T20\n");
                        int m7=store.nextInt();
                        switch(m7)
                        {
                            case 1:
                            {
                                Nokia obj7=new Nokia();
                                obj7.X100();
       

                            }break;
                            case 2:
                            {
                                Nokia obj7=new Nokia();
                                obj7.G300();
       

                            }break;
                            case 3:
                            {
                                Nokia obj7=new Nokia();
                                obj7.T20();
   
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                     case 8:
                    {
                       
                        System.out.println("**********Oppo**********");
                        System.out.printf("1) AS\n2) A16\n3) A11K\n");
                        int m8=store.nextInt();
                        switch(m8)
                        {
                            case 1:
                            {
                                Oppo obj8=new Oppo();
                                obj8.AS();
               

                            }break;
                            case 2:
                            {
                                Oppo obj8=new Oppo();
                                obj8.A16();
                                  System.out.println("**********Payment**********");
        System.out.println("1) Through credit card");
        System.out.println("2) cash");      
        int m=store.nextInt();  
        switch(m)
        {
            case 1:
            {
                System.out.println("");
            }break;
            case 2:
            {
                System.out.println("Please enter your cash money:");
                int cash=store.nextInt();
                int re=cash-prize1;
                System.out.println("Your return prize is "+re);          
               
            }break;
        }

                            }break;
                            case 3:
                            {
                                Oppo obj8=new Oppo();
                                obj8.A11K();
         
                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    case 9:
                    {
                        System.out.println("**********Realme**********");
                        System.out.printf("1) Q3T\n2) C21Y\n3) C25S\n");
                        int m9=store.nextInt();
                        switch(m9)
                        {
                            case 1:
                            {
                                Realme obj9=new Realme();
                                obj9.Q3T();
         

                            }break;
                            case 2:
                            {
                                Realme obj9=new Realme();
                                obj9.C21Y();
                                  System.out.println("**********Payment**********");
     

                            }break;
                            case 3:
                            {
                                Realme obj9=new Realme();
                                obj9.C25S();
     

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                   
                   
                     
                     
                   
                    case 10:
                    {
                        System.out.println("**********vivo**********");
                        System.out.printf("1) Y15A\n2) T1\n3) Y71T\n");
                        int m10=store.nextInt();
                        switch(m10)
                        {
                            case 1:
                            {
                                vivo obj10=new vivo();
                                obj10.Y15A();
       

                            }break;
                            case 2:
                            {
                                vivo obj10=new vivo();
                                obj10.T1();
       

                            }break;
                            case 3:
                            {
                                vivo obj10=new vivo();
                                obj10.Y71T();
       

                            }break;
                            default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;
                        }
                       
                    }break;
                    default:
                    {
                        System.out.println("Sorry wrong input");
                    }break;    
                }
    }

  

   
    }