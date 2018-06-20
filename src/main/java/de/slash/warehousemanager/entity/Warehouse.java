package de.slash.warehousemanager.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Warehouse extends AbstractPersistable
{
    private String name;

    @OneToMany(mappedBy = "warehouse")
    private List<StorageBin> storageBins;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<StorageBin> getStorageBins()
    {
        return storageBins;
    }

    public void setStorageBins(List<StorageBin> storageBins)
    {
        this.storageBins = storageBins;
    }
}