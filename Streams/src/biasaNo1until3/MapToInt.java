package biasaNo1until3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToInt {
    public static void main(String[] args) {

        //Deklarasi dan input data Map
        Map<String, String> masyarakat = new HashMap<>();
        masyarakat.put("001", "Ishak");
        masyarakat.put("002", "Rizki");
        masyarakat.put("003", "Dono");

        //MapToInt tanpa filtering
        List namaMasyarakat = masyarakat.keySet().stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(namaMasyarakat);









    }
}
