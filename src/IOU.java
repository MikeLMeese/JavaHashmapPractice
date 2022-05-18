import java.util.HashMap;
import java.util.Map;

public class IOU {

    private HashMap<String, Double> cripplingDebts = new HashMap<String, Double>();

    public IOU() {

    }

    // Saves amount owed and person owed to the IOU
    public void setSum(String toWhom, double amount) {
        cripplingDebts.put(toWhom, amount);
    }

    // Returns amount owed to the person whose name is given as a parameter
    // If the person cannot be found, it returns 0 instead
    public double howMuchDoIOweTo(String toWhom) {
        for (Map.Entry<String, Double> debtee: cripplingDebts.entrySet()) {
            if (debtee.getKey().equalsIgnoreCase(toWhom)) {
                return debtee.getValue();
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}