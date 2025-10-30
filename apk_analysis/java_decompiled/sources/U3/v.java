package U3;

import N3.Z;
import android.os.Handler;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import k4.J;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class v implements J {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f7467a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f7468b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f7469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f7470d;

    /* JADX WARN: Type inference failed for: r1v2, types: [N3.Z, java.lang.Object] */
    public v(x xVar, InputStream inputStream) {
        this.f7470d = xVar;
        this.f7467a = new DataInputStream(inputStream);
        ?? obj = new Object();
        obj.f5034c = new ArrayList();
        obj.f5032a = 1;
        this.f7468b = obj;
    }

    @Override // k4.J
    public final void a() {
        boolean z9;
        boolean z10;
        String str;
        while (!this.f7469c) {
            byte readByte = this.f7467a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f7467a.readUnsignedByte();
                int readUnsignedShort = this.f7467a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f7467a.readFully(bArr, 0, readUnsignedShort);
                F f9 = (F) this.f7470d.f7478c.get(Integer.valueOf(readUnsignedByte));
                if (f9 != null && !this.f7470d.f7481f) {
                    f9.f7330e.add(bArr);
                }
            } else if (this.f7470d.f7481f) {
                continue;
            } else {
                O0.c cVar = this.f7470d.f7476a;
                Z z11 = this.f7468b;
                DataInputStream dataInputStream = this.f7467a;
                z11.getClass();
                P5.F a5 = z11.a(Z.b(readByte, dataInputStream));
                while (a5 == null) {
                    if (z11.f5032a == 3) {
                        long j = z11.f5033b;
                        if (j > 0) {
                            int e8 = v4.e.e(j);
                            if (e8 != -1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            AbstractC1566a.m(z9);
                            byte[] bArr2 = new byte[e8];
                            dataInputStream.readFully(bArr2, 0, e8);
                            if (z11.f5032a == 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            AbstractC1566a.m(z10);
                            if (e8 > 0) {
                                int i9 = e8 - 1;
                                if (bArr2[i9] == 10) {
                                    if (e8 > 1) {
                                        int i10 = e8 - 2;
                                        if (bArr2[i10] == 13) {
                                            str = new String(bArr2, 0, i10, x.f7475g);
                                            ArrayList arrayList = (ArrayList) z11.f5034c;
                                            arrayList.add(str);
                                            a5 = P5.F.o(arrayList);
                                            ((ArrayList) z11.f5034c).clear();
                                            z11.f5032a = 1;
                                            z11.f5033b = 0L;
                                        }
                                    }
                                    str = new String(bArr2, 0, i9, x.f7475g);
                                    ArrayList arrayList2 = (ArrayList) z11.f5034c;
                                    arrayList2.add(str);
                                    a5 = P5.F.o(arrayList2);
                                    ((ArrayList) z11.f5034c).clear();
                                    z11.f5032a = 1;
                                    z11.f5033b = 0L;
                                }
                            }
                            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                        }
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    a5 = z11.a(Z.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) cVar.f5263b).post(new A6.r(cVar, 7, a5));
            }
        }
    }

    @Override // k4.J
    public final void c() {
        this.f7469c = true;
    }
}
