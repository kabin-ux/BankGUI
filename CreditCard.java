
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067530 Kabin Dongol Maharjan)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //declaring attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //create a constructor
    public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, int balanceAmount,int cvcNumber, 
    double interestRate, String expirationDate)
    {
        //calling super class constructor
        super(balanceAmount,cardID,bankAccount,issuerBank);
        //calling setClientName
        super.setClientName(clientName);
        //assigning the parameter values to the attributes
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        //attribute isGranted is set to false
        this.isGranted = false;
    }
    
    //accessor method for attribute cvcNumber
    public int getCVCNumber()
    {
        return this.cvcNumber;
    } 
    
    //accessor method for attribute creditLimit
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    //accessor method for attribute interestRate 
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    //accessor method for attribute expirationDate  
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    //accessor method for attribute gracePeriod    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    //accessor method for attribute isGranted    
    public boolean getisGranted()
    {
        return this.isGranted;
    }
    
    //method to set the credit limit
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        //check if the CreditLimit is less than or equal to 2.5 times the BalanceAmount
        if (creditLimit <= 2.5* super.getBalanceAmount()) {
            //assigning the parameter values to the attributes
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            //set isGranted to true
            this.isGranted = true;
        }
        else {
            System.out.println("Sorry the credit cannot be issued.");
        }
    }
    
    //method to remove the client's credit card
    public void cancelCreditCard()
    {
        cvcNumber = 0;
        creditLimit = 0;
        gracePeriod = 0;
        isGranted = false;
    }
    
    //creating display() method with same signature as the display() method in BankCard class 
    public void display()
    {
        super.display();

        //check whether isGranted is true or not
        if (isGranted == true) {
            //call the display() method in the BankCard class
            
            
            //display the outputs
            System.out.println("BalanceAmount is: "+this.getBalanceAmount());
            System.out.println("CVCnumber: "+ this.cvcNumber);
            System.out.println("CreditLimit: "+this.creditLimit);
            System.out.println("InterestRate: "+this.interestRate);
            System.out.println("Expiration Date: "+this.expirationDate);
            System.out.println("GracePeriod: "+this.gracePeriod);
        }

        else {
            
            System.out.println("BalanceAmount is: "+this.getBalanceAmount());
            System.out.println("CVCnumber: "+ this.cvcNumber);
            System.out.println("InterestRate: "+this.interestRate);
            System.out.println("Expiration Date: "+this.expirationDate);
        }
    }
}
