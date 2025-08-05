package Hot100;

import java.util.HashSet;
import java.util.Set;

public class T141 {
    public boolean hasCycle(ListNode head) {
        // O(N)空间解法 哈希表
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if (!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // O(1)空间解法 快慢双指针
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
