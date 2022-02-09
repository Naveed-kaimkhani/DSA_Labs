import javax.swing.text.StyledDocument;

public class student {
    int roll;
    String name;
    student next;
    student(){}
    student(int roll){this.roll=roll;}
    student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    public static student insert(student start,int roll,String name) {
        student i;
        for ( i = start; i.next!=null; i=i.next) {
            
        }
        i.next=new student(roll,name);
        return start;
    }
    public static void printlist(student start) {
        for (student i = start; i !=null; i=i.next) {
            System.out.println(i.roll+" "+i.name);
        }
    }
    public static student delete(student start, int x){
        
        if(start==null||start.roll>x){
            return start;
        }
        if(start.roll==x){
            return start.next;
        }
        for (student i = start.next; i.next!=null; i=i.next) {
            if(i.next.roll>x){
                break;             
            }
            if(i.next.roll==x){
                i.next=i.next.next;
                
            }
        }
        return start;
    }
 
    public static void main(String[] args) {
        student start=new student(1,"asim");
        student s=start;
        s.next=new student(2,"faizan");
      //  student newNode=insert(start,60,"naveed");  
      student deleted=delete(start, 1) ;
      printlist(deleted);
 
    }
}
