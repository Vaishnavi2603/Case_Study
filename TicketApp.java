package Train_Ticket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketApp {
	
	public static LocalDate dateInput(String userInput)
	{
		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse(userInput, dateFormat);
		return date;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("======Welcome To Train Reservation=========");
		System.out.println("======Welcome To Train Ticket Reservation=========");

		System.out.println("Enter the Train Number");
		int trainNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Train Name");
		String trainName=sc.nextLine();
		System.out.println("Enter TravelDate");
		String userInput=sc.next();
		LocalDate travelDate=dateInput(userInput);
		System.out.println("Enter Number of Passengers");
		int numberOfPassengers=sc.nextInt();
		
		Train train =new Train(trainNo,trainName,"Banglore","Mumbai",2347.67);
		Ticket ticket=new Ticket(travelDate,train);
		
                 sc.nextLine();
		for(int i=1;i<=numberOfPassengers;i++)
		{
			System.out.println("Enter Passenger Name");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter Age");
			int age=sc.nextInt();
                        sc.nextLine();
			
			System.out.println("Enter Gender(M/F)");
			String gender=sc.next();
			char g=gender.charAt(0);
			ticket.addPassenger(name, age, g);
		}
		System.out.print("Ticket Booked with PNR:"+ticket.generatePNR());
		
		sc.close();
	}
	
}


