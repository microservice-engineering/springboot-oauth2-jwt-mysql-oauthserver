package com.vgc.authentication.entity;

import java.util.Set;
import javax.persistence.*;
/**
 * The Account class is an entity model object. An Account describes the
 * security credentials and authentication flags that permit access to
 * application functionality.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(length = 60)
    private String password;

    private boolean enabled = true;

    private boolean credentialsexpired = false;

    private boolean expired = false;

    private boolean locked = false;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "AccountRole", joinColumns = @JoinColumn(name = "accountId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "id"))
    private Set<Role> roles;

    public Account() {

    }

    public Account(Account account){
        this.id = account.getId();
        this.username = account.getUsername();
        this.password = account.getPassword();
        this.enabled = account.isEnabled();
        this.credentialsexpired = account.isCredentialsexpired();
        this.locked = account.isExpired();
        this.roles = account.getRoles();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isCredentialsexpired() {
        return credentialsexpired;
    }

    public void setCredentialsexpired(boolean credentialsexpired) {
        this.credentialsexpired = credentialsexpired;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
