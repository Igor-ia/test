import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		Rectangle rect= new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width=sc.nextDouble();
		rect.height=sc.nextDouble();
			
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n",rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n",rect.diagonal());

		
		


		
		System.out.println("------------------------");
		
		Employee emp= new Employee();
		
		System.out.println("Name: ");
		emp.name=sc.nextLine();
		System.out.println("Gross Salary:");
		emp.grossSalary=sc.nextDouble();
		System.out.println("Tax:");
		emp.tax=sc.nextDouble();
		
		System.out.println("Employee:"+ emp);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " +emp);
		sc.close();
}

}
