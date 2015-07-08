package package1;

//import package1.A;

public class B {//extends A
   public void methodB1(){
	   A a=new A();
	   a.methodA1();
	   //a.methodA3();
	   //methodA4();
	   a.methodA4();
   }
   
   public static void main(String[] args){
	   B b=new B();
	   b.methodB1();
   }
   
}
