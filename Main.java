public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setEmailId("vinodkumar@gmail.com")
                .setUserId("vinod61")
                .setUserName("vinodkumar")
                .build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setEmailId("ashokkumar@gmail.com")
                .setUserName("ashokkumar")
                .setUserId("ashok32")
                .build();

        System.out.println(user2);

    }
}
