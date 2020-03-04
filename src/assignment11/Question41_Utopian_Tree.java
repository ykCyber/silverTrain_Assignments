package assignment11;

public class Question41_Utopian_Tree {

	public static void main(String[] args) {
		/*
		 * The Utopian Tree grows exactly 1 cm for the first three years, and after
		 * that, it grows by 2 cm every year, this is a simple implementation of the
		 * algorithm. You will need to use loops to create it. Show 10 years of growth
		 * of the Utopian Tree.
		 */
		utopianTreeGrowth();
	}

	public static void utopianTreeGrowth() {
		int year,treeSize=0,growth;
		for (int i = 1; i <=10; i++) {
			year=i;
			growth=i>3?2:1;
			treeSize+=growth;
			System.out.printf("year %d - growth %dcm\ntree size %dcm\n",year,growth,treeSize);
		}
	}

}
