package edu.upc.eetac.dsa;

public class Main {
    public static void main(String[] args) {
        QueueImpl<String> list = new QueueImpl<>(5);
        try{
            System.out.println("Ponemos en la lista las 3 palabras. \t");

            list.push("Hola");
            list.push(" buenos");
            list.push(" días. ");

            System.out.println("Vemos el tamaño de la lista: " + list.size() + ".\t");

            System.out.println("Ahora hacemos pop en cada elemento.\t");

            System.out.println(list);
            list.pop();
            System.out.println(list);
            list.pop();
            System.out.println(list);
            list.pop();

        }
        catch (FullQueueException full) {
            full.printStackTrace();
        }
        catch (EmptyQueueException empty) {
            empty.printStackTrace();
        }
    }
}
