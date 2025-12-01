public class Main {

    public static void main(String[] args) {
        char ch = 'A';
        convert(ch);
    }

    public static void convert(char ch) {

        switch (ch) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter is not found");
                break;
        }
    }
}
