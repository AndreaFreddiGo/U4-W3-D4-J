package andrea_freddi;

import andrea_freddi.dao.*;
import andrea_freddi.entities.*;
import com.github.javafaker.Faker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-D4-J");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        Faker faker = new Faker(Locale.ITALY);
        EventsDAO eventsDAO = new EventsDAO(em);
        LocationsDAO locationsDAO = new LocationsDAO(em);
        PeopleDAO peopleDAO = new PeopleDAO(em);
        AttendancesDAO attendancesDAO = new AttendancesDAO(em);
        ConcertoDAO concertoDAO = new ConcertoDAO(em);
        Random rndm = new Random();

        // ******************** SALVATAGGIO LOCATIONS, UTENTI E EVENTI ************************

        Location location1 = new Location(faker.address().city(), faker.address().cityName());
//        locationsDAO.save(location1);

        Location location2 = new Location(faker.address().city(), faker.address().cityName());
//        locationsDAO.save(location2);

        Person person1 = new Person(faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), LocalDate.now(), rndm.nextInt(0, 2) == 0 ? 'M' : 'F');
//        peopleDAO.save(person1);

        Concerto concerto1 = new Concerto("Concerto di Natale", LocalDate.now(), "Concerto di Natale", TipoEvento.PUBBLICO, 1000, location1, Genere.ROCK, true);
        Concerto concerto2 = new Concerto("Concerto di Capodanno", LocalDate.now(), "Concerto di Capodanno", TipoEvento.PUBBLICO, 1000, location2, Genere.POP, false);
        Concerto concerto3 = new Concerto("Concerto di Ferragosto", LocalDate.now(), "Concerto di Ferragosto", TipoEvento.PUBBLICO, 1000, location1, Genere.CLASSICO, true);
        Concerto concerto4 = new Concerto("Concerto di Pasqua", LocalDate.now(), "Concerto di Pasqua", TipoEvento.PUBBLICO, 1000, location2, Genere.POP, false);

        concertoDAO.save(concerto1);
        concertoDAO.save(concerto2);
        concertoDAO.save(concerto3);
        concertoDAO.save(concerto4);


        // ******************** PARTECIPAZIONE AD UN EVENTO ************************

//        Person person = peopleDAO.findById(23);
//        Event event = eventsDAO.findById(24);

//        Attendance partecipazione = new Attendance(person, event);
//        // attendancesDAO.save(partecipazione);
//
//        // Stampo eventi a cui partecipa la persona 23
//        person.getListaPartecipazioni().forEach(System.out::println);
//
//        // Stampo elenco partecipanti evento 24
//        event.getListaPartecipazioni().forEach(System.out::println);

        // ******************** CASCADING ************************

//        // Eliminando un evento dovrebbe eliminare anche le partecipazioni ad esso collegate
//        eventsDAO.findByIdAndDelete(24);


        em.close();
        emf.close();
    }
}
