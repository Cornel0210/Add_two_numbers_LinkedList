package addNumbers;

public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        int rest = 0;
        ListNode sumHead = new ListNode();
        ListNode tempNode = sumHead;

        while (l1 != null || l2 != null || rest != 0){
            int sum = (l1 != null ? l1.val : 0) +
                    (l2 != null ? l2.val : 0) + rest;
            rest = sum/10;
            ListNode node = new ListNode(sum%10);
            tempNode.next = node;
            tempNode = tempNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return sumHead.next;
    }

}
