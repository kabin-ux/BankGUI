
/**
 * Write a description of class BankCard here.
 *
 * @author (22067530 Kabin Dongol Maharjan)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    
    //create a constructor
    public BankCard(int balanceAmount, int cardID, String bankAccount, String issuerBank)
    {
        //ClientName initialized to an empty string
        this.clientName = " ";
        //the parameter values are assigned to the attributes
        this.balanceAmount= balanceAmount;
        this.cardID= cardID;
        this.bankAccount= bankAccount;
        this.issuerBank= issuerBank;
    }
    
    //accessor method for attribute cardID
    public int getCardID ()
    {
        return this.cardID;
    }
    
    //accessor method for attribute clientName
    public String getClientName ()
    {
        return this.clientName;
    }
    
    //accessor method for attribute issuerBank
    public String getIssuerBank ()
    {
        return this.issuerBank;
    }
    
    //accessor method for attribute bankAccount
    public String getBankAccount ()
    {
        return this.bankAccount;
    }
    
    //accessor method for attribute balanceAmount
    public int getBalanceAmount ()
    {
        return this.balanceAmount;
    }
    
    //method to set the clientName
    public void setClientName(String newClientName)
    {
        this.clientName = newClientName;
    }
    
    //method to set the balanceAmount
    public void setBalanceAmount(int newBalanceAmount)
    {
        this.balanceAmount = newBalanceAmount;
    }
    
    // creating a method to display the details of BankCard class 
    public void display()
    {
        //displaying the results
        System.out.println("Card id is: "+ this.cardID);
        System.out.println("Issuerbank is: "+ this.issuerBank);
        System.out.println("Bankaccount is: "+ this.bankAccount);
        //System.out.println("Balanceamount is: "+ this.balanceAmount);
        
        //check if client name is empty or not
        if (clientName !="") {
            //display clientName if it is not empty
            System.out.println("Client name is: "+ this.clientName);
        }
        else {
            System.out.println("Client name is empty.");
        }
    }
}

