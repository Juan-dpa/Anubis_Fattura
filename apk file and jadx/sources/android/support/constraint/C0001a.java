package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.C0018c;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: android.support.constraint.a */
/* JADX INFO: loaded from: classes.dex */
public class C0001a {

    /* JADX INFO: renamed from: a */
    private static final int[] f62a = {0, 4, 8};

    /* JADX INFO: renamed from: c */
    private static SparseIntArray f63c = new SparseIntArray();

    /* JADX INFO: renamed from: b */
    private HashMap<Integer, a> f64b = new HashMap<>();

    /* JADX INFO: renamed from: android.support.constraint.a$a */
    private static class a {

        /* JADX INFO: renamed from: A */
        public int f65A;

        /* JADX INFO: renamed from: B */
        public int f66B;

        /* JADX INFO: renamed from: C */
        public int f67C;

        /* JADX INFO: renamed from: D */
        public int f68D;

        /* JADX INFO: renamed from: E */
        public int f69E;

        /* JADX INFO: renamed from: F */
        public int f70F;

        /* JADX INFO: renamed from: G */
        public int f71G;

        /* JADX INFO: renamed from: H */
        public int f72H;

        /* JADX INFO: renamed from: I */
        public int f73I;

        /* JADX INFO: renamed from: J */
        public int f74J;

        /* JADX INFO: renamed from: K */
        public int f75K;

        /* JADX INFO: renamed from: L */
        public int f76L;

        /* JADX INFO: renamed from: M */
        public int f77M;

        /* JADX INFO: renamed from: N */
        public float f78N;

        /* JADX INFO: renamed from: O */
        public float f79O;

        /* JADX INFO: renamed from: P */
        public int f80P;

        /* JADX INFO: renamed from: Q */
        public int f81Q;

        /* JADX INFO: renamed from: R */
        public float f82R;

        /* JADX INFO: renamed from: S */
        public boolean f83S;

        /* JADX INFO: renamed from: T */
        public float f84T;

        /* JADX INFO: renamed from: U */
        public float f85U;

        /* JADX INFO: renamed from: V */
        public float f86V;

        /* JADX INFO: renamed from: W */
        public float f87W;

        /* JADX INFO: renamed from: X */
        public float f88X;

        /* JADX INFO: renamed from: Y */
        public float f89Y;

        /* JADX INFO: renamed from: Z */
        public float f90Z;

        /* JADX INFO: renamed from: a */
        boolean f91a;

        /* JADX INFO: renamed from: aa */
        public float f92aa;

        /* JADX INFO: renamed from: ab */
        public float f93ab;

        /* JADX INFO: renamed from: ac */
        public float f94ac;

        /* JADX INFO: renamed from: ad */
        public int f95ad;

        /* JADX INFO: renamed from: ae */
        public int f96ae;

        /* JADX INFO: renamed from: af */
        public int f97af;

        /* JADX INFO: renamed from: ag */
        public int f98ag;

        /* JADX INFO: renamed from: ah */
        public int f99ah;

        /* JADX INFO: renamed from: ai */
        public int f100ai;

        /* JADX INFO: renamed from: b */
        public int f101b;

        /* JADX INFO: renamed from: c */
        public int f102c;

        /* JADX INFO: renamed from: d */
        int f103d;

        /* JADX INFO: renamed from: e */
        public int f104e;

        /* JADX INFO: renamed from: f */
        public int f105f;

        /* JADX INFO: renamed from: g */
        public float f106g;

        /* JADX INFO: renamed from: h */
        public int f107h;

        /* JADX INFO: renamed from: i */
        public int f108i;

        /* JADX INFO: renamed from: j */
        public int f109j;

        /* JADX INFO: renamed from: k */
        public int f110k;

        /* JADX INFO: renamed from: l */
        public int f111l;

        /* JADX INFO: renamed from: m */
        public int f112m;

        /* JADX INFO: renamed from: n */
        public int f113n;

        /* JADX INFO: renamed from: o */
        public int f114o;

        /* JADX INFO: renamed from: p */
        public int f115p;

        /* JADX INFO: renamed from: q */
        public int f116q;

        /* JADX INFO: renamed from: r */
        public int f117r;

        /* JADX INFO: renamed from: s */
        public int f118s;

        /* JADX INFO: renamed from: t */
        public int f119t;

        /* JADX INFO: renamed from: u */
        public float f120u;

        /* JADX INFO: renamed from: v */
        public float f121v;

        /* JADX INFO: renamed from: w */
        public String f122w;

        /* JADX INFO: renamed from: x */
        public int f123x;

        /* JADX INFO: renamed from: y */
        public int f124y;

        /* JADX INFO: renamed from: z */
        public int f125z;

        private a() {
            this.f91a = false;
            this.f104e = -1;
            this.f105f = -1;
            this.f106g = -1.0f;
            this.f107h = -1;
            this.f108i = -1;
            this.f109j = -1;
            this.f110k = -1;
            this.f111l = -1;
            this.f112m = -1;
            this.f113n = -1;
            this.f114o = -1;
            this.f115p = -1;
            this.f116q = -1;
            this.f117r = -1;
            this.f118s = -1;
            this.f119t = -1;
            this.f120u = 0.5f;
            this.f121v = 0.5f;
            this.f122w = null;
            this.f123x = -1;
            this.f124y = -1;
            this.f125z = -1;
            this.f65A = -1;
            this.f66B = -1;
            this.f67C = -1;
            this.f68D = -1;
            this.f69E = -1;
            this.f70F = -1;
            this.f71G = 0;
            this.f72H = -1;
            this.f73I = -1;
            this.f74J = -1;
            this.f75K = -1;
            this.f76L = -1;
            this.f77M = -1;
            this.f78N = 0.0f;
            this.f79O = 0.0f;
            this.f80P = 0;
            this.f81Q = 0;
            this.f82R = 1.0f;
            this.f83S = false;
            this.f84T = 0.0f;
            this.f85U = 0.0f;
            this.f86V = 0.0f;
            this.f87W = 1.0f;
            this.f88X = 1.0f;
            this.f89Y = 0.0f;
            this.f90Z = 0.0f;
            this.f92aa = 0.0f;
            this.f93ab = 0.0f;
            this.f94ac = 0.0f;
            this.f95ad = -1;
            this.f96ae = -1;
            this.f97af = -1;
            this.f98ag = -1;
            this.f99ah = -1;
            this.f100ai = -1;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f91a = this.f91a;
            aVar.f101b = this.f101b;
            aVar.f102c = this.f102c;
            aVar.f104e = this.f104e;
            aVar.f105f = this.f105f;
            aVar.f106g = this.f106g;
            aVar.f107h = this.f107h;
            aVar.f108i = this.f108i;
            aVar.f109j = this.f109j;
            aVar.f110k = this.f110k;
            aVar.f111l = this.f111l;
            aVar.f112m = this.f112m;
            aVar.f113n = this.f113n;
            aVar.f114o = this.f114o;
            aVar.f115p = this.f115p;
            aVar.f116q = this.f116q;
            aVar.f117r = this.f117r;
            aVar.f118s = this.f118s;
            aVar.f119t = this.f119t;
            aVar.f120u = this.f120u;
            aVar.f121v = this.f121v;
            aVar.f122w = this.f122w;
            aVar.f123x = this.f123x;
            aVar.f124y = this.f124y;
            aVar.f120u = this.f120u;
            aVar.f120u = this.f120u;
            aVar.f120u = this.f120u;
            aVar.f120u = this.f120u;
            aVar.f120u = this.f120u;
            aVar.f125z = this.f125z;
            aVar.f65A = this.f65A;
            aVar.f66B = this.f66B;
            aVar.f67C = this.f67C;
            aVar.f68D = this.f68D;
            aVar.f69E = this.f69E;
            aVar.f70F = this.f70F;
            aVar.f71G = this.f71G;
            aVar.f72H = this.f72H;
            aVar.f73I = this.f73I;
            aVar.f74J = this.f74J;
            aVar.f75K = this.f75K;
            aVar.f76L = this.f76L;
            aVar.f77M = this.f77M;
            aVar.f78N = this.f78N;
            aVar.f79O = this.f79O;
            aVar.f80P = this.f80P;
            aVar.f81Q = this.f81Q;
            aVar.f82R = this.f82R;
            aVar.f83S = this.f83S;
            aVar.f84T = this.f84T;
            aVar.f85U = this.f85U;
            aVar.f86V = this.f86V;
            aVar.f87W = this.f87W;
            aVar.f88X = this.f88X;
            aVar.f89Y = this.f89Y;
            aVar.f90Z = this.f90Z;
            aVar.f92aa = this.f92aa;
            aVar.f93ab = this.f93ab;
            aVar.f94ac = this.f94ac;
            aVar.f95ad = this.f95ad;
            aVar.f96ae = this.f96ae;
            aVar.f97af = this.f97af;
            aVar.f98ag = this.f98ag;
            aVar.f99ah = this.f99ah;
            aVar.f100ai = this.f100ai;
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m17a(ConstraintLayout.C0000a c0000a) {
            c0000a.f39d = this.f107h;
            c0000a.f40e = this.f108i;
            c0000a.f41f = this.f109j;
            c0000a.f42g = this.f110k;
            c0000a.f43h = this.f111l;
            c0000a.f44i = this.f112m;
            c0000a.f45j = this.f113n;
            c0000a.f46k = this.f114o;
            c0000a.f47l = this.f115p;
            c0000a.f48m = this.f116q;
            c0000a.f49n = this.f117r;
            c0000a.f50o = this.f118s;
            c0000a.f51p = this.f119t;
            c0000a.leftMargin = this.f65A;
            c0000a.rightMargin = this.f66B;
            c0000a.topMargin = this.f67C;
            c0000a.bottomMargin = this.f68D;
            c0000a.f56u = this.f77M;
            c0000a.f57v = this.f76L;
            c0000a.f58w = this.f120u;
            c0000a.f59x = this.f121v;
            c0000a.f60y = this.f122w;
            c0000a.f21L = this.f123x;
            c0000a.f22M = this.f124y;
            c0000a.f12C = this.f78N;
            c0000a.f11B = this.f79O;
            c0000a.f14E = this.f81Q;
            c0000a.f13D = this.f80P;
            c0000a.f15F = this.f95ad;
            c0000a.f16G = this.f96ae;
            c0000a.f19J = this.f97af;
            c0000a.f20K = this.f98ag;
            c0000a.f17H = this.f99ah;
            c0000a.f18I = this.f100ai;
            c0000a.f23N = this.f125z;
            c0000a.f38c = this.f106g;
            c0000a.f36a = this.f104e;
            c0000a.f37b = this.f105f;
            c0000a.width = this.f101b;
            c0000a.height = this.f102c;
            if (Build.VERSION.SDK_INT >= 17) {
                c0000a.setMarginStart(this.f70F);
                c0000a.setMarginEnd(this.f69E);
            }
            c0000a.m10a();
        }
    }

    static {
        f63c.append(C0018c.a.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f63c.append(C0018c.a.ConstraintSet_layout_editor_absoluteX, 6);
        f63c.append(C0018c.a.ConstraintSet_layout_editor_absoluteY, 7);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintGuide_begin, 17);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintGuide_end, 18);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintGuide_percent, 19);
        f63c.append(C0018c.a.ConstraintSet_android_orientation, 27);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f63c.append(C0018c.a.ConstraintSet_layout_goneMarginLeft, 13);
        f63c.append(C0018c.a.ConstraintSet_layout_goneMarginTop, 16);
        f63c.append(C0018c.a.ConstraintSet_layout_goneMarginRight, 14);
        f63c.append(C0018c.a.ConstraintSet_layout_goneMarginBottom, 11);
        f63c.append(C0018c.a.ConstraintSet_layout_goneMarginStart, 15);
        f63c.append(C0018c.a.ConstraintSet_layout_goneMarginEnd, 12);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintVertical_weight, 40);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintVertical_bias, 37);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintDimensionRatio, 5);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintLeft_creator, 60);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintTop_creator, 60);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintRight_creator, 60);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintBottom_creator, 60);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintBaseline_creator, 60);
        f63c.append(C0018c.a.ConstraintSet_android_layout_marginLeft, 24);
        f63c.append(C0018c.a.ConstraintSet_android_layout_marginRight, 28);
        f63c.append(C0018c.a.ConstraintSet_android_layout_marginStart, 31);
        f63c.append(C0018c.a.ConstraintSet_android_layout_marginEnd, 8);
        f63c.append(C0018c.a.ConstraintSet_android_layout_marginTop, 34);
        f63c.append(C0018c.a.ConstraintSet_android_layout_marginBottom, 2);
        f63c.append(C0018c.a.ConstraintSet_android_layout_width, 23);
        f63c.append(C0018c.a.ConstraintSet_android_layout_height, 21);
        f63c.append(C0018c.a.ConstraintSet_android_visibility, 22);
        f63c.append(C0018c.a.ConstraintSet_android_alpha, 43);
        f63c.append(C0018c.a.ConstraintSet_android_elevation, 44);
        f63c.append(C0018c.a.ConstraintSet_android_rotationX, 45);
        f63c.append(C0018c.a.ConstraintSet_android_rotationY, 46);
        f63c.append(C0018c.a.ConstraintSet_android_scaleX, 47);
        f63c.append(C0018c.a.ConstraintSet_android_scaleY, 48);
        f63c.append(C0018c.a.ConstraintSet_android_transformPivotX, 49);
        f63c.append(C0018c.a.ConstraintSet_android_transformPivotY, 50);
        f63c.append(C0018c.a.ConstraintSet_android_translationX, 51);
        f63c.append(C0018c.a.ConstraintSet_android_translationY, 52);
        f63c.append(C0018c.a.ConstraintSet_android_translationZ, 53);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintWidth_default, 54);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintHeight_default, 55);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintWidth_max, 56);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintHeight_max, 57);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintWidth_min, 58);
        f63c.append(C0018c.a.ConstraintSet_layout_constraintHeight_min, 59);
        f63c.append(C0018c.a.ConstraintSet_android_id, 38);
    }

    /* JADX INFO: renamed from: a */
    private static int m11a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: a */
    private a m12a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0018c.a.ConstraintSet);
        m13a(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m13a(a aVar, TypedArray typedArray) {
        String str;
        StringBuilder sb;
        String str2;
        int i;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = f63c.get(index);
            if (i3 != 60) {
                switch (i3) {
                    case 1:
                        aVar.f115p = m11a(typedArray, index, aVar.f115p);
                        break;
                    case 2:
                        aVar.f68D = typedArray.getDimensionPixelSize(index, aVar.f68D);
                        break;
                    case 3:
                        aVar.f114o = m11a(typedArray, index, aVar.f114o);
                        break;
                    case 4:
                        i = aVar.f113n;
                        aVar.f113n = m11a(typedArray, index, i);
                        break;
                    case 5:
                        aVar.f122w = typedArray.getString(index);
                        break;
                    case 6:
                        aVar.f123x = typedArray.getDimensionPixelOffset(index, aVar.f123x);
                        break;
                    case 7:
                        aVar.f124y = typedArray.getDimensionPixelOffset(index, aVar.f124y);
                        break;
                    case 8:
                        aVar.f69E = typedArray.getDimensionPixelSize(index, aVar.f69E);
                        break;
                    case 9:
                        i = aVar.f119t;
                        aVar.f113n = m11a(typedArray, index, i);
                        break;
                    case 10:
                        aVar.f118s = m11a(typedArray, index, aVar.f118s);
                        break;
                    case 11:
                        aVar.f75K = typedArray.getDimensionPixelSize(index, aVar.f75K);
                        break;
                    case 12:
                        aVar.f76L = typedArray.getDimensionPixelSize(index, aVar.f76L);
                        break;
                    case 13:
                        aVar.f72H = typedArray.getDimensionPixelSize(index, aVar.f72H);
                        break;
                    case 14:
                        aVar.f74J = typedArray.getDimensionPixelSize(index, aVar.f74J);
                        break;
                    case 15:
                        aVar.f77M = typedArray.getDimensionPixelSize(index, aVar.f77M);
                        break;
                    case 16:
                        aVar.f73I = typedArray.getDimensionPixelSize(index, aVar.f73I);
                        break;
                    case 17:
                        aVar.f104e = typedArray.getDimensionPixelOffset(index, aVar.f104e);
                        break;
                    case 18:
                        aVar.f105f = typedArray.getDimensionPixelOffset(index, aVar.f105f);
                        break;
                    case 19:
                        aVar.f106g = typedArray.getFloat(index, aVar.f106g);
                        break;
                    case 20:
                        aVar.f120u = typedArray.getFloat(index, aVar.f120u);
                        break;
                    case 21:
                        aVar.f102c = typedArray.getLayoutDimension(index, aVar.f102c);
                        break;
                    case 22:
                        aVar.f71G = typedArray.getInt(index, aVar.f71G);
                        aVar.f71G = f62a[aVar.f71G];
                        break;
                    case 23:
                        aVar.f101b = typedArray.getLayoutDimension(index, aVar.f101b);
                        break;
                    case 24:
                        aVar.f65A = typedArray.getDimensionPixelSize(index, aVar.f65A);
                        break;
                    case 25:
                        aVar.f107h = m11a(typedArray, index, aVar.f107h);
                        break;
                    case 26:
                        aVar.f108i = m11a(typedArray, index, aVar.f108i);
                        break;
                    case 27:
                        aVar.f125z = typedArray.getInt(index, aVar.f125z);
                        break;
                    case 28:
                        aVar.f66B = typedArray.getDimensionPixelSize(index, aVar.f66B);
                        break;
                    case 29:
                        aVar.f109j = m11a(typedArray, index, aVar.f109j);
                        break;
                    case 30:
                        aVar.f110k = m11a(typedArray, index, aVar.f110k);
                        break;
                    case 31:
                        aVar.f70F = typedArray.getDimensionPixelSize(index, aVar.f70F);
                        break;
                    case 32:
                        aVar.f116q = m11a(typedArray, index, aVar.f116q);
                        break;
                    case 33:
                        aVar.f117r = m11a(typedArray, index, aVar.f117r);
                        break;
                    case 34:
                        aVar.f67C = typedArray.getDimensionPixelSize(index, aVar.f67C);
                        break;
                    case 35:
                        aVar.f112m = m11a(typedArray, index, aVar.f112m);
                        break;
                    case 36:
                        aVar.f111l = m11a(typedArray, index, aVar.f111l);
                        break;
                    case 37:
                        aVar.f121v = typedArray.getFloat(index, aVar.f121v);
                        break;
                    case 38:
                        aVar.f103d = typedArray.getResourceId(index, aVar.f103d);
                        break;
                    case 39:
                        aVar.f79O = typedArray.getFloat(index, aVar.f79O);
                        break;
                    case 40:
                        aVar.f78N = typedArray.getFloat(index, aVar.f78N);
                        break;
                    case 41:
                        aVar.f80P = typedArray.getInt(index, aVar.f80P);
                        break;
                    case 42:
                        aVar.f81Q = typedArray.getInt(index, aVar.f81Q);
                        break;
                    case 43:
                        aVar.f82R = typedArray.getFloat(index, aVar.f82R);
                        break;
                    case 44:
                        aVar.f83S = true;
                        aVar.f84T = typedArray.getFloat(index, aVar.f84T);
                        break;
                    case 45:
                        aVar.f85U = typedArray.getFloat(index, aVar.f85U);
                        break;
                    case 46:
                        aVar.f86V = typedArray.getFloat(index, aVar.f86V);
                        break;
                    case 47:
                        aVar.f87W = typedArray.getFloat(index, aVar.f87W);
                        break;
                    case 48:
                        aVar.f88X = typedArray.getFloat(index, aVar.f88X);
                        break;
                    case 49:
                        aVar.f89Y = typedArray.getFloat(index, aVar.f89Y);
                        break;
                    case 50:
                        aVar.f90Z = typedArray.getFloat(index, aVar.f90Z);
                        break;
                    case 51:
                        aVar.f92aa = typedArray.getFloat(index, aVar.f92aa);
                        break;
                    case 52:
                        aVar.f93ab = typedArray.getFloat(index, aVar.f93ab);
                        break;
                    case 53:
                        aVar.f94ac = typedArray.getFloat(index, aVar.f94ac);
                        break;
                    default:
                        str = "ConstraintSet";
                        sb = new StringBuilder();
                        str2 = "Unknown attribute 0x";
                        break;
                }
            } else {
                str = "ConstraintSet";
                sb = new StringBuilder();
                str2 = "unused attribute 0x";
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f63c.get(index));
            Log.w(str, sb.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14a(Context context, int i) {
        int eventType;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return;
        }
        for (eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType != 0) {
                switch (eventType) {
                    case 2:
                        String name = xml.getName();
                        a aVarM12a = m12a(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            aVarM12a.f91a = true;
                        }
                        this.f64b.put(Integer.valueOf(aVarM12a.f103d), aVarM12a);
                        continue;
                    case 3:
                        continue;
                    default:
                        continue;
                }
                e.printStackTrace();
                return;
            }
            xml.getName();
        }
    }

    /* JADX INFO: renamed from: a */
    void m15a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f64b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.f64b.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                a aVar = this.f64b.get(Integer.valueOf(id));
                ConstraintLayout.C0000a c0000a = (ConstraintLayout.C0000a) childAt.getLayoutParams();
                aVar.m17a(c0000a);
                childAt.setLayoutParams(c0000a);
                childAt.setVisibility(aVar.f71G);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(aVar.f82R);
                    childAt.setRotationX(aVar.f85U);
                    childAt.setRotationY(aVar.f86V);
                    childAt.setScaleX(aVar.f87W);
                    childAt.setScaleY(aVar.f88X);
                    childAt.setPivotX(aVar.f89Y);
                    childAt.setPivotY(aVar.f90Z);
                    childAt.setTranslationX(aVar.f92aa);
                    childAt.setTranslationY(aVar.f93ab);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.f94ac);
                        if (aVar.f83S) {
                            childAt.setElevation(aVar.f84T);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f64b.get(num);
            if (aVar2.f91a) {
                C0017b c0017b = new C0017b(constraintLayout.getContext());
                c0017b.setId(num.intValue());
                ConstraintLayout.C0000a c0000aM9b = constraintLayout.generateDefaultLayoutParams();
                aVar2.m17a(c0000aM9b);
                constraintLayout.addView(c0017b, c0000aM9b);
            }
        }
    }
}
