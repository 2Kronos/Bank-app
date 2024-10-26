package bank;

import java.time.LocalDateTime;

public class Transaction {
  private String type; // e.g., "Deposit" or "Withdrawal"
  private int amount;
  private LocalDateTime timestamp;

  public Transaction(String type, int amount) {
    this.type = type;
    this.amount = amount;
    this.timestamp = LocalDateTime.now(); // Capture the current time
  }

  public String getType() {
    return type;
  }

  public int getAmount() {
    return amount;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  @Override
  public String toString() {
    return String.format("%s: %d at %s", type, amount, timestamp);
  }
}
