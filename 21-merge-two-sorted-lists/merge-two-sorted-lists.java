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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> a=new ArrayList<>();
        while(list1!=null){
            a.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            a.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(a);
        ListNode root=null;
        list1=null;
        for(int n:a){
            ListNode temp=new ListNode(n);
            if(root==null){
                root=temp;
                list1=temp;
            }
            else {
                root.next=temp;
                root=root.next;
            }

        }
        return list1;
    }
}