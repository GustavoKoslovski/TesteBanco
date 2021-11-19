package Model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private long idFuncionario;
    private String nomeFuncionario;
    private long numIdentidadeFuncionario;
    private long telefoneFuncionario;
    private Double salarioFuncionario;
    private List<Venda> vendasFuncionario = new ArrayList<Venda>();


    public Funcionario() {
    }

    public Funcionario(long idFuncionario, String nomeFuncionario, long numIdentidadeFuncionario, long telefoneFuncionario, Double salarioFuncionario, List<Venda> vendasFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.numIdentidadeFuncionario = numIdentidadeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.vendasFuncionario = vendasFuncionario;
    }

    public Funcionario(long idFuncionario, String nomeFuncionario, long numIdentidadeFuncionario, long telefoneFuncionario, Double salarioFuncionario, long idEndereco) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.numIdentidadeFuncionario = numIdentidadeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public long getNumIdentidadeFuncionario() {
        return numIdentidadeFuncionario;
    }

    public void setNumIdentidadeFuncionario(long numIdentidadeFuncionario) {
        this.numIdentidadeFuncionario = numIdentidadeFuncionario;
    }

    public long getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(long telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public List<Venda> getVendasFuncionario() {
        return vendasFuncionario;
    }

    public void setVendasFuncionario(List<Venda> vendasFuncionario) {
        this.vendasFuncionario = vendasFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nomeFuncionario='" + nomeFuncionario +
                ", numIdentidadeFuncionario=" + numIdentidadeFuncionario +
                ", telefoneFuncionario=" + telefoneFuncionario +
                ", salarioFuncionario=" + salarioFuncionario +
                ", vendasFuncionario=" + vendasFuncionario +
                '}';
    }
}
