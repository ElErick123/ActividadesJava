package practicapersona1;
public class Main {
    public static void main(String[] args) {
        Persona erick = new Persona("Erick", "Caro Cravioto", 16);
        Persona arturo = new Persona ("Arutro", "Carmona Vera", 30);
        System.out.println("Datos de Erick:\nNombre: "+erick.getNombre()+
        "\nApellidos: "+erick.getApellidos()+
        "\nEdad: "+erick.getEdad());
        erick.caminar();  
        erick.duerme();
        arturo.caminar();
        arturo.duerme(); 
    }
}
