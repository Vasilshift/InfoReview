package PATTERNS.prototype;
// суть паттерна в создании копии объекта при обращении к нему
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        cache.setClient(new Client());
        Client clientFromCache = cache.getClient();
        System.out.println(clientFromCache);
    }
}

class Client implements Cloneable {
    @Override
    protected Client clone() throws CloneNotSupportedException {
        return (Client) super.clone();
    }
}

class Cache {
    private Client client;

    public Client getClient() throws CloneNotSupportedException {
        System.out.println("Download copy of cachable Client ... ");
        return this.client.clone();
    }

    public void setClient(Client client) {
        System.out.println("creating client ... ");
        this.client = client;
    }
}
