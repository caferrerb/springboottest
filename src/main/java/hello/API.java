package hello;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class API {

    @RequestMapping(method = RequestMethod.GET,value = "/buscar")
    public RespuestaDTO buscar(@RequestParam("ced") String cedula){
        return new RespuestaDTO("00","OK",DAOPersona.buscar(cedula));
    }


    @RequestMapping(method = RequestMethod.POST,value = "/crear")
    public RespuestaDTO crear(@RequestBody Persona per){
        DAOPersona.crear(per);
        return new RespuestaDTO("00","OK",null);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/editar")
    public RespuestaDTO editar(@RequestBody Persona per){
        DAOPersona.editar(per);
        return new RespuestaDTO("00","OK",null);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/listar")
    public RespuestaDTO listar(){

        return new RespuestaDTO("00","OK",DAOPersona.listar());
    }




}
