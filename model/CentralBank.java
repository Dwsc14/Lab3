package model;

public class CentralBank extends SorfBank {
    int CTVcount;

    public CentralBank(String id, String name, String startday, String address, int numberOfSenior, int numberOfJunior,
            double estimate, double actual, int cTVcount) {
        super(id, name, startday, address, numberOfSenior, numberOfJunior, estimate, actual);
        this.CTVcount = cTVcount;
    }

    public CentralBank() {
    }

    public void setInfo() {
        super.setInfo();
        System.out.println("CTVcount: ");
        this.CTVcount = sc.nextInt();
        sc.nextLine();
    }

    public void calActual() {
        super.actual = super.estimate + this.CTVcount * 1000;
    }

    @Override
    public String toString() {
        return "CTVcount=" + CTVcount + super.toString();
    }

}
