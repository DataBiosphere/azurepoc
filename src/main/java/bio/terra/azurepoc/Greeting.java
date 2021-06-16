package bio.terra.azurepoc;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String context) {
        this.id = id;
        this.content = context;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
