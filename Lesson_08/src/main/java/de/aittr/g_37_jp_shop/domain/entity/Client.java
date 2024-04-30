package de.aittr.g_37_jp_shop.domain.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String first_name;

    @Column(name = "second_name")
    private String second_name;

    @Column(name = "email")
    private String email;

    @Column(name = "is_active")
    private boolean isActive;

    public Client(Long id, String first_name, String second_name, String email, boolean isActive) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.isActive = isActive;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return isActive == client.isActive && Objects.equals(id, client.id) && Objects.equals(first_name, client.first_name) && Objects.equals(second_name, client.second_name) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, second_name, email, isActive);
    }

    @Override
    public String toString() {
        return String.format("Client: ID - %d, first name - %s, second name - %s, email - %s, " +
                "active - %s", id, first_name, second_name, email, isActive ? "yes" : "no");
    }
}
