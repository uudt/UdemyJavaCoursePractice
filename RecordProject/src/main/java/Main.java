public class Main {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            Student pojoStudent = new Student("S123" + i,
//                switch (i) {
//                    case 1 -> "Ulya";
//                    case 2 -> "Kolya";
//                    case 3 -> "Tim";
//                    case 4 -> "Nastya";
//                    case 5 -> "Tom";
//                    default -> "Anonymous";
//                }, i + ".07.1999", "Java programming");
//            System.out.println(pojoStudent);
//        }
//
//        System.out.println(" ");
//
//        for (int i = 1; i <= 5; i++) {
//            LPAStudent s = new LPAStudent("S123" + i,
//                switch (i) {
//                    case 1 -> "Ulya";
//                    case 2 -> "Kolya";
//                    case 3 -> "Tim";
//                    case 4 -> "Nastya";
//                    case 5 -> "Tom";
//                    default -> "Anonymous";
//                }, i + ".07.1999", "Java programming");
//            System.out.println(s);
//        }

        Student pojoStudent = new Student("S123", "Ulya", "10.07.1999", "Java programming");
        LPAStudent recordStudent = new LPAStudent("S1235","Uudt", "10.07.2025", "Java programming");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Exam + Certification");
//        recordStudent.setClassList(recordStudent.classList() + ", Certification");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }

}
