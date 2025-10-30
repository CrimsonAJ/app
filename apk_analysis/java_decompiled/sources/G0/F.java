package G0;

import B6.u0;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import b7.C0701c;
import com.google.android.gms.internal.measurement.D1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class F extends Q0.b {

    /* renamed from: c, reason: collision with root package name */
    public C0135a f2651c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2652d;

    /* renamed from: e, reason: collision with root package name */
    public final C0701c f2653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C0135a configuration, C0701c c0701c) {
        super(12, 0);
        kotlin.jvm.internal.h.e(configuration, "configuration");
        this.f2652d = configuration.f2743e;
        this.f2651c = configuration;
        this.f2653e = c0701c;
    }

    @Override // Q0.b
    public final void l(R0.c cVar) {
        Cursor r5 = cVar.r(new G6.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", 2));
        try {
            boolean z9 = false;
            if (r5.moveToFirst()) {
                if (r5.getInt(0) == 0) {
                    z9 = true;
                }
            }
            r5.close();
            C0701c c0701c = this.f2653e;
            C0701c.C(cVar);
            if (!z9) {
                F4.L J8 = C0701c.J(cVar);
                if (!J8.f2364b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + J8.f2365c);
                }
            }
            cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            int i9 = WorkDatabase_Impl.f10424t;
            ((WorkDatabase_Impl) c0701c.f11404b).getClass();
            List list = this.f2652d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((A) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D1.h(r5, th);
                throw th2;
            }
        }
    }

    @Override // Q0.b
    public final void n(R0.c cVar, int i9, int i10) {
        p(cVar, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    @Override // Q0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(R0.c r7) {
        /*
            r6 = this;
            r0 = 2
            G6.a r1 = new G6.a
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r1.<init>(r2, r0)
            android.database.Cursor r1 = r7.r(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            if (r2 == 0) goto L1e
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1b:
            r7 = move-exception
            goto Lbf
        L1e:
            r2 = r3
        L1f:
            r1.close()
            b7.c r1 = r6.f2653e
            r4 = 0
            if (r2 == 0) goto L66
            G6.a r2 = new G6.a
            java.lang.String r5 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r2.<init>(r5, r0)
            android.database.Cursor r0 = r7.r(r2)
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3f
            java.lang.String r2 = r0.getString(r3)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r7 = move-exception
            goto L60
        L3f:
            r2 = r4
        L40:
            r0.close()
            java.lang.String r0 = "c103703e120ae8cc73c9248622f3cd1e"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L78
            java.lang.String r0 = "49f946663a8deb7054212b8adda248c6"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L54
            goto L78
        L54:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: "
            java.lang.String r0 = u0.z.e(r0, r2)
            r7.<init>(r0)
            throw r7
        L60:
            throw r7     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            com.google.android.gms.internal.measurement.D1.h(r0, r7)
            throw r1
        L66:
            F4.L r0 = b7.C0701c.J(r7)
            boolean r2 = r0.f2364b
            if (r2 == 0) goto La9
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r7.l(r0)
            java.lang.String r0 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')"
            r7.l(r0)
        L78:
            int r0 = androidx.work.impl.WorkDatabase_Impl.f10424t
            java.lang.Object r0 = r1.f11404b
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            r0.getClass()
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r7.l(r1)
            J0.a r1 = new J0.a
            r1.<init>(r7)
            r0.n(r1)
            java.util.List r0 = r6.f2652d
            if (r0 == 0) goto La6
            java.util.Iterator r0 = r0.iterator()
        L96:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            G0.A r1 = (G0.A) r1
            r1.a(r7)
            goto L96
        La6:
            r6.f2651c = r4
            return
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.<init>(r2)
            java.lang.String r0 = r0.f2365c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        Lbf:
            throw r7     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            com.google.android.gms.internal.measurement.D1.h(r1, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.F.o(R0.c):void");
    }

    @Override // Q0.b
    public final void p(R0.c cVar, int i9, int i10) {
        C0135a c0135a = this.f2651c;
        C0701c c0701c = this.f2653e;
        if (c0135a != null) {
            C c3 = c0135a.f2742d;
            c3.getClass();
            List<K0.a> m9 = v4.e.m(c3, i9, i10);
            if (m9 != null) {
                s8.n.l(new J0.a(cVar));
                for (K0.a aVar : m9) {
                    aVar.getClass();
                    aVar.a(cVar);
                }
                F4.L J8 = C0701c.J(cVar);
                if (J8.f2364b) {
                    cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: " + J8.f2365c);
            }
        }
        C0135a c0135a2 = this.f2651c;
        if (c0135a2 != null && !v4.e.F(c0135a2, i9, i10)) {
            if (c0135a2.f2756s) {
                Cursor r5 = cVar.r(new G6.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", 2));
                try {
                    C7.c cVar2 = new C7.c(10);
                    while (r5.moveToNext()) {
                        String string = r5.getString(0);
                        kotlin.jvm.internal.h.b(string);
                        if (!W7.l.L(string, "sqlite_", false) && !string.equals("android_metadata")) {
                            cVar2.add(new A7.h(string, Boolean.valueOf(kotlin.jvm.internal.h.a(r5.getString(1), "view"))));
                        }
                    }
                    C7.c e8 = u0.e(cVar2);
                    r5.close();
                    ListIterator listIterator = e8.listIterator(0);
                    while (true) {
                        C7.a aVar2 = (C7.a) listIterator;
                        if (!aVar2.hasNext()) {
                            break;
                        }
                        A7.h hVar = (A7.h) aVar2.next();
                        String str = (String) hVar.f547a;
                        if (((Boolean) hVar.f548b).booleanValue()) {
                            cVar.l("DROP VIEW IF EXISTS " + str);
                        } else {
                            cVar.l("DROP TABLE IF EXISTS " + str);
                        }
                    }
                } finally {
                }
            } else {
                cVar.l("DROP TABLE IF EXISTS `Dependency`");
                cVar.l("DROP TABLE IF EXISTS `WorkSpec`");
                cVar.l("DROP TABLE IF EXISTS `WorkTag`");
                cVar.l("DROP TABLE IF EXISTS `SystemIdInfo`");
                cVar.l("DROP TABLE IF EXISTS `WorkName`");
                cVar.l("DROP TABLE IF EXISTS `WorkProgress`");
                cVar.l("DROP TABLE IF EXISTS `Preference`");
                int i11 = WorkDatabase_Impl.f10424t;
                ((WorkDatabase_Impl) c0701c.f11404b).getClass();
            }
            List list = this.f2652d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((A) it.next()).getClass();
                }
            }
            C0701c.C(cVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i9 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // Q0.b
    public final void k(R0.c cVar) {
    }
}
