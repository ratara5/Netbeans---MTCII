package model.vo;

public class Requerimiento3 {

    private String nombreMaterial;
    private String importado;
    private Integer noCompras;

    public Requerimiento3() {

    }

    public Requerimiento3(String nombreMaterial, String importado, Integer noCompras) {
        this.nombreMaterial = nombreMaterial;
        this.importado = importado;
        this.noCompras = noCompras;
    }

    //Get and Set

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public Integer getNoCompras() {
        return noCompras;
    }

    public void setNoCompras(Integer noCompras) {
        this.noCompras = noCompras;
    }
    
}
