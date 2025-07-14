package lesson1;
import java.util.Scanner;
public class Q2_DataStructure {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("how many nodes do you want in the linkedlist_1?:");
int a=input.nextInt();
int[] arr=new int[a];
System.out.println("how many nodes do you want in the linkedlist_2?:");
int b=input.nextInt();
int [] arr2=new int[b];
int [] arr3=new int[a+b];
Q2_linkedlist ll1=new Q2_linkedlist();
Q2_linkedlist ll2=new Q2_linkedlist();
System.out.println("enter the datas that will be added to linkedlist_1:");
for(int i=0;i<arr.length;i++) {
int n=input.nextInt();
arr[i]=ll1.insertion(i,n);
}
System.out.println();
System.out.println("enter the datas that will be added to linkedlist_2:");
for(int i=0;i<arr2.length;i++) {
int m=input.nextInt();
arr2[i]=ll2.insertion(i,m);
}
for(int i=0;i<arr.length;i++) {
arr3[i]=arr[i];
}
int z=0;
for(int i=a;i<arr3.length;i++) {
arr3[i]=arr2[z];
z++;
}
System.out.print("linkedlist_3: ");
for(int i=0;i<arr3.length;i++) {
for(int j=0;j<arr3.length;j++) {
if(arr3[i]==arr3[j] && j!=i) {
arr3[i]=0;
}
}
if(!(arr3[i]==0)) {
System.out.print(sorting(arr3)[i]+" ");
}
}
}
public static int[] sorting(int arr[]) {
int temp;
for(int i=0;i<arr.length;i++) {
for(int j=0;j<arr.length;j++) {
if(arr[j]>arr[i]) {
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
return arr;
}
}
