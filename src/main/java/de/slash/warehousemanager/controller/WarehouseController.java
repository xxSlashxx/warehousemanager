package de.slash.warehousemanager.controller;

import de.slash.warehousemanager.entity.Warehouse;
import de.slash.warehousemanager.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
public class WarehouseController
{
    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Warehouse> index()
    {
        return warehouseService.findAll();
    }
}