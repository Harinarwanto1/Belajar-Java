public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "EKO";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];


        String[] namaNama = {
                "Eko" , "Kurniawan" , "Khannedy"
        };

        namaNama[0] = null;

        int[] arrayint = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };
        long[] arraylong = {
                10L , 20L , 30L
        };
        System.out.println(arraylong.length);

        String[][] members = {
                {"Eko" , "Kurniawan"},
                {"Budi" , "Nugraha"},
                {"Joko" , "Morro"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }

}
