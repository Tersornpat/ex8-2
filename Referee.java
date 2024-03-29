import java.util.ArrayList;

public class Referee implements Source {
    private final ArrayList<MyObserver> list;
    private int uae, thai;
    
    public Referee(){
        this.list = new ArrayList<MyObserver>();
    }
    
    public void setSomeScore(int th, int ua){
        uae = ua;
        thai = th;
        notifyObserver();
    }
    
    public int getUAEScore(){
        return uae;
    }
    
    public int getThaiScore(){
        return thai;
    }
    
    @Override
    public void register (MyObserver o){
        list.add(o);
    }

    @Override
    public void notifyObserver() {
        for(int j=0; j < list.size(); ++j){
            list.get(j).update(this);
        }
    }
        
    
}
