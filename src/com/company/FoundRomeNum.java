package com.company;

public class FoundRomeNum {
    private static int result = 0;
    private static int a = 0;
    private static int b = 0;
    static String[] rome = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX","X",
                                         "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                                         "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                                         "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                                         "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIV","L",
                                         "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                                         "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXIII","LXIV","LXX",
                                         "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                                         "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                                         "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
    public static String getFoundRomeNum() {
            while (true) {
                if (rome[a].equals(FoundNum.getFoundNum().get(0))) {
                    break;
                }
                a++;
            }
            while (true) {
                if (rome[b].equals(FoundNum.getFoundNum().get(2))) {
                    break;
                }
                b++;
            }
            try {
                if (FoundNum.getFoundNum().contains("+")) {
                    result = a + b;
                } else if (FoundNum.getFoundNum().contains("-")) {
                    result = a - b;
                } else if (FoundNum.getFoundNum().contains("/")) {
                    result = a / b;
                } else if (FoundNum.getFoundNum().contains("*")) {
                    result = a * b;
                } else {
                    throw new Exception("no mathematical action");
                }
                if(a > 10 || b > 10) {
                    throw new Exception("number greater than 10");
                }
                if (FoundNum.getFoundNum().size() > 3) {
                    throw new Exception("2 numbers and 1 action are accepted for entry");
                }
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }

        return rome[result];
    }
}
