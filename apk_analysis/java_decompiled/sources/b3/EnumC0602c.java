package b3;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0602c implements O6.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f10522a;

    EnumC0602c(int i9) {
        this.f10522a = i9;
    }

    @Override // O6.c
    public final int a() {
        return this.f10522a;
    }
}
