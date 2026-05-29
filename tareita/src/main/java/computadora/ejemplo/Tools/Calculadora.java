package x1y2z3.a1b2c3.Tools;
import java.util.Stack;

public class A1B2C3 {

    public static int a(char b) {

        switch (b) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    public static String c1(String d) {

        StringBuilder e = new StringBuilder();

        Stack<Character> f = new Stack<>();

        for (int g = 0; g < d.length(); g++) {

            char h = d.charAt(g);

            if (h == ' ') {
                continue;
            }

            if (Character.isDigit(h)) {
                e.append(h);
            }

            else if (h == '(') {
                f.push(h);
            }

            else if (h == ')') {

                while (!f.isEmpty() &&
                        f.peek() != '(') {

                    e.append(f.pop());
                }

                f.pop();
            }

            else {

                while (!f.isEmpty() &&
                        prioridad(c) <= prioridad(pila.peek())) {

                    postfix.append(pila.pop());
                }

                pila.push(c);
            }
        }

        while (!pila.isEmpty()) {
            postfix.append(pila.pop());
        }

        return postfix.toString();
    }

    public static double resolverExpresionPostfix(
            String postfix
    ) {

        Stack<Double> pila = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {

                pila.push((double)(c - '0'));
            }

            else {

                double b = pila.pop();
                double a = pila.pop();

                switch (c) {

                    case '+':
                        pila.push(a + b);
                        break;

                    case '-':
                        pila.push(a - b);
                        break;

                    case '*':
                        pila.push(a * b);
                        break;

                    case '/':
                        pila.push(a / b);
                        break;

                    case '^':
                        pila.push(Math.pow(a, b));
                        break;
                }
            }
        }

        return pila.pop();
    }
}
