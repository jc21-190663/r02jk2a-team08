
public class Kadai02 {


	int countString(String s,char c) {

		if(s == null) {
			System.out.println("NULLがあります。");
			System.exit(0);
		}
		//nullのとき

		s = s.toUpperCase();

		//文字列を全て大文字に変換する。

		//System.out.println(s);

		char[] array = s.toCharArray();

		int count = 0;

		for(int i= 0; i < array.length; i++) {
			//arrayの長さ分ループ

			if(c ==array[i]) {
				//c(指定したアルファベット)と一致したら↓の処理

				count++;
				//一致したら+1する。
			}
		}
		return count;
		//
	}

}
/**
 * 課題02
 * 文字列の中に、指定されたアルファベットが何文字入っているかを返すメソッド
 * @param s 文字列
 * @param c 文字
 * @return sの中に入っていたcの文字数
 */