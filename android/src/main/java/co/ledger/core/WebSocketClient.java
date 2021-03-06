// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

package co.ledger.core;

/** A connected client via Web Socket. */
public abstract class WebSocketClient {
    /**
     * Connect to a given URL via a Web Socket connection.
     * @param url, the URL to connect to
     * @connection, the Web Socket connection to use
     */
    public abstract void connect(String url, WebSocketConnection connection);

    /**
     * Send a message to a given client.
     * @connection, the Web Socket connection to use
     * @data, the message to send
     */
    public abstract void send(WebSocketConnection connection, String data);

    /**
     * Disconnect a client.
     * @connection, the Web Socket connection to use
     */
    public abstract void disconnect(WebSocketConnection connection);
}
