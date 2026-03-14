package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.C0018c;
import android.support.constraint.p000a.p001a.C0003a;
import android.support.constraint.p000a.p001a.C0004b;
import android.support.constraint.p000a.p001a.C0005c;
import android.support.constraint.p000a.p001a.C0006d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    SparseArray<View> f0a;

    /* JADX INFO: renamed from: b */
    C0005c f1b;

    /* JADX INFO: renamed from: c */
    private final ArrayList<C0004b> f2c;

    /* JADX INFO: renamed from: d */
    private int f3d;

    /* JADX INFO: renamed from: e */
    private int f4e;

    /* JADX INFO: renamed from: f */
    private int f5f;

    /* JADX INFO: renamed from: g */
    private int f6g;

    /* JADX INFO: renamed from: h */
    private boolean f7h;

    /* JADX INFO: renamed from: i */
    private int f8i;

    /* JADX INFO: renamed from: j */
    private C0001a f9j;

    /* JADX INFO: renamed from: android.support.constraint.ConstraintLayout$a */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        int f10A;

        /* JADX INFO: renamed from: B */
        public float f11B;

        /* JADX INFO: renamed from: C */
        public float f12C;

        /* JADX INFO: renamed from: D */
        public int f13D;

        /* JADX INFO: renamed from: E */
        public int f14E;

        /* JADX INFO: renamed from: F */
        public int f15F;

        /* JADX INFO: renamed from: G */
        public int f16G;

        /* JADX INFO: renamed from: H */
        public int f17H;

        /* JADX INFO: renamed from: I */
        public int f18I;

        /* JADX INFO: renamed from: J */
        public int f19J;

        /* JADX INFO: renamed from: K */
        public int f20K;

        /* JADX INFO: renamed from: L */
        public int f21L;

        /* JADX INFO: renamed from: M */
        public int f22M;

        /* JADX INFO: renamed from: N */
        public int f23N;

        /* JADX INFO: renamed from: O */
        boolean f24O;

        /* JADX INFO: renamed from: P */
        boolean f25P;

        /* JADX INFO: renamed from: Q */
        boolean f26Q;

        /* JADX INFO: renamed from: R */
        boolean f27R;

        /* JADX INFO: renamed from: S */
        int f28S;

        /* JADX INFO: renamed from: T */
        int f29T;

        /* JADX INFO: renamed from: U */
        int f30U;

        /* JADX INFO: renamed from: V */
        int f31V;

        /* JADX INFO: renamed from: W */
        int f32W;

        /* JADX INFO: renamed from: X */
        int f33X;

        /* JADX INFO: renamed from: Y */
        float f34Y;

        /* JADX INFO: renamed from: Z */
        C0004b f35Z;

        /* JADX INFO: renamed from: a */
        public int f36a;

        /* JADX INFO: renamed from: b */
        public int f37b;

        /* JADX INFO: renamed from: c */
        public float f38c;

        /* JADX INFO: renamed from: d */
        public int f39d;

        /* JADX INFO: renamed from: e */
        public int f40e;

        /* JADX INFO: renamed from: f */
        public int f41f;

        /* JADX INFO: renamed from: g */
        public int f42g;

        /* JADX INFO: renamed from: h */
        public int f43h;

        /* JADX INFO: renamed from: i */
        public int f44i;

        /* JADX INFO: renamed from: j */
        public int f45j;

        /* JADX INFO: renamed from: k */
        public int f46k;

        /* JADX INFO: renamed from: l */
        public int f47l;

        /* JADX INFO: renamed from: m */
        public int f48m;

        /* JADX INFO: renamed from: n */
        public int f49n;

        /* JADX INFO: renamed from: o */
        public int f50o;

        /* JADX INFO: renamed from: p */
        public int f51p;

        /* JADX INFO: renamed from: q */
        public int f52q;

        /* JADX INFO: renamed from: r */
        public int f53r;

        /* JADX INFO: renamed from: s */
        public int f54s;

        /* JADX INFO: renamed from: t */
        public int f55t;

        /* JADX INFO: renamed from: u */
        public int f56u;

        /* JADX INFO: renamed from: v */
        public int f57v;

        /* JADX INFO: renamed from: w */
        public float f58w;

        /* JADX INFO: renamed from: x */
        public float f59x;

        /* JADX INFO: renamed from: y */
        public String f60y;

        /* JADX INFO: renamed from: z */
        float f61z;

        public C0000a(int i, int i2) {
            super(i, i2);
            this.f36a = -1;
            this.f37b = -1;
            this.f38c = -1.0f;
            this.f39d = -1;
            this.f40e = -1;
            this.f41f = -1;
            this.f42g = -1;
            this.f43h = -1;
            this.f44i = -1;
            this.f45j = -1;
            this.f46k = -1;
            this.f47l = -1;
            this.f48m = -1;
            this.f49n = -1;
            this.f50o = -1;
            this.f51p = -1;
            this.f52q = -1;
            this.f53r = -1;
            this.f54s = -1;
            this.f55t = -1;
            this.f56u = -1;
            this.f57v = -1;
            this.f58w = 0.5f;
            this.f59x = 0.5f;
            this.f60y = null;
            this.f61z = 0.0f;
            this.f10A = 1;
            this.f11B = 0.0f;
            this.f12C = 0.0f;
            this.f13D = 0;
            this.f14E = 0;
            this.f15F = 0;
            this.f16G = 0;
            this.f17H = 0;
            this.f18I = 0;
            this.f19J = 0;
            this.f20K = 0;
            this.f21L = -1;
            this.f22M = -1;
            this.f23N = -1;
            this.f24O = true;
            this.f25P = true;
            this.f26Q = false;
            this.f27R = false;
            this.f28S = -1;
            this.f29T = -1;
            this.f30U = -1;
            this.f31V = -1;
            this.f32W = -1;
            this.f33X = -1;
            this.f34Y = 0.5f;
            this.f35Z = new C0004b();
        }

        public C0000a(Context context, AttributeSet attributeSet) {
            int i;
            float fAbs;
            super(context, attributeSet);
            this.f36a = -1;
            this.f37b = -1;
            this.f38c = -1.0f;
            this.f39d = -1;
            this.f40e = -1;
            this.f41f = -1;
            this.f42g = -1;
            this.f43h = -1;
            this.f44i = -1;
            this.f45j = -1;
            this.f46k = -1;
            this.f47l = -1;
            this.f48m = -1;
            this.f49n = -1;
            this.f50o = -1;
            this.f51p = -1;
            this.f52q = -1;
            this.f53r = -1;
            this.f54s = -1;
            this.f55t = -1;
            this.f56u = -1;
            this.f57v = -1;
            this.f58w = 0.5f;
            this.f59x = 0.5f;
            this.f60y = null;
            this.f61z = 0.0f;
            this.f10A = 1;
            this.f11B = 0.0f;
            this.f12C = 0.0f;
            this.f13D = 0;
            this.f14E = 0;
            this.f15F = 0;
            this.f16G = 0;
            this.f17H = 0;
            this.f18I = 0;
            this.f19J = 0;
            this.f20K = 0;
            this.f21L = -1;
            this.f22M = -1;
            this.f23N = -1;
            this.f24O = true;
            this.f25P = true;
            this.f26Q = false;
            this.f27R = false;
            this.f28S = -1;
            this.f29T = -1;
            this.f30U = -1;
            this.f31V = -1;
            this.f32W = -1;
            this.f33X = -1;
            this.f34Y = 0.5f;
            this.f35Z = new C0004b();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0018c.a.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.f39d = typedArrayObtainStyledAttributes.getResourceId(index, this.f39d);
                    if (this.f39d == -1) {
                        this.f39d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.f40e = typedArrayObtainStyledAttributes.getResourceId(index, this.f40e);
                    if (this.f40e == -1) {
                        this.f40e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.f41f = typedArrayObtainStyledAttributes.getResourceId(index, this.f41f);
                    if (this.f41f == -1) {
                        this.f41f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.f42g = typedArrayObtainStyledAttributes.getResourceId(index, this.f42g);
                    if (this.f42g == -1) {
                        this.f42g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.f43h = typedArrayObtainStyledAttributes.getResourceId(index, this.f43h);
                    if (this.f43h == -1) {
                        this.f43h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.f44i = typedArrayObtainStyledAttributes.getResourceId(index, this.f44i);
                    if (this.f44i == -1) {
                        this.f44i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.f45j = typedArrayObtainStyledAttributes.getResourceId(index, this.f45j);
                    if (this.f45j == -1) {
                        this.f45j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.f46k = typedArrayObtainStyledAttributes.getResourceId(index, this.f46k);
                    if (this.f46k == -1) {
                        this.f46k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.f47l = typedArrayObtainStyledAttributes.getResourceId(index, this.f47l);
                    if (this.f47l == -1) {
                        this.f47l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.f21L = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f21L);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.f22M = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22M);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.f36a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f36a);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.f37b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f37b);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.f38c = typedArrayObtainStyledAttributes.getFloat(index, this.f38c);
                } else if (index == C0018c.a.ConstraintLayout_Layout_android_orientation) {
                    this.f23N = typedArrayObtainStyledAttributes.getInt(index, this.f23N);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.f48m = typedArrayObtainStyledAttributes.getResourceId(index, this.f48m);
                    if (this.f48m == -1) {
                        this.f48m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.f49n = typedArrayObtainStyledAttributes.getResourceId(index, this.f49n);
                    if (this.f49n == -1) {
                        this.f49n = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.f50o = typedArrayObtainStyledAttributes.getResourceId(index, this.f50o);
                    if (this.f50o == -1) {
                        this.f50o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.f51p = typedArrayObtainStyledAttributes.getResourceId(index, this.f51p);
                    if (this.f51p == -1) {
                        this.f51p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_goneMarginLeft) {
                    this.f52q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f52q);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_goneMarginTop) {
                    this.f53r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53r);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_goneMarginRight) {
                    this.f54s = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f54s);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_goneMarginBottom) {
                    this.f55t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f55t);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_goneMarginStart) {
                    this.f56u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f56u);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_goneMarginEnd) {
                    this.f57v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f57v);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.f58w = typedArrayObtainStyledAttributes.getFloat(index, this.f58w);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.f59x = typedArrayObtainStyledAttributes.getFloat(index, this.f59x);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    this.f60y = typedArrayObtainStyledAttributes.getString(index);
                    this.f61z = Float.NaN;
                    this.f10A = -1;
                    if (this.f60y != null) {
                        int length = this.f60y.length();
                        int iIndexOf = this.f60y.indexOf(44);
                        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                            i = 0;
                        } else {
                            String strSubstring = this.f60y.substring(0, iIndexOf);
                            if (strSubstring.equalsIgnoreCase("W")) {
                                this.f10A = 0;
                            } else if (strSubstring.equalsIgnoreCase("H")) {
                                this.f10A = 1;
                            }
                            i = iIndexOf + 1;
                        }
                        int iIndexOf2 = this.f60y.indexOf(58);
                        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                            String strSubstring2 = this.f60y.substring(i);
                            if (strSubstring2.length() > 0) {
                                fAbs = Float.parseFloat(strSubstring2);
                                this.f61z = fAbs;
                            }
                        } else {
                            String strSubstring3 = this.f60y.substring(i, iIndexOf2);
                            String strSubstring4 = this.f60y.substring(iIndexOf2 + 1);
                            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                try {
                                    float f = Float.parseFloat(strSubstring3);
                                    float f2 = Float.parseFloat(strSubstring4);
                                    if (f > 0.0f && f2 > 0.0f) {
                                        fAbs = this.f10A == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                                        this.f61z = fAbs;
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                    this.f11B = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                    this.f12C = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                    this.f13D = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                    this.f14E = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintWidth_default) {
                    this.f15F = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintHeight_default) {
                    this.f16G = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintWidth_min) {
                    this.f17H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f17H);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintWidth_max) {
                    this.f19J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19J);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintHeight_min) {
                    this.f18I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f18I);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_constraintHeight_max) {
                    this.f20K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20K);
                } else if (index != C0018c.a.ConstraintLayout_Layout_layout_constraintLeft_creator && index != C0018c.a.ConstraintLayout_Layout_layout_constraintTop_creator && index != C0018c.a.ConstraintLayout_Layout_layout_constraintRight_creator && index != C0018c.a.ConstraintLayout_Layout_layout_constraintBottom_creator) {
                    int i3 = C0018c.a.ConstraintLayout_Layout_layout_constraintBaseline_creator;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m10a();
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36a = -1;
            this.f37b = -1;
            this.f38c = -1.0f;
            this.f39d = -1;
            this.f40e = -1;
            this.f41f = -1;
            this.f42g = -1;
            this.f43h = -1;
            this.f44i = -1;
            this.f45j = -1;
            this.f46k = -1;
            this.f47l = -1;
            this.f48m = -1;
            this.f49n = -1;
            this.f50o = -1;
            this.f51p = -1;
            this.f52q = -1;
            this.f53r = -1;
            this.f54s = -1;
            this.f55t = -1;
            this.f56u = -1;
            this.f57v = -1;
            this.f58w = 0.5f;
            this.f59x = 0.5f;
            this.f60y = null;
            this.f61z = 0.0f;
            this.f10A = 1;
            this.f11B = 0.0f;
            this.f12C = 0.0f;
            this.f13D = 0;
            this.f14E = 0;
            this.f15F = 0;
            this.f16G = 0;
            this.f17H = 0;
            this.f18I = 0;
            this.f19J = 0;
            this.f20K = 0;
            this.f21L = -1;
            this.f22M = -1;
            this.f23N = -1;
            this.f24O = true;
            this.f25P = true;
            this.f26Q = false;
            this.f27R = false;
            this.f28S = -1;
            this.f29T = -1;
            this.f30U = -1;
            this.f31V = -1;
            this.f32W = -1;
            this.f33X = -1;
            this.f34Y = 0.5f;
            this.f35Z = new C0004b();
        }

        /* JADX INFO: renamed from: a */
        public void m10a() {
            this.f27R = false;
            this.f24O = true;
            this.f25P = true;
            if (this.width == 0 || this.width == -1) {
                this.f24O = false;
            }
            if (this.height == 0 || this.height == -1) {
                this.f25P = false;
            }
            if (this.f38c == -1.0f && this.f36a == -1 && this.f37b == -1) {
                return;
            }
            this.f27R = true;
            this.f24O = true;
            this.f25P = true;
            if (!(this.f35Z instanceof C0006d)) {
                this.f35Z = new C0006d();
            }
            ((C0006d) this.f35Z).m135m(this.f23N);
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            super.resolveLayoutDirection(i);
            this.f30U = -1;
            this.f31V = -1;
            this.f28S = -1;
            this.f29T = -1;
            this.f32W = -1;
            this.f33X = -1;
            this.f32W = this.f52q;
            this.f33X = this.f54s;
            this.f34Y = this.f58w;
            if (1 == getLayoutDirection()) {
                if (this.f48m != -1) {
                    this.f30U = this.f48m;
                } else if (this.f49n != -1) {
                    this.f31V = this.f49n;
                }
                if (this.f50o != -1) {
                    this.f29T = this.f50o;
                }
                if (this.f51p != -1) {
                    this.f28S = this.f51p;
                }
                if (this.f56u != -1) {
                    this.f33X = this.f56u;
                }
                if (this.f57v != -1) {
                    this.f32W = this.f57v;
                }
                this.f34Y = 1.0f - this.f58w;
            } else {
                if (this.f48m != -1) {
                    this.f29T = this.f48m;
                }
                if (this.f49n != -1) {
                    this.f28S = this.f49n;
                }
                if (this.f50o != -1) {
                    this.f30U = this.f50o;
                }
                if (this.f51p != -1) {
                    this.f31V = this.f51p;
                }
                if (this.f56u != -1) {
                    this.f32W = this.f56u;
                }
                if (this.f57v != -1) {
                    this.f33X = this.f57v;
                }
            }
            if (this.f50o == -1 && this.f51p == -1) {
                if (this.f41f != -1) {
                    this.f30U = this.f41f;
                } else if (this.f42g != -1) {
                    this.f31V = this.f42g;
                }
            }
            if (this.f49n == -1 && this.f48m == -1) {
                if (this.f39d != -1) {
                    this.f28S = this.f39d;
                } else if (this.f40e != -1) {
                    this.f29T = this.f40e;
                }
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f0a = new SparseArray<>();
        this.f2c = new ArrayList<>(100);
        this.f1b = new C0005c();
        this.f3d = 0;
        this.f4e = 0;
        this.f5f = Integer.MAX_VALUE;
        this.f6g = Integer.MAX_VALUE;
        this.f7h = true;
        this.f8i = 2;
        this.f9j = null;
        m4b(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0a = new SparseArray<>();
        this.f2c = new ArrayList<>(100);
        this.f1b = new C0005c();
        this.f3d = 0;
        this.f4e = 0;
        this.f5f = Integer.MAX_VALUE;
        this.f6g = Integer.MAX_VALUE;
        this.f7h = true;
        this.f8i = 2;
        this.f9j = null;
        m4b(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f0a = new SparseArray<>();
        this.f2c = new ArrayList<>(100);
        this.f1b = new C0005c();
        this.f3d = 0;
        this.f4e = 0;
        this.f5f = Integer.MAX_VALUE;
        this.f6g = Integer.MAX_VALUE;
        this.f7h = true;
        this.f8i = 2;
        this.f9j = null;
        m4b(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private final C0004b m0a(int i) {
        View view;
        if (i != 0 && (view = this.f0a.get(i)) != this) {
            if (view == null) {
                return null;
            }
            return ((C0000a) view.getLayoutParams()).f35Z;
        }
        return this.f1b;
    }

    /* JADX INFO: renamed from: a */
    private final C0004b m1a(View view) {
        if (view == this) {
            return this.f1b;
        }
        if (view == null) {
            return null;
        }
        return ((C0000a) view.getLayoutParams()).f35Z;
    }

    /* JADX INFO: renamed from: a */
    private void m2a(int i, int i2) {
        boolean z;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0000a c0000a = (C0000a) childAt.getLayoutParams();
                C0004b c0004b = c0000a.f35Z;
                if (!c0000a.f27R) {
                    int measuredWidth = c0000a.width;
                    int measuredHeight = c0000a.height;
                    boolean z2 = true;
                    if (c0000a.f24O || c0000a.f25P || (!c0000a.f24O && c0000a.f15F == 1) || c0000a.width == -1 || (!c0000a.f25P && (c0000a.f16G == 1 || c0000a.height == -1))) {
                        if (measuredWidth == 0 || measuredWidth == -1) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -2);
                            z = true;
                        } else {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, measuredWidth);
                            z = false;
                        }
                        if (measuredHeight == 0 || measuredHeight == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -2);
                        } else {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, measuredHeight);
                            z2 = false;
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    c0004b.m80d(measuredWidth);
                    c0004b.m83e(measuredHeight);
                    if (z) {
                        c0004b.m89h(measuredWidth);
                    }
                    if (z2) {
                        c0004b.m91i(measuredHeight);
                    }
                    if (c0000a.f26Q && (baseline = childAt.getBaseline()) != -1) {
                        c0004b.m93j(baseline);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3b(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0004b.a aVar = C0004b.a.FIXED;
        C0004b.a aVar2 = C0004b.a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                aVar = C0004b.a.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                size = Math.min(this.f5f, size) - paddingLeft;
            }
            size = 0;
        } else {
            aVar = C0004b.a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                aVar2 = C0004b.a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f6g, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            aVar2 = C0004b.a.WRAP_CONTENT;
        }
        this.f1b.m85f(0);
        this.f1b.m87g(0);
        this.f1b.m61a(aVar);
        this.f1b.m80d(size);
        this.f1b.m71b(aVar2);
        this.f1b.m83e(size2);
        this.f1b.m85f((this.f3d - getPaddingLeft()) - getPaddingRight());
        this.f1b.m87g((this.f4e - getPaddingTop()) - getPaddingBottom());
    }

    /* JADX INFO: renamed from: b */
    private void m4b(AttributeSet attributeSet) {
        this.f1b.m65a(this);
        this.f0a.put(getId(), this);
        this.f9j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0018c.a.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C0018c.a.ConstraintLayout_Layout_android_minWidth) {
                    this.f3d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3d);
                } else if (index == C0018c.a.ConstraintLayout_Layout_android_minHeight) {
                    this.f4e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4e);
                } else if (index == C0018c.a.ConstraintLayout_Layout_android_maxWidth) {
                    this.f5f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5f);
                } else if (index == C0018c.a.ConstraintLayout_Layout_android_maxHeight) {
                    this.f6g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6g);
                } else if (index == C0018c.a.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f8i = typedArrayObtainStyledAttributes.getInt(index, this.f8i);
                } else if (index == C0018c.a.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    this.f9j = new C0001a();
                    this.f9j.m14a(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1b.m129m(this.f8i);
    }

    /* JADX INFO: renamed from: c */
    private void m5c() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f2c.clear();
            m6d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6d() {
        float f;
        C0004b c0004bM0a;
        C0003a.c cVar;
        C0003a.c cVar2;
        int i;
        C0004b c0004b;
        C0004b c0004bM0a2;
        C0003a.c cVar3;
        C0003a.c cVar4;
        C0004b c0004bM0a3;
        C0003a.c cVar5;
        C0003a.c cVar6;
        C0004b c0004bM0a4;
        C0003a.c cVar7;
        C0003a.c cVar8;
        int i2;
        if (this.f9j != null) {
            this.f9j.m15a(this);
        }
        int childCount = getChildCount();
        this.f1b.m148I();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0004b c0004bM1a = m1a(childAt);
            if (c0004bM1a != null) {
                C0000a c0000a = (C0000a) childAt.getLayoutParams();
                c0004bM1a.mo54a();
                c0004bM1a.m56a(childAt.getVisibility());
                c0004bM1a.m65a(childAt);
                this.f1b.m149b(c0004bM1a);
                if (!c0000a.f25P || !c0000a.f24O) {
                    this.f2c.add(c0004bM1a);
                }
                if (c0000a.f27R) {
                    C0006d c0006d = (C0006d) c0004bM1a;
                    if (c0000a.f36a != -1) {
                        c0006d.m136n(c0000a.f36a);
                    }
                    if (c0000a.f37b != -1) {
                        c0006d.m137o(c0000a.f37b);
                    }
                    if (c0000a.f38c != -1.0f) {
                        c0006d.m134e(c0000a.f38c);
                    }
                } else if (c0000a.f28S != -1 || c0000a.f29T != -1 || c0000a.f30U != -1 || c0000a.f31V != -1 || c0000a.f43h != -1 || c0000a.f44i != -1 || c0000a.f45j != -1 || c0000a.f46k != -1 || c0000a.f47l != -1 || c0000a.f21L != -1 || c0000a.f22M != -1 || c0000a.width == -1 || c0000a.height == -1) {
                    int i4 = c0000a.f28S;
                    int i5 = c0000a.f29T;
                    int i6 = c0000a.f30U;
                    int i7 = c0000a.f31V;
                    int i8 = c0000a.f32W;
                    int i9 = c0000a.f33X;
                    float f2 = c0000a.f34Y;
                    if (Build.VERSION.SDK_INT < 17) {
                        i4 = c0000a.f39d;
                        i5 = c0000a.f40e;
                        i6 = c0000a.f41f;
                        i7 = c0000a.f42g;
                        i8 = c0000a.f52q;
                        i9 = c0000a.f54s;
                        f2 = c0000a.f58w;
                        if (i4 == -1 && i5 == -1) {
                            if (c0000a.f49n != -1) {
                                i4 = c0000a.f49n;
                            } else if (c0000a.f48m != -1) {
                                i5 = c0000a.f48m;
                            }
                        }
                        if (i6 == -1 && i7 == -1) {
                            if (c0000a.f50o != -1) {
                                i6 = c0000a.f50o;
                            } else if (c0000a.f51p != -1) {
                                i7 = c0000a.f51p;
                            }
                        }
                    }
                    int i10 = i6;
                    int i11 = i7;
                    int i12 = i9;
                    float f3 = f2;
                    int i13 = i8;
                    if (i4 != -1) {
                        c0004bM0a = m0a(i4);
                        if (c0004bM0a != null) {
                            cVar = C0003a.c.LEFT;
                            cVar2 = C0003a.c.LEFT;
                            c0004b = c0004bM1a;
                            f = f3;
                            i = c0000a.leftMargin;
                            c0004b.m60a(cVar, c0004bM0a, cVar2, i, i13);
                            if (i10 != -1) {
                                c0004bM0a2 = m0a(i10);
                                if (c0004bM0a2 != null) {
                                    cVar3 = C0003a.c.RIGHT;
                                    cVar4 = C0003a.c.LEFT;
                                    c0004bM1a.m60a(cVar3, c0004bM0a2, cVar4, c0000a.rightMargin, i12);
                                }
                                if (c0000a.f43h == -1) {
                                    c0004bM0a3 = m0a(c0000a.f43h);
                                    if (c0004bM0a3 != null) {
                                        cVar5 = C0003a.c.TOP;
                                        cVar6 = C0003a.c.TOP;
                                        c0004bM1a.m60a(cVar5, c0004bM0a3, cVar6, c0000a.topMargin, c0000a.f53r);
                                    }
                                    if (c0000a.f45j == -1) {
                                        c0004bM0a4 = m0a(c0000a.f45j);
                                        if (c0004bM0a4 != null) {
                                            cVar7 = C0003a.c.BOTTOM;
                                            cVar8 = C0003a.c.TOP;
                                            c0004bM1a.m60a(cVar7, c0004bM0a4, cVar8, c0000a.bottomMargin, c0000a.f55t);
                                        }
                                        if (c0000a.f47l != -1) {
                                            View view = this.f0a.get(c0000a.f47l);
                                            C0004b c0004bM0a5 = m0a(c0000a.f47l);
                                            if (c0004bM0a5 != null && view != null && (view.getLayoutParams() instanceof C0000a)) {
                                                C0000a c0000a2 = (C0000a) view.getLayoutParams();
                                                c0000a.f26Q = true;
                                                c0000a2.f26Q = true;
                                                c0004bM1a.mo53a(C0003a.c.BASELINE).m37a(c0004bM0a5.mo53a(C0003a.c.BASELINE), 0, -1, C0003a.b.STRONG, 0, true);
                                                c0004bM1a.mo53a(C0003a.c.TOP).m46i();
                                                c0004bM1a.mo53a(C0003a.c.BOTTOM).m46i();
                                            }
                                        }
                                        if (f >= 0.0f && f != 0.5f) {
                                            c0004bM1a.m55a(f);
                                        }
                                        if (c0000a.f59x >= 0.0f && c0000a.f59x != 0.5f) {
                                            c0004bM1a.m67b(c0000a.f59x);
                                        }
                                        if (isInEditMode() && (c0000a.f21L != -1 || c0000a.f22M != -1)) {
                                            c0004bM1a.m57a(c0000a.f21L, c0000a.f22M);
                                        }
                                        if (!c0000a.f24O) {
                                            c0004bM1a.m61a(C0004b.a.FIXED);
                                            i2 = c0000a.width;
                                        } else if (c0000a.width == -1) {
                                            c0004bM1a.m61a(C0004b.a.MATCH_PARENT);
                                            c0004bM1a.mo53a(C0003a.c.LEFT).f140d = c0000a.leftMargin;
                                            c0004bM1a.mo53a(C0003a.c.RIGHT).f140d = c0000a.rightMargin;
                                            if (c0000a.f25P) {
                                                c0004bM1a.m71b(C0004b.a.FIXED);
                                                c0004bM1a.m83e(c0000a.height);
                                            } else if (c0000a.height == -1) {
                                                c0004bM1a.m71b(C0004b.a.MATCH_PARENT);
                                                c0004bM1a.mo53a(C0003a.c.TOP).f140d = c0000a.topMargin;
                                                c0004bM1a.mo53a(C0003a.c.BOTTOM).f140d = c0000a.bottomMargin;
                                            } else {
                                                c0004bM1a.m71b(C0004b.a.MATCH_CONSTRAINT);
                                                c0004bM1a.m83e(0);
                                            }
                                            if (c0000a.f60y != null) {
                                                c0004bM1a.m66a(c0000a.f60y);
                                            }
                                            c0004bM1a.m75c(c0000a.f11B);
                                            c0004bM1a.m79d(c0000a.f12C);
                                            c0004bM1a.m95k(c0000a.f13D);
                                            c0004bM1a.m97l(c0000a.f14E);
                                            c0004bM1a.m58a(c0000a.f15F, c0000a.f17H, c0000a.f19J);
                                            c0004bM1a.m70b(c0000a.f16G, c0000a.f18I, c0000a.f20K);
                                        } else {
                                            c0004bM1a.m61a(C0004b.a.MATCH_CONSTRAINT);
                                            i2 = 0;
                                        }
                                        c0004bM1a.m80d(i2);
                                        if (c0000a.f25P) {
                                        }
                                        if (c0000a.f60y != null) {
                                        }
                                        c0004bM1a.m75c(c0000a.f11B);
                                        c0004bM1a.m79d(c0000a.f12C);
                                        c0004bM1a.m95k(c0000a.f13D);
                                        c0004bM1a.m97l(c0000a.f14E);
                                        c0004bM1a.m58a(c0000a.f15F, c0000a.f17H, c0000a.f19J);
                                        c0004bM1a.m70b(c0000a.f16G, c0000a.f18I, c0000a.f20K);
                                    } else {
                                        if (c0000a.f46k != -1 && (c0004bM0a4 = m0a(c0000a.f46k)) != null) {
                                            cVar7 = C0003a.c.BOTTOM;
                                            cVar8 = C0003a.c.BOTTOM;
                                            c0004bM1a.m60a(cVar7, c0004bM0a4, cVar8, c0000a.bottomMargin, c0000a.f55t);
                                        }
                                        if (c0000a.f47l != -1) {
                                        }
                                        if (f >= 0.0f) {
                                            c0004bM1a.m55a(f);
                                        }
                                        if (c0000a.f59x >= 0.0f) {
                                            c0004bM1a.m67b(c0000a.f59x);
                                        }
                                        if (isInEditMode()) {
                                            c0004bM1a.m57a(c0000a.f21L, c0000a.f22M);
                                        }
                                        if (!c0000a.f24O) {
                                        }
                                        c0004bM1a.m80d(i2);
                                        if (c0000a.f25P) {
                                        }
                                        if (c0000a.f60y != null) {
                                        }
                                        c0004bM1a.m75c(c0000a.f11B);
                                        c0004bM1a.m79d(c0000a.f12C);
                                        c0004bM1a.m95k(c0000a.f13D);
                                        c0004bM1a.m97l(c0000a.f14E);
                                        c0004bM1a.m58a(c0000a.f15F, c0000a.f17H, c0000a.f19J);
                                        c0004bM1a.m70b(c0000a.f16G, c0000a.f18I, c0000a.f20K);
                                    }
                                } else {
                                    if (c0000a.f44i != -1 && (c0004bM0a3 = m0a(c0000a.f44i)) != null) {
                                        cVar5 = C0003a.c.TOP;
                                        cVar6 = C0003a.c.BOTTOM;
                                        c0004bM1a.m60a(cVar5, c0004bM0a3, cVar6, c0000a.topMargin, c0000a.f53r);
                                    }
                                    if (c0000a.f45j == -1) {
                                    }
                                }
                            } else {
                                if (i11 != -1 && (c0004bM0a2 = m0a(i11)) != null) {
                                    cVar3 = C0003a.c.RIGHT;
                                    cVar4 = C0003a.c.RIGHT;
                                    c0004bM1a.m60a(cVar3, c0004bM0a2, cVar4, c0000a.rightMargin, i12);
                                }
                                if (c0000a.f43h == -1) {
                                }
                            }
                        } else {
                            f = f3;
                            if (i10 != -1) {
                            }
                        }
                    } else {
                        f = f3;
                        if (i5 != -1 && (c0004bM0a = m0a(i5)) != null) {
                            cVar = C0003a.c.LEFT;
                            cVar2 = C0003a.c.RIGHT;
                            i = c0000a.leftMargin;
                            c0004b = c0004bM1a;
                            c0004b.m60a(cVar, c0004bM0a, cVar2, i, i13);
                        }
                        if (i10 != -1) {
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0000a generateLayoutParams(AttributeSet attributeSet) {
        return new C0000a(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: a */
    protected void m8a() {
        this.f1b.mo121F();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0000a generateDefaultLayoutParams() {
        return new C0000a(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0000a;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0000a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f6g;
    }

    public int getMaxWidth() {
        return this.f5f;
    }

    public int getMinHeight() {
        return this.f4e;
    }

    public int getMinWidth() {
        return this.f3d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0000a c0000a = (C0000a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || c0000a.f27R || zIsInEditMode) {
                C0004b c0004b = c0000a.f35Z;
                int iM99n = c0004b.m99n();
                int iM100o = c0004b.m100o();
                childAt.layout(iM99n, iM100o, c0004b.m88h() + iM99n, c0004b.m96l() + iM100o);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int i3;
        View view;
        int baseline;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f1b.m68b(paddingLeft);
        this.f1b.m76c(paddingTop);
        m3b(i, i2);
        int i4 = 0;
        if (this.f7h) {
            this.f7h = false;
            m5c();
        }
        m2a(i, i2);
        if (getChildCount() > 0) {
            m8a();
        }
        int size = this.f2c.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size > 0) {
            boolean z = this.f1b.m51B() == C0004b.a.WRAP_CONTENT;
            boolean z2 = this.f1b.m52C() == C0004b.a.WRAP_CONTENT;
            boolean z3 = false;
            iCombineMeasuredStates = 0;
            while (i4 < size) {
                C0004b c0004b = this.f2c.get(i4);
                if ((c0004b instanceof C0006d) || (view = (View) c0004b.m109x()) == null || view.getVisibility() == 8) {
                    i3 = size;
                } else {
                    C0000a c0000a = (C0000a) view.getLayoutParams();
                    i3 = size;
                    view.measure(c0000a.width == -2 ? getChildMeasureSpec(i, paddingRight, c0000a.width) : View.MeasureSpec.makeMeasureSpec(c0004b.m88h(), 1073741824), c0000a.height == -2 ? getChildMeasureSpec(i2, paddingBottom, c0000a.height) : View.MeasureSpec.makeMeasureSpec(c0004b.m96l(), 1073741824));
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth != c0004b.m88h()) {
                        c0004b.m80d(measuredWidth);
                        if (z && c0004b.m105t() > this.f1b.m88h()) {
                            this.f1b.m80d(Math.max(this.f3d, c0004b.m105t() + c0004b.mo53a(C0003a.c.RIGHT).m41d()));
                        }
                        z3 = true;
                    }
                    if (measuredHeight != c0004b.m96l()) {
                        c0004b.m83e(measuredHeight);
                        if (z2 && c0004b.m106u() > this.f1b.m96l()) {
                            this.f1b.m83e(Math.max(this.f4e, c0004b.m106u() + c0004b.mo53a(C0003a.c.BOTTOM).m41d()));
                        }
                        z3 = true;
                    }
                    if (c0000a.f26Q && (baseline = view.getBaseline()) != -1 && baseline != c0004b.m108w()) {
                        c0004b.m93j(baseline);
                        z3 = true;
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    }
                }
                i4++;
                size = i3;
            }
            if (z3) {
                m8a();
            }
        } else {
            iCombineMeasuredStates = 0;
        }
        int iH = this.f1b.m88h() + paddingRight;
        int iL = this.f1b.m96l() + paddingBottom;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(iH, iL);
            return;
        }
        int iResolveSizeAndState = resolveSizeAndState(iH, i, iCombineMeasuredStates);
        int iResolveSizeAndState2 = resolveSizeAndState(iL, i2, iCombineMeasuredStates << 16);
        int iMin = Math.min(this.f5f, iResolveSizeAndState) & 16777215;
        int iMin2 = Math.min(this.f6g, iResolveSizeAndState2) & 16777215;
        if (this.f1b.m119D()) {
            iMin |= 16777216;
        }
        if (this.f1b.m120E()) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0004b c0004bM1a = m1a(view);
        if ((view instanceof C0017b) && !(c0004bM1a instanceof C0006d)) {
            C0000a c0000a = (C0000a) view.getLayoutParams();
            c0000a.f35Z = new C0006d();
            c0000a.f27R = true;
            ((C0006d) c0000a.f35Z).m135m(c0000a.f23N);
            C0004b c0004b = c0000a.f35Z;
        }
        this.f0a.put(view.getId(), view);
        this.f7h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f0a.remove(view.getId());
        this.f1b.m150c(m1a(view));
        this.f7h = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f7h = true;
    }

    public void setConstraintSet(C0001a c0001a) {
        this.f9j = c0001a;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f0a.remove(getId());
        super.setId(i);
        this.f0a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f6g) {
            return;
        }
        this.f6g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f5f) {
            return;
        }
        this.f5f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f4e) {
            return;
        }
        this.f4e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f3d) {
            return;
        }
        this.f3d = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.f1b.m129m(i);
    }
}
