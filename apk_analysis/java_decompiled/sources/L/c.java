package L;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4441a;

    /* renamed from: b, reason: collision with root package name */
    public b f4442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4443c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f4443c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f4442b != bVar) {
                this.f4442b = bVar;
                if (this.f4441a) {
                    bVar.g();
                }
            }
        }
    }
}
