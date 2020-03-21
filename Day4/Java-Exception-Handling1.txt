class exdemo1
{
public static void main(String [] args)
{
System.out.println("Deepak in 10th class");
System.out.println("Deepak in 12th class");
System.out.println("Deepak in B.Tech.");
System.out.println("Deepak became software engineer");
try
{
System.out.println("Deepak weds Anushka"+(10/0));
}
catch(ArithmeticException ex)
{
System.out.println("Deepak weds Katrina");
}
System.out.println("Deepak's Kids");
}
}

