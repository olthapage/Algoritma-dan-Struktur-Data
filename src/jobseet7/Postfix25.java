package jobseet7;

public class Postfix25 {
    int n;
    int top;
    char[] stack;

    public Postfix25(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('('); 
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperation(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String O) {
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = O.charAt(i);
            if (Character.isLetter(c)) {
                p = p + c; 
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop(); 
            } else if (IsOperation(c)) {
                while (derajat(stack[top]) >= derajat(c) && stack[top] != '(') {
                    p = p + pop();
                }
                push(c);
            }
        }
        return p;
    }
}

