package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        DateTimeFormatter formatter;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = myScanner.nextLine();
        String[] nameSplit = name.split(" ");
        String formattedName = nameSplit[1] + ", " + nameSplit[0];

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = myScanner.nextLine();
        formatter = DateTimeFormatter.ofPattern(("MM/dd/yyyy"));
        LocalDate ticketDate = LocalDate.parse(date, formatter);

        System.out.print("How many tickets would you like? ");
        int numOfTickets = Integer.parseInt(myScanner.nextLine());

        String appending = "";
        if (numOfTickets > 1) appending = "s";

        System.out.printf("%d ticket%s reserved for %s under %s", numOfTickets, appending, ticketDate, formattedName);
    }
}
