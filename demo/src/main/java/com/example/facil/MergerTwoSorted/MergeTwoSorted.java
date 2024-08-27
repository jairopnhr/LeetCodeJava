package com.example.facil.MergerTwoSorted;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSorted {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        ListNode merged;
        if (menorOuIgual(list1.val, list2.val)) {
            merged = list1;
            list1 = list1.next;
        } else {
            merged = list2;
            list2 = list2.next;
        }
        
        ListNode curr = merged;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        
        // Anexar a lista restante
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        
        return merged;
    }
    private boolean menorOuIgual (int val1,int val2)
    {
        return (val1 <= val2)?true:false;
    }
    
    public static void main(String[] args) {
        // Criando a primeira lista encadeada: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Criando a segunda lista encadeada: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Mesclando as listas
        MergeTwoSorted merge = new MergeTwoSorted();
        ListNode mergedList = merge.mergeTwoLists(list1, list2);

        // Imprimindo a lista mesclada
        System.out.print("Merged List: ");
        printList(mergedList);
    }
    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
