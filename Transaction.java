package bank;

import java.time.LocalDateTime;

public class Transaction {
  private String type; // e.g., "Deposit" or "Withdrawal" - the type of transaction
  private int amount; // the amount of money involved in the transaction
  private LocalDateTime timestamp; // the date and time the transaction occurred

  public Transaction(String type, int amount) {
    this.type = type; // initialize the type of transaction
    this.amount = amount; // initialize the amount of the transaction
    this.timestamp = LocalDateTime.now(); // Capture the current time when the transaction is created
  }

  public String getType() {
    return type; // return the type of the transaction
  }

  public int getAmount() {
    return amount; // return the amount of the transaction
  }

  public LocalDateTime getTimestamp() {
    return timestamp; // return the timestamp of the transaction
  }

  @Override
  public String toString() {
    return String.format("%s: %d at %s", type, amount, timestamp); // format the transaction details as a string
  }
}
