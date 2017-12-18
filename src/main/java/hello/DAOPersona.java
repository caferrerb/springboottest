package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOPersona {

    private static final Map<String,Persona> personas=new HashMap<>();

    public static void crear(Persona per){
        personas.put(per.getCedula(),per);
    }

    public static void editar(Persona per){
        crear(per);
    }

    public static Persona buscar(String ced){
        return personas.get(ced);
    }


    public static List<Persona> listar(){
        return new ArrayList<>(personas.values());
    }
}
