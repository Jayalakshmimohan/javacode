package Assignment;

public class MainEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 obj[]= new Employee1[4];
		
		Employee1 obj1=new Employee1(1,"A");
		Employee1 obj2=new Employee1(2,"B");
		Employee1 obj3=new Employee1(3,"C");
		Employee1 obj4=new Employee1(4,"C");
//		Employee1 obj5=new Employee1(5,"D");
		
		obj[0]=obj1;
		obj[1]=obj2;
		obj[2]=obj3;
		obj[3]=obj4;
		
		IntegerSearch ins=new IntegerSearch();
		System.out.println(ins.search(obj, obj4));
 
		
 
	}
 
}