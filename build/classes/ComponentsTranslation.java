package com.google.appinventor.client;

import java.util.HashMap;
import java.util.Map;

import static com.google.appinventor.client.Ode.MESSAGES;

public class ComponentsTranslation {
  public static Map<String, String> myMap = map();

  private static String getName(String key) {
    String value = myMap.get(key);
    if (key == null) {
      return "**Missing key in ComponentsTranslations**";
    } else {
      return value;
    }
  }

  public static String getPropertyName(String key) {
    String value = getName("PROPERTY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getPropertyDescription(String key) {
    String value = getName("PROPDESC-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getMethodName(String key) {
    String value = getName("METHOD-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getEventName(String key) {
    String value = getName("EVENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentName(String key) {
    String value = getName("COMPONENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getCategoryName(String key) {
    String value = getName("CATEGORY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentHelpString(String key) {
    String value = getName(key + "-helpString");
    if(value == null) return key;
    return value;
  }
  public static HashMap<String, String> map() {
    HashMap<String, String> map = new HashMap<String, String>();


    /* Descriptions */

    map.put("PROPDESC-AutomaticReconnectPropertyDescriptions", MESSAGES.AutomaticReconnectPropertyDescriptions());
    map.put("PROPDESC-BrokerPropertyDescriptions", MESSAGES.BrokerPropertyDescriptions());
    map.put("PROPDESC-ClientCertFilePropertyDescriptions", MESSAGES.ClientCertFilePropertyDescriptions());
    map.put("PROPDESC-ClientIDPropertyDescriptions", MESSAGES.ClientIDPropertyDescriptions());
    map.put("PROPDESC-ClientKeyFilePropertyDescriptions", MESSAGES.ClientKeyFilePropertyDescriptions());
    map.put("PROPDESC-ClientKeyPasswordPropertyDescriptions", MESSAGES.ClientKeyPasswordPropertyDescriptions());
    map.put("PROPDESC-ClientKeystoreFilePropertyDescriptions", MESSAGES.ClientKeystoreFilePropertyDescriptions());
    map.put("PROPDESC-ClientKeystorePasswordPropertyDescriptions", MESSAGES.ClientKeystorePasswordPropertyDescriptions());
    map.put("PROPDESC-ClientPemFormattedPropertyDescriptions", MESSAGES.ClientPemFormattedPropertyDescriptions());
    map.put("METHODDESC-ConnectMethodDescriptions", MESSAGES.ConnectMethodDescriptions());
    map.put("METHODDESC-ConnectWithLastWillMethodDescriptions", MESSAGES.ConnectWithLastWillMethodDescriptions());
    map.put("EVENTDESC-ConnectionStateChangedEventDescriptions", MESSAGES.ConnectionStateChangedEventDescriptions());
    map.put("PROPDESC-ConnectionStatePropertyDescriptions", MESSAGES.ConnectionStatePropertyDescriptions());
    map.put("PROPDESC-ConnectionTimeoutPropertyDescriptions", MESSAGES.ConnectionTimeoutPropertyDescriptions());
    map.put("METHODDESC-DisconnectMethodDescriptions", MESSAGES.DisconnectMethodDescriptions());
    map.put("EVENTDESC-ErrorOccurredEventDescriptions", MESSAGES.ErrorOccurredEventDescriptions());
    map.put("METHODDESC-FromDictionaryMethodDescriptions", MESSAGES.FromDictionaryMethodDescriptions());
    map.put("PROPDESC-IsConnectedPropertyDescriptions", MESSAGES.IsConnectedPropertyDescriptions());
    map.put("PROPDESC-IsDisconnectedPropertyDescriptions", MESSAGES.IsDisconnectedPropertyDescriptions());
    map.put("METHODDESC-IsNullMethodDescriptions", MESSAGES.IsNullMethodDescriptions());
    map.put("PROPDESC-KeepAlivePropertyDescriptions", MESSAGES.KeepAlivePropertyDescriptions());
    map.put("PROPDESC-LastActionPropertyDescriptions", MESSAGES.LastActionPropertyDescriptions());
    map.put("PROPDESC-LastErrorCodePropertyDescriptions", MESSAGES.LastErrorCodePropertyDescriptions());
    map.put("PROPDESC-LastErrorMessagePropertyDescriptions", MESSAGES.LastErrorMessagePropertyDescriptions());
    map.put("PROPDESC-LastExecptionCausePropertyDescriptions", MESSAGES.LastExecptionCausePropertyDescriptions());
    map.put("PROPDESC-MaxInflightPropertyDescriptions", MESSAGES.MaxInflightPropertyDescriptions());
    map.put("PROPDESC-MaxReconnectDelayPropertyDescriptions", MESSAGES.MaxReconnectDelayPropertyDescriptions());
    map.put("EVENTDESC-MessageReceivedEventDescriptions", MESSAGES.MessageReceivedEventDescriptions());
    map.put("PROPDESC-PortPropertyDescriptions", MESSAGES.PortPropertyDescriptions());
    map.put("PROPDESC-ProtocolPropertyDescriptions", MESSAGES.ProtocolPropertyDescriptions());
    map.put("METHODDESC-PublishBinaryMethodDescriptions", MESSAGES.PublishBinaryMethodDescriptions());
    map.put("METHODDESC-PublishByteArrayMethodDescriptions", MESSAGES.PublishByteArrayMethodDescriptions());
    map.put("METHODDESC-PublishExMethodDescriptions", MESSAGES.PublishExMethodDescriptions());
    map.put("METHODDESC-PublishMethodDescriptions", MESSAGES.PublishMethodDescriptions());
    map.put("EVENTDESC-PublishedByteArrayReceivedEventDescriptions", MESSAGES.PublishedByteArrayReceivedEventDescriptions());
    map.put("PROPDESC-StateConnectedPropertyDescriptions", MESSAGES.StateConnectedPropertyDescriptions());
    map.put("PROPDESC-StateConnectingPropertyDescriptions", MESSAGES.StateConnectingPropertyDescriptions());
    map.put("PROPDESC-StateConnectionAbortetPropertyDescriptions", MESSAGES.StateConnectionAbortetPropertyDescriptions());
    map.put("PROPDESC-StateDisconnectedPropertyDescriptions", MESSAGES.StateDisconnectedPropertyDescriptions());
    map.put("PROPDESC-StateDisconnectingPropertyDescriptions", MESSAGES.StateDisconnectingPropertyDescriptions());
    map.put("METHODDESC-SubscribeByteArrayMethodDescriptions", MESSAGES.SubscribeByteArrayMethodDescriptions());
    map.put("METHODDESC-SubscribeMethodDescriptions", MESSAGES.SubscribeMethodDescriptions());
    map.put("PROPDESC-TimeToWaitPropertyDescriptions", MESSAGES.TimeToWaitPropertyDescriptions());
    map.put("METHODDESC-ToDictionaryMethodDescriptions", MESSAGES.ToDictionaryMethodDescriptions());
    map.put("PROPDESC-TrustedCertFilePropertyDescriptions", MESSAGES.TrustedCertFilePropertyDescriptions());
    map.put("PROPDESC-TruststoreFilePropertyDescriptions", MESSAGES.TruststoreFilePropertyDescriptions());
    map.put("PROPDESC-TruststorePasswordPropertyDescriptions", MESSAGES.TruststorePasswordPropertyDescriptions());
    map.put("METHODDESC-UnsubscribeMethodDescriptions", MESSAGES.UnsubscribeMethodDescriptions());
    map.put("PROPDESC-UserNamePropertyDescriptions", MESSAGES.UserNamePropertyDescriptions());
    map.put("PROPDESC-UserPasswordPropertyDescriptions", MESSAGES.UserPasswordPropertyDescriptions());


    /* Categories */

    map.put("CATEGORY-Extension", MESSAGES.extensionComponentPallette());
  return map;
  }
}
