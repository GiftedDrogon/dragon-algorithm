package com.dragon.talon.algorithm.link.singleLinkList;

/**
 * 链表节点
 * @author dragonboy 
 */
public class Snode<T> {
    private T data;
    
    private Snode next;

    public Snode(){}
    
    public Snode(T data){
        this.data = data;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Snode getNext() {
        return next;
    }

    public void setNext(Snode next) {
        this.next = next;
    }

    public static void main(String[] args) {
        String str = "abr";
        String sta = "abr";
        System.out.println(sta == str);
        
        String b = new String("atr").intern();
        String a = new String("atr");
        System.out.println(a == b);
    }
}
