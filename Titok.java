public class Titok {
    static String kodolas(String eredeti) {
        StringBuilder kodolt = new StringBuilder();

        for (int j = 0; j < eredeti.length(); j++) {
            kodolt.append(eredeti.charAt(j));
            kodolt.append(eredeti.charAt(j));
            kodolt.append(eredeti.charAt(j));
        }

    return kodolt.toString();
    }

    static String dekodolas(String kodolt) {
        StringBuilder eredeti = new StringBuilder();

        for (int i = 0; i < kodolt.length(); i+=3) {
            int osszeg = 0;
            for (int j = 0; j <3; j++) {
                osszeg = osszeg + kodolt.charAt(i+j) - '0';
            }

            if (osszeg<= 1) {
                eredeti.append('0');
            } else {
                eredeti.append('1');
            }
        }


        return eredeti.toString();
    }

}
