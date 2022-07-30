package io.github.aleksas.android.simplerpc_bluetooth_client;

import java.util.Collection;

import io.github.aleksas.arduino.simplerpc.Method;

interface SerialListener {
    void onSerialConnect      ();
    void onSerialConnectError (Exception e);
    void onSerialIoError      (Exception e);
    void onMethodsRead(Collection<Method> methods);
}
