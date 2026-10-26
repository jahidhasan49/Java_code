package store;

public class Customer {
     private String customerName;
     private int customerId;
     private int loyaltyScore;

    public Customer() {
         this.customerName = "";
         this.customerId = 0;
         this.loyaltyScore = 0;
    }

    public Customer(String customerName, int customerId, int loyaltyScore) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.loyaltyScore = loyaltyScore;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getLoyaltyScore() {
        return this.loyaltyScore;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setLoyaltyScore(int loyaltyScore) {
         if(this.loyaltyScore >= 0 && this.loyaltyScore <= 100) {
             this.loyaltyScore = loyaltyScore;
         }
         else {
             System.out.println("Invalid loyalty score");
         }
    }

    public String calculateLoyaltyTier() {
        if (this.loyaltyScore >= 80) {
            return "Platinum";
        }

        else if (this.loyaltyScore >= 60) {
            return "Gold";
        }

        else if (this.loyaltyScore >= 40) {
            return "Silver";
        }

        else {
            return "Bronze";
        }
    }
}
