package problems;
// TEST 1

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(2);
		l1.next =  new ListNode(4, new ListNode(3));
		
		ListNode l2 = new ListNode(5);
		l2.next =  new ListNode(6, new ListNode(4));

//		ListNodeDS l1DS = new ListNodeDS(); 
//		l1DS.addListNode(l1);
//		System.out.println(l1DS.count);
		
		
		ListNodeDS l1ds = new ListNodeDS();
		ListNodeDS l2ds = new ListNodeDS();
		ListNodeDS l1ds1 = new ListNodeDS();
		ListNodeDS l2ds2 = new ListNodeDS();

		l1ds.addListNode(l1);
		l1ds1.addListNode(l1ds.top);
		l2ds.addListNode(l2);
		l2ds2.addListNode(l2ds.top);

		ListNodeDS sum = ListNodeDS.sumTwoList(l1ds1,l2ds2);
		
		getLength(sum.top);
	}
	
	public static int getLength(ListNode l1) {
		int counter = 0;
		if(l1 == null)
			return counter;
		ListNode tmp;
		tmp = l1;
		while(tmp.next != null) {
			
			System.out.println(tmp.val);
			tmp = tmp.next;
			counter++;
		}
		counter++;
		System.out.println("ddddddd " + tmp.val);

		return counter;
	}
	
}

class ListNodeDS{
	ListNode top = null;
	int count = 0;
	public void addTop(int val){
		if(top == null) {
			top = new ListNode(val);
			count++;
			return;
		}
		ListNode newData = new ListNode(val,top);
		top = newData;
		count++;
	}
	
	public void addListNode(ListNode list) {
		
		while(list != null) {
			addTop(list.val);
			list = list.next;
		}		
	}
	public int getCount() {
		return this.count;
	}
	public static ListNodeDS sumTwoList(ListNodeDS l1,ListNodeDS l2) {
		int lower = 0,upper = 0;
		ListNode lowerList, upperList;
		if(l1.count > l2.count) {
			upper = l1.getCount();
			upperList = l1.top;
			lower = l2.getCount();
			lowerList = l2.top;
		}else {
			lower = l1.getCount();
			lowerList = l1.top;
			upper = l2.getCount();
			upperList = l2.top;

		}
		ListNodeDS sum = new ListNodeDS();
		int sumTmpVal = 0;
		boolean carry = false;
		for (; 0 < upper; upper--) {
			
			sumTmpVal = upperList.val;
			upperList = upperList.next;
			if(lowerList != null) {
				sumTmpVal += lowerList.val;
				lowerList = lowerList.next;
				lower--;
			}
			if(carry) {
				sumTmpVal++;
				carry = false;
			}
			if(sumTmpVal > 9) {
				sumTmpVal %= 10;
				carry = true;
			}
			
			sum.addTop(sumTmpVal);
		}
		if(carry) {
			sum.addTop(1);
			carry = false;
		}
		
		ListNodeDS sum1 = new ListNodeDS();
		sum1.addListNode(sum.top);
		return sum1;
	}
}


class ListNode{
	int val;
	ListNode next;
	public ListNode() { }
	public ListNode(int val) {
		this.val = val;
	}
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}