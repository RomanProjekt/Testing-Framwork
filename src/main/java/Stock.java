/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Stock {
    private String stockId;
   private String name;	
   private int quantity;

   public Stock(String stockId, String name, int quantity){
      this.stockId = stockId;
      this.name = name;		
      this.quantity = quantity;		
   }

   public String getStockId() {
      return stockId;
   }

   public void setStockId(String stockId) {
      this.stockId = stockId;
   }

   public int getQuantity() {
      return quantity;
   }

   public String getTicker() {
      return name;
   }
}
