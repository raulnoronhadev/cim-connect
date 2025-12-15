package com.backend.cimconnect.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_USERS")
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID idUser;
    private String name;
    private String age;
    private String city;
    private String church;
    private String pastor;
}
