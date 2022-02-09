import java.util.Scanner;

class Employee{
    private int salary;
    private int NOH;

    
    public void getinfo(int salary,int NOH) {
        this.salary=salary;
        this.NOH=NOH;
    }
    public void Addsal(int extended) {
       if (salary<500) {
        salary+=extended;
       }
    }
    public void Addwork(int overtime) {
        if (NOH>6) {
         salary+=overtime;
        }
     }
     public void  print() {
         // TODO Auto-generated method stub
       System.out.println(salary+"\n"+NOH);
     }
     
}

public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int salary=sc.nextInt();
        // int noh=sc.nextInt();
    Employee em=new Employee();
    em.getinfo(4000,7);
    em.Addsal(10);
    em.Addwork(500);
  em.print();       
    }
}