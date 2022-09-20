package co.gov.mintic.cartera.entities;

<<<<<<< HEAD
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long idUser;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "_password", nullable = false)
    private String _password;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "create_at")
    private Date createdAt;
    @Column(name = "status")
=======
import java.time.LocalDate;

public class UserEntity {
    private long idUser;
    private String username;
    private String _password;
    private String email;
    private LocalDate createdAt;
>>>>>>> develop
    private boolean status;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
=======
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
>>>>>>> develop
        this.createdAt = createdAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", _password='" + _password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", status=" + status +
                '}';
    }
}
