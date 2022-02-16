package com.company_hw14;

public enum Material {
    A("ANY", 1),
    PA("PAPER", 2),
    C("CARDBOARD", 3),
    PO("POLYETHYLENE", 4),
    PL("PLASTIC", 5),
    W("WOOD", 6),
    S("STEEL", 7);

    private String materialName;
    private int indexMaterial;

    Material() {
    }

    Material(String materialName) {
        this.materialName = materialName;
    }

    Material(int indexMaterial) {
        this.indexMaterial = indexMaterial;
    }

    Material(String materialName, int indexMaterial) {
        this.materialName = materialName;
        this.indexMaterial = indexMaterial;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getIndexMaterial() {
        return indexMaterial;
    }

    public void setIndexMaterial(int indexMaterial) {
        this.indexMaterial = indexMaterial;
    }

    public static Material getMaterialObj(int indexMaterial) {
        for (Material material : Material.values()) {
            if (material.getIndexMaterial() == indexMaterial) {
                return material;
            }
        }
        return Material.A;
    }
}
