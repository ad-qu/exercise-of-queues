package edu.upc.eetac.dsa;

public class Main {
    public static void main(String[] args) {
        QueueImpl<String> list = new QueueImpl<>(3);
        try{
            System.out.println("Ponemos en la lista las 3 palabras. \t");

            list.push("Hola");
            list.push(" buenos");
            list.push(" días. ");

            System.out.println("Vemos el tamaño de la lista actualmente: " + list.size() + ".\t");

            System.out.println("Ahora hacemos pop en cada elemento.\t");

            System.out.println(list.getList());
            list.pop();
            System.out.println(list.getList());
            list.pop();
            System.out.println(list.getList());
            list.pop();

        }
        catch (FullQueueException e) {
            System.out.println(e.getMessage());
        }

        catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
