package com.company_hw14;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();

    boolean isEmpty();
}
