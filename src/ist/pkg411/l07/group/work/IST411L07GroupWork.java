/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg411.l07.group.work;

import javax.persistence.EntityManager;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Chris Lefebvre
 * 
 * 
 * 
 * 
 * 
 */
public class IST411L07GroupWork {
   
    private EntityManager entityManager;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    /*
    Create
        Login - Post: payme.com/auth/Token/v3/
        Logout - Post: payme.com/auth/logout
        Order - Post: payme.com/cart/v3/order/{order_id}
    Read
        Get: payme.com/paymentcheckout/v3/order/{order_id}
        Get: payme.com/paymentcheckout/v3/order/all
        Get: payme.com/transactions/v4/{Transaction_id}
        Get: payme.com/transactions/v4/all
    Update
        Put: payme.com/paymentcheckout/v3/order/{order_id}
    Delete
        Delete: payme.com/paymentCheckout/v3/order/{order_id}
    */
    @POST
    @Path("form")
    public void createOrder(@FormParam("order_Id") short order_id){
        
    }
    
    @GET
    @Path("order_id")
    public void readOrder(@PathParam("order_id") Short order_id){
        
    }
    
    @GET
    @Path("order_id")
    public void readTransaction(@PathParam("order_id)") Short order_id){
        
    }
    
    @PUT
    @Path("order_id")
    public void updateOrder(@PathParam("order_id") Short order_id){
        
    }
    
    @DELETE
    @Path("order_id")
    public void deleteOrder(@PathParam("order_id") Short order_id){
        
    }
    
}
