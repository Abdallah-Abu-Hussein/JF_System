package com.company;
public class Cargo extends Aircraft {
    private int Load_in_Ton;

    public Cargo(String model, String manufacture, int code, int load_in_Ton) {
        super(model, manufacture, code);
        Load_in_Ton = load_in_Ton;
    }

    public int getLoad_in_Ton() {
        return Load_in_Ton;
    }

    public void setLoad_in_Ton(int load_in_Ton) {
        Load_in_Ton = load_in_Ton;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "Load_in_Ton=" + Load_in_Ton +
                '}';
    }
}
