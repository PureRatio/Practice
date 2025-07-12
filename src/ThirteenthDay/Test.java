package ThirteenthDay;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("Пользователь 1");
        User u2 = new User("Пользователь 2");
        User u3 = new User("Пользователь 3");

        u1.sendMessage(u2, "Привет");
        u1.sendMessage(u2, "Как у тебя дела?");

        u2.sendMessage(u1, "Привет");
        u2.sendMessage(u1, "Неплохо");
        u2.sendMessage(u1, "А у тебя?");

        u3.sendMessage(u1, "Привет");
        u3.sendMessage(u1, "Как у тебя дела?");
        u3.sendMessage(u1, "У меня всё хорошо");

        u1.sendMessage(u3, "Привет");
        u1.sendMessage(u3, "Неплохо");
        u1.sendMessage(u3, "Как погода?");

        u3.sendMessage(u1, "Хорошая погода");

        MessageDatabase.showDialog(u1, u3);
    }
}
