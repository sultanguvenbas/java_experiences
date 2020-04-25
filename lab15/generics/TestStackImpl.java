package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStackImpl {
	public static void main(String[] args) {
		
		List<Integer> lst = new LinkedList<>();
		lst.add(5);
		lst.add(6);
		
		List <String> lstStr = new LinkedList<>();
		lstStr.add("A");
		lstStr.add("B");
		
		List<Object> lstObj = new ArrayList<>();
		lstObj.add(lstStr);
		lstObj.add(lst);
		
		
		Stack <Object> stackObj = new StackImpl<>();
		
		Stack <String> stack= new StackImpl<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		//stack.push(5);
		
		stackObj.push(5);
		stackObj.push("sultan");
		
		stackObj.addAll(stack);

		
		System.out.println(stackObj.toList());
		
		Stack <String> stack2= new StackImpl<>();
		stack2.push("X");
		stack2.push("Y");
		
		stack.addAll(stack2);
		System.out.println(stack.toList());
		
		while (!stack.empty()) {
			String str= stack.pop();
			System.out.println(str);
		}
		
		Stack<Integer> stackInt = new StackArrayImpl<Integer>();
		stackInt.push(5);
		int a = stackInt.pop();
		
		Integer b;
		int c;
		c = 8;
		b = c;
		
	}

}
