package mysocketnet.a10test4;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
        String name = UUID.randomUUID().toString().replace("-", "");
        System.out.println(name);
    }
}
