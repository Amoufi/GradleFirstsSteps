package es.eed;

import es.eed.util.Util;
import es.eed.model.Person;
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        Person person = new Person("alice", 30);
        
        // Usar StringUtils para capitalizar el nombre
        String capitalizedName = StringUtils.capitalize(person.getName());
        System.out.println("Nombre: " + capitalizedName);
        System.out.println("Edad: " + person.getAge());
        
        String message = "¡Hola, " + capitalizedName + "!";
        Util.printMessage(message);
        
        // Convertir el objeto Person a JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);
    }
}
