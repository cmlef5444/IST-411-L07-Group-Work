/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg411.l07.group.work;

/**
 *
 * @author cjani
 */
public class Order {
    
    private int order_id;
    private String senderLastName;
    private String senderFirstName;
    private int senderID;
    private String recipientLastName;
    private String recipientFirstName;
    private int recipientID;
    private double transactionAmount;
    
    public Order(){
        
    }
    
    public Order(int order_id, String senderLastName, String senderFirstName, int senderID, String recipientLastName, String recipientFirstName, int recipientID, double transactionAmount){
        this.order_id = order_id;
        this.senderLastName = senderLastName;
        this.senderFirstName = senderFirstName;
        this.senderID = senderID;
        this.recipientLastName = recipientLastName;
        this.recipientFirstName = recipientFirstName;
        this.recipientID = recipientID;
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return the order_id
     */
    public int getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id the order_id to set
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    /**
     * @return the senderLastName
     */
    public String getSenderLastName() {
        return senderLastName;
    }

    /**
     * @param senderLastName the senderLastName to set
     */
    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    /**
     * @return the senderFirstName
     */
    public String getSenderFirstName() {
        return senderFirstName;
    }

    /**
     * @param senderFirstName the senderFirstName to set
     */
    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    /**
     * @return the senderID
     */
    public int getSenderID() {
        return senderID;
    }

    /**
     * @param senderID the senderID to set
     */
    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    /**
     * @return the recipientLastName
     */
    public String getRecipientLastName() {
        return recipientLastName;
    }

    /**
     * @param recipientLastName the recipientLastName to set
     */
    public void setRecipientLastName(String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }

    /**
     * @return the recipientFirstName
     */
    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    /**
     * @param recipientFirstName the recipientFirstName to set
     */
    public void setRecipientFirstName(String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }

    /**
     * @return the recipientID
     */
    public int getRecipientID() {
        return recipientID;
    }

    /**
     * @param recipientID the recipientID to set
     */
    public void setRecipientID(int recipientID) {
        this.recipientID = recipientID;
    }

    /**
     * @return the transactionAmount
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount the transactionAmount to set
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    
}
