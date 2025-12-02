package br.com.fiap.coletas_residuo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TB_COLETA")
public class Coleta {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COLETA")
    @SequenceGenerator(
            name = "SEQ_COLETA",
            sequenceName = "SEQ_COLETA",
            allocationSize = 1
    )
    private Long id;
    private String NomeResiduo;
    private String TipoResiduo;
    private Integer QtdResiduo;
    private LocalDate DataColeta;


    public Coleta() {
    }

    public Coleta(Long id, String nomeResiduo, String tipoResiduo, Integer QtdResiduo, LocalDate DataColeta) {
        this.id = id;
        this.NomeResiduo = nomeResiduo;
        this.TipoResiduo = tipoResiduo;
        this.QtdResiduo = QtdResiduo;
        this.DataColeta = DataColeta;
    }

    public Coleta(String nomeResiduo, String tipoResiduo, Integer QtdResiduo, LocalDate DataColeta) {

        this.NomeResiduo = nomeResiduo;
        this.TipoResiduo = tipoResiduo;
        this.QtdResiduo = QtdResiduo;
        this.DataColeta = DataColeta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeResiduo() {
        return NomeResiduo;
    }

    public void setNomeResiduo(String nomeResiduo) {
        NomeResiduo = nomeResiduo;
    }

    public String getTipoResiduo() {
        return TipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        TipoResiduo = tipoResiduo;
    }

    public Integer getQtdResiduo() {
        return QtdResiduo;
    }

    public void setQtdResiduo(Integer qtdResiduo) {
        QtdResiduo = qtdResiduo;
    }

    public LocalDate getDataColeta() {
        return DataColeta;
    }

    public void setDataColeta(LocalDate dataColeta) {
        DataColeta = dataColeta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coleta coleta = (Coleta) o;
        return Objects.equals(id, coleta.id) && Objects.equals(NomeResiduo, coleta.NomeResiduo) && Objects.equals(TipoResiduo, coleta.TipoResiduo) && Objects.equals(QtdResiduo, coleta.QtdResiduo) && Objects.equals(DataColeta, coleta.DataColeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, NomeResiduo, TipoResiduo, QtdResiduo, DataColeta);
    }

    @Override
    public String toString() {
        return "Coleta{" +
                "id=" + id +
                ", NomeResiduo='" + NomeResiduo + '\'' +
                ", TipoResiduo='" + TipoResiduo + '\'' +
                ", QtdResiduo=" + QtdResiduo +
                ", DataColeta=" + DataColeta +
                '}';
    }
}





