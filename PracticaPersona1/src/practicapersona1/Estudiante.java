package practicapersona1;
public class Estudiante extends Persona {
    private int matricula;
    public Estudiante (String nombre, String apellidos, int edad, int matricula) {
        super(nombre, apellidos, edad);
        this.matricula = matricula;
    }
    public int getMatricula () {
        return this.matricula;
    }
    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }
}
