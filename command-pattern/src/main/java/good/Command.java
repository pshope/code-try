package good;

import bad.clients.IntegrationClient;

@FunctionalInterface
public interface Command {
    IntegrationClient create();
}
