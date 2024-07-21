package RailwaySystem;

import java.util.Scanner;

public class MainClass {
     public static void main(String[] args) {
          boolean loop = true;
          while (loop) {

               System.out.println(" \nChoose any one \n1.Book ticket \n2.Cancelticket \n3.Display BookedList" +
                         "\n4.Exit");
               Scanner sc = new Scanner(System.in);
               int n = sc.nextInt();

               switch (n) {
                    case 1: {
                         System.out.println("Enter name : ");
                         String name = sc.next();
                         System.out.println("Enter the Age : ");
                         int Age = sc.nextInt();
                         System.out.println("Enter berth");
                         char preference = sc.next().charAt(0);

                         if (preference == 'U' || preference == 'L')
                              TicketBooking.bookTicket(new Passenger(name, Age, preference));
                         else
                              System.out.println("Invalid berth");

                         break;
                    }
                    case 2: {
                         System.out.println("Enter your TicketId : ");
                         int id = sc.nextInt();
                         System.out.println(TicketCancel.canceling(id));
                         break;
                    }
                    case 3: {
                         TicketBooking.displayConfirmed();
                         break;
                    }
                    case 4: {
                         System.out.println("\tThank You");
                         sc.close();
                         loop = false;
                         break;
                    }

               }

          }
     }
}
