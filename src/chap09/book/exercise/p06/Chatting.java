package chap09.book.exercise.p06;

public class Chatting {
	
	void startChat(String chatId) {
		
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}  //nickName은 중첩 클래스 안에서 사용되기 때문에 final 특성을 갖게 됨
		};//null로 정의된 nickName을 다시 chatId로 정의해서 final 특성을 갖는 nickName 보고 에러발생
		chat.start();
	}
	
	class Chat {
		void start() {
			
		}
		void sendMessage(String message) {
			
		}
	}
}
