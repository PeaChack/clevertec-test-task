package by.peachack.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class Client {
    private UUID id;
    private String firstName;
    private String lastName;
    private List<Account> accounts;
}
