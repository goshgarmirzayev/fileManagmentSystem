/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Goshgar
 */
public class Files {

    private Integer id;
    private String name;

    public Files(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Files() {
    }

    public Files(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Files{" + "name=" + name + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
