---
layout: documentation
title: Extension
---

[&laquo; Back to index](index.html)
# Extension

Table of Contents:

* [UrsPahoMqttClient](#UrsPahoMqttClient)

## UrsPahoMqttClient  {#UrsPahoMqttClient}

Component for UrsPahoMqttClient



### Properties  {#UrsPahoMqttClient-Properties}

{:.properties}

{:id="UrsPahoMqttClient.AutomaticReconnect" .boolean} *AutomaticReconnect*
: Auto Reconnect to MQTT Broker after disconnect?

{:id="UrsPahoMqttClient.Broker" .text} *Broker*
: The IP address or hostname of the server to connect to.

{:id="UrsPahoMqttClient.ClientCertFile" .text} *ClientCertFile*
: The name of the client certificate file.

{:id="UrsPahoMqttClient.ClientID" .text} *ClientID*
: The unique client Id. If this field is blank, a random GUID is used.

{:id="UrsPahoMqttClient.ClientKeyFile" .text} *ClientKeyFile*
: The name of the client key file.

{:id="UrsPahoMqttClient.ClientKeyPassword" .text} *ClientKeyPassword*
: The client key password.

{:id="UrsPahoMqttClient.ClientKeystoreFile" .text} *ClientKeystoreFile*
: The name of the client keystore file.

{:id="UrsPahoMqttClient.ClientKeystorePassword" .text} *ClientKeystorePassword*
: The client keystore password.

{:id="UrsPahoMqttClient.ClientPemFormatted" .boolean} *ClientPemFormatted*
: The client certifacte and key files are PEM formatted.

{:id="UrsPahoMqttClient.ConnectionState" .number .ro .bo} *ConnectionState*
: The connection state:
0: Disconnected. The client is not connected to a broker.
1: Connecting. The client is currently creating a connection to a MQTT broker.
2: Connected. The client is connected to a MQTT broker.
3: Disconnecting. The client is currently disconnecting from the MQTT broker.
4: ConnectionAbortet. The connection could not be established or was interrupted.

{:id="UrsPahoMqttClient.ConnectionTimeout" .number} *ConnectionTimeout*
: Connection timeout [seconds].

{:id="UrsPahoMqttClient.IsConnected" .boolean .ro .bo} *IsConnected*
: true: Client is connected to a MQTT broker.

{:id="UrsPahoMqttClient.IsDisconnected" .boolean .ro .bo} *IsDisconnected*
: true: Client is disconnected from the MQTT broker.

{:id="UrsPahoMqttClient.KeepAlive" .number} *KeepAlive*
: Keep alive interval [seconds].

{:id="UrsPahoMqttClient.LastAction" .text .ro .bo} *LastAction*
: Returns the last Action the error code belongs to.

{:id="UrsPahoMqttClient.LastErrorCode" .number .ro .bo} *LastErrorCode*
: Returns the code of the last error.

{:id="UrsPahoMqttClient.LastErrorMessage" .text .ro .bo} *LastErrorMessage*
: Returns a text message about the last error.

{:id="UrsPahoMqttClient.LastExecptionCause" .text .ro .bo} *LastExecptionCause*
: Provides information on the last exception.

{:id="UrsPahoMqttClient.MaxInflight" .number} *MaxInflight*
: The max inflight limits to how many messages we can send without receiving acknowledgments.
Increase this value in a high traffic environment.

{:id="UrsPahoMqttClient.MaxReconnectDelay" .number} *MaxReconnectDelay*
: Set the maximum time to wait between reconnects [millis].

{:id="UrsPahoMqttClient.Port" .number} *Port*
: The port number of the server to connect to.

{:id="UrsPahoMqttClient.Protocol" .text} *Protocol*
: The protocol to use.

{:id="UrsPahoMqttClient.StateConnected" .number .ro .bo} *StateConnected*
: Constant for connection state 'Connected'.

{:id="UrsPahoMqttClient.StateConnecting" .number .ro .bo} *StateConnecting*
: Constant for connection state 'Connecting'.

{:id="UrsPahoMqttClient.StateConnectionAbortet" .number .ro .bo} *StateConnectionAbortet*
: Constant for connection state 'ConnectionAbortet'.

{:id="UrsPahoMqttClient.StateDisconnected" .number .ro .bo} *StateDisconnected*
: Constant for connection state 'Disconnected'.

{:id="UrsPahoMqttClient.StateDisconnecting" .number .ro .bo} *StateDisconnecting*
: Constant for connection state 'Disconnecting'.

{:id="UrsPahoMqttClient.TimeToWait" .number} *TimeToWait*
: Maximum time to wait for an action to complete [seconds].
-1 means the action will not timeout.

{:id="UrsPahoMqttClient.TrustedCertFile" .text} *TrustedCertFile*
: The name of the trusted certificate file.

{:id="UrsPahoMqttClient.TruststoreFile" .text} *TruststoreFile*
: The name of the truststore file.

{:id="UrsPahoMqttClient.TruststorePassword" .text} *TruststorePassword*
: The password of the truststore file.

{:id="UrsPahoMqttClient.UserName" .text} *UserName*
: The user name used authentication and authorization.

{:id="UrsPahoMqttClient.UserPassword" .text} *UserPassword*
: The password used authentication and authorization.

### Events  {#UrsPahoMqttClient-Events}

{:.events}

{:id="UrsPahoMqttClient.ConnectionStateChanged"} ConnectionStateChanged(*NewState*{:.number},*StateString*{:.text})
: Connection state has changed.

{:id="UrsPahoMqttClient.ErrorOccurred"} ErrorOccurred(*ActionName*{:.text},*ErrorCode*{:.number},*ErrorMessage*{:.text})
: Error occurred.

{:id="UrsPahoMqttClient.MessageReceived"} MessageReceived(*Topic*{:.text},*Payload*{:.text},*Message*{:.text},*RetainFlag*{:.boolean},*DupFlag*{:.boolean})
: Message received.

{:id="UrsPahoMqttClient.PublishedByteArrayReceived"} PublishedByteArrayReceived(*Topic*{:.text},*ByteArray*{:.any},*RetainFlag*{:.boolean},*DupFlag*{:.boolean})
: Message with byte array received.

### Methods  {#UrsPahoMqttClient-Methods}

{:.methods}

{:id="UrsPahoMqttClient.Connect" class="method"} <i/> Connect(*CleanSession*{:.boolean})
: Connect to a MQTT broker.

{:id="UrsPahoMqttClient.ConnectWithLastWill" class="method"} <i/> ConnectWithLastWill(*CleanSession*{:.boolean},*Topic*{:.text},*Message*{:.text},*Retain*{:.boolean},*QoS*{:.number})
: Connect to a MQTT broker.

{:id="UrsPahoMqttClient.Disconnect" class="method"} <i/> Disconnect()
: Disconnects from the broker.

{:id="UrsPahoMqttClient.FromDictionary" class="method"} <i/> FromDictionary(*dict*{:.dictionary})
: Export conection parameters to a dictionary.

{:id="UrsPahoMqttClient.IsNull" class="method returns boolean"} <i/> IsNull(*Object*{:.any})
: Test whether an object is null.

{:id="UrsPahoMqttClient.Publish" class="method"} <i/> Publish(*Topic*{:.text},*Message*{:.text})
: Publish a MQTT message. Retain flag is false, QoS is 0.

{:id="UrsPahoMqttClient.PublishBinary" class="method"} <i/> PublishBinary(*Topic*{:.text},*BinaryMessage*{:.text},*RetainFlag*{:.boolean},*QoS*{:.number})
: Publishes a binary coded MQTT message.

{:id="UrsPahoMqttClient.PublishByteArray" class="method"} <i/> PublishByteArray(*Topic*{:.text},*ByteArray*{:.any},*RetainFlag*{:.boolean},*QoS*{:.number})
: Publishes a binary array.

{:id="UrsPahoMqttClient.PublishEx" class="method"} <i/> PublishEx(*Topic*{:.text},*Message*{:.text},*RetainFlag*{:.boolean},*QoS*{:.number})
: Publish a MQTT message.

{:id="UrsPahoMqttClient.Subscribe" class="method"} <i/> Subscribe(*Topic*{:.text},*QoS*{:.number})
: Subscribe a topic.

{:id="UrsPahoMqttClient.SubscribeByteArray" class="method"} <i/> SubscribeByteArray(*Topic*{:.text},*QoS*{:.number})
: Subscribe a topic for receiving byte arrays.

{:id="UrsPahoMqttClient.ToDictionary" class="method returns dictionary"} <i/> ToDictionary()
: Export conection parameters to a dictionary.

{:id="UrsPahoMqttClient.Unsubscribe" class="method"} <i/> Unsubscribe(*Topic*{:.text})
: Unsubscribe a topic.
