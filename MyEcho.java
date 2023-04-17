package laboratorio.e1;

import edu.princeton.cs.algs4.*;

public class MyEcho {
    public static void main(String[] args){
        if (args.length == 0) {
            System.err.println("There's no argument");
        } else {
            for (int i = 0; i < args.length; i++) {
                String word = args[i];
                if (word.isEmpty()) {
                    System.err.println("No string introduced");
                } else {
                    StdOut.print(word + "   ");
                }
            }
        }

    }
}
