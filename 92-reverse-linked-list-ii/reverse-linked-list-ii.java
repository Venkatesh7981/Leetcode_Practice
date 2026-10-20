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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
    left--;
    right--;
    while(left<right){
        int temp=a.get(left);
        a.set(left,a.get(right));
        a.set(right,temp);
        left++;
        right--;
    }

     head=null;
    ListNode root=null;
    for(int num:a){
        ListNode temp=new ListNode(num);
        if(root==null){
            head=temp;
            root=temp;

        }
        else {
            root.next=temp;
            root=root.next;
        }
    }
    return head;
    }
}