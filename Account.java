package OopsConceptsinjava;

public class Account {
        private  int accId;
         private String name;
         private double val;

      public  Account(){
           accId = 101;
           name = "Amit";
           val= 5000.00;
        }
       public void show(){
            System.out.println("Account Id : " + accId);
            System.out.println("Acoount Name : "  +name);
            System.out.println("Account Balance : " +val);
        }



    }

