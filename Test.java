class Test
{	
	int x;
	void Test(int val)	//not a constructor
	{
		System.out.println("this is the Test() method");
		x=val;
	}
	void show()
	{
		System.out.println("value of x: "+x);
	}
	public static void main(String S[])
	{
		Test t1,t2;
		t1=new Test();
		t2=new Test();
		t1.Test(50);
		t1.show();
		t2.show();
	}
}