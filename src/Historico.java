import java.util.ArrayList;

public abstract class Historico {
    public <T> String mostrarHistorico(ArrayList<?> o){
        String newString = new String();
        for (Object a : o) {
            newString = newString + a.toString() + '\n';
        }
        return newString;
    }
}
