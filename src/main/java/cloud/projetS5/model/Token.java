package cloud.projetS5.model;

import java.sql.Timestamp;

public class Token {
    private String token;
    private Timestamp date_expiration;
    private Timestamp date_creation;
    private boolean etat;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean getEtat() {
        return this.etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public void setEtat(String etat) {
        boolean eta = Boolean.valueOf(etat);
        this.setEtat(eta);
    }

    public Timestamp getDate_expiration() {
        return this.date_expiration;
    }

    public Timestamp getDate_creation() {
        return this.date_creation;
    }

    public void setDate_expiration(Timestamp date_expiration) {
        this.date_expiration = date_expiration;
    }

    public void setDate_creation(Timestamp date_creation) {
        this.date_creation = date_creation;
    }

    public Token(String token, Timestamp date_expiration, Timestamp date_creation, boolean etat) {
        this.setToken(token);
        this.setDate_expiration(date_expiration);
        this.setDate_creation(date_creation);
        this.setEtat(etat);
    }

    public Token() {

    }
}