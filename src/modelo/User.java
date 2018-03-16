/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Desarrollo01
 */
public class User {
   private int id;
   private int rol_id;
   private int persona_id;
   private byte estado;
   private String name;
   private String imagen;
   private String email;
   private String password;
   private String lugar_dependencia;
   
   public User(){
       id = 0;
       rol_id = 0;
       persona_id = 0;
       estado = 0;
       name = "";
       imagen = "";
       email = "";
       password = "";
       lugar_dependencia = "";
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLugar_dependencia() {
        return lugar_dependencia;
    }

    public void setLugar_dependencia(String lugar_dependencia) {
        this.lugar_dependencia = lugar_dependencia;
    }
   
   
}
