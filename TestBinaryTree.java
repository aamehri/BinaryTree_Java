public class TestBinaryTree {
    public static void main(String[] args) {

        BinaryTree br1 = new BinaryTree();

        br1.insert(50, "car");
        br1.insert(30, "Truck");
        br1.insert(78, "Bus");
        br1.insert(21, "bike");
        br1.insert(60, "Plane");
        br1.insert(65, "motorcycle");
        br1.insert(12, "Helicopter");
        br1.insert(79, "jet");

        System.out.println("In Order:\n" + br1.inOrder());
        System.out.println("Pre Order:\n" + br1.preOrder());
        System.out.println("Post Order:\n" + br1.postOrder());
        if (br1.search(50))
            System.out.println("Record found!");
        else
            System.out.println("Record not found!");
    }
}
