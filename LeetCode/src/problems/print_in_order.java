package problems;

import java.util.concurrent.atomic.AtomicInteger;

public class print_in_order {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicInteger atomic = new AtomicInteger(4);
		
		System.out.println(atomic.getAndAdd(3));
		
		System.out.println(atomic.addAndGet(3));

	}

}
class Foo {

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }
 
    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}