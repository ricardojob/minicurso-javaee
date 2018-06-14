package br.edu.ifpb.app;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/11/2017, 18:00:38
 */
public class Contato implements Serializable {

    @NotBlank
    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @Email
    private String email;
    @Positive
    private int idade;
    @Past
    private LocalDate dataDeNascimento;

    private List<@Size(min = 9) String> telefones = new ArrayList<>();

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", idade=" + idade + ", dataDeNascimento=" + dataDeNascimento + ", telefones=" + telefones + '}';
    }

}
