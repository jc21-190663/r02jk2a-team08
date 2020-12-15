
public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
		char[] CharacterList(String s) {
			int  wk;
			int  count = 0;
			char[] c = new char[26];
			char[] array =s.toCharArray();
			for(int i = 0;i < array.length; i++ ) {
				if(  array[i]  >=  'a'  &&  array[i]  <=  'z' ) {
					array[i] = (char) (array[i]  - 32 );
				}
				if(array[i] >= 'A' &&  array[i] <= 'Z' ) {
					wk  = array[i]  -  'A';
					if  (  c[wk]  !=  '*' ) {
						c [ wk ] = '*';
						count++;
					}
				}

			}
			char[]   returnc  =  new  char[count];
			count  =  0;

			for  ( int i =0; i < c.length; i++ ) {
				if(c[i] == '*') {
					returnc [count] = (char)(i + 'A');
					count++;
				}

			}
			return   returnc;
		}
}
