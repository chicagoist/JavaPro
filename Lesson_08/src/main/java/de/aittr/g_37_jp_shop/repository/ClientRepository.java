package de.aittr.g_37_jp_shop.repository;

import de.aittr.g_37_jp_shop.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @Query(value = "SELECT * FROM client WHERE email = :email",nativeQuery = true)
    Client findByEmail(@Param("email") String clientEmail);

//    Optional<Client> findById(Long id);


}
