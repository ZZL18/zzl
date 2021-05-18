package zzl;

public class Shuixianhua {
	public static void main(String[] args) {
		for (int i = 100; i <1000 ; i++) {
			int firstNum = i/100;
			int secondNum = i/10%10;
			int thirdNum = i%10;
			if(firstNum*firstNum*firstNum + secondNum*secondNum*secondNum+thirdNum*thirdNum*thirdNum == i){
				System.out.println("水仙花数为：" + i);
			}
		}
	}
}
