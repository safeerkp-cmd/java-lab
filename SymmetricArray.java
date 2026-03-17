import java.util.*;

class SymmetricArray {
    int[][] a;
    int n;

    void read(Scanner sc) {
        System.out.println("Enter order of array: ");
	n = sc.nextInt();
        System.out.println("Enter array Elements: ");
        a = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
    }

    boolean check() {
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(a[i][j] != a[j][i])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SymmetricArray obj = new SymmetricArray();
        obj.read(sc);

        if(obj.check())
            System.out.println("Array is Symmetric");
        else
            System.out.println("Array is not Symmetric");
    }	
}
