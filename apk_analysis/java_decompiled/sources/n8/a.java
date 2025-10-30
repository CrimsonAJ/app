package n8;

import J5.k;
import U3.C0394a;
import i8.E;
import i8.L;
import i8.z;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21245a = new Object();

    @Override // i8.z
    public final L a(o8.d dVar) {
        g gVar = dVar.f21752a;
        gVar.getClass();
        synchronized (gVar) {
            try {
                if (gVar.f21272l) {
                    if (!gVar.f21271k) {
                        if (gVar.j) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0394a c0394a = gVar.f21268g;
        kotlin.jvm.internal.h.b(c0394a);
        E client = gVar.f21262a;
        kotlin.jvm.internal.h.e(client, "client");
        try {
            k kVar = new k(gVar, c0394a, c0394a.c(dVar.f21757f, dVar.f21758g, dVar.f21759h, client.f18977f, !kotlin.jvm.internal.h.a(dVar.f21756e.f19006b, "GET")).k(client, dVar));
            gVar.f21270i = kVar;
            gVar.f21274n = kVar;
            synchronized (gVar) {
                gVar.j = true;
                gVar.f21271k = true;
            }
            if (!gVar.f21273m) {
                return o8.d.a(dVar, 0, kVar, null, 61).b(dVar.f21756e);
            }
            throw new IOException("Canceled");
        } catch (IOException e8) {
            c0394a.e(e8);
            throw new j(e8);
        } catch (j e9) {
            c0394a.e(e9.f21293b);
            throw e9;
        }
    }
}
