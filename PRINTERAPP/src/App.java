public class App
 { public static void main(String[] args) throws Exception {
     System.out.println("This app is made by:");

  //Declaring variable as creator 
  String creator = "Sushant";
  System.out.println("This app is made by: "+ creator);

  //Declaring double
  double number1 = 2;
  double number2 = 2;

  
 //System.out.println(number1);
 System.out.println("The value of number1 is: "+ number1);
 System.out.println("The value of number2 is: "+ number2);

 //multiplication
 double multiplication = number1*number2;
 System.out.println(number1 * number2+ " = "+ multiplication);

 //Addition
 double Addition = number1+number2;
 System.out.println(number1*number2 + " = "+ Addition);

 //Subtraction
 double Subtraction = number1-number2;
 System.out.println(number1-number2 + "= "+Subtraction); 

 //Division
 double Division = number1/number2;
 System.out.println(number1/number2 + " = "+Division);
 }
}