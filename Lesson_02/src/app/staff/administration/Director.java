package app.staff.administration;

import app.staff.specialists.Secretary;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {

    @Autowired
    private Secretary secretary;

    @Autowired
    private ProductionChief productionChief;

    @Autowired
    private SalesChief salesChief;

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public ProductionChief getProductionChief() {
        return productionChief;
    }

    public void setProductionChief(ProductionChief productionChief) {
        this.productionChief = productionChief;
    }

    public SalesChief getSalesChief() {
        return salesChief;
    }

    public void setSalesChief(SalesChief salesChief) {
        this.salesChief = salesChief;
    }

    public void manageCompany() {

        secretary.work();
        productionChief.giveOrders();
        salesChief.giveOrders();

    }
}
