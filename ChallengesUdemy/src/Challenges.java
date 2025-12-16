import java.util.Arrays;
import java.util.Scanner;

public class Challenges {

    //4th day
    //1
    public class PositiveNegativeZero {
        // write code here

        public static void checkNumber (int number) {

            if (number > 0) {
                System.out.println("positive");
            } else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
    }

    //2
    public class MegaBytesConverter {
        // write code here

        public static void printMegaBytesAndKiloBytes (int kiloBytes) {

            if (kiloBytes < 0) {
                System.out.println("Invalid Value");
            } else {
                int megabytes = (int) (kiloBytes / 1024);
                int rem = (int) (kiloBytes % 1024);

                System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + rem + " KB");
            }
        }
    }

    //3
    public class BarkingDog {
        // write code here

        public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }


            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            }

            return false;
        }
    }

    //4
    public class LeapYear {
        // write code here

        public static boolean isLeapYear (int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    //5
    public class DecimalComparator {
        // write code here

        public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {

            num1 = num1 * 1000;
            num2 = num2 * 1000;

            num1 = (long) num1;
            num2 = (long) num2;

            if (num1 == num2) {
                return true;
            }

            return false;
        }
    }

    //6
    public class EqualSumChecker {
        // write code here
        public static boolean hasEqualSum (int num1, int num2, int num3) {

            if (num1 + num2 == num3 ) {
                return true;
            }
            return false;
        }
    }

    //7
    public class TeenNumberChecker {
        // write code here

        public static boolean hasTeen(int num1, int num2, int num3) {
            if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19)|| (num3 >= 13 && num3 <= 19)) {
                return true;
            }
            return false;
        }

        public static boolean isTeen(int num1) {
            if (num1 >= 13 && num1 <= 19) {
                return true;
            }
            return false;
        }
    }



    //5th day
    //1
    public class AreaCalculator {
        // write code here
        public static double area(double radius) {
            if (radius < 0) {
                return -1.0;
            }
            double pi = 3.14159;

            return pi * radius * radius;
        }

        public static double area(double x, double y) {
            if (x < 0 || y < 0) {
                return -1.0;
            }
            return x * y;
        }
    }

    //2
    public class MinutesToYearsDaysCalculator {
        // write code here
        public static void printYearsAndDays(long minutes) {

            if (minutes < 0) {
                System.out.println("Invalid Value");
            } else {
                long minutesInYear = 60 * 24 * 365;
                long years = (long) minutes / minutesInYear;
                long minutesLeft = (long) minutes - (years * minutesInYear);
                long days = (long) minutesLeft / (60 * 24);
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }

    //3
    public class IntEqualityPrinter {
        // write code here
        public static void printEqual(int num1, int num2, int num3) {
            if (num1 < 0 || num2 < 0 || num3 < 0) {
                System.out.println("Invalid Value");
            } else if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("All numbers are equal");
            } else if (num1 != num2 && num1 != num3 && num2 != num3) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

    //4
    public class PlayingCat {
        // write code here
        public static boolean isCatPlaying(boolean summer, int temperature) {

            if (summer && temperature >= 25 && temperature <= 45) {
                return true;   // cat is playing
            } else if (!summer && temperature >= 25 && temperature <= 35) {
                return true;
            }
            return false;
        }
    }



    //6th day
    //1
    public class NumberInWord {
        // write code here
        public static void printNumberInWord(int number) {
            switch (number) {
                case 0 -> System.out.println("ZERO");
                case 1 -> System.out.println("ONE");
                case 2 -> System.out.println("TWO");
                case 3 -> System.out.println("THREE");
                case 4 -> System.out.println("FOUR");
                case 5 -> System.out.println("FIVE");
                case 6 -> System.out.println("SIX");
                case 7 -> System.out.println("SEVEN");
                case 8 -> System.out.println("EIGHT");
                case 9 -> System.out.println("NINE");
                default -> System.out.println("OTHER");
            };
        }
    }

    //2
    public class NumberOfDaysInMonth {
        // write code here

        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    return true;
                }
            }
            return false;
        }

        public static int getDaysInMonth(int month, int year) {
            if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
                return -1;
            }

            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }

    }

    //3
    public class SumOddRange {
        // write code here

        public static boolean isOdd(int number) {

            if (number <= 0) {
                return false;
            }

            if (number % 2 != 0) {
                return true;
            }

            return false;
        }

        public static int sumOdd(int start, int end) {

            if (end < start || end < 0 || start < 0) {
                return -1;
            }

            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    //4
    public class NumberPalindrome {
        // write code here

        public static boolean isPalindrome(int number) {

            // if (number < 0) {
            //     number = -number;
            // }

            int reverse = 0;
            int num = number;
            while (num > 9) {
                int lastDigit = num % 10;
                reverse = reverse * 10 + lastDigit;
                num = num / 10;
            }
            reverse = reverse * 10 + num;

            return (number == reverse);
        }
    }

    //5
    public class FirstLastDigitSum {
        // write code here

        public static int sumFirstAndLastDigit(int number) {

            if (number < 0) {
                return -1;
            }

            int lastDigit = number % 10;

            while (number > 9) {
                number = number / 10;
            }

            return number + lastDigit;
        }
    }

    //6
    public class EvenDigitSum {
        // write code here

        public static int getEvenDigitSum(int number) {

            if (number < 0) {
                return -1;
            }

            int evenCount = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenCount += digit;
                }
                number = number / 10;
            }

            return evenCount;
        }
    }

    //7
    public class SharedDigit {
        // write code here

        public static boolean hasSharedDigit(int num1, int num2) {

            if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
                return false;
            }

            int appear;
            while (num1 != 0) {
                appear = num1 % 10;
                int num3 = num2;
                while (num3 != 0) {
                    int comparable = num3 % 10;
                    if (appear == comparable) {
                        return true;
                    }
                    num3 = num3 / 10;
                }
                num1 = num1 / 10;
            }

            return false;
        }
    }

    //8
    public class LastDigitChecker {
        // write code here

        public static boolean hasSameLastDigit(int num1, int num2, int num3) {

            if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
                return false;
            }

            int rNum1 = num1 % 10;
            int rNum2 = num2 % 10;
            int rNum3 = num3 % 10;

            if (rNum1 == rNum2 || rNum1 == rNum3 || rNum2 == rNum3) {
                return true;
            }

            return false;
        }

        public static boolean isValid(int param) {
            if (param >= 10 && param <= 1000) {
                return true;
            }
            return false;
        }
    }

    //9
    public class FactorPrinter {
        // write code here

        public static void printFactors(int number) {

            if (number < 1) {
                System.out.println("Invalid Value");
            }

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    //10
    public class GreatestCommonDivisor {
        // write code here

        public static int getGreatestCommonDivisor(int first, int second) {

            if (first < 10 || second < 10) {
                return -1;
            }

            int smallerNum;
            if (first <= second) {
                smallerNum = first;
            } else {
                smallerNum = second;
            }

            int commonDivisor = 1;
            for (int i = 1; i <= smallerNum; i++) {
                if (first % i == 0 && second % i == 0) {
                    commonDivisor = i;
                }
            }
            return commonDivisor;
        }
    }

    //11
    public class PerfectNumber {
        // write code here

        public static boolean isPerfectNumber(int number) {

            if (number < 1) {
                return false;
            }

            int sumDivisors =0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumDivisors += i;
                }
            }

            if (sumDivisors == number) {
                return true;
            }
            return false;
        }
    }

    //12
    public class NumberToWords {
        // write code here

        public static void numberToWords(int number) {
            if (number < 0) {
                System.out.println("Invalid Value");
                return;
            }

            if (number == 0) {
                System.out.println("Zero");
                return;
            }

            //count number of digits
            int initDigitCount = getDigitCount(number);

            //reverse number (may loose leading zeros)
            int reversedNum = reverse(number);

            //check if leading zeros are missed
            // int checker = reversedNum;
            // int leftDigitCount = 0;
            // while (checker != 0) {
            //     checker = checker / 10;
            //     leftDigitCount++;
            // }

            int leftDigitCount = getDigitCount(reversedNum);

            //recover missed leading zeros
            int addZeroCount = 0;
            if (initDigitCount != leftDigitCount) {
                addZeroCount = initDigitCount - leftDigitCount;
            }


            while (reversedNum != 0) {
                int rem = reversedNum % 10;
                // print ready num
                if (rem == 0) {
                    System.out.println("Zero");
                } else if (rem == 1) {
                    System.out.println("One");
                } else if (rem == 2) {
                    System.out.println("Two");
                } else if (rem == 3) {
                    System.out.println("Three");
                } else if (rem == 4) {
                    System.out.println("Four");
                } else if (rem == 5) {
                    System.out.println("Five");
                } else if (rem == 6) {
                    System.out.println("Six");
                } else if (rem == 7) {
                    System.out.println("Seven");
                } else if (rem == 8) {
                    System.out.println("Eight");
                } else if (rem == 9) {
                    System.out.println("Nine");
                }
                reversedNum /= 10;
            }

            //correct reversed number (with recovered leading zeros) ready to transcript it to words
            reversedNum = reversedNum * (int) Math.pow(10, addZeroCount);

            for (int i = 0; i < addZeroCount; i++) {
                System.out.println("Zero");
            }
        }

        public static int reverse(int num) {
            int reversedNum = 0;
            while (num != 0) {
                reversedNum = reversedNum * 10 + (num % 10);
                num /= 10;
            }
            return reversedNum;
        }

        public static int getDigitCount(int number) {
            if (number < 0) return -1;
            if (number == 0) return 1;

            int counter = 0;
            while (number != 0) {
                number = number / 10;
                counter++;
            }
            return counter;
        }
    }

    //13
    public class FlourPacker {
        // write code here

        public static boolean canPack(int bigCount, int smallCount, int goal) {

            if(bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }

            if ((bigCount * 5 + smallCount) < goal) {
                return false;
            } else {
                while (goal >= 5 && bigCount > 0) {
                    goal -= 5;
                    bigCount--;
                }
                while (goal > 0 && smallCount > 0) {
                    goal -= 1;
                    smallCount--;
                }
            }
            return goal == 0;
        }
    }

    //14
    public class LargestPrime {
        // write code here

        public static int getLargestPrime(int number) {
            if (number <= 1) {
                return -1;
            }

            for (int i = number; i >= 2; i--) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime && number % i == 0) {
                    return i;
                }
            }
            return -1;
        }
    }

    //15
    import java.util.Scanner;

    public class InputCalculator {
        // write code here

        public static void inputThenPrintSumAndAverage() {

            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            long average = 0;
            int i = 0;

            while (true) {
                String userInput = scanner.nextLine();
                try {
                    int num = Integer.parseInt(userInput);
                    sum += num;
                    i++;
                } catch (NumberFormatException e) {
                    average = (long) Math.round((double) sum /(double) i);
                    System.out.println("SUM = " + sum + " AVG = " + average);
                    break;
                }
            }
        }

    }

    //16
    public class PaintJob {
        // write code here

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;
            }

            // Scanner scanner = new Scanner(System.in);
            // System.out.println("Already bought bucket number = ")
            // String userInput = scanner.nextLine();

            // double numD = Double.parseDouble(userInput);

            // double areaToPaint = width * height;
            // int bucketsNeeded = (int) Math.ceil(areaToPaint / areaPerBucket);

            int bucketsNeeded = getBucketCount(width, height, areaPerBucket);
            int bucketsToBuy = bucketsNeeded - extraBuckets;

            return bucketsToBuy;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket) {

            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1;
            }

            double areaToPaint = width * height;
            // int bucketsNeeded = (int) Math.ceil(areaToPaint / areaPerBucket);
            int bucketsNeeded = getBucketCount(areaToPaint, areaPerBucket);

            return bucketsNeeded;
        }

        public static int getBucketCount(double area, double areaPerBucket) {

            if (area <= 0 || areaPerBucket <= 0) {
                return -1;
            }

            int bucketsNeededtoBuy = (int) Math.ceil(area / areaPerBucket);

            return bucketsNeededtoBuy;
        }

    }



    //7th day
    //1
    public class SimpleCalculator {
        // write code here
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() {
            return this.firstNumber;
        }

        public double getSecondNumber() {
            return this.secondNumber;
        }

        public void setFirstNumber(double num) {
            this.firstNumber = num;
        }

        public void setSecondNumber(double num) {
            this.secondNumber = num;
        }

        public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
        }

        public double getMultiplicationResult() {
            return this.firstNumber * this.secondNumber;
        }

        public double getDivisionResult() {
            if (secondNumber == 0) return 0;
            return this.firstNumber / this.secondNumber;
        }
    }

    //2
    public class Person {
        // write code here
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            if (age < 0 || age > 100) this.age = 0;
            else this.age = age;
        }

        public boolean isTeen() {
            if (this.age > 12 && this.age < 20) {
                return true;
            }
            return false;
        }

        public String getFullName() {
            if (firstName.isEmpty() && lastName.isEmpty()) return "";
            else if (lastName.isEmpty()) return firstName;
            else if (firstName.isEmpty()) return lastName;
            return firstName + " " + lastName;
        }
    }

    //3
    public class Wall {
        // write code here
        private double width;
        private double height;

        public Wall() {

        }

        public Wall(double width, double height) {
            if (width < 0) width = 0;
            if (height < 0) height = 0;

            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return this.width;
        }

        public double getHeight() {
            return this.height;
        }

        public void setWidth(double width) {
            if (width < 0) width = 0;
            this.width = width;
        }

        public void setHeight(double height) {
            if (height < 0) height = 0;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

    }

    //4
    public class Point {
        // write code here
        private int x;
        private int y;

        public Point() {

        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance(Point point) {

            double dist = distance(point.x, point.y);

            return dist;
        }

        public double distance() {

            Point point = new Point (0, 0);
            double dist = distance(point);
            return dist;
        }

        public double distance(int x, int y) {

            double dist = Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y));

            return dist;
        }

    }

    //5
    public class Floor {
        // write code here
        private double width;
        private double length;

        public Floor(double width, double length) {
            if (width < 0) width = 0;
            if (length < 0) length = 0;

            this.width = width;
            this.length = length;
        }

        public double getArea() {
            return this.width * this.length;
        }

    }

    public class Carpet {
        // write code here
        private double cost;

        public Carpet(double cost) {
            if (cost < 0) cost = 0;

            this.cost = cost;
        }

        public double getCost() {
            return this.cost;
        }

    }

    public class Calculator {
        // write code here
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }

    //6
    public class ComplexNumber {
        // write code here
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal() {
            return this.real;
        }

        public double getImaginary() {
            return this.imaginary;
        }

        public void add(double real, double imaginary) {
            this.real += real;
            this.imaginary += imaginary;
        }

        public void add(ComplexNumber complexNum) {

            add(complexNum.getReal(), complexNum.getImaginary());
        }

        public void subtract(double real, double imaginary) {
            this.real -= real;
            this.imaginary -= imaginary;
        }

        public void subtract(ComplexNumber complexNum) {

            subtract(complexNum.getReal(), complexNum.getImaginary());
        }
    }

    //7
    public class Circle {
        // write code here
        private double radius;

        public Circle(double radius) {
            if (radius < 0) radius = 0;
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }

    public class Cylinder extends Circle {
        // write code here
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            if (height < 0) height = 0;
            this.height = height;
        }

        public double getHeight() {
            return this.height;
        }

        public double getVolume() {
            return super.getArea() * this.height;
        }
    }

    //8
    public class Rectangle {
        // write code here
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            if (width < 0) width = 0;
            if (length < 0) length = 0;

            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return this.width;
        }

        public double getLength() {
            return this.length;
        }

        public double getArea() {
            return this.width * this.length;
        }
    }

    public class Cuboid extends Rectangle {
        // write code here
        private double height;

        public Cuboid(double width, double length, double height) {
            super(width, length);
            if (height < 0) height = 0;
            this.height = height;
        }

        public double getHeight() {
            return this.height;
        }

        public double getVolume() {
            return super.getArea() * this.height;
        }
    }



    //8th day
    //1
    public class Wall {
        // write code here
        private String direction;

        public Wall(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return this.direction;
        }

    }

    public class Ceiling {
        // write code here
        private int height;
        private int paintedColor;

        public Ceiling(int height, int paintedColor) {
            this.height = height;
            this.paintedColor = paintedColor;
        }

        public int getHeight() {
            return this.height;
        }

        public int getPaintedColor() {
            return this.paintedColor;
        }

    }

    public class Bed{
        // write code here
        private String style;
        private int pillows;
        private int height;
        private int sheets;
        private int quilt;

        public Bed(String style, int pillows, int height, int sheets, int quilt) {
            this.style = style;
            this.pillows = pillows;
            this.height = height;
            this.sheets = sheets;
            this.quilt = quilt;
        }

        public void make() {
            System.out.print("Bed -> Making | ");
        }

        public String getStyle() {
            return this.style;
        }

        public int getPillows() {
            return this.pillows;
        }

        public int getHeight() {
            return this.height;
        }

        public int getSheets() {
            return this.sheets;
        }

        public int getQuilt() {
            return this.quilt;
        }

    }

    public class Lamp {
        // write code here
        private String style;
        private boolean battery;
        private int globRating;

        public Lamp(String style, boolean battery, int globRating) {
            this.style = style;
            this.battery = battery;
            this.globRating = globRating;
        }

        public void turnOn() {
            System.out.print("Lamp -> Turning on");
        }

        public String getStyle() {
            return this.style;
        }

        public boolean isBattery() {
            return this.battery;
        }

        public int getGlobRating() {
            return this.globRating;
        }

    }

    public class Bedroom {
        // write code here
        private String name;
        private Wall wall1, wall2, wall3, wall4;
        private Ceiling ceiling;
        private Bed bed;
        private Lamp lamp;

        public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
            this.name = name;
            this.wall1 = wall1;
            this.wall2 = wall2;
            this.wall3 = wall3;
            this.wall4 = wall4;
            this.ceiling = ceiling;
            this.bed = bed;
            this.lamp = lamp;
        }

        public Lamp getLamp() {
            return this.lamp;
        }

        public void makeBed() {
            System.out.print("Bedroom -> Making bed | ");
            this.bed.make();
            // this.lamp.turnOn();
        }
    }

    //2 the same as challenge from video

    //3
    public class Car {
        // write code here
        private boolean engine = true;
        private int cylinders;
        private String name;
        private int wheels = 4;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
        }

        public String startEngine() {
            return "Car -> The " + getClass().getSimpleName() + " car's engine is starting";
        }

        public String accelerate() {
            return "Car -> The car " + getClass().getSimpleName() + " is accelerating";
        }

        public String brake() {
            return "Car -> The car " + getClass().getSimpleName() + " is braking";
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

    }

    public class Mitsubishi extends Car {
        // write code here

        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi -> The " + getClass().getSimpleName() + " car's engine is starting";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi -> The car " + getClass().getSimpleName() + " is accelerating";
        }

        @Override
        public String brake() {
            return "Mitsubishi -> The car " + getClass().getSimpleName() + " is braking";
        }

    }

    public class Holden extends Car {
        // write code here

        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Holden -> The " + getClass().getSimpleName() + " car's engine is starting";
        }

        @Override
        public String accelerate() {
            return "Holden -> The car " + getClass().getSimpleName() + " is accelerating";
        }

        @Override
        public String brake() {
            return "Holden -> The car " + getClass().getSimpleName() + " is braking";
        }

    }

    public class Ford extends Car {
        // write code here

        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> The " + getClass().getSimpleName() + " car's engine is starting";
        }

        @Override
        public String accelerate() {
            return "Ford -> The car " + getClass().getSimpleName() + " is accelerating";
        }

        @Override
        public String brake() {
            return "Ford -> The car " + getClass().getSimpleName() + " is braking";
        }

    }



    //9th day
    //1
    import java.util.Scanner;
    import java.util.Arrays;

    public class SortedArray {
        // write code here

        public static int[] getIntegers(int len) {
            int[] arr = new int[len];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < len; i++) {
                // sc();
                int num = (int) sc.nextInt();
                arr[i] = num;
            }
            return arr; //not sorted
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element " + i + " contents " + arr[i]);
            }
        }

        public static int[] sortIntegers(int[] arr) {
            Arrays.sort(arr);
            int[] sorted = new int[arr.length];
            for (int i = 0; i < arr.length; i ++) {
                sorted[i] = arr[arr.length - 1 - i];
            }
            return sorted;
        }

    }

    //2 - Implement Min Finder: Reading and Storing Data for Minimum Value Discovery
    import java.util.Scanner;
    import java.util.Arrays;

    public class MinimumElement {
        // write code here

        private static int readInteger() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integer counter value: ");
            int input = scanner.nextInt();
            return input;
        }

        private static int[] readElements(int num) {
            int[] arr = new int[num];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < num; i++) {
                System.out.println("Enter integer value: ");
                int input = scanner.nextInt();
                arr[i] = input;
            }
            return arr;
        }

        private static int findMin(int[] arr) {
            int minValue = Arrays.stream(arr).min().getAsInt();
            return minValue;
        }
    }

    //3
    import java.util.Arrays;

    public class ReverseArray {
        // write code here

        private static void reverse(int[] arr) {
            System.out.println("Array = " + Arrays.toString(arr));

            int temp;
            for (int i = 0; i < arr.length && i < arr.length - 1 - i; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

            System.out.println("Reversed array = " + Arrays.toString(arr));
        }
    }
    


    //10th day
    //1

}
