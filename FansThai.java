public class FansThai implements MyObserver {

    @Override
    public void update(Source o) {
        System.out.println(
        "(THAI Observer) live result: Thai " + 
                ((Referee)o).getThaiScore() + "-" + 
                ((Referee)o).getUAEScore() + " UAE");
    }
    
}
