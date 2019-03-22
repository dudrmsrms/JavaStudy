package Ch07.Example;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå
		boolean isPossible = false; // ÇåÇ÷ °¡´É ¿©ºÎ
		/* ³Ñ°Ü¹ŞÀº Human Å¬·¡½º·ÎºÎÅÍ age Á¤º¸ È®ÀÎ age = ? */
		age = human.getAge();
		
		/* age°¡ 16¼¼ ÀÌ»ó 69¼¼ ÀÌÇÏ ÀÏ¶§¸¸ ÇåÇ÷ °¡´ÉÇÏµµ·Ï Á¶°Ç¹® ÀÛ¼º */
		if (age >= 16 && age < 69) {
			isPossible = true;
		} else {
			isPossible = false;
		}
		

		
		return isPossible;
	}

	public String action(Human human) {
//		String name = human.name;
//		char blood = human.type;
		String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
//		BloodHouse b = new BloodHouse();
//		result = b.isPossible(human); boolean °ú  String Àº °øÁ¸ºÒ°¡ .
//		boolean ox = isPossible(human);

		/* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ÀÛ¼º */
		if (isPossible(human) == true) {
			result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù." + human.name + "´Ô " + human.type + "Çü ÇåÇ÷ °¨»çÇÕ´Ï´Ù.";
		} else {
			result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù.";
		}
		/* ÇåÇ÷ °¡´É ½Ã result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù. */
		/* ÇåÇ÷ ºÒ°¡ ½Ã result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. */
		return result;
	}
}