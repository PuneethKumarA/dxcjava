package generics;

public class DemoGenericsMethod {
	public static <E> void printArray(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[]  intArray = {10,20,30,40};
		Character[] charArray = {'a','b','c','d'};
		printArray(intArray);
		printArray(charArray);
	} 
	
}
