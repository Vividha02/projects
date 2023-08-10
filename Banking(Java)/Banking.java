
import java.util.*;
public class Banking{
    
    Scanner sc=new Scanner(System.in);
    Random ram = new Random();
    int currentBalance;
    int f;
    public void mainInterface()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println();
        System.out.println("click the number(assigned) to access that page");
        System.out.println();
        System.out.println("          VIEW BALANCE(1)           ");
        System.out.println();
        System.out.println("Account(2)          YONO Pay(3)         YONO Cash(4)");
        System.out.println("Deposits(5)         Investment(6)       Loans(7)");
        System.out.println("Cards(8)            Insurance(9)            ");
        System.out.println("Shop & order(10)    Best Offers(11)     Mobility(12)");
        System.out.println();
        System.out.println("click 00 for exit");
        int x=1;
        currentBalance=ram.nextInt(20000);
        while(x!=0)
        {
            System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
            System.out.println("click the number(assigned) to access that page");
            System.out.println("          VIEW BALANCE(1)           ");
            System.out.println();
            System.out.println("Account(2)          YONO Pay(3)         YONO Cash(4)");
            System.out.println("Deposits(5)         Investment(6)       Loans(7)");
            System.out.println("Cards(8)            Insurance(9)            ");
            System.out.println("Shop & order(10)    Best Offers(11)     Mobility(12)");
            System.out.println();
            System.out.println("click 00 for exit");
        
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1 : 
                    if(f==0)
                    {
                        currentBalance=0;
                        System.out.println("Account Balance:0 ");
                    }
                    else
                    {
                        System.out.println("Account Balance: "+currentBalance);
                    }
                    break;                
                case 2 : 
                    accounts();
                    break;                    
                case 3 :
                    yono_pay();
                    break;
                case 4 :
                    yono_cash();
                    break;                
                case 5 :
                    deposit();
                    break;                
                case 6 :
                    investment();
                    break;                
                case 7 :
                    loans();
                    break;                
                case 8 :
                    cards();
                    break;                
                case 9 :
                    insurance();
                    break;                
                case 10 :
                    shopOrder();
                    break;                
                case 11 :
                    bestOffer();
                    break;                
                case 12 :
                    mobility();
                    break;                
                default :
                    System.out.println("Invalid response");
                    break;                    
            }
            System.out.println("PRESS 1. FOR CONTINUE.  PRESS 0 TO EXIT");
            x=sc.nextInt();
        }
    }
    
    public void accounts()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println("My Balance: "+currentBalance);
        System.out.println();
        System.out.println("click the number(assigned) to access that page");
        System.out.println();
        System.out.println("Deposits(1)         Investment(2)       ");
        System.out.println("Cards(3)            Insurance(4)            ");
        System.out.println();
        System.out.println("click 00 for exit");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: deposit();
                    break;
            case 2: investment();
                    break;
            case 3: cards();
                    break;
            case 4: insurance();
                    break;
            case 00:  System.exit(0);
                      break;
            default:  System.out.println("Invalid response");
                      break;
        }
    }
    
    public void yono_pay()
    {   
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println("                YONO Pay");
        System.out.println();
        System.out.println("click the number(assigned) to access that page");
        System.out.println();
        System.out.println("Quick Transfer(1)         Bank Account(2)       ");
        System.out.println("YONO Cash(3)              Contacts(4)            ");
        System.out.println();
        System.out.println("click 00 for exit");
        int choice=sc.nextInt();
        /*switch(choice)
        {
            case 1: quickTransfer();
                    break;
            case 2: investment();
                    break;
            case 3: cards();
                    break;
            case 4: insurance();
                    break;
            case 00:  System.exit(0);
                      break;
            default:  System.out.println("Invalid response");
                      break;
        } */
    } 
    
    public void yono_cash()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println();
        System.out.println("              YONO Cash");
        System.out.println();
        System.out.println("* Withdraw cash without a physical debit card");
        System.out.println("* Cardless Shopping");
        System.out.println("* secured two factor authetification");
        System.out.println();
        System.out.println("Enter 11 digit account Number");
        int accNo = sc.nextInt();
        String st = Integer.toString(accNo);
        while(st.length()!=11)
        {
            System.out.println("Invalid pin");
            System.out.println("Enter account number again");
            accNo = sc.nextInt();
            st =Integer.toString(accNo);
        }
        System.out.println("Enter amount to be withdrawn");
        int amount = sc.nextInt();
        int yono_cash_code = 1000+ ram.nextInt(9999-1000+1);
        System.out.println("Yono cash code ="+yono_cash_code);
    }
    
    public void deposit()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println("Deposit Calculator");
        System.out.println("Click '0' to calulate return on FIXED DEPOSIT or click'1' to calculate return on RECURRING DEPOSIT");
        System.out.println("click 00 for exit");
        int choice = sc.nextInt();
        if(choice==0)
        {
            System.out.println("enter total principle amount");
            double p = sc.nextDouble();
            System.out.println("enter rate of interest");
            double r =sc.nextDouble(); 
            System.out.println("enter time period");
            double t = sc.nextInt();
            double returnV = (p*r*t)/100;
            System.out.println("Returns = "+returnV);
            System.out.println("Total value = "+(returnV+p));
        }
        else if(choice==1)
        {
            System.out.println("enter instalment each month");
            float p = sc.nextFloat();
            System.out.println("enter rate of interest");
            float r =sc.nextFloat(); 
            System.out.println("enter time period");
            float t = sc.nextInt();
            float n = 4f;
            float halfVal = (1+r/(100*n));
            float amt=0f;
            for(int i=1;i<=t*12;i++)
            {
                float returnV = (float)(p*(Math.pow(halfVal,n*i/12)));
                amt+=returnV;
            }
            System.out.println("return value = "+amt);
        }
        else if(choice==00)
        {
            System.exit(0);
        }
        else{
            System.out.println("Invalid Response");
        }
    }
    
    public void investment()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println();
        System.out.println("Uh-oh! We have no funds to show ");
        System.out.println("Create a Folio");
        System.out.println("Invest in MF");
        System.out.println("New Fund Offer");
    }
    
    public void loans()
    {
        
    }
    
    public void cards()
    {
        System.out.println("Do you have a SBI credit Card, LINK NOW");
        System.out.println("Apply for New Card");
    }
    
    public void insurance()
    {
        System.out.println("My Insurance Policies");
        System.out.println("Buy a new Policies");
    }
    
    public void shopOrder()
    {
        
    }
    
    public void bestOffer()
    {
        
    }
    
    public void mobility()
    {
        
    }
    
    public void signUpForm()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        int formNo = ram.nextInt(5000);
        System.out.println("APPLICATION FORM NUMBER. " + formNo);
        System.out.println("");
        System.out.println("Page 1 - Personal Deatails");
        System.out.println("");
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your father name");
        String fatherName = sc.nextLine();
        System.out.println("Enter your date of birth in given format(YYYY-MM-DD)");
        String dob = sc.nextLine();
        System.out.println("Enter f - female, m-Male , t-transgender");
        String gender = sc.nextLine();
        System.out.println("Enter your email id");
        String email = sc.nextLine();
        System.out.println("Enter your marital status");
        String maritalStatus = sc.nextLine();
        System.out.println("Enter your permanent address");
        String address = sc.nextLine();
        System.out.println("Enter city");
        String city = sc.nextLine();
        System.out.println("Enter State");
        String State = sc.nextLine();
        System.out.println("Enter Pin Code");
        int pincode = sc.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Page 2- Additional Detail");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter your religion");
        String religion = sc.nextLine();
        System.out.println("Enter your category");
        String category = sc.nextLine();
        System.out.println("Enter your education qualification");
        String education = sc.nextLine();
        System.out.println("Enter your occupation");
        String occupation = sc.nextLine();
        System.out.println("Enter your PAN number");
        int panNo = sc.nextInt();
        System.out.println("Enter your Aadhar number");
        int aadharNo = sc.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Page 3- Account Detail");
        System.out.println("");
        System.out.println(""); 
        System.out.println("Account Type Enter 0 :-Saving Account, 1-Current Account, 2-Fixed Deposit Account, 3-Recurring Deposit Account");
        int accountType = sc.nextInt();
        f=0;
        //newAccount();
        mainInterface();
    }
    
    public void logInForm()
    {
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println("Enter your Card number");
        long cardNo = sc.nextLong();
        String s=Long.toString(cardNo);
        while(s.length()!=16)
        {
            System.out.println("Invalid pin");
            System.out.println("Enter Card Number Again (16 dig)");
            cardNo = sc.nextLong();
            s=Long.toString(cardNo);
            
        }
        System.out.println("Enter 4 digit PIN");
        int pin = sc.nextInt();
        s=Integer.toString(pin);
        if(s.length()!=4)
        {
            System.out.println("Invalid PIN");
            logInForm();
        }
        else
        {
            f=1; 
            mainInterface();
        }
    }   
    
     public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Banking bk = new Banking();
        System.out.println("--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--||--");
        System.out.println("                                                   WELCOME TO VRL BANK");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter 0 for login and 1 for sign up");
        int logInOption = sc.nextInt();
        
        if(logInOption==0)
        {
            bk.logInForm();
        }
        else if(logInOption==1)
        {
            bk.signUpForm();
        }
        else
        {
            System.out.println("Invalid option is entered");
        }
        
    }
}