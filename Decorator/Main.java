

public class MainDecorator {
    
    public static void main(String[] args) {
        String str = new String();
        str = "Hello World";
        Channel channel = new ChannelDecorator (new BufferChannel());
        channel.showString();
    }
}