package org.freedesktop.dbus;

/**
 * Thrown if a DBus action is called when not connected to the Bus.
 */
@SuppressWarnings("serial")
public class NotConnected extends DBusExecutionException
{
   public NotConnected(String message)
   {
      super (message);
   }
}
