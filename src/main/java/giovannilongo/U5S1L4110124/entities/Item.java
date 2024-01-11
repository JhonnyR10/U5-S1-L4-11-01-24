package giovannilongo.U5S1L4110124.entities;

import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;


@Getter
@Entity
@Table(name = "item")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {
    protected int calories;
    protected double price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Item() {
    }

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
