
// program to take measurement of box.

import java.util.*;

class boxmeasure {
int l,b,h;

void readdata(){
Scanner ip = new Scanner(System.in);

System.out.println("enter length of box:");
l = ip.nextInt();

System.out.println("enter breadth of box:");
b = ip.nextInt();

System.out.println("enter height of box:");
h = ip.nextInt();

System.out.printf("length : %d\nbreadth : %d\nheight : %d\n\n",l,b,h);
}

void area() {

System.out.println("Area = "+(2*((l*b)+(b*h)+(h*l))));
}

void volume(){

System.out.println("Area = "+(l*b*h));
}

public static void main(String args[]){

box ob = new box();
ob.readdata();
ob.volume();
ob.area();
}
}








