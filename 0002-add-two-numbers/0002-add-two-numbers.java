class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node for result list
        ListNode dummy = new ListNode(0);

        // Pointer to build new list
        ListNode current = dummy;

        int carry = 0;

        // Run until both lists and carry are finished
        while (l1 != null || l2 != null || carry != 0) {

            int num1 = 0;
            int num2 = 0;

            // Take value from l1
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }

            // Take value from l2
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }

            // Add numbers + carry
            int sum = num1 + num2 + carry;

            // Update carry
            carry = sum / 10;

            // Store last digit
            int digit = sum % 10;

            // Create new node
            current.next = new ListNode(digit);

            // Move pointer
            current = current.next;
        }

        // Return answer list
        return dummy.next;
    }
}