package clase;

public class State {

    private String client;

    public State( String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("State{");
        sb.append(", client='").append(client).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
