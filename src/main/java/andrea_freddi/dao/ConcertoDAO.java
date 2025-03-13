package andrea_freddi.dao;

import andrea_freddi.entities.Concerto;

import javax.persistence.EntityManager;

public class ConcertoDAO {
    private EntityManager em;

    public ConcertoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Concerto concerto) {
        em.getTransaction().begin();
        em.persist(concerto);
        em.getTransaction().commit();
        System.out.println("Concerto " + concerto.getTitolo() + " creato");
    }
}
