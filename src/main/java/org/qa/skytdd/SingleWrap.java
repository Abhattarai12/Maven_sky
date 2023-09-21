package org.qa.skytdd;

public interface SingleWrap<T, K> {

    T getValue(K key);

    void add (K key, T value);

    T remove(K key);



}
