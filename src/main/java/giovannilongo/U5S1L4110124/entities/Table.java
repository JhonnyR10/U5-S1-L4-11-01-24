package giovannilongo.U5S1L4110124.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;


@Getter
@Entity
@jakarta.persistence.Table(name = "table")
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tableId;

    private int numTable;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

    public Table() {
    }

    public Table(int numTable, int numMaxCoperti, boolean isFree, double costoCoperto) {
        this.numTable = numTable;
        this.numMaxCoperti = numMaxCoperti;
        this.isFree = isFree;
        this.costoCoperto = costoCoperto;
    }

    public void print() {
        System.out.println("numero tavolo--> " + numTable);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }

}
