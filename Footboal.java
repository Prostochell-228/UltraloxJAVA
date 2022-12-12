public class Footboal {
    public static void main(String[] args) {
        Object[][] grupA = new Object[5][5];
        grupA[0][0] = "   *   ";;
        grupA[0][1] = "  NLD  ";grupA[1][0] = "  NLD  ";grupA[1][1] = "   *   ";
        grupA[0][2] = "  SEN  ";grupA[2][0] = "  SEN  ";grupA[2][2] = "   *   ";
        grupA[0][3] = "  ECU  ";grupA[3][0] = "  ECU  ";grupA[3][3] = "   *   ";
        grupA[0][4] = "  QAT  ";grupA[4][0] = "  QAT  ";grupA[4][4] = "   *   ";

        grupA[1][2] = " 0 : 2 "; grupA[2][1] = " 2 : 0 ";
        grupA[1][3] = " 1 : 1 "; grupA[3][1] = " 1 : 1 ";
        grupA[1][4] = " 2 : 0 "; grupA[4][1] = " 0 : 2 ";
        grupA[2][3] = " 1 : 2 "; grupA[3][2] = " 2 : 1 ";
        grupA[2][4] = " 1 : 3 "; grupA[4][2] = " 3 : 1 ";
        grupA[3][4] = " 0 : 2 "; grupA[4][3] = " 2 : 0 ";

        for (int i = 0; i < grupA.length; i++) {
            for (int j = 0; j < grupA[i].length; j++) {
                System.out.print(grupA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
