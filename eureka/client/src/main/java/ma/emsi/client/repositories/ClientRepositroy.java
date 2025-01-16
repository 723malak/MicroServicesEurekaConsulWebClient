package ma.emsi.client.repositories;

import ma.emsi.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositroy extends JpaRepository<Client, Long> {
}
