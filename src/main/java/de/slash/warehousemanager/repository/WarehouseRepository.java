package de.slash.warehousemanager.repository;

import de.slash.warehousemanager.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long>
{
}
