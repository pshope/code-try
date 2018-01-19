package bad.clients;

public interface IntegrationClient<R,S> {
    public S call(R request);
}
