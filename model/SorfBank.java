package model;

import java.util.Scanner;

public class SorfBank {

    String id, name, startday, address;
    int numberOfSenior, numberOfJunior;
    double estimate, actual;

    Scanner sc = new Scanner(System.in);

    public SorfBank(String id, String name, String startday, String address, int numberOfSenior, int numberOfJunior,
            double estimate, double actual) {
        this.id = id;
        this.name = name;
        this.startday = startday;
        this.address = address;
        this.numberOfSenior = numberOfSenior;
        this.numberOfJunior = numberOfJunior;
        this.estimate = estimate;
        this.actual = actual;
    }

    public SorfBank() {
    }

    public void setInfo() {
        System.out.println("id: ");
        this.id = sc.nextLine();
        System.out.println("name: ");
        this.name = sc.nextLine();
        System.out.println("startday: ");
        this.startday = sc.nextLine();
        System.out.println("address: ");
        this.address = sc.nextLine();

        System.out.println("numberOfSenior: ");
        this.numberOfSenior = sc.nextInt();
        sc.nextLine();

        System.out.println("numberOfJunior: ");
        this.numberOfJunior = sc.nextInt();
        sc.nextLine();

        System.out.println("estimate: ");
        this.estimate = sc.nextDouble();
        sc.nextLine();

        System.out.println("actual: ");
        this.actual = sc.nextDouble();
        sc.nextLine();

    }

    public void calEstimate(int coeSlry) {
        this.estimate = numberOfSenior * 5000 * coeSlry + numberOfJunior * 2000 * coeSlry;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", startday=" + startday + ", address=" + address
                + ", numberOfSenior=" + numberOfSenior + ", numberOfJunior=" + numberOfJunior + ", estimate=" + estimate
                + ", actual=" + actual;
    }
}
