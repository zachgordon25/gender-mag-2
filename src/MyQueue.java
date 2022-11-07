import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
interface MyQueue<E>{
    //methods to use
    //adds a movie to the heap
    String addMovie(String x);
    //Clears the Entire Heap
    void clearAll();
    //tells if the heap is empty
    boolean isEmpty();
    //returns a movie and its information
    String peekMovie();
    //pushes a movie up a heap
    void pushMovie();
    //removes one movie from the heap
    void removeMovie(int x);
    //returns the size of the heap
    int size();
}
class MyHeap<E> implements MyQueue {
    //creates Heap
    ArrayList mList = new ArrayList<>();

    //adds only a movie to the heap
    public String addMovie(String x){
        mList.add(x);
        return null;
    }

    public void clearAll() {
        int i = 0;
        while (i <= mList.size()) mList.remove(i);
    }

    public boolean isEmpty() {
        return mList.size() == 0;
    }

    public String peekMovie() {
        return (String) mList.get(0);
    }

    public void pushMovie() {

    }

    public void removeMovie(int x) {
        mList.remove(x);
    }

    public int size() {
        return mList.size();
    }
    //heapsort
}


