
public class Stack {

	int[] stack;
	int top;
	
	Stack(int size){
		stack = new int[size];
		top=0;
	}
	
	void push(int data) {
		stack[top] = data;
		top++;
	}
	
	int pop(){
		top--;
		return stack[top];
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(1000);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(30);
		System.out.println(s.pop());
		s.push(40);
		s.push(50);
		System.out.println(s.pop());		
	}
}
