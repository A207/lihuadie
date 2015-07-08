package statiC;

public class Static {
   int age;
	void hello(){
	   System.out.println("hello...");
   }
	static String name="Jame";
	//静态方法，也称之为类方法
	
	static void hi(){
		System.out.println("hi...");
	}
   
   public static void main(String[] args){
	   Static d=new Static();
	   /*
	   //当我们调用属性和方法的时候，一定是调用某个实例对象的属性或方法
	   d.age=10;
	   d.hello();	    
	   */
	   System.out.println(Static.name);
	   Static.hi();
	   //d.hi();
   }
}
