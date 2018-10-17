package de.slash.warehousemanager.service;

import de.slash.warehousemanager.entity.HandlingUnit;
import de.slash.warehousemanager.repository.HandlingUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandlingUnitService
{
    @Autowired
    HandlingUnitRepository handlingUnitRepository;

    public List<HandlingUnit> findAll()
    {
        return handlingUnitRepository.findAll();
    }

    public HandlingUnit createHandlingUnit()
    {
        HandlingUnit handlingUnit = new HandlingUnit();
        handlingUnit.setStatus("OPEN");
        handlingUnit.setIdentificationNumber(getNextIdentificationNumber());

        return handlingUnitRepository.saveAndFlush(handlingUnit);
    }

    private int getNextIdentificationNumber()
    {
        Integer currentMax = handlingUnitRepository.findMaxIdentificationNumber();

        if (currentMax != null)
        {
            return currentMax++;
        }
        else
        {
            return 10000000;
        }
    }
}