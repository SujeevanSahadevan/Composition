package com.sujeevan;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int vgaSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int vgaSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.vgaSlots = vgaSlots;
        this.bios = bios;
    }
    public void Program(String programName)
    {
        System.out.println("Program " + programName + " now loading ");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getVgaSlots() {
        return vgaSlots;
    }

    public String getBios() {
        return bios;
    }
}
