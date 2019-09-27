package com.rang.stationerycalculation.Model;

public class CategoryModel {

    private int CatId;
    private int CatImage;
    private String CatName;

    public CategoryModel(String catName,int catImage) {

        CatName = catName;
        CatImage=catImage;
    }

    public int getCatId() {
        return CatId;
    }

    public void setCatId(int catId) {
        CatId = catId;
    }

    public int getCatImage() {
        return CatImage;
    }

    public void setCatImage(int catImage) {
        CatImage = catImage;
    }

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String catName) {
        CatName = catName;
    }
}
