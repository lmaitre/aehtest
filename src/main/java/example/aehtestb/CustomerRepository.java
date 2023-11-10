package example.aehtestb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.aehtestb.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}
