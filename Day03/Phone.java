package phone;

public class Phone {
   //���ԣ�������
	String name;
   String brand;
   int price;
   
   //��Ϊ��������
   //void�����ķ�������
   //call������
   void call(){
	   System.out.println("��绰...");
   }
   void sendMsg(){
	   System.out.println("������...");
   }
   
   public static void main(String[] args){
	   //ʵ����һ���ֻ�
	   Phone p=new Phone();
	   p.name="����";
	   p.brand="note";
	   p.price=99;
	   
	   System.out.println(p.name);
	   p.sendMsg();
   }
}
