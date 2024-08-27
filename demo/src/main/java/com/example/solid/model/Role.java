package com.example.solid.model;

public enum Role {
    
    ADMIN(0,"ROLE_ADMIN"), USER(1,"ROLE_USER");

private String role;
private int codigo;

  Role(int codigo, String role) {
       this.role = role;
       this.codigo = codigo;
    } 
    
    public String getRole() {
        return role;
    }

    

    public int getCodigo() {
        return codigo;
    }

  
}
