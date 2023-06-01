package br.com.fiap.chatgpt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_CHATGPT")
public class ChatGpt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chatgpt")
    private Long id;
    @Column(name = "cl_pergunta")
    private String pergunta;
    @Column(name = "cl_resposta")
    private String resposta;

    public ChatGpt(Long id, String pergunta, String resposta) {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public ChatGpt() {

    }

    public Long getId() {
        return id;
    }

    public ChatGpt setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPergunta() {
        return pergunta;
    }

    public ChatGpt setPergunta(String pergunta) {
        this.pergunta = pergunta;
        return this;
    }

    public String getResposta() {
        return resposta;
    }

    public ChatGpt setResposta(String resposta) {
        this.resposta = resposta;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatGpt{");
        sb.append("id=").append(id);
        sb.append(", pergunta='").append(pergunta).append('\'');
        sb.append(", resposta='").append(resposta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
