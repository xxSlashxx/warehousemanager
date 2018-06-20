package de.slash.warehousemanager;

import de.slash.warehousemanager.entity.Warehouse;
import de.slash.warehousemanager.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestData
{
    @Autowired
    private WarehouseService warehouseService;

    @PostConstruct
    public void insertTestData() {
        insertWarehouses();
    }

    private void insertWarehouses()
    {
        Warehouse warehouse = new Warehouse();
        warehouse.setName("Test");
        warehouseService.createWarehouse(warehouse);
    }
}
