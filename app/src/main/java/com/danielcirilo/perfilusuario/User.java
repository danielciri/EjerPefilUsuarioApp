package com.danielcirilo.perfilusuario;

public class User {
    private String name;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String cif;
    private String email;
    private String contrasena;
    private String userName;
    private String paginaWeb;
    private String nif;
    private String razonSocial;

    public User(String name, String apellido, String fechaNacimiento, String direccion, String cif, String email, String contrasena, String userName, String paginaWeb, String nif, String razonSocial) {
        this.name = name;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.cif = cif;
        this.email = email;
        this.contrasena = contrasena;
        this.userName = userName;
        this.paginaWeb = paginaWeb;
        this.nif = nif;
        this.razonSocial = razonSocial;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCif() {
        return cif;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getUserName() {
        return userName;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public String getNif() {
        return nif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
