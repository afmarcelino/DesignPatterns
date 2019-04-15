

class TCPChannel implements Channel {

    public static void sendTCP(String str) {
        System.out.println(“Enviando "+str+" via TCP”);
    }

    public void recvString(String str) {
        System.out.println(“Recebendo "+str+" via TCP”);
    }
    
   }

class UDPChannel implements Channel {
    
    public static void sendString(String str) {
        System.out.println(“Enviando "+str+" via UDP”);
    }

    public void recvString(String str) {
        System.out.println(“Recebendo "+str+" via UDP”);
    }

   }