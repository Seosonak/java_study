package ch14.Collection.Set;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// 스택 LIFO  : 후입선출! 나중에넣은게 먼저빠져나감
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//값을 넣을땐 push (동전넣기)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전꺼내기
		//isEmpty - 스택이비어있는지 물어보고 비었으면 T 안비었으면F
		while(!coinBox.isEmpty()) { //비어있지않으면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());
		}

	}

}
