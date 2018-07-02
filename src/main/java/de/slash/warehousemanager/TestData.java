package de.slash.warehousemanager;

import de.slash.warehousemanager.entity.StorageBin;
import de.slash.warehousemanager.entity.Warehouse;
import de.slash.warehousemanager.service.StorageBinService;
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

    @Autowired
    private StorageBinService storageBinService;

    @PostConstruct
    public void insertTestData()
    {
        Warehouse warehouse = new Warehouse();
        warehouse.setName("Test");
        Warehouse createdWarehouse = warehouseService.createWarehouse(warehouse);

        StorageBin storageBin = new StorageBin();
        storageBin.setRow(1L);
        storageBin.setStack(1L);
        storageBin.setLevel(1L);
        storageBin.setWarehouse(createdWarehouse);
        storageBinService.createStorageBin(storageBin);
    }
}