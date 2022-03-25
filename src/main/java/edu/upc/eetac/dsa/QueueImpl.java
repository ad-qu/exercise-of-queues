package edu.upc.eetac.dsa;

public class QueueImpl<E> implements Queue<E> {

    private E[] List;
    private int num, max;

    public QueueImpl(int m) {
        this.List = (E[]) new Object[m];
        this.num = 0;
        this.max = m;
    }

    @Override
    public void push(E obj) throws FullQueueException {
        if(this.num < this.max)
        {
            this.List[this.num] = obj;
            this.num++;
        }
        else throw new FullQueueException();
    }

    @Override
    public E pop() throws EmptyQueueException {
        E first;

        if(this.num > 0)
        {
            first = this.List[0];

            for(int i = 0; i < num; i++) {
                this.List[i] = this.List[i + 1];
            }

            this.num--;
            this.List[this.num] = null;
        }
        else throw new EmptyQueueException();

        return first;
    }

    @Override
    public int size() {
        return this.num;
    }

    public String getList() {

        String l = "";

        for (int i = 0; i < num; i++) {
            l = l + this.List[i];
        }
        return l;
    }
}
