//Class and Object
/*Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like a "blueprint" of program.*/
//we create a class usign class keyword.
//wen can create an object of a class using new keyword.

class Percentage
{
	float sub1;
	float sub2;
	float sub3;
  float sub4;
	float result;
	
    public void perform()
	{
		 result = ((sub1 + sub2 + sub3 + sub4)/400)*100;
     System.out.print("Percentage : "+result);
	}
}

public class ObjectAndClassDemo 
{
	public static void main(String[] args)
	{
		Percentage obj = new Percentage();
		obj.sub1 = 60;
		obj.sub2 = 60;
   		obj.sub3 = 60;
		obj.sub4 = 60;
		obj.perform();
		
		//System.out.println(obj.result);
	}
}
