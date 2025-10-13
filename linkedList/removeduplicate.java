package linkedList;
import java.util.*;
class ListNode{
    int val ; 
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        while(ptr.next!=null){
            freq.put(ptr.val, freq.getOrDefault(ptr.val, 0) + 1);
        }
        while(head.next!=null){
            if(freq.get(head.val)==1){
                return head;
            }

        }
        
    }
public class removeduplicate {
    
}
