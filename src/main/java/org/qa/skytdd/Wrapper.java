package org.qa.skytdd;

public class Wrapper<T, E> implements SingleWrap<T, E> {



    private Wrapper<Integer, String> wrap = new Wrapper<>();
    public Wrapper<Integer, String> getMywrap() {
        return this.wrap;
    }

    public void setMywrap(Wrapper<Integer, String> awrap) {
        this.wrap = awrap;
    }

    @Override
    public T getValue(E key) {
        return null;
    }

    @Override
    public void add(E key, T value) {

    }

    @Override
    public T remove(E key) {
        return null;
    }
}
