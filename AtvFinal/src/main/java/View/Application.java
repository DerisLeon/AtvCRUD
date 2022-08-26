package View;
import model.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {
	
	public static void main(String[] args) {
	
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.events.jpa");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
		
                long tempoInicial = System.currentTimeMillis();
            	//INSERT
		Pessoa pessoa = new Pessoa(null, "44444444444", "Barros Sousa", "22/12/1973", "HTML, CSS, JAVA, Postgres");
             
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();
                 

                // FIND
		//Pessoa pessoa = entityManager.find(Pessoa.class, 1);
		//System.out.println("Nome do cliente: " + pessoa.getNome());
                //System.out.println("Data de Nascimento: " + pessoa.getNascimento());
                //System.out.println("Formação: " + pessoa.getFormacao());
		

   
		
		// DELETE
		
//              Pessoa pessoa = entityManager.find(Pessoa.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(pessoa);
//		entityManager.getTransaction().commit();
                
		
                
		//UPDATE
                
//		Pessoa pessoa = new Pessoa();
//		pessoa.setId(2);
//		pessoa.setNome("Jose da Silva");
//              pessoa.setNascimento("11/11/1970");
//              pessoa.setCpf("11111111111");
//              pessoa.setFormacao("HTML, CSS, JAVA, Postgres");
//		
//		entityManager.getTransaction().begin();
//		entityManager.merge(pessoa);
//		entityManager.getTransaction().commit();
//
//		entityManager.close();
//		entityManagerFactory.close();


                long tempoFinal = System.currentTimeMillis();
                System.out.printf("\nTempo de execução: %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
			
            }

}