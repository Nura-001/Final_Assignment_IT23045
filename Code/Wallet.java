class InvalidAmountException extends IllegalArgumentException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Wallet {
    private double balance;

    // Constructor to initialize the balance
    public Wallet() {
        this.balance = 0;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Add funds to the wallet
    public void addFunds(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }
        this.balance += amount;
    }

    // Spend funds from the wallet
    public void spend(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        this.balance -= amount;
    }

    // Main method for testing the functionality
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();

        try {
            myWallet.addFunds(100);
            System.out.println("Current balance: " + myWallet.getBalance());

            myWallet.spend(50);
            System.out.println("Current balance: " + myWallet.getBalance());

            myWallet.spend(70); // Will trigger InsufficientFundsException

        } catch (InvalidAmountException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("END");
        }

        // Test case for adding negative funds
        try {
            myWallet.addFunds(-20); // Will trigger InvalidAmountException
        } catch (InvalidAmountException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
