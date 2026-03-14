package android.support.constraint.p000a;

/* JADX INFO: renamed from: android.support.constraint.a.f */
/* JADX INFO: loaded from: classes.dex */
final class C0015f {

    /* JADX INFO: renamed from: android.support.constraint.a.f$a */
    interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo204a();

        /* JADX INFO: renamed from: a */
        void mo205a(T[] tArr, int i);

        /* JADX INFO: renamed from: a */
        boolean mo206a(T t);
    }

    /* JADX INFO: renamed from: android.support.constraint.a.f$b */
    static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a */
        private final Object[] f303a;

        /* JADX INFO: renamed from: b */
        private int f304b;

        b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f303a = new Object[i];
        }

        @Override // android.support.constraint.p000a.C0015f.a
        /* JADX INFO: renamed from: a */
        public T mo204a() {
            if (this.f304b <= 0) {
                return null;
            }
            int i = this.f304b - 1;
            T t = (T) this.f303a[i];
            this.f303a[i] = null;
            this.f304b--;
            return t;
        }

        @Override // android.support.constraint.p000a.C0015f.a
        /* JADX INFO: renamed from: a */
        public void mo205a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f304b < this.f303a.length) {
                    this.f303a[this.f304b] = t;
                    this.f304b++;
                }
            }
        }

        @Override // android.support.constraint.p000a.C0015f.a
        /* JADX INFO: renamed from: a */
        public boolean mo206a(T t) {
            if (this.f304b >= this.f303a.length) {
                return false;
            }
            this.f303a[this.f304b] = t;
            this.f304b++;
            return true;
        }
    }
}
