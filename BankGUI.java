
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067530 Kabin Dongol Maharjan)
 * @version (1.0.0)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.util.*;
public class BankGUI implements ActionListener
{
    //declare all the components
    private JFrame BankGUIframe;
    
    private ArrayList <BankCard> bankcard_arraylist=new ArrayList<>();
    
    //------components for Debit Card
    //Withdraw
    private JLabel heading1Label,heading2Label,dcardid1Label,withdrawalamountLabel,withdrawaldateLabel,dpinnumber1Label;
    private JTextField dcardid1Text,withdrawalamountText,dpinnumber1Text;
    private JComboBox debityearsBox, debitmonthsBox, debitdaysBox;
    private JButton withdrawButton;
    
    //Add DebitCard
    private JLabel heading3Label,dclientnameLabel,dcardid2Label,dissuerbankLabel,dbankaccountLabel,dbalanceamountLabel,dpinnumber2Label;
    private JTextField dclientnameText,dcardid2Text,dissuerbankText,dbankaccountText,dbalanceamountText,dpinnumber2Text;
    private JButton daddButton,ddisplayButton,dclearButton; 
    
    //---------components for Credit Card
    //Set credit limit
    private JLabel heading4Label,heading5Label,ccardid1Label,creditlimitLabel,graceperiodLabel;
    private JTextField ccardid1Text, creditlimitText, graceperiodText;
    private JButton creditlimitButton;
    
    //add CreditCard
    private JLabel heading6Label,ccardid2Label,cclientnameLabel,cissuerbankLabel,cbankaccountLabel, cbalanceamountLabel,cvcnumberLabel,expirationdateLabel,interestrateLabel;
    private JTextField ccardid2Text, cclientnameText, cissuerbankText, cbankaccountText, cbalanceamountText, cvcnumberText,interestrateText;
    private JComboBox credityearsBox, creditmonthsBox, creditdaysBox;
    private JButton caddButton,cdisplayButton;
    
    //cancel CreditCard
    private JLabel heading7Label,ccardid3Label;
    private JTextField ccardid3Text;
    private JButton cancelButton, cclearButton;
    
    
    public BankGUI(){
        //create new JFrame BankGUIframe 
        JFrame BankGUIframe = new JFrame();

        heading1Label = new JLabel("Debit Card");
        heading1Label.setFont(new Font("Calibri", Font.BOLD, 26));
        
        //withdraw
        //intializing JLabels, JTextfields, JComboBoxes and JButtons
        heading2Label = new JLabel("Withdraw");
        heading2Label.setFont(new Font("Calibri", Font.BOLD, 19));
        dcardid1Text = new JTextField("");
        dcardid1Label = new JLabel("CardID");
        withdrawalamountText = new JTextField("");
        withdrawalamountLabel = new JLabel("Withdrawal Amount");
        String[] years = {"2023","2024"};
        debityearsBox = new JComboBox(years);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        debitmonthsBox = new JComboBox(months);
        debitdaysBox = new JComboBox();
        for(int i = 1; i<=31; i++){
            debitdaysBox.addItem(i);
        }
        withdrawaldateLabel = new JLabel("Date of Withdrawal");
        dpinnumber1Text = new JTextField("");
        dpinnumber1Label = new JLabel("PIN Number");
        withdrawButton = new JButton("Withdraw");

        //set Bounds 
        heading1Label.setBounds(504, 2, 305, 50);
        heading2Label.setBounds(215,60,150,36);
        dcardid1Text.setBounds(190, 103, 163,29);
        dcardid1Label.setBounds(56, 103, 66,22);
        withdrawalamountText.setBounds(190 , 143 , 163 ,29);
        withdrawalamountLabel.setBounds(56, 143, 124, 24);
        debityearsBox.setBounds(360, 183, 78, 29);
        debitmonthsBox.setBounds(247, 183, 110, 29);
        debitdaysBox.setBounds(190, 183, 56, 29);
        withdrawaldateLabel.setBounds(56, 183, 146, 24);
        dpinnumber1Text.setBounds(190, 223, 163, 29);
        dpinnumber1Label.setBounds(56, 223, 184, 24);
        withdrawButton.setBounds(117, 274, 120, 32);

        //-----------Add Debit Card
        //intializing JLabels, JTextfields, JComboBoxes and JButtons
        heading3Label = new JLabel("Add Debit Card");
        heading3Label.setFont(new Font("Calibri", Font.BOLD, 19));
        dclientnameText = new JTextField("");
        dclientnameLabel = new JLabel("Client Name");
        dcardid2Text = new JTextField("");
        dcardid2Label = new JLabel("CardID");
        dissuerbankText = new JTextField("");
        dissuerbankLabel = new JLabel("Issuer Bank");
        dbankaccountText = new JTextField("");
        dbankaccountLabel = new JLabel("Bank Account");
        dbalanceamountText = new JTextField("");
        dbalanceamountLabel = new JLabel("Balance Amount");
        dpinnumber2Text = new JTextField("");
        dpinnumber2Label = new JLabel("PIN Number");
        daddButton = new JButton("Add");        
        ddisplayButton = new JButton("Display ");
        dclearButton = new JButton("Clear ");

        //set bounds
        heading3Label.setBounds(668,60,198,36);
        dclientnameText.setBounds(592, 103, 163, 29);
        dclientnameLabel.setBounds(504, 103, 142, 24);
        dcardid2Text.setBounds(592, 143, 163, 29);
        dcardid2Label.setBounds(504, 143, 93, 30);
        dissuerbankText.setBounds(592, 183, 163, 29);
        dissuerbankLabel.setBounds(504, 183, 182, 22);
        dbankaccountText.setBounds(892, 103, 163, 29);
        dbankaccountLabel.setBounds(790, 103, 100, 17);
        dbalanceamountText.setBounds(892, 143, 163, 29);
        dbalanceamountLabel.setBounds(790, 143, 100, 19);
        dpinnumber2Text.setBounds(892, 183, 163, 29);
        dpinnumber2Label.setBounds(790, 183, 124, 20);
        daddButton.setBounds(700,246, 120, 32);
        ddisplayButton.setBounds(830, 246, 120, 32);
        dclearButton.setBounds(494, 308, 120, 32);

        withdrawButton.setBackground(new Color (102,255,204));
        daddButton.setBackground(new Color (0,255,0));
        ddisplayButton.setBackground(new Color (204,204,255));
        dclearButton.setBackground(new Color (255,80,80));
        
        
        //add buttons, labels, textfields in BankGUIframe
        BankGUIframe.add(heading1Label);
        BankGUIframe.add(heading2Label);
        BankGUIframe.add(heading3Label);

        BankGUIframe.add(dcardid1Text);
        BankGUIframe.add(dcardid1Label);

        BankGUIframe.add(withdrawalamountText);
        BankGUIframe.add(withdrawalamountLabel);

        BankGUIframe.add(debityearsBox);
        BankGUIframe.add(debitmonthsBox);
        BankGUIframe.add(debitdaysBox);
        BankGUIframe.add(withdrawaldateLabel);
        BankGUIframe.add(dpinnumber1Text);
        BankGUIframe.add(dpinnumber1Label);

        BankGUIframe.add(dclientnameText);
        BankGUIframe.add(dclientnameLabel);

        BankGUIframe.add(dcardid2Text);
        BankGUIframe.add(dcardid2Label);

        BankGUIframe.add(dissuerbankText);
        BankGUIframe.add(dissuerbankLabel);

        BankGUIframe.add(dbankaccountText);
        BankGUIframe.add(dbankaccountLabel);

        BankGUIframe.add(dbalanceamountText);
        BankGUIframe.add(dbalanceamountLabel);

        BankGUIframe.add(dpinnumber2Text);
        BankGUIframe.add(dpinnumber2Label);

        BankGUIframe.add(withdrawButton);
        BankGUIframe.add(daddButton);  
        BankGUIframe.add(ddisplayButton);
        BankGUIframe.add(dclearButton);

        //--------------------creating GUI for CreditCard-----------------------------------
        //-----Set Credit Limit------------
        //intializing JLabel, JTextfield, JComboBox and JButtons
        heading4Label = new JLabel("Credit Card");
        heading4Label.setFont(new Font("Calibri", Font.BOLD, 26));
        heading5Label = new JLabel("Set Credit Limit");
        heading5Label.setFont(new Font("Calibri", Font.BOLD, 19));
        ccardid1Text = new JTextField("");
        ccardid1Label = new JLabel("CardID");
        creditlimitText = new JTextField("");
        creditlimitLabel = new JLabel("Credit Limit");
        graceperiodText = new JTextField("");
        graceperiodLabel = new JLabel("Grace Period");
        creditlimitButton = new JButton("Set Credit Limit");

        //set bounds
        heading4Label.setBounds(504, 368, 158, 36);
        heading5Label.setBounds(144, 417, 305, 36);
        ccardid1Text.setBounds(110, 465, 163, 29);
        ccardid1Label.setBounds(26, 465, 68, 29);
        creditlimitText.setBounds(110, 505, 163, 29);
        creditlimitLabel.setBounds(26, 505, 140, 29);
        graceperiodText.setBounds(110, 545, 163, 29);
        graceperiodLabel.setBounds(26, 545, 150, 29);
        creditlimitButton.setBounds(116, 645, 135, 32);

        //----------Add Credit Card-----------
        //intializing JLabel, JTextfield, JComboBox and JButtons
        heading6Label = new JLabel("Add Credit Card");
        heading6Label.setFont(new Font("Calibri", Font.BOLD, 19));
        ccardid2Text = new JTextField("");
        ccardid2Label = new JLabel("CardID");
        cclientnameText = new JTextField("");
        cclientnameLabel = new JLabel("Client Name");
        cissuerbankText = new JTextField("");
        cissuerbankLabel = new JLabel("Issuer Bank");
        cbankaccountText = new JTextField("");
        cbankaccountLabel = new JLabel("Bank Account");
        cbalanceamountText = new JTextField("");
        cbalanceamountLabel = new JLabel("Balance Amount");
        cvcnumberText = new JTextField("");
        cvcnumberLabel = new JLabel("CVC Number");
        String[] cyears = {"2023","2024"};
        credityearsBox = new JComboBox(cyears);
        String[] cmonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        creditmonthsBox = new JComboBox(cmonths);
        creditdaysBox = new JComboBox();
        for(int i = 1; i<=31; i++){
            creditdaysBox.addItem(i);
        }
        expirationdateLabel = new JLabel("Expiration Date");
        interestrateText = new JTextField("");
        interestrateLabel = new JLabel("Interest Rate");

        caddButton = new JButton("Add");
        cdisplayButton = new JButton("Display");

        
        //set bounds
        heading6Label.setBounds(540, 417, 305, 36);
        ccardid2Text.setBounds(391, 465,163, 29);
        ccardid2Label.setBounds(308, 465, 81, 19);
        cclientnameText.setBounds(391, 505, 163, 29);
        cclientnameLabel.setBounds(308, 505, 104, 19);
        cissuerbankText.setBounds(391, 545, 163, 29);
        cissuerbankLabel.setBounds(308, 545, 103, 19);
        cbankaccountText.setBounds(391, 585, 163, 29);
        cbankaccountLabel.setBounds(308, 585, 112, 22);
        cbalanceamountText.setBounds(684, 465, 163, 29);
        cbalanceamountLabel.setBounds(581, 465, 112, 29);
        cvcnumberText.setBounds(684, 505, 163, 29);
        cvcnumberLabel.setBounds(581, 505, 142, 24);
        credityearsBox.setBounds(806, 545, 60, 29);
        creditmonthsBox.setBounds(735, 545, 69, 29);
        creditdaysBox.setBounds(684, 545, 50, 29);
        expirationdateLabel.setBounds(581, 545, 128, 29);
        interestrateText.setBounds(684, 585, 163, 29);
        interestrateLabel.setBounds(581, 585, 110, 29);
        caddButton.setBounds(448, 645, 120, 32);
        cdisplayButton.setBounds(578, 645, 120, 32);

        //-----------Cancel Credit Card-------------
        heading7Label = new JLabel("Cancel Credit Card");
        heading7Label.setFont(new Font("Calibri", Font.BOLD, 19));
        ccardid3Text = new JTextField("");
        ccardid3Label = new JLabel("CardID");
        cancelButton = new JButton("Cancel");
        cclearButton = new JButton("Clear");
        
        
        //set Bounds
        heading7Label.setBounds(899, 417, 305, 36);
        ccardid3Text.setBounds(920, 465, 163, 29);
        ccardid3Label.setBounds(870, 465, 69, 29);
        cancelButton.setBounds(930, 645, 120, 32);
        cclearButton.setBounds(519, 723, 120, 32);
        
        //set the color of buttons
        creditlimitButton.setBackground(new Color (0,255,204));
        caddButton.setBackground(new Color (0,255,0));
        cdisplayButton.setBackground(new Color (204,153,255));
        cancelButton.setBackground(new Color (255,153,153));
        cclearButton.setBackground(new Color (255,80,80));

        //add buttons, labels, textfields in BankGUIframe
        BankGUIframe.add(heading4Label);
        BankGUIframe.add(heading5Label);
        BankGUIframe.add(heading6Label);
        BankGUIframe.add(heading7Label);
        
        BankGUIframe.add(ccardid1Text); 
        BankGUIframe.add(ccardid1Label);

        BankGUIframe.add(creditlimitText);
        BankGUIframe.add(creditlimitLabel);

        BankGUIframe.add(graceperiodText);
        BankGUIframe.add(graceperiodLabel);

        BankGUIframe.add(ccardid2Text); 
        BankGUIframe.add(ccardid2Label);

        BankGUIframe.add(cclientnameText); 
        BankGUIframe.add(cclientnameLabel);

        BankGUIframe.add(cissuerbankText); 
        BankGUIframe.add(cissuerbankLabel);

        BankGUIframe.add(cbankaccountText); 
        BankGUIframe.add(cbankaccountLabel);

        BankGUIframe.add(cbalanceamountText); 
        BankGUIframe.add(cbalanceamountLabel);

        BankGUIframe.add(cvcnumberText); 
        BankGUIframe.add(cvcnumberLabel);

       
        BankGUIframe.add(creditlimitButton);
        BankGUIframe.add(credityearsBox);
        BankGUIframe.add(creditmonthsBox);
        BankGUIframe.add(creditdaysBox);

        
        BankGUIframe.add(interestrateText); 
        BankGUIframe.add(interestrateLabel);
        
        BankGUIframe.add(expirationdateLabel);
        
        BankGUIframe.add(ccardid3Text);
        BankGUIframe.add(ccardid3Label);

        BankGUIframe.add(caddButton);
        BankGUIframe.add(cdisplayButton);
        
        BankGUIframe.add(cancelButton);
        BankGUIframe.add(cclearButton);

        
        //add Actionlistener for buttons
        withdrawButton.addActionListener(this);
        daddButton.addActionListener(this);
        ddisplayButton.addActionListener(this);
        dclearButton.addActionListener(this);
        creditlimitButton.addActionListener(this);
        caddButton.addActionListener(this);
        cdisplayButton.addActionListener(this);
        cclearButton.addActionListener(this);
        cancelButton.addActionListener(this);
        
        //creating ArrayList
        ArrayList BankCard= new ArrayList();
                
        BankGUIframe.setSize(1110,1080);
       
        BankGUIframe.setLayout(null);
       
        BankGUIframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        BankGUIframe.setResizable(false);
        
        BankGUIframe.setPreferredSize(new Dimension(550, 300));
        
        BankGUIframe.setTitle("GUI");
        
        BankGUIframe.getContentPane().setBackground(new Color(102,255,255));
       
        BankGUIframe.setVisible(true);  
        
    }
    
    //Implement the method of the ActionListener
    public void actionPerformed(ActionEvent e){
        //------------when clear button of Debit Card section pressed------------
        if (e.getSource()==dclearButton){
            //setting the value in the textfields to an empty string
            dcardid1Text.setText(" ");
            withdrawalamountText.setText(" ");
            dpinnumber1Text.setText(" ");
            dclientnameText.setText(" ");
            dcardid2Text.setText(" ");
            dissuerbankText.setText(" ");
            dbankaccountText.setText(" ");
            dbalanceamountText.setText(" ");
            dpinnumber2Text.setText(" "); 
        }

        //------------when clear button of Credit Card section pressed------------
        if (e.getSource()==cclearButton){
            //setting the value in the textfields to an empty string
            ccardid1Text.setText(" ");
            creditlimitText.setText(" ");
            graceperiodText.setText(" ");
            ccardid2Text.setText(" ");
            cclientnameText.setText(" ");
            cissuerbankText.setText(" ");
            cbankaccountText.setText(" ");
            cbalanceamountText.setText(" ");
            cvcnumberText.setText(" ");
            interestrateText.setText(" ");
            ccardid3Text.setText(" ");
        }
        
        //------------when display button of Debit Card section pressed------------
        if (e.getSource()==ddisplayButton){
            //check all BankCard objects in the ArrayList
            for (BankCard obj: bankcard_arraylist){
                // check if obj is not an instance of DebitCard
                if (!(obj instanceof DebitCard)){
                        continue;
                }
                //call display() method of the object obj
                obj.display();
            }
        }
        
        //------------when display button of Credit Card section pressed------------
           if (e.getSource()==cdisplayButton){
               //check all BankCard objects in the ArrayList
            for (BankCard obj: bankcard_arraylist){
                // check if obj is not an instance of DebitCard
                if (!(obj instanceof CreditCard)){
                    continue;
                }
                //call display() method of object obj
                obj.display();
            }
        }
        
        //------------when withdraw button of Debit Card section pressed------------
        if(e.getSource()==withdrawButton){
            //exception handling using try catch
            try{
                //initalizing the values
                boolean verify =false;
                int cardID = Integer.parseInt(dcardid1Text.getText());
                
                String day= debitdaysBox.getSelectedItem().toString();
                String month= debitmonthsBox.getSelectedItem().toString();
                String year=debityearsBox.getSelectedItem().toString();
                String date= day+"/"+month+"/"+year;
                
                int withdrawalAmount= Integer.parseInt(withdrawalamountText.getText());
                int pinNumber = Integer.parseInt(dpinnumber1Text.getText());
                
                //check all BankCard objects in the ArrayList
                for (BankCard obj: bankcard_arraylist){
                    //check if obj is not an instance of DebitCard
                    if (!(obj instanceof DebitCard)){
                        continue;
                    }
                    //verify if cardID variable matches CardID attribute of the object obj or not
                    if (obj.getCardID()== cardID){
                        verify = true;
                        //downcasting and calling withdraw method by passing arguments and assigning the result to x
                        int x= ((DebitCard)obj).withdraw(withdrawalAmount, date, pinNumber);
                        if (x==1){
                            //show message dialog box
                            JOptionPane.showMessageDialog(null,"PinNumber entered is not correct!");
                        }
                        else if(x==2){
                            //show message dialog box
                            JOptionPane.showMessageDialog(null, "With draw Balance is not sufficient ");
                        }
                        else if(x==0){
                            //show message dialog box
                            JOptionPane.showMessageDialog(null, "Withdraw was successful");
                        }
                    }
                }
                
                //check if the ArrayList is empty or not
                if(bankcard_arraylist.isEmpty()){
                    ////show message dialog box
                    JOptionPane.showMessageDialog(null, "First input values in Debit Card");
                }
                
                //if values of cardId variable and CardID attribute of object don't match
                if(!verify){
                    ////show message dialog box
                    JOptionPane.showMessageDialog(null, "Error!! CardID not found");
                }
                
            }
            catch(NumberFormatException em){
                //show message dialog box
                JOptionPane.showMessageDialog(null, "First input values in Debit Card");                
            }
        }
        
        //------------when credit limit button of Credit Card section pressed------------        
        if(e.getSource()==creditlimitButton){
            //Exception handling using try catch
            try{
                //initializing all values
                boolean verify = false;
                int cardID = Integer.parseInt(ccardid1Text.getText());
                
                int creditLimit=Integer.parseInt(creditlimitText.getText());
                int gracePeriod=Integer.parseInt(graceperiodText.getText());
                
                //check all BankCard objects in the ArrayList
                for (BankCard obj : bankcard_arraylist){
                    //check if obj is not an instance of CreditCard
                    if (!(obj instanceof CreditCard)){
                        continue;
                    }
                    //verify if cardID variable matches CardID attribute of the object obj or not using downcasting
                    if (((CreditCard)obj).getCardID() == cardID){
                        verify = true;
                        //downcasting and calling setCreditLimit method by passing arguments  
                        ((CreditCard)obj).setCreditLimit(creditLimit, gracePeriod);
                        ////show message dialog box
                        JOptionPane.showMessageDialog(null, "Credit Limit has been successfully set");
                    }
                    
                }
                
                //check if the ArrayList is empty
                if (bankcard_arraylist.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Invalid, Please check if all the data inserted is correct or verify every text field is filled.");
                }
                
                //check if values of cardID variableand CardID attribute of the object match or not
                if(!verify){
                    //show message dialog box
                    JOptionPane.showMessageDialog(null, "Error! CardID not found");
                }
            }
            catch(NumberFormatException en){
               JOptionPane.showMessageDialog(null, "Invalid, Please check if all the data inserted is correct or verify if every text field is filled or not."); 
            }
            
        }
        
     
        //------------when cancel button of Credit Card section pressed------------        
        if(e.getSource()==cancelButton){
            try{
                //initializing all values
                boolean verify = false;
                int cardID = Integer.parseInt(ccardid3Text.getText());
                //check all BankCard objects in the ArrayList
                for (BankCard obj: bankcard_arraylist){
                    //check if obj is an instance of CreditCard
                    if (!(obj instanceof CreditCard)){
                        continue;
                    }
                    //verify if cardID variable matches CardID attribute of the object obj or not
                    if (obj.getCardID()== cardID){
                        verify = true;
                        //downcasting and calling cancelCreditCard method without passing arguments
                        ((CreditCard)obj).cancelCreditCard();
                        //show message dialog box
                        JOptionPane.showMessageDialog(null, "Credit Card has been cancelled!");
                    }
                }
                
                // if cardID variable matches CardID attribute of the object obj 
                if (!verify){
                    //show message dialog box
                    JOptionPane.showMessageDialog(null, "Error! CardID not found");
                }
            }
            catch(NumberFormatException em){
                JOptionPane.showMessageDialog(null, "Please enter the cardID");
            }
        }
        
        //------------when add button of Debit Card section pressed------------
        if (e.getSource() == daddButton){
            //Exception handling using try catch
            try{
                //Inititalzing all values
                int cardID = Integer.parseInt(dcardid2Text.getText());
                String clientName = dclientnameText.getText();
                String issuerBank = dissuerbankText.getText();
                String bankAccount = dbankaccountText.getText();
                int balanceAmount = Integer.parseInt(dbalanceamountText.getText());
                int pinNumber = Integer.parseInt(dpinnumber2Text.getText());
               
                //calling DebitCard constructor of DebitCard class and create new object of DebitCard class
                DebitCard debitCard = new DebitCard(balanceAmount, cardID, bankAccount, issuerBank, clientName, pinNumber);
                boolean verify = false;
                
                //check all BankCard objects in the ArrayList
                for (BankCard obj: bankcard_arraylist){
                    //check if obj is an instanceof DebitCard
                    if (!(obj instanceof DebitCard)){
                        verify = true;
                        continue;
                    }
                    
                    //downcasting and getting CardID value from attribute of object and comparing it with cardID variable using downcasting
                    if (((DebitCard)obj).getCardID() == cardID){
                        //show message dialog box
                        JOptionPane.showMessageDialog(null, "CardID already detected!");
                        verify = false;
                        break;
                    }
                    else{
                        verify = true;
                    }
                }
                //check if the ArrayList is empty 
                if((bankcard_arraylist.isEmpty()) || (verify)){
                    //add debitCard object to ArrayList if empty
                    bankcard_arraylist.add(debitCard);
                    //show message dialog box
                    JOptionPane.showMessageDialog(null, "Debit Card has been successfully added.");
                }
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid!! Please Enter Valid Data");
            }
        }         
        
        //------------when add button of Debit Card section pressed------------
        if (e.getSource() == caddButton){
            //Exception handling using try catch
            try{
                //Intitializing all values
                int cardID = Integer.parseInt(ccardid2Text.getText());
                String clientName = cclientnameText.getText();
                String issuerBank = cissuerbankText.getText();
                String bankAccount = cbankaccountText.getText();
                int balanceAmount = Integer.parseInt(cbalanceamountText.getText());
                int cvcNumber = Integer.parseInt(cvcnumberText.getText());
                String day= creditdaysBox.getSelectedItem().toString();
                String month= creditmonthsBox.getSelectedItem().toString();
                String year=credityearsBox.getSelectedItem().toString();
                String expirationDate= day+"-"+month+"-"+year;
                float interestRate= Float.parseFloat(interestrateText.getText());
                
                //calling constructor of CreditCard class and create new object of CreditCard class
                CreditCard creditCard = new CreditCard(cardID, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                boolean verify = false;
                
                //check all BankCard objects in the ArrayList
                for (BankCard obj: bankcard_arraylist){
                    //check if obj is not an instance of CreditCard
                    if (!(obj instanceof CreditCard)){
                        verify = true;
                        continue;
                    }
                    
                    //downcasting and getting CardID value from attribute of object and comparing it with cardID variable using downcasting
                    if(((CreditCard)obj).getCardID() == cardID){
                        //show message dialog box
                        JOptionPane.showMessageDialog(null, "CardID already detected");
                        verify =false;
                        //terminate the loop
                        break;
                    }
                    else{
                        verify = true;
                    }
                }
                
                //check if the ArrayList is empty 
                if((bankcard_arraylist.isEmpty()) || (verify)){
                    //add creditCard object to the ArrayList
                    bankcard_arraylist.add(creditCard);
                    //show message dialog box
                    JOptionPane.showMessageDialog(null, "Credit Card has been added successfully.");
                }
            } 
            catch(NumberFormatException ex){
                //show message dialog box                
                JOptionPane.showMessageDialog(null, "Invalid!! Please Enter Valid Data");
            }
        }    
        
        
    }
    //main method
    public static void main (String[] args){
        //creating object of BankGUI
        BankGUI obj = new BankGUI();
    }

}
