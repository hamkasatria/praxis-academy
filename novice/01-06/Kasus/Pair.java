package Kausus;

public class Pair<F, S> {//merupakan parameter
    F first; S second;

    public Pair(F f,S s){
        first = f ; second =s;
    }

    public void setFirst(F f){
        first = f;
    }

    public F getFirst(){
        return first;
    }

    public setSecond(S s){
        second = s;
    }

    public S getSecond(){
        return second;
    }
    
}