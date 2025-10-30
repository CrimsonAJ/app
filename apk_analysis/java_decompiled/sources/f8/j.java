package f8;

import Y7.B;
import e1.q;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f17473c;

    public j(Runnable runnable, long j, q qVar) {
        super(j, qVar);
        this.f17473c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17473c.run();
        } finally {
            this.f17472b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f17473c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(B.l(runnable));
        sb.append(", ");
        sb.append(this.f17471a);
        sb.append(", ");
        sb.append(this.f17472b);
        sb.append(']');
        return sb.toString();
    }
}
