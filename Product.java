public class Product{
    private int productID;
    private String categryOfItems;
    private int quntity;
    private double price;

// constructor to initialized for the grocery class
  public Product(int productID,String categryOfItems,int quntity,double price){
      this.productID = productID;
      this.categryOfItems = categryOfItems;
      this.quntity = quntity;
      this.price = price;
  }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getCategryOfItems() {
        return categryOfItems;
    }

    public void setCategryOfItems(String categryOfItems) {
        this.categryOfItems = categryOfItems;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

