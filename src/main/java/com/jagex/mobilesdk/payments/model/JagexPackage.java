package com.jagex.mobilesdk.payments.model;

import java.util.List;

public class JagexPackage {
    private int categoryID;
    private String imageCollapsed;
    private String imageExpanded;
    private String longDescription;
    private String name;
    private List<JagexProducts> products;
    private String shortDescription;

    public int getCategoryID() {
        return this.categoryID;
    }

    public String getImageCollapsed() {
        return this.imageCollapsed;
    }

    public String getImageExpanded() {
        return this.imageExpanded;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public String getName() {
        return this.name;
    }

    public List<JagexProducts> getProducts() {
        return this.products;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setCategoryID(int i) {
        this.categoryID = i;
    }

    public void setImageCollapsed(String str) {
        this.imageCollapsed = str;
    }

    public void setImageExpanded(String str) {
        this.imageExpanded = str;
    }

    public void setLongDescription(String str) {
        this.longDescription = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProducts(List<JagexProducts> list) {
        this.products = list;
    }

    public void setShortDescription(String str) {
        this.shortDescription = str;
    }
}
