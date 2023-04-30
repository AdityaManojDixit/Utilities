import java.util.*;  
class fs{  
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.println("Enter the path: ");  
		String str= sc.nextLine(); //reads sting
		str = str.replace("\\", "/");
		System.out.println(str);             
	}  
}  
	
