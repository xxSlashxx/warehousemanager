package de.slash.warehousemanager.service;

import de.slash.warehousemanager.entity.StorageBin;
import de.slash.warehousemanager.repository.StorageBinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageBinService
{
    @Autowired
    private StorageBinRepository storageBinRepository;

    public List<StorageBin> findAll()
    {
        return storageBinRepository.findAll();
    }

    public StorageBin createStorageBin(StorageBin storageBin)
    {
        return storageBinRepository.saveAndFlush(storageBin);
    }

    public void lockUnlockStorageBin(StorageBin storageBin, boolean isLockRequest)
    {
        if(isLockRequest && !storageBin.isLocked())
        {
            storageBin.setLocked(true);
        }
        else if(!isLockRequest && storageBin.isLocked())
        {
            storageBin.setLocked(false);
        }

        storageBinRepository.saveAndFlush(storageBin);
    }
}
