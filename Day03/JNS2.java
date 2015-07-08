package jiazaiheshilihua;

public class JNS2 {
   public static void main(String[] args){
   Person p=new Person(20);   
   System.out.println(p.age);
   }
}

class Person{
	Person(int age){
		this.age=age;
	}
	{
		age=18;
	}
	int age;
}