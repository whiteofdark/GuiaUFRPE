package net.alunando.circularufrpe.classes;

import java.io.Serializable;

public class Usuario implements Serializable {
    private int id;
    private String nickname;
    private String nome;
    private String email;
    private String senha;
    private int token;
    private String avatar;

    public Usuario(){}

    public Usuario(int id, String nome, String nickname, String email, String avatar) {
        this.id = id;
        this.nome = nome;
        this.nickname = nickname;
        this.email = email;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
