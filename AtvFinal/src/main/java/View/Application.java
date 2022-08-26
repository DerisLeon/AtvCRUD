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
                
                
                for(int i = 0; i < 1000;i++){
                    entityManager.getTransaction().begin();
                    entityManager.persist(pessoa);
                    entityManager.getTransaction().commit();
                    pessoa = new Pessoa(null, "44444444444", "Barros Sousa", "22/12/1973", "HTML, CSS, JAVA, Postgres");
                }
                
                        System.out.println("Completou");
                    

                System.out.println(pessoa);
                 

                // FIND
		Pessoa pessoa3 = entityManager.find(Pessoa.class, 98);
		System.out.println("Nome do cliente: " + pessoa3.getNome());
                System.out.println("Data de Nascimento: " + pessoa3.getNascimento());
                System.out.println("Formação: " + pessoa3.getFormacao());
		

   
		
		// DELETE
		
              Pessoa pessoa2 = entityManager.find(Pessoa.class, 103);
		entityManager.getTransaction().begin();
		entityManager.remove(pessoa2);
		entityManager.getTransaction().commit();
                
		
                
		//UPDATE
                
		Pessoa pessoa1 = new Pessoa();
		pessoa.setId(2);
		pessoa.setNome("Jose da Silva");
                pessoa.setNascimento("11/11/1970");
                pessoa.setCpf("11111111111");
                pessoa.setFormacao("HTML, CSS, JAVA, Postgres");
		
		entityManager.getTransaction().begin();
		entityManager.merge(pessoa1);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();


                long tempoFinal = System.currentTimeMillis();
                System.out.printf("\nTempo de execução: %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
			
            }

}