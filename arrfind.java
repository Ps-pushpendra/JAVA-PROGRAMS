// java program to find the element present in the array and displaying its index.

import java.util.*;

class arrfind {

public static void main(String[] args) {

int i,found,flag=0;
Scanner sc = new Scanner(System.in);

System.out.print("size of array: ");
int n = sc.nextInt();

int arr [] = new int[n];

for( i = 0;i<n;i++){

System.out.print("Enter element: ");
arr[i] = sc.nextInt();

}

System.out.print("Enter element to search: ");
int s = sc.nextInt();

System.out.print("array: ");


for( i = 0;i<n;i++){

System.out.printf(" %d ",arr[i]);

}

for( i = 0;i<n;i++){

if(arr[i]==s){
found=arr[i];
flag++;
break;
}
}
System.out.print(" \n");
if(flag==1){
System.out.printf("element found at index %d",i);
}
else System.out.print("element not found!!");

}
}
