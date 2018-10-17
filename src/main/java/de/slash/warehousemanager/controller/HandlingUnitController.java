package de.slash.warehousemanager.controller;

import de.slash.warehousemanager.entity.HandlingUnit;
import de.slash.warehousemanager.service.HandlingUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/handlingUnits")
public class HandlingUnitController
{
    @Autowired
    private HandlingUnitService handlingUnitService;

    @RequestMapping(method = RequestMethod.GET)
    public List<HandlingUnit> index()
    {
        return handlingUnitService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public HandlingUnit createHandlingUnit()
    {
        return handlingUnitService.createHandlingUnit();
    }
}