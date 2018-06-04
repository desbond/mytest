import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fibonacci {
	
	interface MyInterface {
		
		public void returnHelloWorkdGreeting(int i);
	}
	 public static void main (String argv[]) throws Exception
	    {
		 BigInteger currentA = BigInteger.valueOf(0), currentB = BigInteger.valueOf(1);
		 int position = 2;
		
		 MyInterface interface1 = (n) -> {System.out.println(""+n);};
			 Fibonacci.addNumbers(position,currentA , currentB);
			 theFibNums.forEach((K, V) -> System.out.println(V));
			 
			 theFibNumsList.forEach((V) -> System.out.println(V));
			 
			 theFibNums.values().stream().forEach(elt -> {System.out.println("ssssss");});
			 theFibNumsList.forEach((V) -> System.out.println(V));
	    }
	 static int finalPosition = 116;
	 static Map<Integer, BigInteger> theFibNums = new HashMap<Integer, BigInteger>();
	 static List<BigInteger> theFibNumsList = new ArrayList<BigInteger>();
	 static public void addNumbers(int position, BigInteger firstNum, BigInteger secondNum){
		 BigInteger result = firstNum.add(secondNum);
		 theFibNums.put(position, result);
		 theFibNumsList.add(result);
		 if(position<finalPosition){
			 position++;
			 addNumbers(position,secondNum, result);
		 }
		 
	 }
}
