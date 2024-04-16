package com.learn.Tasks;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SinglyLinkedListReverse {

    public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            System.out.println("Original List:");
            printList(head);

            ListNode reversedHead = reverseList(head);

            System.out.println("Reversed List:");
            printList(reversedHead);
        }

        public static ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }

            return prev;
        }

        public static void printList(ListNode head) {
            ListNode curr = head;

            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }

            System.out.println();
        }
    }


