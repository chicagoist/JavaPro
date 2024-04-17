package app.code;

import app.staff.administration.Director;
import app.staff.administration.ProductionChief;
import app.staff.administration.SalesChief;
import app.staff.specialists.Secretary;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.Storekeeper;
import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;

import java.io.DataInput;

public class Application {
    public static void main(String[] args) {
/*

        MachineOperator machineOperator = new MachineOperator();
        Storekeeper storekeeper = new Storekeeper();

        Merchandiser merchandiser = new Merchandiser();
        SalesManager salesManager = new SalesManager();

        Secretary secretary = new Secretary();

        ProductionChief productionChief = new ProductionChief();
        productionChief.setMachineOperator(machineOperator);
        productionChief.setStorekeeper(storekeeper);

        SalesChief salesChief = new SalesChief();
        salesChief.setMerchandiser(merchandiser);
        salesChief.setSalesManager(salesManager);

        Director director = new Director();

        //new Director(); Alt + Enter

        director.setSecretary(secretary);
        director.setProductionChief(productionChief);
        director.setSalesChief(salesChief);
*/

        director.manageCompany();




    }
}
