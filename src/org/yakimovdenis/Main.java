package org.yakimovdenis;

public class Main {

    public static void main(String[] args) {
	    RandomString random = new RandomString(10);
	    for (int i=0; i<100;i++){
            System.out.println(random.nextString());
        }
    }
}
