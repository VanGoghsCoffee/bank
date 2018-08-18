package io.vangoghscoffee.bank.transactions;

import java.util.UUID;

public class Transaction {
    public Transaction() {
        this.id = UUID.randomUUID().toString();
    }

    public Transaction(UUID senderAccountUuid, UUID receiverAccountUuid, Double amount) {
        this.id = UUID.randomUUID().toString();
        this.senderAccountUuid = senderAccountUuid;
        this.receiverAccountUuid = receiverAccountUuid;
        this.amount = amount;
        this.verified = false;
    }

    public String getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public UUID getSenderAccountUuid() {
        return senderAccountUuid;
    }

    public void setSenderAccountUuid(UUID senderAccountUuid) {
        this.senderAccountUuid = senderAccountUuid;
    }

    public UUID getReceiverAccountUuid() {
        return receiverAccountUuid;
    }

    public void setReceiverAccountUuid(UUID receiverAccountUuid) {
        this.receiverAccountUuid = receiverAccountUuid;
    }

    private String id;
    private UUID senderAccountUuid;
    private UUID receiverAccountUuid;
    private Double amount;
    private Boolean verified;
}
