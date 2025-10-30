package n3;

import java.util.UUID;
import m3.InterfaceC1588a;

/* renamed from: n3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1646w implements InterfaceC1588a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f21140d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f21141a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21142b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21143c;

    static {
        boolean z9;
        if ("Amazon".equals(l4.y.f20555c)) {
            String str = l4.y.f20556d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
                f21140d = z9;
            }
        }
        z9 = false;
        f21140d = z9;
    }

    public C1646w(UUID uuid, byte[] bArr, boolean z9) {
        this.f21141a = uuid;
        this.f21142b = bArr;
        this.f21143c = z9;
    }
}
