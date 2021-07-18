
package Model;

import java.util.Date;

public class Expediente {
    
    private long idExp;
    private int nroExp;
    private String cara;
    private String fuero;
    private int nroJuzgado;
    private Date feUlUpdate;

    public Expediente(long idExp, int nroExp, String cara, String fuero, int nroJuzgado, Date feUlUpdate) {
        this.idExp = idExp;
        this.nroExp = nroExp;
        this.cara = cara;
        this.fuero = fuero;
        this.nroJuzgado = nroJuzgado;
        this.feUlUpdate = feUlUpdate;
    }

    public Expediente(int nroExp, String cara, String fuero, int nroJuzgado, Date feUlUpdate) {
        this.nroExp = nroExp;
        this.cara = cara;
        this.fuero = fuero;
        this.nroJuzgado = nroJuzgado;
        this.feUlUpdate = feUlUpdate;
    }

    public Expediente() {
    }

    public long getIdExp() {
        return idExp;
    }

    public void setIdExp(long idExp) {
        this.idExp = idExp;
    }

    public int getNroExp() {
        return nroExp;
    }

    public void setNroExp(int nroExp) {
        this.nroExp = nroExp;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public String getFuero() {
        return fuero;
    }

    public void setFuero(String fuero) {
        this.fuero = fuero;
    }

    public int getNroJuzgado() {
        return nroJuzgado;
    }

    public void setNroJuzgado(int nroJuzgado) {
        this.nroJuzgado = nroJuzgado;
    }

    public Date getFeUlUpdate() {
        return feUlUpdate;
    }

    public void setFeUlUpdate(Date feUlUpdate) {
        this.feUlUpdate = feUlUpdate;
    }

    @Override
    public String toString() {
        return "Expediente{" + "idExp=" + idExp + ", nroExp=" + nroExp + ", cara=" + cara + ", fuero=" + fuero + ", nroJuzgado=" + nroJuzgado + ", feUlUpdate=" + feUlUpdate + '}';
    }
}
