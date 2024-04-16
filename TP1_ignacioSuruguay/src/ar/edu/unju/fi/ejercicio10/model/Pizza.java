package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    public Pizza() {
        // Constructor por defecto
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public double getArea() {
        return area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                precio = ingredientesEspeciales ? 4500 + 500 : 4500;
                break;
            case 30:
                precio = ingredientesEspeciales ? 4800 + 750 : 4800;
                break;
            case 40:
                precio = ingredientesEspeciales ? 5500 + 1000 : 5500;
                break;
            default:
                System.out.println("Diámetro no válido");
        }
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
