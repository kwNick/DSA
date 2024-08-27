class stack { //O(N) time; O(N) space
    int size = 10000;
    int arr[] = new int[size];
    int top = -1;
    void push(int x) {  //O(1)
        top++;
        arr[top] = x;
    }

    int pop() { //O(1)
        int x = arr[top];
        top--;
        return x;
    }

    int top() { //O(1)
        return arr[top];
    }

    int size() {    //O(1)
        return top + 1;
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }
}