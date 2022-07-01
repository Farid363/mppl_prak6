import figure.calculation.BlockOperation;
import figure.calculation.CubeOperation;

public class Main {
    public static void main(String[] args) {
        CubeOperation OPCube1 = new CubeOperation(4.0);
        CubeOperation OPCube2 = new CubeOperation(76.0);
        CubeOperation OPCube3 = new CubeOperation(126.0);

        BlockOperation OPBlock1 = new BlockOperation(4.0, 2.0, 9.0);
        BlockOperation OPBlock2 = new BlockOperation(54.0, 84.0, 7.0);
        BlockOperation OPBlock3 = new BlockOperation(23.0, 22.0, 2.0);

        System.out.printf("Cube 1 Volume: %.2f\n", OPCube1.volume());
        System.out.printf("Cube 2 Volume: %.2f\n", OPCube2.volume());
        System.out.printf("Cube 3 Volume: %.2f\n", OPCube3.volume());

        System.out.printf("Block 1 Volume: %.2f\n", OPBlock1.volume());
        System.out.printf("Block 2 Volume: %.2f\n", OPBlock2.volume());
        System.out.printf("Block 3 Volume: %.2f\n", OPBlock3.volume());
    }
}
