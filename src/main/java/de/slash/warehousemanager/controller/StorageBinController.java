package de.slash.warehousemanager.controller;

import de.slash.warehousemanager.entity.StorageBin;
import de.slash.warehousemanager.service.StorageBinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/storagebins")
public class StorageBinController
{
    @Autowired
    private StorageBinService storageBinService;

    @RequestMapping(method = RequestMethod.GET)
    public List<StorageBin> index()
    {
        return storageBinService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public StorageBin createStorageBin(@RequestBody StorageBin storageBin)
    {
        return storageBinService.createStorageBin(storageBin);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lockUnlock")
    public void lockUnlockStorageBin(@RequestBody StorageBin storageBin, boolean isLockRequest)
    {
        storageBinService.lockUnlockStorageBin(storageBin, isLockRequest);
    }
}
