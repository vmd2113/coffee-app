package com.example.coffee;

public class setting_Options {
    private String nameOption;
    private int idDrawRes;

    public String getNameOption() {
        return nameOption;
    }

    public void setNameOption(String nameOption) {
        this.nameOption = nameOption;
    }

    public int getSrcIconOption() {
        return idDrawRes;
    }

    public void setSrcIconOption(int srcIconOption) {
        this.idDrawRes = srcIconOption;
    }

    public setting_Options(String nameOption, int srcIconOption) {
        this.nameOption = nameOption;
        this.idDrawRes = srcIconOption;
    }

    @Override
    public String toString() {
        return "itemOptions{" +
                "nameOption='" + nameOption + '\'' +
                ", srcIconOption='" + idDrawRes + '\'' +
                '}';
    }
}
