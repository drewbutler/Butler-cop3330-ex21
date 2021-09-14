/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int monthNum = myObj.nextInt();
        String month;
        switch (monthNum) {
            case 1:
                month = "The name of the month is January";
                break;
            case 2:
                month = "The name of the month is February";
                break;
            case 3:
                month = "The name of the month is March";
                break;
            case 4:
                month = "The name of the month is April";
                break;
            case 5:
                month = "The name of the month is May";
                break;
            case 6:
                month = "The name of the month is June";
                break;
            case 7:
                month = "The name of the month is July";
                break;
            case 8:
                month = "The name of the month is August";
                break;
            case 9:
                month = "The name of the month is September";
                break;
            case 10:
                month = "The name of the month is October";
                break;
            case 11:
                month = "The name of the month is November";
                break;
            case 12:
                month = "The name of the month is December";
                break;
            default:
                month = "The number you entered was not an apporpriate value.";
                break;
        }
            System.out.println(month + ".");
        }
    }