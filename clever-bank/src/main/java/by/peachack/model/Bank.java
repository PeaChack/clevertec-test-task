package by.peachack.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class Bank {
    private UUID id;
    private String name;
    private List<Account> accounts;
    private List<Client> clients;
}
