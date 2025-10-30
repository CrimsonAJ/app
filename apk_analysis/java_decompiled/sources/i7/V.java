package i7;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f18803a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f18804b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18805c;

    /* renamed from: d, reason: collision with root package name */
    public int f18806d;

    /* renamed from: e, reason: collision with root package name */
    public M f18807e;

    public V(e0 timeProvider, f0 uuidGenerator) {
        kotlin.jvm.internal.h.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.h.e(uuidGenerator, "uuidGenerator");
        this.f18803a = timeProvider;
        this.f18804b = uuidGenerator;
        this.f18805c = a();
        this.f18806d = -1;
    }

    public final String a() {
        this.f18804b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.h.d(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.h.d(uuid, "uuidGenerator.next().toString()");
        String lowerCase = W7.l.J(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
