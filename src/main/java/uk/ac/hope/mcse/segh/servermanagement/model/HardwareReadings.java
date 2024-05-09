package uk.ac.hope.mcse.segh.servermanagement.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HardwareReadings")
public class HardwareReadings {

    @Id
    @GeneratedValue
    private int Id;

    private String dateTime;

    private int CPU;

    private int RAM;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

}