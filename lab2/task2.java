import java.util.Scanner;

class Area{
    private int length;
    private int breadth;
    public void setDim(int length,int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    
    public int getArea() {
        return length*breadth;
     }
}
class task2{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter length");
    int length=sc.nextInt();
    System.out.println("Enter breadth");
    int breadth=sc.nextInt();
    Area ar= new Area();
    ar.setDim(length, breadth);
    ar.getArea();
        
    }
}