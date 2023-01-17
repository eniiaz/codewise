package oopRecap;

public class Microphone extends Object {

    private String color;
    private int size;
    boolean hasGuarantee;

    public void setSize(int size){
        if(size < 5 || size > 15){
            System.out.println("Invalid size for microphone");
            System.out.println("Try again");
        }else{
            System.out.println("Size successfully set");
            this.size = size;
        }
    }

    public int getSize(){
        return size;
    }

}
