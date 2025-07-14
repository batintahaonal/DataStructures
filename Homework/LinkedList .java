package ders1;
// Bat?n Taha Önal 220315086
public class LinkedList {
Node head=null;
Node tail=null;
public void delete(int indis) {
if(head==null) {
System.out.println("List is empty");
}
else if(head!=null && indis==0) {
head=null;
tail=null;
}
else if(head.next!=null && indis==0) {
head=head.next;
}
else {
Node temp=head;
Node temp2=head;
int n=0;
while(temp.next!=null) {
temp2=temp;
temp=temp.next;
n++;
}
if(n==indis) {
temp2.next=null;
tail=temp2;
}
else {
temp=head;
temp2=head;
int i=0;
while(i!=indis) {
temp2=temp;
temp=temp.next;
i++;
}
temp2.next=temp.next;
}
}
}
public void add(int indis,int x) {
Node element=new Node();
element.data=x;
if(head==null && indis==0) {
head=element;
tail=element;
}
else if(head!=null && indis==0) {
element.next=head;
head=element;
}
else {
Node temp=head;
Node temp2=head;
int n=0;
while(temp.next!=null) {
temp2=temp;
temp=temp.next;
n++;
}
if(n==indis) {
tail.next=element;
tail=element;
element.next=null;
}
else {
temp=head;
temp2=head;
int i=0;
while(i!=indis) {
temp2=temp;
temp=temp.next;
i++;
}
temp2.next=element;
element.next=temp;
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
