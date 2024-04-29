package de.aittr.g_37_jp_shop.service;

import de.aittr.g_37_jp_shop.domain.entity.Client;
import de.aittr.g_37_jp_shop.repository.ClientRepository;
import de.aittr.g_37_jp_shop.service.interfaces.ClientService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@ComponentScan
public class ClientServiceImpl implements ClientService {

    private ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }


    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client getById(Long id) {

        if(id == null || id < 1) {
            throw new RuntimeException("Client's data id is incorrect for getById");
        }

        Client client = repository.findById(id).orElse(null);

        if(client == null) {
            throw new RuntimeException("Client not found");
        }

        return client;

    }


/*
    public Client findByEmail(String email) {
        if(email == null) {
            throw new RuntimeException("Client's data id is incorrect");
        }

        Client client = repository.findByEmail(email);

        if(client == null) {
            throw new RuntimeException("Client not found");
        }

        return client;
    }
*/


    @Override
    public void update(Client client) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void restoreById(Long id) {

    }
}
