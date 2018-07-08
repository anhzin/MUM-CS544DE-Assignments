/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week01jpademo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sunling
 */
@Entity
public class Car implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Make;
    private String Model;
    @Column(name="ManufacturingYear")
    private int Year;
    private int Miles;
    private Color Color;

    public Car() {
    }

    public Car(String Make, String Model, int Year, int Miles, Color Color) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Miles = Miles;
        this.Color = Color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMiles() {
        return Miles;
    }

    public void setMiles(int Miles) {
        this.Miles = Miles;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }
  

}
