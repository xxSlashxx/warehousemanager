package de.slash.warehousemanager.repository;

import de.slash.warehousemanager.entity.HandlingUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HandlingUnitRepository extends JpaRepository<HandlingUnit, Long>
{
    @Query("SELECT MAX(identificationNumber) FROM HandlingUnit")
    Integer findMaxIdentificationNumber();
}