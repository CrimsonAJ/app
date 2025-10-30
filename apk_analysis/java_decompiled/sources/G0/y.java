package G0;

import B6.u0;
import B7.C0050a;
import a.AbstractC0485a;
import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import o1.C1671f;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2811a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2812b;

    /* renamed from: c, reason: collision with root package name */
    public final C0135a f2813c;

    /* renamed from: d, reason: collision with root package name */
    public final F0.K f2814d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2815e;

    /* renamed from: f, reason: collision with root package name */
    public final I0.b f2816f;

    /* renamed from: g, reason: collision with root package name */
    public Q0.a f2817g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    public y(C0135a c0135a, C0050a c0050a) {
        this.f2813c = c0135a;
        this.f2814d = new F0.K("", -1, "");
        B7.t tVar = B7.t.f1135a;
        ?? r32 = c0135a.f2743e;
        this.f2815e = r32 == 0 ? tVar : r32;
        ArrayList z02 = B7.k.z0(r32 != 0 ? r32 : tVar, new C0157x(new C0050a(1, this)));
        Context context = c0135a.f2739a;
        kotlin.jvm.internal.h.e(context, "context");
        C migrationContainer = c0135a.f2742d;
        kotlin.jvm.internal.h.e(migrationContainer, "migrationContainer");
        B b9 = c0135a.f2745g;
        Executor queryExecutor = c0135a.f2746h;
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        Executor transactionExecutor = c0135a.f2747i;
        kotlin.jvm.internal.h.e(transactionExecutor, "transactionExecutor");
        List typeConverters = c0135a.f2754q;
        kotlin.jvm.internal.h.e(typeConverters, "typeConverters");
        List autoMigrationSpecs = c0135a.f2755r;
        kotlin.jvm.internal.h.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f2816f = new J0.b(new C1671f((Q0.d) c0050a.invoke(new C0135a(context, c0135a.f2740b, c0135a.f2741c, migrationContainer, z02, c0135a.f2744f, b9, queryExecutor, transactionExecutor, c0135a.j, c0135a.f2748k, c0135a.f2749l, c0135a.f2750m, c0135a.f2751n, c0135a.f2752o, c0135a.f2753p, typeConverters, autoMigrationSpecs, c0135a.f2756s, c0135a.f2757t, c0135a.f2758u))));
        boolean z9 = b9 == B.f2638c;
        Q0.d c3 = c();
        if (c3 != null) {
            c3.setWriteAheadLoggingEnabled(z9);
        }
    }

    public static final void a(y yVar, P0.a aVar) {
        Object h7;
        B b9 = yVar.f2813c.f2745g;
        B b10 = B.f2638c;
        if (b9 == b10) {
            s8.n.m(aVar, "PRAGMA journal_mode = WAL");
        } else {
            s8.n.m(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (yVar.f2813c.f2745g == b10) {
            s8.n.m(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            s8.n.m(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        P0.c d02 = aVar.d0("PRAGMA user_version");
        try {
            d02.W();
            int H8 = (int) d02.H(0);
            AbstractC1002u1.k(d02, null);
            F0.K k5 = yVar.f2814d;
            if (H8 != k5.f2041a) {
                s8.n.m(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                int i9 = k5.f2041a;
                try {
                    if (H8 == 0) {
                        yVar.d(aVar);
                    } else {
                        yVar.e(aVar, H8, i9);
                    }
                    s8.n.m(aVar, "PRAGMA user_version = " + i9);
                    h7 = A7.n.f558a;
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (!(h7 instanceof A7.i)) {
                    s8.n.m(aVar, "END TRANSACTION");
                }
                Throwable a5 = A7.j.a(h7);
                if (a5 != null) {
                    s8.n.m(aVar, "ROLLBACK TRANSACTION");
                    throw a5;
                }
            }
            yVar.f(aVar);
        } finally {
        }
    }

    public static void b(P0.a aVar) {
        P0.c d02 = aVar.d0("PRAGMA busy_timeout");
        try {
            d02.W();
            long H8 = d02.H(0);
            AbstractC1002u1.k(d02, null);
            if (H8 < 3000) {
                s8.n.m(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1002u1.k(d02, th);
                throw th2;
            }
        }
    }

    public final Q0.d c() {
        J0.b bVar;
        C1671f c1671f;
        I0.b bVar2 = this.f2816f;
        if (bVar2 instanceof J0.b) {
            bVar = (J0.b) bVar2;
        } else {
            bVar = null;
        }
        if (bVar == null || (c1671f = bVar.f3584a) == null) {
            return null;
        }
        return (Q0.d) c1671f.f21473b;
    }

    public final void d(P0.a connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        P0.c d02 = connection.d0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z9 = false;
            if (d02.W()) {
                if (d02.H(0) == 0) {
                    z9 = true;
                }
            }
            AbstractC1002u1.k(d02, null);
            F0.K k5 = this.f2814d;
            k5.a(connection);
            if (!z9) {
                F4.L w7 = k5.w(connection);
                if (!w7.f2364b) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + w7.f2365c).toString());
                }
            }
            s8.n.m(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            s8.n.m(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) k5.f2042b) + "')");
            k5.s(connection);
            Iterator it = this.f2815e.iterator();
            while (it.hasNext()) {
                ((A) it.next()).getClass();
                if (connection instanceof J0.a) {
                    Q0.a db = ((J0.a) connection).f3583a;
                    kotlin.jvm.internal.h.e(db, "db");
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1002u1.k(d02, th);
                throw th2;
            }
        }
    }

    public final void e(P0.a connection, int i9, int i10) {
        kotlin.jvm.internal.h.e(connection, "connection");
        C0135a c0135a = this.f2813c;
        List<K0.a> m9 = v4.e.m(c0135a.f2742d, i9, i10);
        F0.K k5 = this.f2814d;
        if (m9 != null) {
            k5.v(connection);
            for (K0.a aVar : m9) {
                aVar.getClass();
                if (connection instanceof J0.a) {
                    aVar.a(((J0.a) connection).f3583a);
                } else {
                    throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
            }
            F4.L w7 = k5.w(connection);
            if (w7.f2364b) {
                k5.u(connection);
                s8.n.m(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                s8.n.m(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) k5.f2042b) + "')");
                return;
            }
            throw new IllegalStateException(("Migration didn't properly handle: " + w7.f2365c).toString());
        }
        if (!v4.e.F(c0135a, i9, i10)) {
            if (c0135a.f2756s) {
                P0.c d02 = connection.d0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                try {
                    C7.c cVar = new C7.c(10);
                    while (d02.W()) {
                        String i11 = d02.i(0);
                        if (!W7.l.L(i11, "sqlite_", false) && !i11.equals("android_metadata")) {
                            cVar.add(new A7.h(i11, Boolean.valueOf(kotlin.jvm.internal.h.a(d02.i(1), "view"))));
                        }
                    }
                    C7.c e8 = u0.e(cVar);
                    AbstractC1002u1.k(d02, null);
                    ListIterator listIterator = e8.listIterator(0);
                    while (true) {
                        C7.a aVar2 = (C7.a) listIterator;
                        if (!aVar2.hasNext()) {
                            break;
                        }
                        A7.h hVar = (A7.h) aVar2.next();
                        String str = (String) hVar.f547a;
                        if (((Boolean) hVar.f548b).booleanValue()) {
                            s8.n.m(connection, "DROP VIEW IF EXISTS " + str);
                        } else {
                            s8.n.m(connection, "DROP TABLE IF EXISTS " + str);
                        }
                    }
                } finally {
                }
            } else {
                k5.c(connection);
            }
            Iterator it = this.f2815e.iterator();
            while (it.hasNext()) {
                ((A) it.next()).getClass();
                if (connection instanceof J0.a) {
                    Q0.a db = ((J0.a) connection).f3583a;
                    kotlin.jvm.internal.h.e(db, "db");
                }
            }
            k5.a(connection);
            return;
        }
        throw new IllegalStateException(("A migration from " + i9 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(P0.a r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.y.f(P0.a):void");
    }

    public y(C0135a c0135a, F0.K k5) {
        int i9;
        I0.h hVar;
        this.f2813c = c0135a;
        this.f2814d = k5;
        List list = c0135a.f2743e;
        this.f2815e = list == null ? B7.t.f1135a : list;
        B b9 = c0135a.f2745g;
        String str = c0135a.f2740b;
        P0.b bVar = c0135a.f2757t;
        if (bVar == null) {
            Q0.c cVar = c0135a.f2741c;
            if (cVar != null) {
                Context context = c0135a.f2739a;
                kotlin.jvm.internal.h.e(context, "context");
                this.f2816f = new J0.b(new C1671f(cVar.e(new A6.t(context, str, new C0156w(this, k5.f2041a), false))));
            } else {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
        } else {
            if (str == null) {
                hVar = new I0.h(new A1.g(this, bVar));
            } else {
                A1.g gVar = new A1.g(this, bVar);
                int ordinal = b9.ordinal();
                if (ordinal == 1) {
                    i9 = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + b9 + '\'').toString());
                    }
                    i9 = 4;
                }
                int ordinal2 = b9.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + b9 + '\'').toString());
                }
                hVar = new I0.h(gVar, str, i9);
            }
            this.f2816f = hVar;
        }
        boolean z9 = b9 == B.f2638c;
        Q0.d c3 = c();
        if (c3 != null) {
            c3.setWriteAheadLoggingEnabled(z9);
        }
    }
}
