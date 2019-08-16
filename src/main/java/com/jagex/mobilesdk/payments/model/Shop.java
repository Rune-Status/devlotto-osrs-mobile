package com.jagex.mobilesdk.payments.model;

import java.util.List;

public class Shop {
    private List<JagexPackage> categories;
    private String imageBackground;
    private String imageLogo;

    public List<JagexPackage> getCategories() {
        return this.categories;
    }

    public String getImageBackground() {
        return this.imageBackground;
    }

    public String getImageLogo() {
        return this.imageLogo;
    }

    public void setCategories(List<JagexPackage> list) {
        this.categories = list;
    }

    public void setImageBackground(String str) {
        this.imageBackground = str;
    }

    public void setImageLogo(String str) {
        this.imageLogo = str;
    }
}
