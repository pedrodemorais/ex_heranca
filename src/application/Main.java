package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entitities.Employee;
import model.entitities.OutSourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List <Employee> list = new ArrayList<Employee>();
		
		System.out.print("Enter the of employees: ");
		
		int numOfEmploye = input.nextInt();
		input.hasNextLine();
			
		for(int i=0; i<numOfEmploye;i++) {
				
				System.out.println("Employee #"+(i+1)+" data: ");
				System.out.print("Outsourced(y/n): ");
				
				char outsourced = input.next().charAt(0);
				input.nextLine();
					if(outsourced == 'n') {
						System.out.print("Name: ");
						String name = input.nextLine();
						System.out.print("Hours: ");
						int quantityOfHours=input.nextInt();
						System.out.print("Value per Hours: ");
						Double ValuePerHours = input.nextDouble();
						Employee employee = new Employee(name, quantityOfHours, ValuePerHours);
						list.add(employee);
						
						
						
					}else if(outsourced =='y'){
						System.out.print("Name: ");
						String name = input.nextLine();
						System.out.print("Hours: ");
						int quantityOfHours=input.nextInt();
						System.out.print("Value per Hours: ");
						Double ValuePerHours = input.nextDouble();
						System.out.print("Additional charge: ");
						Double additionalCharge = input.nextDouble();
						Employee employee = new OutSourcedEmployee(name, quantityOfHours, ValuePerHours,additionalCharge );
						list.add(employee);
						
						
						
					}else if(outsourced != 'y' && outsourced!='n') { 
						System.out.print("Opção Inválida!");
						
					}
					
							
						}
		System.out.println("");
				
		System.out.println("PAYMENTS");
					for(Employee x: list) {
						System.out.println(x);
					
				
			}
	}

}
