package pck;

import java.util.Scanner;
public class BC1048 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           double salary = scanner.nextDouble();
           double newsalary = 0.0;
           double increase = 0.0;
           int percentage = 0;

           if (salary >= 0.00 && salary <= 400.00) {
               percentage = 15;
           } else if (salary <= 800.00) {
               percentage = 12;
           } else if (salary <= 1200.00) {
               percentage = 10;
           } else if (salary <= 2000.00) {
               percentage = 7;
           } else if(salary > 2000.00) {
               percentage = 4;
           }
           increase = salary * percentage/100.00f;
           newsalary = salary + increase;

           System.out.printf("Novo salario: %.2f\n", newsalary);
           System.out.printf("Reajuste ganho: %.2f\n", increase);
           System.out.printf("Em percentual: %d %%\n", percentage);

           scanner.close();
       }
   }