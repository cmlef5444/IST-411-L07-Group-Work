/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg411.l07.group.work;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    public void createOrder(@FormParam("orderId") short orderId){
        Order entity = new Order();
        entity.setOrderId(orderId);
        entityManager.persist(entity);

    }
    
    @GET
    @Path("orderId")
    public void readOrder(@PathParam("orderId") Short orderId){
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> readAllOrders(){
        CriteriaQuery cq = entityManager..getCriteriaBuilder().createQuery();
        cq.select(cq.from(Order.class));
        List<Order> orders = entityManager.createQuery(cq).getResultList();
        return orders;
    }
    
    @PUT
    @Path("orderId")
    public void updateOrder(@PathParam("orderId") Short orderId, Order entity){
        entityManager.merge(entity);
    }
    
    @DELETE
    @Path("orderId")
    public void deleteOrder(@PathParam("orderId") Short orderId){
        
    }
    
    @GET
    @Path("orderId")
    public void readTransaction(@PathParam("orderId)") Short orderId){
        
    }
    
    
    
}
