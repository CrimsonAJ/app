package d0;

import e0.C1133a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f16677d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f16678a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.s f16679b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f16680c = 0;

    public u(com.google.firebase.messaging.s sVar, int i9) {
        this.f16679b = sVar;
        this.f16678a = i9;
    }

    public final int a(int i9) {
        C1133a b9 = b();
        int a5 = b9.a(16);
        if (a5 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b9.f1637d;
            int i10 = a5 + b9.f1634a;
            return byteBuffer.getInt((i9 * 4) + byteBuffer.getInt(i10) + i10 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [C7.f, java.lang.Object] */
    public final C1133a b() {
        ThreadLocal threadLocal = f16677d;
        C1133a c1133a = (C1133a) threadLocal.get();
        C1133a c1133a2 = c1133a;
        if (c1133a == null) {
            ?? fVar = new C7.f();
            threadLocal.set(fVar);
            c1133a2 = fVar;
        }
        e0.b bVar = (e0.b) this.f16679b.f16504b;
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i9 = a5 + bVar.f1634a;
            int i10 = (this.f16678a * 4) + ((ByteBuffer) bVar.f1637d).getInt(i9) + i9 + 4;
            int i11 = ((ByteBuffer) bVar.f1637d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1637d;
            c1133a2.f1637d = byteBuffer;
            if (byteBuffer != null) {
                c1133a2.f1634a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                c1133a2.f1635b = i12;
                c1133a2.f1636c = ((ByteBuffer) c1133a2.f1637d).getShort(i12);
                return c1133a2;
            }
            c1133a2.f1634a = 0;
            c1133a2.f1635b = 0;
            c1133a2.f1636c = 0;
        }
        return c1133a2;
    }

    public final String toString() {
        int i9;
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1133a b9 = b();
        int a5 = b9.a(4);
        if (a5 != 0) {
            i9 = ((ByteBuffer) b9.f1637d).getInt(a5 + b9.f1634a);
        } else {
            i9 = 0;
        }
        sb.append(Integer.toHexString(i9));
        sb.append(", codepoints:");
        C1133a b10 = b();
        int a9 = b10.a(16);
        if (a9 != 0) {
            int i11 = a9 + b10.f1634a;
            i10 = ((ByteBuffer) b10.f1637d).getInt(((ByteBuffer) b10.f1637d).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
