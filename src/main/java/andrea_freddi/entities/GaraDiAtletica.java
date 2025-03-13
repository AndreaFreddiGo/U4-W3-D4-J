package andrea_freddi.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class GaraDiAtletica extends Event {
    @OneToMany(mappedBy = "garaDiAtletica")
    private List<Person> setAtleti;
    @OneToOne(mappedBy = "garaVinta")
    private Person vincitore;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, List<Person> setAtleti, Person vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.setAtleti = setAtleti;
        this.vincitore = vincitore;
    }

    public List<Person> getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(List<Person> setAtleti) {
        this.setAtleti = setAtleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "setAtleti=" + setAtleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
