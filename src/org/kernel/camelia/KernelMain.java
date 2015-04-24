package org.kernel.camelia;

import org.kernel.camelia.language.Bootstrapper;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by jimmy on 24/04/15.
 */
public class KernelMain {
    public static void main(String[] args) throws Exception {
        Reader reader = null;
        boolean debug = false;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-e")) reader = new StringReader(args[++i]);
            else if (args[i].equals("-d")) debug = true;
            else reader = new FileReader(args[i]);
        }
        /*
        if (reader == null) {
            System.out.println("usage: camelia [-d] < -e code | file.ca >");
            System.exit(1);
        }*/

        reader = new FileReader("./src/org/kernel/test/test001.ca");
        Bootstrapper.run().eval(reader);

    }
}
