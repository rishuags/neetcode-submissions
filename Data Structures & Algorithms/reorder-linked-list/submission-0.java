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
    public void reorderList(ListNode head) {


        ListNode t = head;
        ListNode r = head.next;

        while(r!=null && r.next!=null){
            t=t.next; // getting turtle to middle
            r=r.next.next;
        }

        ListNode secondHalf = t.next; // second half of linked list
        t.next = null;
        ListNode prev = null;

        //reverse second half
        while (secondHalf != null) {
            ListNode temp = secondHalf.next;

            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;

        }


        // merge lists
        ListNode firstHalf = head;
        secondHalf = prev;
        while (secondHalf != null) {

            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;

        }









        





        
    }
}
