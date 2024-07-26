package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 날짜: 2024/07/17
 * 이름: 박연화
 * 내용: 스택, 큐 실습하기
 */
public class StackQueueTest {
	public static void main(String[] args) {
		
		//Stack
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
	
		while(!stack.empty()){
			System.out.print(stack.pop()+", ");
		}
		System.out.println();
		
		//Queue
		Queue<Integer> queue = new LinkedList<Integer>();
	
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
	
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+", ");
		}
	
	}
}
