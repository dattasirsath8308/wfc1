
//Description: This is the main class of the WFC programme. Menu is design under this class.

package com.coursework.wfc;
import java.util.Scanner;

public class PrintMain {
    // Initialize Scanner object
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("****** Welcome to The Weekend Fitness Club *******");
        System.out.println("**************************************************");
        printMenu();
    }
    public static void printMenu() {
        int inputNumber;
        String inputType;
        System.out.println("##--------------------- MENU --------------------##");
        System.out.println("");
        System.out.println("1.View Session ");
        System.out.println("2.Book a Session  ");
        System.out.println("3.Update a Booking  ");
        System.out.println("4.Cancel Booking ");
        System.out.println("5.Give Feedback ");
        System.out.println("6.Update Attendance ");
        System.out.println("7.View Customers ");
        System.out.println("8.View Bookings ");
        System.out.println("9.Print Report ");
        System.out.println("10.Exit ");
        System.out.println("-----------------------------------------------------");

        try {
            System.out.println("Please enter the number which you need to proceed. ");
            inputNumber = Integer.parseInt(console.next());
            try {
                if (inputNumber == 2) {//Create Bookings
                    Bookings.createBooking();
                } else if (inputNumber == 3) {//Edit Bookings
                    Bookings.editBooking();
                } else if (inputNumber == 4) {//Cancel Bookings
                    Bookings.cancelBooking();
                } else if (inputNumber == 5 || inputNumber == 6) {//Give Feedback and Attendance
                    Feedback.updateAttendanceAndFeedback();
                } else if (inputNumber == 1) {//View Sessions
                    System.out.println("Which choice you like to view the session? ");
                    System.out.println("1.View Sessions By Day ");
                    System.out.println("2.View Sessions By Session Type ");

                    System.out.println("Please enter the number ");
                    inputNumber = Integer.parseInt(console.next());

                    if (inputNumber == 2) {
                        System.out.println("Which session do you want to view? (zumba/yoga/spin/bodysculpt/all)");
                        inputType = console.next().toLowerCase();
                        Fitness_Lessons.readSessionFile(inputNumber, inputType);
                    } else if (inputNumber == 1) {
                        System.out.println("Which day you want to view? (saturday/sunday/both)");
                        inputType = console.next().toLowerCase();
                        Fitness_Lessons.readSessionFile(inputNumber, inputType);
                    }
                } else if (inputNumber == 9) {//View Reports
                    if (inputNumber == 9) {
                        System.out.println("Which choice you like to view the report? ");
                        System.out.println("1.A report containing the number of customers per lesson on each day ");
                        System.out.println("2.A report containing the type of fitness lessons which has generated the highest income ");

                        System.out.println("Please enter the number ");
                        inputNumber = Integer.parseInt(console.next());

                        if (inputNumber == 1) {
                            System.out.println("Which month you want to view data? (1/2) ");
                            inputType = console.next();
                            Report.getNumOfCustomers(inputType);
                        }
                        if (inputNumber == 2) {
                            System.out.println("Which month you want to view data? (1/2) ");
                            inputType = console.next();
                            Report.calIncomePerLesson(inputType);
                        }
                    }
                } else if (inputNumber == 7) {//View Customers
                    if (inputNumber == 7) {
                        Customer.readCustomerFile();
                    }
                } else if (inputNumber == 8) {//View Booking Details
                    if (inputNumber == 8) {
                        Bookings.readBookingFile();
                    }
                } else if (inputNumber == 10) {
                } else {
                    System.out.println("Error: Invalid number");
                    printMenu();
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error: Input value is not a number");
                System.out.println("------------------------------------");
                printMenu();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Error: Input value is not a number");
            System.out.println("------------------------------------");
            printMenu();
        }
        // closing the scanner stream
        console.close();
    }

}
















//
////Description: This is the main class of the WFC programme. Menu is design under this class.
//
//package com.coursework.wfc;
//import java.util.Scanner;
//
//public class PrintMain {
//    // Initialize Scanner object
//    static Scanner console = new Scanner(System.in);
//    public static void main(String[] args) {
//        System.out.println("**************************************************");
//        System.out.println("****** Welcome to The Weekend Fitness Club *******");
//        System.out.println("**************************************************");
//        printMenu();
//    }
//    public static void printMenu() {
//        int inputNumber;
//        String inputType;
//        System.out.println("##--------------------- MENU --------------------##");
//        System.out.println("");
//        System.out.println("[1].Create Booking ");
//        System.out.println("[2].Edit Booking ");
//        System.out.println("[3].Cancel Booking ");
//        System.out.println("[4].Give Feedback ");
//        System.out.println("[5].Update Attendance ");
//        System.out.println("[6].View Session ");
//        System.out.println("[7].Print Report ");
//        System.out.println("[8].View Customers ");
//        System.out.println("[9].View Bookings ");
//        System.out.println("[10].Exit ");
//        System.out.println("-----------------------------------------------------");
//
//        try {
//            System.out.println("Please enter the number which you need to proceed. ");
//            inputNumber = Integer.parseInt(console.next());
//            try {
//                if (inputNumber == 1) {//Create Bookings
//                    Bookings.createBooking();
//                } else if (inputNumber == 2) {//Edit Bookings
//                    Bookings.editBooking();
//                } else if (inputNumber == 3) {//Cancel Bookings
//                    Bookings.cancelBooking();
//                } else if (inputNumber == 4 || inputNumber == 5) {//Give Feedback and Attendance
//                    Feedback.updateAttendanceAndFeedback();
//                } else if (inputNumber == 6) {//View Sessions
//                    System.out.println("Which choice you like to view the session? ");
//                    System.out.println("[11].View Sessions By Day ");
//                    System.out.println("[12].View Sessions By Session Type ");
//
//                    System.out.println("Please enter the number ");
//                    inputNumber = Integer.parseInt(console.next());
//
//                    if (inputNumber == 12) {
//                        System.out.println("Which session do you want to view? (zumba/yoga/spin/bodysculpt/all)");
//                        inputType = console.next().toLowerCase();
//                        Fitness_Lessons.readSessionFile(inputNumber, inputType);
//                    } else if (inputNumber == 11) {
//                        System.out.println("Which day you want to view? (saturday/sunday/both)");
//                        inputType = console.next().toLowerCase();
//                        Fitness_Lessons.readSessionFile(inputNumber, inputType);
//                    }
//                } else if (inputNumber == 7) {//View Reports
//                    if (inputNumber == 7) {
//                        System.out.println("Which choice you like to view the report? ");
//                        System.out.println("[13].A report containing the number of customers per lesson on each day ");
//                        System.out.println("[14].A report containing the type of fitness lessons which has generated the highest income ");
//
//                        System.out.println("Please enter the number ");
//                        inputNumber = Integer.parseInt(console.next());
//
//                        if (inputNumber == 13) {
//                            System.out.println("Which month you want to view data? (1/2) ");
//                            inputType = console.next();
//                            Report.getNumOfCustomers(inputType);
//                        }
//                        if (inputNumber == 14) {
//                            System.out.println("Which month you want to view data? (1/2) ");
//                            inputType = console.next();
//                            Report.calIncomePerLesson(inputType);
//                        }
//                    }
//                } else if (inputNumber == 8) {//View Customers
//                    if (inputNumber == 8) {
//                        Customer.readCustomerFile();
//                    }
//                } else if (inputNumber == 9) {//View Booking Details
//                    if (inputNumber == 9) {
//                        Bookings.readBookingFile();
//                    }
//                } else if (inputNumber == 10) {
//                } else {
//                    System.out.println("Error: Invalid number");
//                    printMenu();
//                }
//            } catch (NumberFormatException ex) {
//                System.out.println("Error: Input value is not a number");
//                System.out.println("------------------------------------");
//                printMenu();
//            }
//        } catch (NumberFormatException ex) {
//            System.out.println("Error: Input value is not a number");
//            System.out.println("------------------------------------");
//            printMenu();
//        }
//        // closing the scanner stream
//        console.close();
//    }
//
//}
