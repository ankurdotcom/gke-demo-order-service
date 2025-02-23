package demo.gke.ecom.orderservice.domain;

public class Order {

     private long id ;

     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     public String getCustName() {
          return custName;
     }

     public void setCustName(String custName) {
          this.custName = custName;
     }

     private String custName;


}
