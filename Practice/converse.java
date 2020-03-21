class Converse
{
	static void m1(int[] a)
	{
		for(int a1:a)
		System.out.println(a1);
	}
	static int[] m2()
	{
		System.out.println("m1 return");
		return new int[]{100,200,300,400};
	}
	public static void main(String[] args)
	{
		Converse.m1(new int[]{10,20,30,40});
		int[] x=Converse.m2();
		for(int x1:x)
		System.out.println(x1);
	}
}