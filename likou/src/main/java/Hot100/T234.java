package Hot100;


public class T234 {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode head2= reverse(mid);
        while(head2 != null){
            if (head.val != head2.val){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }

    public ListNode findMid(ListNode head){
        ListNode low = head
                ,fast = head;
        while(fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }

    public ListNode reverse(ListNode head2){
        ListNode prew = null;
        ListNode curr = head2;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prew;
            prew = curr;
            curr = next;
        }
        return prew;
    }
}



