package module;

import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements AtmInterface {
    ATM atm = new ATM();
    Map<Double,String> minis = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Availabe Balance: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if( withdrawAmount <= atm.getBalance()) {
            minis.put(withdrawAmount, atm.getBalance()+"Amount withdrawn");
            System.out.println("Collect the cash: " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        minis.put(depositAmount, atm.getBalance()+"Amount deposited");
        System.out.println("Deposit Amount: " + depositAmount);
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> entry : minis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
