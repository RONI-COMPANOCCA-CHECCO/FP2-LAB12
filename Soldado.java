// RONI COMPANOCCA CHECCO
// CUI: 20210558
// LABORATORIO 04
// FUNDAMENTOS DE PROGRAMACION 
// CLASE SOLDADO PARA LOS METODOS SETTER Y GETTER
class Soldado {
    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int vidaActual;
    private boolean vive;

    public Soldado(String nombre, int nivelAtaque, int nivelDefensa, int vidaActual, boolean vive) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.vidaActual = vidaActual;
        this.vive = vive;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
}

