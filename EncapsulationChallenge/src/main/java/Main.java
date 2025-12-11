public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("Initial pages count = " + printer.getPagesPrinted());


        int currentPrintedPages = printer.printPages(5);
        System.out.printf("Current pages to print = %d. Total printed pages = %d %n",
            currentPrintedPages, printer.getPagesPrinted());
        currentPrintedPages = printer.printPages(10);
        System.out.printf("Current pages to print = %d. Total printed pages = %d %n",
            currentPrintedPages, printer.getPagesPrinted());

    }

}
