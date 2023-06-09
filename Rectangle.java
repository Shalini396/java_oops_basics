public class Rectangle{
  public static void main(String[] args){
      Area a = new Area();
      a.getArea(5,6);
}
}
class Area{
   void setDim(int len,int bre){
      len = 5;
      bre = 6;
 }
   void getArea(int len,int bre){
        int Ar = len*bre;
        System.out.println(Ar);
   }
}