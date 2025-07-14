package lesson1;

public class Q1_DataStructure {
public static void main(String[] args) {
int[] arr=new int[9];
int [] arr2=new int[4];
int [] arr3=new int[1];
int [] arr4=new int [4];
Q1_linkedlist ll=new Q1_linkedlist();
for(int i=0;i<arr.length;i++) {
int number=(int)(Math.random()*100);
arr[i]=ll.insertion(i,number);
}
System.out.print("level 1:"+" ");
for(int i=0;i<arr.length;i++) {
System.out.print(sorting(arr)[i]+" ");
}
for(int i=0;i<4;i++) {
int j=(int)(Math.random()*8);
arr2[i]=j;
}
System.out.println();
System.out.print("level 2:"+" ");
for(int i=0;i<4;i++) {
arr4[i]=arr[sorting(arr2)[i]];
}
for(int i=0;i<arr4.length;i++) {
for(int j=0;j<arr4.length;j++) {
if(arr4[i]==arr4[j] && j!=i) {
arr4[i]=0;
}
}
if(!(arr4[i]==0)) {
System.out.print(arr4[i]+" ");
}
}
System.out.println();
System.out.print("level 3:"+" ");
for(int i=0;i<1;i++) {
int k=(int)(Math.random()*4);
arr3[i]=k;
System.out.println(arr[arr2[arr3[i]]]+" ");
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

