const WebSocket = require("ws");

const wss = new WebSocket.Server({ port: 8080 });

const clients = new Set();

wss.on("connection", (ws) => {
    clients.add(ws);
    
    ws.on("message", (message) => {
        // Forward messages to all other clients
        clients.forEach(client => {
            if (client !== ws && client.readyState === WebSocket.OPEN) {
                client.send(message);
            }
        });
    });

    ws.on("close", () => {
        clients.delete(ws);
    });
});

console.log("WebSocket signaling server running on ws://localhost:8080");
