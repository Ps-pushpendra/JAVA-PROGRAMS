
// java program to find the greatest of two.


import java.util.*;

class greater {

public static void main( String[] args ){

Scanner ip = new Scanner(System.in);
float a,b;

System.out.print("enter a:");
a = ip.nextFloat();

System.out.print("enter b:");
b = ip.nextFloat();

if(a==b) System.out.println("Both a&b are Equal");

else if(a>b)  System.out.println("a is greater");

else  System.out.println("b is greater");

}
}



