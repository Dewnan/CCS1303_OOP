// While loop part wrote in a online lecture to show how the while loop works.

public class loop {
    public static void main(String[] args) {
        int i = 6;
        while_loop(i);
        do_while_loop(i);
    }

    static void while_loop(int i) {
        System.out.println("While Loop");
        while (i <= 5) {
            System.out.println(i + " Itteration");
            i++;
        }
        System.out.println(" ");
    }

    static void do_while_loop(int i) {
        System.out.println("Do While Loop");
        do {
            System.out.println(i + " Itteration");
            i++;
        } while (i <= 5);
    }
}
