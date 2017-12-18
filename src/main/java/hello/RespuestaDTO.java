package hello;

public class RespuestaDTO {

    private String codigo;
    private String mensaje;
    private Object obj;

    public RespuestaDTO() {
    }

    public RespuestaDTO(String codigo, String mensaje, Object obj) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.obj = obj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
