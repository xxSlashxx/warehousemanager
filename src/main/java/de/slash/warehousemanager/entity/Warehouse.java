package de.slash.warehousemanager.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Warehouse extends AbstractPersistable
{
    private String name;

    @OneToMany(mappedBy = "warehouse")
    @JsonManagedReference
    private Set<StorageBin> storageBins;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<StorageBin> getStorageBins()
    {
        return storageBins;
    }

    public void setStorageBins(Set<StorageBin> storageBins)
    {
        this.storageBins = storageBins;
    }
}