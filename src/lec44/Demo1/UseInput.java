package lec44.Demo1;

import java.io.*;

class Input {
    public static void accept() throws IOException {
        System.out.println("Enter a character");
        char c = (char) System.in.read();
        System.out.println("You entered " + c);
    }
}

class UseInput {
    public static void main(String[] args) throws IOException {
        Input.accept();
    }
}