package de.slash.warehousemanager.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StorageBin extends AbstractPersistable
{
    private Long row;

    private Long stack;

    private Long level;

    @ManyToOne
    @JoinColumn(name = "WAREHOUSE_ID", referencedColumnName = "ID")
    private Warehouse warehouse;

    public Long getRow()
    {
        return row;
    }

    public void setRow(Long row)
    {
        this.row = row;
    }

    public Long getStack()
    {
        return stack;
    }

    public void setStack(Long stack)
    {
        this.stack = stack;
    }

    public Long getLevel()
    {
        return level;
    }

    public void setLevel(Long level)
    {
        this.level = level;
    }

    public Warehouse getWarehouse()
    {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse)
    {
        this.warehouse = warehouse;
    }
}