package Day_43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {

		ChildA chA = new ChildA();
		
		chA.m1();
		chA.m2();
		chA.m3();
		
		ChildB chB = new ChildB();
		
		chB.m1();
		chB.m2();
		chB.m4();
		
		Parent p1 = new ChildA();	// polymorphism
		p1.m1();
		
		Parent p2 = new ChildB();
		p2.m1();
		
		iMyInterface int1 = new ChildA();
		int1.m2();
		
		iMyInterface int2 = new ChildB();
		int2.m2();
		
	}

}


class Parent{
	
	public void m1() {}
}

interface iMyInterface{
	
	void m2();
}

class ChildA extends Parent implements iMyInterface{
	
	public void m2() {}
	public void m3() {}
	
	}

class ChildB extends Parent implements iMyInterface{
	public void m2() {}
	public void m4() {}
}