package good;

import bad.clients.IntegrationClient;

public interface Command {
    IntegrationClient create();
}
