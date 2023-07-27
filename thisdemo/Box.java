package thisdemo;

public class Box {
    private int l,b,h;

    public Box(){
        this(0,0,0);
    }
    public Box(int s){
        this(s,s,s);

    }
    public Box(int x,int y, int z){
        l=x;
        b=y;
        h=z;

    }
    public void show(){

        System.out.println("length is"+l+" ,breath is "+b+",height is "+h );
    }
}
