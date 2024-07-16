import java.util.HashMap;
import java.util.Map;

public class MonedasMap {
    private Map<String, String> divisasMap = new HashMap<>();

    public MonedasMap() {
        divisasMap.put("1", "USD");
        divisasMap.put("2", "ARS");
        divisasMap.put("3", "EUR");
        divisasMap.put("4", "BRL");
        divisasMap.put("5", "CLP");
        divisasMap.put("6", "COP");
        divisasMap.put("7", "Salir");
    }

    public String getAbreviatura(String numero) {
        return divisasMap.getOrDefault(numero, "Desconocida");
    }
}
