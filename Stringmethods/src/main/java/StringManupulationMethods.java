public class StringManupulationMethods {

    public static void main(String[] args) {

        String birthDate = "10.07.1999";
        int startIndex = birthDate.indexOf("1999");
        System.out.println("startIndex = " + startIndex);
        System.out.println("Birth Year = " + birthDate.substring(startIndex));

        System.out.println("Month = " + birthDate.substring(3, 5)); // (incl, not incl)

        String newDate = String.join(".", "10", "07", "1999");
        System.out.println("newDate = " + newDate);

        newDate = "10";
        newDate = newDate.concat(".");
        newDate = newDate.concat("07");
        newDate = newDate.concat(".");
        newDate = newDate.concat("1999");
        System.out.println("newDate = " + newDate);

        newDate = "10" + "." + "07" + "." + "1999";
        System.out.println("newdate = " + newDate);

        newDate = "10".concat(".").concat("07").concat(".").concat("1999");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('.', '/'));
        System.out.println(newDate.replace("1", "10"));
        System.out.println(newDate.replaceFirst("0", "1"));
        System.out.println(newDate.replaceAll("9", "--"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-8));
        System.out.println("-".repeat(20));


    }
}
