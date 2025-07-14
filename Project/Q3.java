package lesson1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q3 {
public static void main(String[] args) {
HashMap<Integer,String>hm=new HashMap<Integer,String>();
String s = "bb bb cc aa aa aa";
String words[]= s.split(" ");
int distinctElementCount = countDistinctElements(words);
System.out.println("Distinct element number: " + distinctElementCount);
for (int i=0;i<words.length;i++) {
	hm.put(i,words[i]);
}
Arrays.sort(words);
String currentElement = words[0];
int count = 0;
for (int i = 0; i < words.length; i++) {
if (words[i].equals(currentElement)) {
count++;
} 
else {
System.out.println("Element: " + currentElement + ", Frequency: " + count);
currentElement = words[i];
count = 1;
}
}
System.out.println("Element: " + currentElement + ", Frequency: " + count);
}
public static int countDistinctElements(String [] array) {
HashSet<String> a = new HashSet<>();
for (String str: array) {
a.add(str);
}
return a.size();
}
}
