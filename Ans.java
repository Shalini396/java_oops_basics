public class Ans{
   public static void main(String[] args){
     Student s = new Student();
     s.name = "shalu";
     s.roll_no = 27;
     System.out.print(s.name +", "+s.roll_no);
  }
}
class Student{
  String name;
  int roll_no;
}