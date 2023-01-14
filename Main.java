
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Marcos");
        cliente.setTelefono(32413233);
        cliente.setCredito(421);

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
            trabajador.setEdad(35);
            trabajador.setNombre("Lucas");
            trabajador.setTelefono(32313233);
            trabajador.setSalario(42.1);

            System.out.println(trabajador.nombre);
            System.out.println(trabajador.edad);
            System.out.println(trabajador.telefono);
            System.out.println(trabajador.salario);
    }

}


class Persona {
    
    public int edad;
    public String nombre;
    public int telefono;

    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}


class Cliente extends Persona {
    public int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}


class Trabajador extends Persona {
    public double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}