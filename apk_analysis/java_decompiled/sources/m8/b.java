package m8;

import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.firebase.messaging.u;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f20922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20923b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20924c;

    /* renamed from: d, reason: collision with root package name */
    public a f20925d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f20926e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20927f;

    public b(c taskRunner, String name) {
        h.e(taskRunner, "taskRunner");
        h.e(name, "name");
        this.f20922a = taskRunner;
        this.f20923b = name;
        this.f20926e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = k8.c.f20141a;
        synchronized (this.f20922a) {
            if (b()) {
                this.f20922a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f20925d;
        if (aVar != null && aVar.f20919b) {
            this.f20927f = true;
        }
        ArrayList arrayList = this.f20926e;
        boolean z9 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f20919b) {
                a aVar2 = (a) arrayList.get(size);
                if (c.f20929i.isLoggable(Level.FINE)) {
                    AbstractC1002u1.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    public final void c(a task, long j) {
        h.e(task, "task");
        synchronized (this.f20922a) {
            if (this.f20924c) {
                if (task.f20919b) {
                    if (c.f20929i.isLoggable(Level.FINE)) {
                        AbstractC1002u1.a(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    if (c.f20929i.isLoggable(Level.FINE)) {
                        AbstractC1002u1.a(task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (e(task, j, false)) {
                this.f20922a.d(this);
            }
        }
    }

    public final boolean e(a task, long j, boolean z9) {
        String concat;
        h.e(task, "task");
        b bVar = task.f20920c;
        if (bVar != this) {
            if (bVar == null) {
                task.f20920c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues");
            }
        }
        u uVar = this.f20922a.f20930a;
        long nanoTime = System.nanoTime();
        long j4 = nanoTime + j;
        ArrayList arrayList = this.f20926e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f20921d <= j4) {
                if (c.f20929i.isLoggable(Level.FINE)) {
                    AbstractC1002u1.a(task, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f20921d = j4;
        if (c.f20929i.isLoggable(Level.FINE)) {
            if (z9) {
                concat = "run again after ".concat(AbstractC1002u1.B(j4 - nanoTime));
            } else {
                concat = "scheduled after ".concat(AbstractC1002u1.B(j4 - nanoTime));
            }
            AbstractC1002u1.a(task, this, concat);
        }
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((a) obj).f20921d - nanoTime > j) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 == -1) {
            i9 = arrayList.size();
        }
        arrayList.add(i9, task);
        if (i9 != 0) {
            return false;
        }
        return true;
    }

    public final void f() {
        byte[] bArr = k8.c.f20141a;
        synchronized (this.f20922a) {
            this.f20924c = true;
            if (b()) {
                this.f20922a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f20923b;
    }
}
