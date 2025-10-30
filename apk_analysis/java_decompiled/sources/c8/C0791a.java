package c8;

import b8.InterfaceC0726f;
import java.util.concurrent.CancellationException;

/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0726f f11746a;

    public C0791a(InterfaceC0726f interfaceC0726f) {
        super("Flow was aborted, no more elements needed");
        this.f11746a = interfaceC0726f;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
