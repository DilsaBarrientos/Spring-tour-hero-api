package co.udea.hero.api.model;

public class Hero {

    private Integer id;
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
