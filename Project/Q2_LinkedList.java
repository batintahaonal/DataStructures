package lesson1;

public class Q2_linkedlist {
int arr[]=new int[8];
Q2_Node head=null;
Q2_Node tail=null;
public int insertion(int index,int x) {
Q2_Node element=new Q2_Node();
element.data=x;
if(head==null && index==0) {
head=element;
tail=element;
}
else if(head!=null && index==0) {
element.next=head;
head=element;
}
else {
Q2_Node temp=head;
Q2_Node temp2=head;
int n=0;
while(temp.next!=null) {
n++;
temp2=temp;
temp=temp.next;
}
if(n==index) {
temp2.next=element;
element.next=temp;
}
else {
temp=head;
temp2=head;
int r=0;
while(r!=index) {
r++;
temp2=temp;
temp=temp.next;
}
temp2.next=element;
element.next=temp;
}
}
return send_data();
}
public int send_data() {
Q2_Node temp=head;
int i=0;
while(temp!=null) {
arr[i]=temp.data;
temp=temp.next;
}
return arr[i];
}
}

