package andrea_freddi.entities;

import java.time.LocalDate;

public class PartitaDiCalcio extends Event {
    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int goalSquadraDiCasa;
    private int goalSquadraOspite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, int goalSquadraDiCasa, int goalSquadraOspite, String squadraDiCasa, String squadraOspite, String squadraVincente) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.goalSquadraDiCasa = goalSquadraDiCasa;
        this.goalSquadraOspite = goalSquadraOspite;
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
    }

    public int getGoalSquadraDiCasa() {
        return goalSquadraDiCasa;
    }

    public void setGoalSquadraDiCasa(int goalSquadraDiCasa) {
        this.goalSquadraDiCasa = goalSquadraDiCasa;
    }

    public int getGoalSquadraOspite() {
        return goalSquadraOspite;
    }

    public void setGoalSquadraOspite(int goalSquadraOspite) {
        this.goalSquadraOspite = goalSquadraOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "goalSquadraDiCasa=" + goalSquadraDiCasa +
                ", squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", goalSquadraOspite=" + goalSquadraOspite +
                '}';
    }
}
