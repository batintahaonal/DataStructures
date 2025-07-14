/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

// BATIN TAHA ONAL 220315086
public class DLL {
Node head=null;
Node tail=null;
public void add(int indis,int x) {
Node element=new Node();
element.data=x;
if(head==null && indis==0) {
head=element;
tail=element;
}
else if(head!=null ){
element.next=head;
head.prev=element;
head=element;
}
else {
Node temp=head;
int n=0;
while(temp!=null) {
temp=temp.next;
n++;
}
if(n!=indis) {
tail.next=element;
element.prev=tail;
tail=element;
}
else {
	temp=head;
int i=0;
while(i!=indis) {
temp=temp.next;
i++;
}element.prev=temp.prev;
temp.prev.next=element;
element.next=temp;
temp.prev=element;
}
}
}
public void display() {
Node temp=head;
while(temp!=null) {
System.out.println(temp.data);
temp=temp.next;
}
}
}

