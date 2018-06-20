package de.slash.warehousemanager.entity;

import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractPersistable implements Serializable, Persistable<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nullable
    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public boolean isNew()
    {
        return null == getId();
    }
}
