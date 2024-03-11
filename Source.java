public interface Source {
    public void notifyObserver();
    public void register(MyObserver o);
}
