package academy.nelioalves.cursojava.domain.Enumeração.Exercício01.Application;

import academy.nelioalves.cursojava.domain.Enumeração.Exercício01.Enum.WorkerLevel;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício01.Entities.Department;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício01.Entities.Hour_Contract;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício01.Entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program_Worker {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        System.out.print("Enter department's name: ");
        String departmentName = scan.nextLine();
        System.out.println();
        System.out.println("Enter worker data: ");
        System.out.print("Name:");
        String workerName = scan.nextLine();
        System.out.print("Level: ");
        String workerLevel = scan.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int amountOfContracts = scan.nextInt();

        for (int i = 1; i <= amountOfContracts; i++) {

            System.out.println("Enter contract #" + i + " data" );
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration hours: ");
            int hours = scan.nextInt();
            Hour_Contract contract = new Hour_Contract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }
        System.out.println();

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
         String monthAndYear = scan.next();
         int month = Integer.parseInt(monthAndYear.substring(0, 2));
         int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        scan.close();
    }
}
