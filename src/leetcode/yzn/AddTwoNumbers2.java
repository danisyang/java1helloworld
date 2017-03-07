package leetcode.yzn;

/**
 * Created by Dennis Yang on 2017/3/7.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers2{
    public static void main(String[] args){

    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head ;
        int length1 = 0,length2 = 0;
        ListNode node1,node2;
        node1 = l1;node2 = l2;
        do {
            length1 ++;
            node1 = node1.next;
        }while (node1!=null);
        do {
            length2 ++;
            node2 = node2.next;
        }while  (node2!=null);

         head = (length1>length2)?l1:l2;
         int carry = 0;
       /* while(head!=null&&l1!=null&&l2!=null){这段代码遍历两个链子，并且把加起来的值返回到链表上
            head.val = l1.val+l2.val+carry;
            if (head.val>10){
                head.val = head.val%10;
                carry = 1;
            }else{
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }*/


        return head;
    }


}