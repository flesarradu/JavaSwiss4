public class Stiva<T>{
    private Object[] list;//private ArrayList<T> queue;
    private int top;
    private int levelMaxim;

    public Stiva(int levelMaxim){
        list = new Object[levelMaxim]; //queue = new ArrayList<T>();
        this.levelMaxim = levelMaxim;
        top = -1;
    }

    public void push(T x){
        if(plina()){
            System.out.println("EROARE: Stiva este plina!!");
            return;
        }
        list[++top] = x; //queue.add(++top);
    }
    public T pop(){
        if(goala()){
            System.out.println("EROARE: Stiva este goala!!");
            return null;
        }
        return (T) list[top--]; //queue.remove(top--); !!! Se salveaza si retunreaza queue.get(top);
    }
    public T peek(){
        if(goala()){
            System.out.println("EROARE: Stiva este goala!!");
            return null;
        }
        return (T) list[top];
    }

    public boolean plina(){
        return top == levelMaxim -1;
    }
    public  boolean goala(){
        return top == -1;
    }

}
