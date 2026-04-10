class Account {
    int p;

    Account(int p) {
        this.p = p;
    }

    double calculateInterest(int p, int r, int t) {
        double si;
        double b;
        si = (0.02 * p * r * t) / 100;
        b = p + si;
        return si;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int p) {
        super(p);
    }

    @Override
    double calculateInterest(int p, int r, int t) {
        double see;
        see = (0.04 * p * r * t) / 100;
        if (p > 50000) {
            return see + 500;
        }
        return see;
    }
}

class FixedDeposit extends SavingsAccount {

    FixedDeposit(int p) {
        super(p);
    }

    @Override
    double calculateInterest(int p, int r, int t) {
        double see;
        see = super.calculateInterest(p, r, t);
        see = see + (0.02 * p * r * t) / 100;
        return see;
    }
}

public class MultiTierSys {
    
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(10000);
        System.out.println(s1.calculateInterest(10000, 1, 1));

        SavingsAccount s2 = new SavingsAccount(60000);
        System.out.println(s2.calculateInterest(60000, 1, 1));
 
        FixedDeposit f1 = new FixedDeposit(60000);
        System.out.println(f1.calculateInterest(60000, 1, 1));
    }
}