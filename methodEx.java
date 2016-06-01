import java.util.Scanner;
//new class person
class person{
  int age;
  String name;
  //function1
  void sayName(){
    System.out.println("Hello my name is" + name);
    System.out.println("my age is" + age);
  }//end sayName
}//end person



public class methodEx{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    person eric = new person();
    person laura = new person();
    laura.age = 25;
    laura.name = "Laura bermingham";
    eric.age =27;
    eric.name = "Eric Strong";
    eric.sayName();
    laura.sayName();
  }//end main
}//end clas
