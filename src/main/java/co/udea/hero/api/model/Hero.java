package co.udea.hero.api.model;


import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
@Table (name="heroes")
public class Hero {

    @Id
    @Column(name="id")
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    public Hero(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hero() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
