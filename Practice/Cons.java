class Cons
{
	Cons(int i){System.out.println(""+i);}
	Cons(int a,String str){System.out.println(""+a);System.out.println(""+str);}
	public static void main(String[] args)
	{
		
		Cons t1=new Cons(10);
		Cons t2=new Cons(20,Sundram);
	}
}