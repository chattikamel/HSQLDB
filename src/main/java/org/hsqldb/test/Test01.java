package org.hsqldb.test;

public class Test01 {

    public static String listagg(String in, Boolean flag,
                                         String[] buffer, Integer[] counter) {

        if (flag) return buffer[0];
        else {
            if (in == null) return null;
            if (buffer[0] == null) {
                buffer[0] = "";
            }
            if (counter[0] == null) counter[0] = Integer.valueOf(0);
            if (counter[0] > 0) buffer[0] = buffer[0] + ",";

            buffer[0] = buffer[0] + in;
            counter[0] = counter[0] + 1;
        }

        return null;
    }

}
