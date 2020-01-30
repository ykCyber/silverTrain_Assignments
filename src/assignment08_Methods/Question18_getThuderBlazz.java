package assignment08_Methods;

public class Question18_getThuderBlazz {

	public static void main(String[] args) {
		System.out.println(getThunderBlazz(true,  false, 1, 2, 3));
		System.out.println(getThunderBlazz(false, false, 1, 2, 3));
		System.out.println(getThunderBlazz(false, false, 1, 5, 3));
		System.out.println(getThunderBlazz(false, false, 3, 1, 2));
		System.out.println(getThunderBlazz(false, false, 3, 1, 1));
		System.out.println(getThunderBlazz(false, true,  9, 7, 3));
	}

	public static boolean getThunderBlazz(boolean inStore, boolean isGift, double ingredient1, double ingredient2,
			double ingredient3) {
		// 1st case it is in store so it is available OR if it is a gift again avaible;
		if (inStore == true || isGift == true) {
			return true;
		}
		// if it is not in store OR it is not a gift than you have to use Correct ratios
		// 3rd case we have to check ratios and there is two Correct recipe
		
		// 3-1: 6Xingredient1==3Xingredient2==2Xingredient3
		// 3-2 2Xingredient1==6Xingredient2==3Xingredient3
		else if (ingredient1 * 6 == 3 * ingredient2 && ingredient1 * 6 == ingredient3 * 2) {
			return true;
		} else if (ingredient1 * 2 == 6 * ingredient2 && ingredient1 * 2 == ingredient3 * 3) {
			return true;
		} else {
			return false;
		}

	}

}
