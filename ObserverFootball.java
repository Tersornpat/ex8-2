
import java.util.Scanner;

public class ObserverFootball {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        FansUAE obj1 = new FansUAE();
        FansThai obj2 = new FansThai();
        Referee obj = new Referee();

        obj.register(obj1);
        obj.register(obj2);

        int th, uae;

        while (true) {
            try {
                String tmp = inp.nextLine().trim();
                if (tmp.split("\\s+").length == 2) {
                    th = Integer.parseInt(tmp.split("\\s+")[0]);
                    uae = Integer.parseInt(tmp.split("\\s+")[1]);
                } else {
                    th = Integer.parseInt(tmp);
                    uae = Integer.parseInt(inp.nextLine());
                }
                System.out.println("Enter Score Thai " + th + "-" + uae + " UAE");
            } catch (Exception e) {
                break;
            }
            obj.setSomeScore(th, uae);
        }
        
    }
}
