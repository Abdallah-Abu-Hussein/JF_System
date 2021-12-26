package com.company;

public class Aircraft {
    private String Model;
    private String Manufacture;
    private int Code;

    public Aircraft(String model, String manufacture, int code) {
        Model = model;
        Manufacture = manufacture;
        Code = code;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "Model='" + Model + '\'' +
                ", Manufacture='" + Manufacture + '\'' +
                ", Code=" + Code +
                '}';
    }
}

