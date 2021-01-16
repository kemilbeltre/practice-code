package MergeTwoSortedLists;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(-1);
		ListNode returnVal = dummy;

		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				dummy.next = new ListNode(l1.val);
				dummy = dummy.next;
				l1 = l1.next;

			} else if (l1.val > l2.val) {

				dummy.next = new ListNode(l2.val);
				dummy = dummy.next;
				l2 = l2.next;

			} else {

				dummy.next = new ListNode(l1.val, new ListNode(l1.val));
				dummy = dummy.next.next;
				l2 = l2.next;
				l1 = l1.next;
			}
		}

		if (l1 != null) {

			dummy.next = l1;

		} else if (l2 != null) {

			dummy.next = l2;
		}

		return returnVal.next;

	}

}
