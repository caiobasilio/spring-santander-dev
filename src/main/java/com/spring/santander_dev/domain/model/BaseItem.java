package com.spring.santander_dev.domain.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long icon;
    private Long description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIcon() {
        return icon;
    }

    public void setIcon(Long icon) {
        this.icon = icon;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

}
