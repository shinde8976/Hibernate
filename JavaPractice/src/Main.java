public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(5);
        list.insertLast(10);
        list.insertLast(12);
        list.insertLast(12);

        list.display();
        System.out.println();
        list.removeDuplicates();
        System.out.println();
        list.display();

        System.out.println("Hello world!");
    }
}