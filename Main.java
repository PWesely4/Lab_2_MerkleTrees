import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lstItems = new ArrayList<>();

        lstItems.add("tx1");
        lstItems.add("tx2");
        lstItems.add("tx3");
        lstItems.add("tx4");

        Util Util = new Util();
        String MerkleRoot = Util.getMerkle_Root(lstItems);
        System.out.println(MerkleRoot);
    }
}
