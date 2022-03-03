import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Integer[] integers = {1, 2, 3, 4 ,5 };
        Double[] doubles = { 1.2, 2.1, 3.4, 4.3, 5.6};
        String[] strings = {"Ala", "bala", "porto", "cala"};
        afiseazaLista(integers);
        afiseazaLista(doubles);
        afiseazaLista(strings);
        System.out.println(max("ala","b"));

        Valoare<Integer> v = new Valoare<Integer>();
        v.set(4);
        System.out.println(v.get());
        Valoare<String> v2 = new Valoare<String>();
        v2.set("alabala");
        System.out.println(v2.get());
         */

        ListaSortata<Integer> listaSortata = new ListaSortata<>();
        listaSortata.insert(5);
        listaSortata.insert(3);
        listaSortata.insert(7);
        listaSortata.insert(9);

        listaSortata.afisare();
        listaSortata.insert(7);
        listaSortata.insert(8);

        listaSortata.afisare();

    }

    public static <E extends Comparable<E>> E max(E a, E b){
        if(a.compareTo(b) > 0)
            return a;
        else
            return b;
    }

    //max(a,b,c) = max(max(a,b),c);
    public static <E extends Comparable<E>> E max(E a, E b, E c){
        return max(max(a,b),c);
    }

    public static Integer max(Integer a, Integer b){
        return (a>b) ? a : b; //inline-if
        /*
            (cond) ?  adevart : fals;
         */
    }
    public static Integer max(Integer a, Integer b, Integer c){
        return (a>b) ? (a>c)? a : c : (b>c)? b : c; //inline-if
    }

    public static void afiseazaLista(Integer[] lista){
        System.out.println("Suprascriere Interger");
        for(var x : lista){
            System.out.print(x+" ");
        }
        System.out.print('\n');
    }

    public static <E> void afiseazaLista(E[] lista){

        System.out.println("Metoda Generica");
        for(var x : lista){
            System.out.print(x+" ");
        }
        System.out.print('\n');
    }

}
