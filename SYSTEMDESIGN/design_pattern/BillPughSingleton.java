public class BillPughSingleton {
    private BillPughSingleton(){}
    
    // Inner class is not loaded until getInstance() is called
    private static class Holder{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public BillPughSingleton getInstace(){
        return Holder.instance;
    }
}

