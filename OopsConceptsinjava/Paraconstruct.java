package OopsConceptsinjava;

public class Paraconstruct {
    private int accID;
    private String name;
    private double val;

    Paraconstruct(int i, String j , double k){
        accID=i;
        name= j;
        val=k;
    }
    public void show(){
        System.out.println("Account id : "+accID);
        System.out.println("name :"+name);
        System.out.println("Balance " +val);
        
    }
}
