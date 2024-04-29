package de.aittr.g_37_jp_shop.service.interfaces;

import de.aittr.g_37_jp_shop.domain.entity.Client;

import java.util.List;

public interface ClientService {

    Client save(Client client);

    List<Client> getAll();

    Client getById(Long id);

   // Client findByEmail(String email);

    void update(Client client);

    void deleteById(Long id);

    void deleteByEmail(String email);

    void restoreById(Long id);

}
