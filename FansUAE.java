public class FansUAE implements MyObserver{

    @Override
    public void update(Source o) {
        System.out.println(
        "(UAE Observer) live result: Thai " + 
                ((Referee)o).getThaiScore() + "-" + 
                ((Referee)o).getUAEScore() + " UAE");
    }
    
}
