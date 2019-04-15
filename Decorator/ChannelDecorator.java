import java.Channel;

class ChannelDecorator implements Channel {
 
    Channel dataString;
    public ChannelDecorator(Channel nextString) { 
    this.dataString = nextString; 
    }

    @Override 
    public Channel sendString() {
    }

    @Override 
    public Channel recvString() {
        return this;
    }

    @Override 
    public void showString() { 
    nextString.showString(); 
    }
}

class LogChannel extends ChannelDecorator {

    public LogChannel(Channel dataString) { 
        super(dataString);
    }
        
    @Override 
    public void showString() { 
        super.showString(); 
        System.out.println("Registrando dados");
    }
}

class ZipChannel extends ChannelDecorator {
    
    public ZipChannel(Channel dataString) { 
        super(dataString); 
    } 
    
    @Override 
    public void showString() { 
        super.showString(); 
        System.out.println("Compactando dados"); 
    }
}

class BufferChannel extends ChannelDecorator {
    
    public BufferChannel(Channel nextString) { 
        super(nextString);
    }
        
     @Override 
    public void showString() { 
        super.showString(); 
        System.out.println("Buffering dados"); 
    }
}