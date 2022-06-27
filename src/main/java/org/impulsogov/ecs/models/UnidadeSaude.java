package org.impulsogov.ecs.models;

public class UnidadeSaude {

    private String id;
    private String ibgeOrigem;
    private Long idOrigem;
    private String cnes;
    private String nome;
    private String nomeFiltro;
    private String bairroNome;
    private Boolean registroValido;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIbgeOrigem() {
        return ibgeOrigem;
    }

    public void setIbgeOrigem(String ibgeOrigem) {
        this.ibgeOrigem = ibgeOrigem;
    }

    public Long getIdOrigem() {
        return idOrigem;
    }

    public void setIdOrigem(Long idOrigem) {
        this.idOrigem = idOrigem;
    }

    public String getCnes() {
        return cnes;
    }

    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFiltro() {
        return nomeFiltro;
    }

    public void setNomeFiltro(String nomeFiltro) {
        this.nomeFiltro = nomeFiltro;
    }

    public String getBairroNome() {
        return bairroNome;
    }

    public void setBairroNome(String bairroNome) {
        this.bairroNome = bairroNome;
    }

    public Boolean getRegistroValido() {
        return registroValido;
    }

    public void setRegistroValido(Boolean registroValido) {
        this.registroValido = registroValido;
    }
}
