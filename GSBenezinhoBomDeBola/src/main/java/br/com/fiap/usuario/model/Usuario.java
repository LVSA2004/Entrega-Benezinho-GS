package br.com.fiap.usuario.model;

import br.com.fiap.pessoa.model.Pessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long id;
    @Column(name = "NM_USUARIO")
    private String nome;
    @Column(name = "EMAIL_USUARIO")
    private String email;
    @Column(name = "PASS_USUARIO")
    private String senha;
    @Column(name = "TEL_USUARIO")
    private String telefone;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(name = "FK_USUARIO_PESSOA", value = ConstraintMode.CONSTRAINT))
    private Pessoa pessoa;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public Usuario setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Usuario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Usuario setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", senha='").append(senha).append('\'');
        sb.append(", telefone='").append(telefone).append('\'');
        sb.append(", pessoa=").append(pessoa);
        sb.append('}');
        return sb.toString();
    }
}
