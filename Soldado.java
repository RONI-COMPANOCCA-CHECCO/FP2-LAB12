// RONI COMPANOCCA CHECCO
// CUI: 20210558
// LABORATORIO 12
// FUNDAMENTOS DE PROGRAMACION 
// CLASE SOLDADO PARA LOS METODOS SETTER Y GETTER
public class Soldado {
    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelVida;
    private int vidaActual;
    private int velocidad;
    private String actitud;
    private boolean vive;

    public Soldado() {
        nombre = "";
        nivelAtaque = 0;
        nivelDefensa = 0;
        nivelVida = 0;
        vidaActual = nivelVida;
        velocidad = 0;
        actitud = "";
        vive = true;
    }

    public void atacar(Soldado enemigo) {
        int danio = this.nivelAtaque - enemigo.nivelDefensa;
        if (danio > 0) {
            enemigo.serAtacado(danio);
            System.out.println(this.nombre + " atacó a " + enemigo.nombre + " y le causó " + danio + " de daño.");
        } else {
            System.out.println(this.nombre + " atacó a " + enemigo.nombre + " pero no le causó daño.");
        }
    }

    public void defender() {
        // Lógica para la defensa
        // Puede disminuir el daño recibido en un futuro ataque, por ejemplo
        this.nivelDefensa += 10; // Aumentar la defensa por ejemplo
        System.out.println(this.nombre + " se está defendiendo.");
    }

    public void avanzar() {
        // Lógica para avanzar en el juego
        // Podría mover al soldado a una nueva posición en el tablero, por ejemplo
        if (this.velocidad > 0) {
            // Mover al soldado en la dirección correspondiente
            System.out.println(this.nombre + " está avanzando.");
        } else {
            System.out.println(this.nombre + " no puede avanzar, la velocidad es 0.");
        }
    }

    public void retroceder() {
        // Lógica para retroceder en el juego
        // Podría mover al soldado hacia atrás en el tablero, por ejemplo
        System.out.println(this.nombre + " está retrocediendo.");
    }

    public void serAtacado(int danioRecibido) {
        this.vidaActual -= danioRecibido;
        if (this.vidaActual <= 0) {
            this.morir();
        }
    }

    public void huir() {
        // Lógica para huir del combate
        // Podría cambiar la posición del soldado a una zona segura, por ejemplo
        if (this.nivelVida < 10) {
            // Huir solo si la vida es baja
            System.out.println(this.nombre + " está huyendo del combate.");
        } else {
            System.out.println(this.nombre + " no puede huir, su vida está alta.");
        }
    }

    public void morir() {
        this.vidaActual = 0;
        this.vive = false;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public String getNivelVida() {
        return nivelVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public int setNivelVida() {
        this.nivelVida = nivelVida;
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

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
}

