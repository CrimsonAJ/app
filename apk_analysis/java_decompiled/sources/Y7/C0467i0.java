package Y7;

import java.util.concurrent.CancellationException;

/* renamed from: Y7.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467i0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient r0 f8818a;

    public C0467i0(String str, Throwable th, r0 r0Var) {
        super(str);
        this.f8818a = r0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0467i0) {
                C0467i0 c0467i0 = (C0467i0) obj;
                if (!kotlin.jvm.internal.h.a(c0467i0.getMessage(), getMessage()) || !kotlin.jvm.internal.h.a(c0467i0.f8818a, this.f8818a) || !kotlin.jvm.internal.h.a(c0467i0.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i9;
        String message = getMessage();
        kotlin.jvm.internal.h.b(message);
        int hashCode = (this.f8818a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i9 = cause.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8818a;
    }
}
