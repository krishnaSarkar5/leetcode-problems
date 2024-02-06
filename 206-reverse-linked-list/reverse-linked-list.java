/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;

        // if(head==null){
        //     return null;
        // }

        // if(curr.next==null){
        //     return head;
        // }

        // while(curr!=null){
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr=temp;
        // }
        // head=prev;



       head= reverse(prev,curr);

        return head;
    }

    private ListNode reverse(ListNode prev,ListNode curr){
       
       if(curr==null)
            return prev;

        ListNode temp = curr.next;

        curr.next=prev;
        prev=curr;
        curr=temp;
        ListNode head = reverse(prev,curr);
        return head;

    }
}