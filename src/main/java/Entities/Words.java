package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Words {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String englishWorld;
    private String polishWorld;

    public Words(String englishWorld, String polishWorld) {
        this.englishWorld = englishWorld;
        this.polishWorld = polishWorld;
    }

    public Words() {

    }

    public Integer getId() {
        return id;
    }

    public String getEnglishWorld() {
        return englishWorld;
    }

    public void setEnglishWorld(String englishWorld) {
        this.englishWorld = englishWorld;
    }

    public String getPolishWorld() {
        return polishWorld;
    }

    public void setPolishWorld(String polishWorld) {
        this.polishWorld = polishWorld;
    }

    @Override
    public String toString() {
        return "Entities.Words{" +
                "id=" + id +
                ", englishWorld='" + englishWorld + '\'' +
                ", polishWorld='" + polishWorld + '\'' +
                '}';
    }
}
