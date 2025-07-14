package lesson1;
import java.util.Stack;
public class Q4 {
public static void main(String[] args) {
String task= "(90 /2)/3"; // If the task has same privilege operators, please put parantheses first operation
System.out.println(calculator(task)); 
}
public static double calculator(String task) {
char task_chars[] = task.toCharArray();
Stack<Double> values = new Stack<>();
Stack<Character> operators = new Stack<>();
for (int i = 0; i <task_chars.length; i++) {
if (task_chars[i] == ' ') {
	continue;
}
if (Character.isDigit(task_chars[i])) {
StringBuilder s = new StringBuilder();
while (i < task_chars.length && (Character.isDigit(task_chars[i])|| task_chars[i] == '.')) {
s.append(task_chars[i++]);
}
values.push(Double.parseDouble(s.toString())); 
i--;
} 
else if (task_chars[i] == '(') {
operators.push(task_chars[i]);
} 
else if (task_chars[i] == ')') {
while (operators.peek() != '(') {
values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
}
operators.pop(); 
} 
else if (task_chars[i] == '+' || task_chars[i] == '-' || task_chars[i] == '*' || task_chars[i] == '/') {
while (!operators.isEmpty() && privilege(task_chars[i], operators.peek())) {
values.push(applyOperator(operators.pop(), values.pop(), values.pop())); 
}
operators.push(task_chars[i]);
}
}
while (!operators.isEmpty()) {
values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
}
return values.pop();
}
private static boolean privilege(char operator1, char operator2) {
return (operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-');
}
private static double applyOperator(char operator, double number2, double number1) {
switch (operator) {
case '+':
return number1 + number2;
case '-':
return number1 - number2;
case '*':
return number1 * number2;
case '/':
return number1 / number2;
default: return -1;
}
}
}




