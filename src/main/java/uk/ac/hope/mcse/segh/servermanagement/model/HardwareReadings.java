package uk.ac.hope.mcse.segh.servermanagement.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HardwareReadings")
public class HardwareReadings {

    @Id
    @GeneratedValue
    private Long id;

    private int reading1;
    private int reading2;
    private int reading3;
    private int reading4;
    private int reading5;
    private int reading6;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getReading1() {
        return reading1;
    }

    public void setReading1(int reading1) {
        this.reading1 = reading1;
    }

    public int getReading2() {
        return reading2;
    }

    public void setReading2(int reading2) {
        this.reading2 = reading2;
    }

    public int getReading3() {
        return reading3;
    }

    public void setReading3(int reading3) {
        this.reading3 = reading3;
    }

    public int getReading4() {
        return reading4;
    }

    public void setReading4(int reading4) {
        this.reading4 = reading4;
    }

    public int getReading5() {
        return reading5;
    }

    public void setReading5(int reading5) {
        this.reading5 = reading5;
    }

    public int getReading6() {
        return reading6;
    }

    public void setReading6(int reading6) {
        this.reading6 = reading6;
    }



}


/*S7 Seminar
@Document(collection = "products")
public class Product {

    @Id
    private long id;

    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String name;

    private String description;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
*/