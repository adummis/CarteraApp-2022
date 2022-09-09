package co.gov.mintic.cartera.entities;

public class RoleEntity {
    private long idRole;
    private String description;
    private boolean status;

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "idRole=" + idRole +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
