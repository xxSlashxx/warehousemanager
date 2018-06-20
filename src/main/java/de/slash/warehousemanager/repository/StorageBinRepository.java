package de.slash.warehousemanager.repository;

import de.slash.warehousemanager.entity.StorageBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StorageBinRepository extends JpaRepository<StorageBin, Long>
{
}
