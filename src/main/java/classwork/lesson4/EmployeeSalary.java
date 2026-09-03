package classwork.lesson4;

public class EmployeeSalary {

    public static void main(String[] args) {

        int salary1 = 1500;
        int salary2 = 2000;
        int salary3 = 1800;

        int salary1In10Years = salary1 * 120;
        int salary2In10Years = salary2 * 120;
        int salary3In10Years = salary3 * 120;

        System.out.println("Salary1 in 10 years: " + salary1In10Years);
        System.out.println("Salary2 in 10 years: " + salary2In10Years);
        System.out.println("Salary3 in 10 years: " + salary3In10Years);

        int salaryTax1 = salary1In10Years - (salary1In10Years * 5 / 100);
        int salaryTax2 = salary2In10Years - (salary2In10Years * 5 / 100);
        int salaryTax3 = salary3In10Years - (salary3In10Years * 5 / 100);

        System.out.println("Salary1 with tax 5% is: " + salaryTax1);
        System.out.println("Salary2 with tax 5% is: " + salaryTax2);
        System.out.println("Salary3 with tax 5% is: " + salaryTax3);

        int averageSalary = (salaryTax1 + salaryTax2 + salaryTax3) / 3;

        System.out.println("Average salary: " + averageSalary);

    }

}
