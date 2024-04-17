package app.staff.administration;

import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;

public class SalesChief {

    private Merchandiser merchandiser;
    private SalesManager salesManager;

    public Merchandiser getMerchandiser() {
        return merchandiser;
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public SalesManager getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }


    public void giveOrders() {

        merchandiser.work();
        salesManager.work();

    }
}
