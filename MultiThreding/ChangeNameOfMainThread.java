package MultiThreding;

import javax.sound.midi.Soundbank;

public class ChangeNameOfMainThread {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println("current thread: "+ obj);
        System.out.println("Name of current thread is :"+obj.getName());

        System.out.println("Changing a name of main thread");

        obj.setName("new thread");
        System.out.println("Name of main thread after changing is : "+ obj);
    }
}
