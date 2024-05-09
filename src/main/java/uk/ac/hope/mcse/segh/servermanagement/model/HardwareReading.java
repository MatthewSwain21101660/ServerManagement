package uk.ac.hope.mcse.segh.servermanagement.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "HardwareReadings")
public class HardwareReading {

    @Id

    private BigInteger _id;

    private String dateTime;

    private int cpu;

    private int ram;


    public BigInteger get_id() {
        return _id;
    }

    public void set_id(BigInteger _id) {
        this._id = _id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}