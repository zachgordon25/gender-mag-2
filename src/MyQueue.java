interface MyQueue<E>{
    //methods to use
    //adds a movie to the heap
    String addMovie();
    //Clears the Entire Heap
    void clearAll();
    //tells if the heap is empty
    boolean isEmpty();
    //returns a movie and its information
    String peekMovie();
    //pushes a movie up a heap
    void pushMovie();
    //removes one movie from the heap
    void removeMovie();
    //returns the size of the heap
    int size();
}
class MyHeap<E> implements MyQueue{
    //creates Heap

    //adds a movie to the heap
    public String addMovie() {
        return null;
    }

    public void clearAll() {

    }

    public boolean isEmpty() {

        return false;
    }

    public String peekMovie() {
        return null;
    }

    public void pushMovie() {

    }

    public void removeMovie() {

    }

    public int size() {
        return 0;
    }
}
