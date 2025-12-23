import java.util.Scanner;

 class atm {
    float balance;
    int pin=6914;
    atm(){
        System.out.println("enter your pin number");
        Scanner sc=new Scanner(System.in);
        int enetredpin=sc.nextInt();
        if(enetredpin ==pin){
            
            menu();

        }
        else {
            System.out.println("enter valid pin  ");
            new atm();
        }
    }

        public void menu(){
            System.out.println("enter your choice");
            System.out.println("1.check balance");
            System.out.println("2.withdraw money");
            System.out.println("3.deposit money");
            System.out.println("4.exit");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();
            if(opt==1)
            {
                checkbalance();
            }
            else if(opt==2)
            {
                withdrawmoney();
            }
            else if (opt==3){
                depositmoney();

            }
            else if(opt==4)
            {
                return;
            }
            else {
                System.out.println("choose appropriate option");
            }
            menu();

        }
    
        public void checkbalance(){
            System.out.println("balance"+ balance);
            menu();
        }
        public void withdrawmoney()
        {System.out.println("enter amount ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
            if(amount>balance)
            {
                System.out.println("insufficint balance");
            }
            else{

            
            balance=balance-amount;
            System.out.println("withdrawn succesfully");
            menu();
            }

        }
        public void depositmoney(){
            System.out.println("enter amount ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
            balance=balance+amount;
            System.out.println("deposit succeesfully");
            menu();

        
        
        



    }


    public void exit(){
        return;
    }
}

public class atmmachine{
    public static void main(String[] args) {
        atm obj=new atm();
        

    }
}