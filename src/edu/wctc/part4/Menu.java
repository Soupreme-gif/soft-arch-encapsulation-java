package edu.wctc.part4;

import java.util.Scanner;

public class Menu {

    public void displayMenu()
    {

        Scanner scan = new Scanner(System.in);


        for(int i = 0; i < Integer.MAX_VALUE; i++)
        {
            HrPerson interviewer = new HrPerson();

            System.out.println("Hire an Employee?");
            String response = scan.nextLine();

            if(response.equals("yes") || response.equals("Yes"))
            {

                boolean hiredEmployee = interviewer.Interview();

                if(hiredEmployee == true)
                {
                    System.out.println("What is the Employee's name?");
                    String name = scan.nextLine();

                    System.out.println("What is the Employee's last name?");
                    String lastName = scan.nextLine();

                    System.out.println("Enter in the employee's SSN");
                    String ssn = scan.nextLine();

                    Employee employee = new Employee(name, lastName, ssn);
                    employee.doFirstTimeOrientation("A101");
                    employee.printReport();

                }


            }
            else
            {
                continue;
            }


        }

    }
}
