package by.peachack.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@Getter
@Setter
public class Account {
    private String id;
    private String currency;
    private Double balance;
    private Client client;
    private Bank bank;
    private LocalDateTime openingDateTime;
}
