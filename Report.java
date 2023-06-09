public class Report{
   public static void main(String[] args){
     Student s = new Student();
     Student m = new Student();
     s.name = "shalu";
     s.roll_no = 27;
     s.phno = 12345678;
     m.name = "Manish";
     m.roll_no = 3014;
     m.phno = 12354678;
     System.out.println(s.name +", "+s.roll_no+", "+s.phno);
     System.out.println(m.name +", "+m.roll_no+", "+m.phno);
  }
}
class Student{
  String name;
  int roll_no;
  int phno;
}