class CashRegister extends Thread {
    private int registerNumber;

    public CashRegister(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public void run() {
        for (int transaction = 1; transaction <= 5; transaction++) {
            System.out.println("Cash Register " + registerNumber + ": Processing transaction " + transaction);

            
            System.out.println("Cash Register " + registerNumber + ": Simulating transaction processing time");
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SupermarketSimulation {
    public static void main(String[] args) {
        int numberOfCashRegisters = 3; 

        
        for (int i = 1; i <= numberOfCashRegisters; i++) {
            CashRegister cashRegister = new CashRegister(i);
            cashRegister.start();
        }
    }
}
