
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067530 Kabin Dongol Maharjan)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //declaring attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
  
   //create a constructor
    public DebitCard(int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        //calling super class constructor 
        super(balanceAmount,cardID,bankAccount,issuerBank);
        //calling setClientName
        super.setClientName(clientName);
        //initializing the attributes.
        this.hasWithdrawn = false;
        this.pinNumber = pinNumber;
    }
  
    //accessor method for the attribute pinNumber
    public int getPINNumber()
    {
        return this.pinNumber;
    }
    
    //accessor method for the attribute withdrawalAmount
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    //accessor method for the attribute dateOfWithdrawal
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    
    //accessor method for the attribute hasWithdrawn
    public boolean gethasWithdrawn()
    {
        return this.hasWithdrawn;
    }
  
    //mutator method for withdrawal amount
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //withdraw method to deduct the money from the client account  
    public int withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        int x;
        //check whether the pin number is valid
        if (pinNumber != getPINNumber()) {
            System.out.println("Error pin number");
            x=1;
        }
        //check if withdraw amount is greater than the balance amount
        else if(withdrawalAmount > super.getBalanceAmount()) {
            System.out.println("Balance is not sufficient");
            x=2;
        }
        //if pin number is valid and sufficient amount is present
        else {
            
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.withdrawalAmount = withdrawalAmount;
            this.hasWithdrawn = true;
            //calculation of balanceAmount
            super.setBalanceAmount(super.getBalanceAmount()-withdrawalAmount);
            x=0;
        }
        return x;
    }
    
    //creating display() method with same signature as the display() method in BankCard class 
    public void display()
    {
        super.display();
        
        //check if amount has been withdrawn or not
        if(hasWithdrawn == true) {
            //calling of the display() method in the class BankCard 
            
            //displaying the results
            System.out.println("PINNumber is: "+this.pinNumber);
            System.out.println("WithdrawalAmount is: "+this.withdrawalAmount);
            System.out.println("date of Withdrawal is: "+this.dateOfWithdrawal);
            System.out.println("BalanceAmount is: "+this.getBalanceAmount());

        }
        else {
            System.out.println("BalanceAmount is: "+this.getBalanceAmount());
        }
        
    }
}


