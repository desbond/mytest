package generics;

public class GenericTest {
	 public static void main (String argv[]) throws Exception
	    {
		 MyGen<String,String,String> gen  = new MyGen<String,String,String>();
		 MyGen<Integer,Integer,Integer> gen2  = new MyGen<Integer,Integer,Integer>();
		 String str = "str";
		 Integer integetr = new Integer(1);
		 //sddsdsds
		 gen.addT(str);
		 gen2.addT(integetr);
		 
		 System.out.println("gen "+gen.getT());
		 System.out.println("gen2 "+gen2.getT());
		 
		 Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
	        
	        System.out.println( "Printing Integer Array" );  
	        gen.printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        gen.printArray( charArray );   
	    }
}


class MyGen<T,A,B>{  
	T obj;  
	A obj2;  
	B obj3;  
	void addT(T obj){
		this.obj=obj;
	}  
	T getT(){
		return obj;
	}  
	
	 public < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  

	 
}  

