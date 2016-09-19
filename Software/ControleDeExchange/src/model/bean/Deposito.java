/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Luan Rodrigo Machado
 */
public class Deposito {

    private int idDepositos;
    private Float DataDep;
    private Float ValorDep;
    private String TipoDep;
    private String FontDep;

    public int getIdDepositos() {
        return idDepositos;
    }

    public void setIdDepositos(int idDepositos) {
        this.idDepositos = idDepositos;
    }

    public Float getDataDep() {
        return DataDep;
    }

    public void setDataDep(Float DataDep) {
        this.DataDep = DataDep;
    }

    public Float getValorDep() {
        return ValorDep;
    }

    public void setValorDep(Float ValorDep) {
        this.ValorDep = ValorDep;
    }

    public String getTipoDep() {
        return TipoDep;
    }

    public void setTipoDep(String TipoDep) {
        this.TipoDep = TipoDep;
    }

    public String getFontDep() {
        return FontDep;
    }

    public void setFontDep(String FontDep) {
        this.FontDep = FontDep;
    }
}