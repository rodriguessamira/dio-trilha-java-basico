import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Formatar {
    double saldo;
    public String decimalFormat(double saldo){
        DecimalFormat decimalFormat = new DecimalFormat("#,###0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(saldo);

    }
   
}
