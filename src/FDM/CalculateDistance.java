package FDM;

public class CalculateDistance {

    public static int distanceBetween(String coor) {

        int[] firstCoor = new int[2];
        int[] secondCoor = new int[2];

        // Define a regular expression pattern to match (x, y) (i, j)
        String pattern = "\\((-?\\d+), (-?\\d+)\\) \\((-?\\d+), (-?\\d+)\\)";

        // Use a Matcher to find and extract values
        java.util.regex.Pattern regex = java.util.regex.Pattern.compile(pattern);
        java.util.regex.Matcher matcher = regex.matcher(coor);

        if (matcher.matches()) {
            firstCoor[0] = Integer.parseInt(matcher.group(1)); // x
            firstCoor[1] = Integer.parseInt(matcher.group(2)); // y
            secondCoor[0] = Integer.parseInt(matcher.group(3)); // i
            secondCoor[1] = Integer.parseInt(matcher.group(4)); // j
        }

        double result = Math.sqrt(Math.pow((firstCoor[0]-secondCoor[0]), 2) + Math.pow((firstCoor[1]-secondCoor[1]), 2));


        return (int)result;
    }

    public static void main(String[] args) {
        String coordinates1 = "(25, 4) (1, -6)";
        String coordinates2 = "(47, 43) (-25, -11)";

        System.out.println (distanceBetween ( coordinates2 ));
    }
}
