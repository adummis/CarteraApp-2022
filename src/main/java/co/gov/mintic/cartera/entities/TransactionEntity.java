package co.gov.mintic.cartera.entities;

import java.time.*;

public class TransactionEntity {
    private long idTransaction;
    private float amount;
    private String transactionConcept;
    private EmployeeEntity employee;
    private LocalDate createdAt;

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getTransactionConcept() {
        return transactionConcept;
    }

    public void setTransactionConcept(String transactionConcept) {
        this.transactionConcept = transactionConcept;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "idTransaction=" + idTransaction +
                ", amount=" + amount +
                ", transactionConcept='" + transactionConcept + '\'' +
                ", employee=" + employee +
                ", createdAt=" + createdAt +
                '}';
    }
}
