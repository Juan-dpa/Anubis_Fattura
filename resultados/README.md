## Resultados

Las peticiones a6.php son lanzadas tras el comando botnet (mandado por a4.php), el cual viene encriptado con el formato que la aplicacion desea (cmd = GetSWSGO). El resultado de las peticiones viene también encriptado. La aplicación de python permite desencriptarlo correctamente. 

Para conseguir que funcione, se ha tenido que forzar la capacidad de lectura de SMS.

adb shell dumpsys package wocwvy.czyxoxmbauu.slsa | grep -A1
  "READ_SMS"
  Resultado: READ_SMS declarado en manifest pero granted=false en
  runtime.

Ejecuté directamente:
  adb shell pm grant wocwvy.czyxoxmbauu.slsa android.permission.READ_SMS
  adb shell pm grant wocwvy.czyxoxmbauu.slsa
  android.permission.RECEIVE_SMS

Por si el virus estaba dormido:

C:\Users\jdelp\AppData\Local\Android\Sdk\platform-tools>adb shell am start -n wocwvy.czyxoxmbauu.slsa/.ncec.bdxyqqt

y fakenet de fondo con la configuración.

PS C:\TFG-LAB\fakenet3.5> .\fakenet.exe -c configs\anubis_sws.ini