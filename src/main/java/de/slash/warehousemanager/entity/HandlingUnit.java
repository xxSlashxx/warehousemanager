package de.slash.warehousemanager.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HandlingUnit extends AbstractPersistable
{
    private Integer identificationNumber;

    private String status;

    @ManyToOne
    @JoinColumn(name = "STORAGE_BIN_ID", referencedColumnName = "ID")
    @JsonBackReference
    private StorageBin storageBin;

    public int getIdentificationNumber()
    {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber)
    {
        this.identificationNumber = identificationNumber;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
