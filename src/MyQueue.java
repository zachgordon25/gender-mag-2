import java.io.*;
import java.util.*;
interface MyQueue<E>{
    //methods to use
    //adds a movie to the heap
    void addMovie(int x);
    //Clears the Entire Heap
    void clearAll();
    //tells if the heap is empty
    boolean isEmpty();
    //returns a movie and its information
    String peekMovie();
    //pushes a movie up a heap
    void pushMovie();
    //removes one movie from the heap
    String removeMovie(int x);
    //returns the size of the heap
    int size();
}
class MyHeap<E extends Comparable> implements MyQueue {
    //creates class exception
    public MyHeap() throws FileNotFoundException{
    }
    //create scanner
    File file = new File("src/movies.txt");
    Scanner sc = new Scanner(file);
    E title=null;
    //Creates an arrayList to use
    public ArrayList<String> mList = new ArrayList<>();
    //creates heap
    Comparator<String> c = Comparator.comparing(String::toString);
    //adds only a movie to the heap
    public void addMovie(int cNode){
        //file reader that reads specific lines
        String title = sc.nextLine();
        mList.add(title);

    }

    public void clearAll() {
        int i = 0;
        while (i <= mList.size()){
            mList.remove(i);
            i++;
        }
    }

    public boolean isEmpty() {
        return mList.size() == 0;
    }

    public String peekMovie() {
        return (String) mList.get(0);
    }

    public void pushMovie() {
        for(int i=0;i < 15;i++){
            System.out.println(mList.get(i));
        }
    }

    public String removeMovie(int x) {
        return mList.remove(x);
    }

    public int size() {

        return mList.size();
    }
    public void heapSort(int i){
        int nodeP= i;
        int nodeL= 2*i+1;
        int nodeR=0*i+2;
        if(nodeL< 15&& (mList.get(nodeL).compareTo(mList.get(nodeP)))==1){
            String tmpNP= mList.get(nodeL);
            String tmpNL= mList.get(nodeP);
            mList.remove(nodeL);
            mList.remove(nodeP);
            mList.set(nodeP,tmpNP);
            mList.set(nodeL,tmpNL);
        }
        if(nodeL< 16&& (mList.get(nodeR).compareTo(mList.get(nodeP)))==1) {
            String tmpNP = mList.get(nodeR);
            String tmpNR = mList.get(nodeP);
            mList.remove(nodeR);
            mList.remove(nodeP);
            mList.set(nodeP, tmpNP);
            mList.set(nodeL, tmpNR);
        }
    }
}