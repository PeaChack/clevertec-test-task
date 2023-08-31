package by.peachack.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

public class Transaction {
    private final Account sender; // may be null
    private final Account recipient; // may be null
    private final Double value;
    private String description;

    public Transaction(Account sender, Account recipient, Double value, String description) {
        if (sender == null && recipient == null)
            throw new IllegalArgumentException("Sender and recipient cannot be null both");
        if (sender == recipient)
            throw new IllegalArgumentException("Not allow loop transactions");
        if (value == null)
            throw new IllegalArgumentException("Value cannot be null");
        this.sender = sender;
        this.recipient = recipient;
        this.value = value;
        this.description = description;
    }

    public void commit(){
        //work with JDBС directly to avoid particularly execution cause SQL exceptions
        //TODO transaction between 2 accounts
        //TODO transaction without sender
        //TODO transaction without recipient
    }

    public void rollback(){
        // if catch SQL exception
    }
}
