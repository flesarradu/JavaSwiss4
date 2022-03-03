import java.util.ArrayList;


//Ex: inseram 9
//  1 2 2 2 3 4 5 7 8
public class ListaSortata<T extends Comparable<T>> {
    private ArrayList<T> list;
    public ListaSortata(){
        list=new ArrayList<>();
    }
    public void insert(T x){
        boolean amInserat = false;
        for(var y : list){
            if(x.compareTo(y) < 0){
                list.add(list.indexOf(y), x);
                amInserat = true;
                break;
            }
        }
        if(!amInserat){
            list.add(x);
        }
    }

    public void sterge(T x){
        if(exista(x)){ //il sterg
            list.remove(x);
        }
    }

    public boolean exista(T x){
        for(var y : list){
            if(x.compareTo(y)==0){
                return true;
            }
        }
        return false;
    }

    public void afisare(){
        for(var x : list){
            System.out.print(x + " ");
        }
        System.out.print('\n');
    }

    public int len(){
        return list.size();
    }

}
