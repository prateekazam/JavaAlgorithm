package algo.dynamic.conn;

/**
 * This is class which is implemtation of Quick find algorithm which is 
 * help us to solve dynamic connected problem.
 * The time will be init (N ) +  union (N) + connect (1) 
 */

public class QuickFind {

    private int id[];

    public QuickFind() {
        super();
    }

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public static void main(String[] args) {
        QuickFind find = new QuickFind(10);
        for (int i = 0; i < find.id.length; i++) {
            System.err.print(find.id[i] + " ");
        }
        find.union(0, 5);
        find.union(5, 0);
        System.err.println("");
        for (int i = 0; i < find.id.length; i++) {
            System.err.print(find.id[i] + " ");
        }
    }

    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
    }
}
