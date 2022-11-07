import com.fasterxml.jackson.annotation.JsonProperty;
public class CatFact {
    private final int id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public CatFact(@JsonProperty("id") int id,
                   @JsonProperty("text") String text,
                   @JsonProperty("type") String type,
                   @JsonProperty("user") String user,
                   @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "CatFacts{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }

}
