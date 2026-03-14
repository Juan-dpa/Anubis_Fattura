package wocwvy.czyxoxmbauu.slsa.oyqwzkyy;

import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b */
/* JADX INFO: loaded from: classes.dex */
public class C0050b {

    /* JADX INFO: renamed from: a */
    C0020b f495a = new C0020b();

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b$a */
    class a extends AsyncTask<String, String, String> {

        /* JADX INFO: renamed from: a */
        String f496a = null;

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setRequestProperty("Content-Length", "" + Integer.toString(str2.getBytes().length));
                    httpURLConnection.getOutputStream().write(str2.getBytes("UTF-8"));
                    int length = str2.length();
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (responseCode == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        byte[] bArr = new byte[length + 3000];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        this.f496a = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                    }
                } catch (MalformedURLException | IOException | Exception unused) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this.f496a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m296a(String str, String str2) {
        C0020b c0020b = new C0020b();
        a aVar = new a();
        aVar.execute(str, str2);
        try {
            return c0020b.m225a(aVar.get(), "<tag>", "</tag>");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m297b(String str, String str2) {
        a aVar = new a();
        aVar.execute(str, str2);
        try {
            return aVar.get();
        } catch (Exception unused) {
            return "";
        }
    }
}
