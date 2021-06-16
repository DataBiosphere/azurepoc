package bio.terra.azurepoc;

public class Status {
    private final boolean ok;
    private final String content;
    private final long id;

    public Status(Boolean ok, String context, long id) {
        this.ok = ok;
        this.content = context;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public boolean getOk() {
        return ok;
    }

    public String getContent() {
        return content;
    }
}
