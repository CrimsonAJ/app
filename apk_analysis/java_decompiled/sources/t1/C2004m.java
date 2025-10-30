package t1;

import Y7.B;
import Y7.K;
import Y7.z0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.session.y;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import d8.o;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.z;
import u1.C2054b;
import w1.C2130a;
import x1.C2165i;
import y1.C2200a;
import z1.C2234a;

/* renamed from: t1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2004m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23097a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.c f23098b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.l f23099c;

    /* renamed from: d, reason: collision with root package name */
    public final H1.j f23100d;

    /* renamed from: e, reason: collision with root package name */
    public final d8.e f23101e;

    /* renamed from: f, reason: collision with root package name */
    public final y f23102f;

    /* renamed from: g, reason: collision with root package name */
    public final C1993b f23103g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23104h;

    /* JADX WARN: Type inference failed for: r11v0, types: [Y2.r, java.lang.Object] */
    public C2004m(Context context, C1.c cVar, A7.l lVar, A7.l lVar2, A7.l lVar3, C1993b c1993b, H1.j jVar) {
        int i9 = 3;
        int i10 = 4;
        int i11 = 5;
        int i12 = 0;
        this.f23097a = context;
        this.f23098b = cVar;
        this.f23099c = lVar;
        this.f23100d = jVar;
        z0 b9 = B.b();
        f8.e eVar = K.f8773a;
        this.f23101e = B.a(O4.h.D(b9, o.f17003a.f9070d).plus(new C2003l(this)));
        H1.m mVar = new H1.m(this);
        y yVar = new y(this, mVar);
        this.f23102f = yVar;
        ?? obj = new Object();
        obj.f8647a = B7.k.I0(c1993b.f23058a);
        obj.f8648b = B7.k.I0(c1993b.f23059b);
        obj.f8649c = B7.k.I0(c1993b.f23060c);
        obj.f8650d = B7.k.I0(c1993b.f23061d);
        obj.f8651e = B7.k.I0(c1993b.f23062e);
        obj.k(new C2234a(2), i8.y.class);
        obj.k(new C2234a(i11), String.class);
        obj.k(new C2234a(1), Uri.class);
        obj.k(new C2234a(i10), Uri.class);
        obj.k(new C2234a(i9), Integer.class);
        obj.k(new C2234a(i12), byte[].class);
        Object obj2 = new Object();
        ArrayList arrayList = (ArrayList) obj.f8649c;
        arrayList.add(new A7.h(obj2, Uri.class));
        arrayList.add(new A7.h(new C2200a(jVar.f2959a), File.class));
        obj.j(new w1.i(lVar3, lVar2, jVar.f2961c), Uri.class);
        obj.j(new C2130a(i11), File.class);
        obj.j(new C2130a(i12), Uri.class);
        obj.j(new C2130a(i9), Uri.class);
        obj.j(new C2130a(6), Uri.class);
        obj.j(new C2130a(i10), Drawable.class);
        obj.j(new C2130a(1), Bitmap.class);
        obj.j(new C2130a(2), ByteBuffer.class);
        C2054b c2054b = new C2054b(jVar.f2962d, jVar.f2963e);
        ArrayList arrayList2 = (ArrayList) obj.f8651e;
        arrayList2.add(c2054b);
        List e02 = AbstractC1002u1.e0((ArrayList) obj.f8647a);
        this.f23103g = new C1993b(e02, AbstractC1002u1.e0((ArrayList) obj.f8648b), AbstractC1002u1.e0(arrayList), AbstractC1002u1.e0((ArrayList) obj.f8650d), AbstractC1002u1.e0(arrayList2));
        this.f23104h = B7.k.z0(e02, new C2165i(this, mVar, yVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec A[Catch: all -> 0x00df, TryCatch #5 {all -> 0x00df, blocks: (B:23:0x00e2, B:25:0x00ec, B:26:0x00ef, B:28:0x00fa, B:29:0x00fd, B:14:0x00c1, B:16:0x00c7, B:18:0x00cc, B:69:0x0194, B:70:0x019b), top: B:13:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[Catch: all -> 0x00df, TryCatch #5 {all -> 0x00df, blocks: (B:23:0x00e2, B:25:0x00ec, B:26:0x00ef, B:28:0x00fa, B:29:0x00fd, B:14:0x00c1, B:16:0x00c7, B:18:0x00cc, B:69:0x0194, B:70:0x019b), top: B:13:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:37:0x0140, B:39:0x0146, B:42:0x015a, B:43:0x0168, B:46:0x015e, B:47:0x0175, B:49:0x0179, B:50:0x0188, B:51:0x018d), top: B:36:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:37:0x0140, B:39:0x0146, B:42:0x015a, B:43:0x0168, B:46:0x015e, B:47:0x0175, B:49:0x0179, B:50:0x0188, B:51:0x018d), top: B:36:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0 A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:56:0x019c, B:58:0x01a0, B:61:0x01b4, B:62:0x01bd), top: B:55:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[Catch: all -> 0x01b2, TRY_ENTER, TryCatch #0 {all -> 0x01b2, blocks: (B:56:0x019c, B:58:0x01a0, B:61:0x01b4, B:62:0x01bd), top: B:55:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [C1.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [C1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [t1.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(t1.C2004m r19, C1.i r20, int r21, G7.c r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C2004m.a(t1.m, C1.i, int, G7.c):java.lang.Object");
    }

    public static void c(C1.e eVar, E1.a aVar, C1994c c1994c) {
        C1.i iVar = eVar.f1173b;
        boolean i9 = z.i(aVar);
        Drawable drawable = eVar.f1172a;
        if (!i9) {
            if (aVar != null) {
                aVar.k(drawable);
            }
        } else {
            eVar.f1173b.f1197g.getClass();
            aVar.k(drawable);
        }
        c1994c.getClass();
        iVar.getClass();
    }

    public final C1.k b(C1.i iVar) {
        B.c(this.f23101e, null, new C1997f(iVar, null, this), 3);
        E1.a aVar = iVar.f1193c;
        if (z.i(aVar)) {
            return H1.f.c(aVar.f1926b).a();
        }
        return new C1.k(1);
    }
}
