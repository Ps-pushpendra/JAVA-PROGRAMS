import java.util.*;

class mathtriangle {

float b,h,l;
double area;
Scanner ip = new Scanner(System.in);

void readdata() {

System.out.print("enter base: ");
b = ip.nextFloat();


System.out.print("enter height: ");
h = ip.nextFloat();


System.out.print("enter length: ");
l = ip.nextFloat();

}

void area(){

float sp = (b+h+l)/2;
float result = sp*(sp-b)*(sp-h)*(sp-l);

area = Math.sqrt(result);
System.out.print("Area of Triangle: "+area);

}

public static void main(String[] args){

atriangle ob = new atriangle();
ob.readdata();
ob.area();

}
}





