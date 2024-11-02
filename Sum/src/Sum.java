public class Sum {
    public static void main(String[] args) {
        int summa = 0;
        int arrIndex = 0;
        for (int i = 0; i < args.length; i++) {
            if (args.length == 0) {
                return;
            }
            //args[i] = args[i].replaceAll("\\p{Zs}+", " ")
            String[] digitArr = args[i].split("[^0-9+-]");

            for (String elem : digitArr) {
                if (elem.equals("")) {
                    summa += 0;
                } else if (elem.equals("+") || elem.equals("-")) {
                    if (elem == digitArr[digitArr.length-1]) {
                        args[i+1] = elem + args[i+1];
                    } else {
                        digitArr[arrIndex+1] = digitArr[arrIndex] + digitArr[arrIndex+1];
                    }
                } else {
                    summa += Integer.parseInt(elem);
                }
                arrIndex++;
            }
        }
        System.out.println(summa);
    }
}