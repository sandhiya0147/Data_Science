import java.util.Scanner;

public class OrangeDistribution {
    public static int[] computeOrangesDistribution(int total, int difference) {
        int anniOranges = (total - difference) / 2;
        int himaOranges = anniOranges + difference;
        return new int[]{himaOranges, anniOranges};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of oranges: ");
        int totalOranges = scanner.nextInt();
        System.out.print("Enter how many more oranges Hima has than Anni: ");
        int difference = scanner.nextInt();
        int[] oranges = computeOrangesDistribution(totalOranges, difference);
        int himaOranges = oranges[0];
        int anniOranges = oranges[1];
        System.out.println(himaOranges);
        System.out.println(anniOranges);
        scanner.close();
    }
}
