package org.example;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan","Lopez","23.453.453-4","jlopez@gmail.com",45);
        Persona persona2 = new Persona("Mario","Hormazabal","12.565.455-7","els@gmail.com",22);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1.getRut());

        Curso cursoA = new Curso("Lorena","Ramirez","23.444.566-7","lore@gmail.com",22,"Profesor Saldivar","Lenguaje","12:00 a 14:00 hrs");

        System.out.println("El nombre del Profesor es: "+cursoA.getProfesor());
        System.out.println("La asignatura es: "+cursoA.getAsignatura());
        System.out.println("El horario de atencion es: "+cursoA.getHorario());

        System.out.println("Nombre del Alumno: "+persona1.getNombre());
        System.out.println("Correo del Alumno: "+persona1.getEmail());

        Auto auto1 = new Auto("Toyota","F.2000","34.000");

        System.out.println(auto1.getMarca());
        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getEdad());

        Casas casa1 = new Casas("4","3",4);
        System.out.println("La casa tiene : "+casa1.getHabitaciones()+"Habitaciones");
    }
}