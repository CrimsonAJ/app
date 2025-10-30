package b5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class N extends B {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f10810e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    public final C0646m f10811c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10812d;

    public N(C0650n0 c0650n0) {
        super(c0650n0);
        this.f10811c = new C0646m(this, ((C0650n0) this.f1707a).f11221a);
    }

    @Override // b5.B
    public final boolean o0() {
        return false;
    }

    public final SQLiteDatabase p0() {
        if (this.f10812d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10811c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f10812d = true;
            return null;
        }
        return writableDatabase;
    }

    public final void q0() {
        int delete;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        l0();
        try {
            SQLiteDatabase p02 = p0();
            if (p02 != null && (delete = p02.delete("messages", null, null)) > 0) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10978n.c(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e8) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10971f.c(e8, "Error resetting local analytics data. error");
        }
    }

    public final void r0() {
        l0();
        if (!this.f10812d) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            if (c0650n0.f11221a.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i9 = 5;
                for (int i10 = 0; i10 < 5; i10++) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase p02 = p0();
                        if (p02 == null) {
                            this.f10812d = true;
                            return;
                        }
                        p02.beginTransaction();
                        p02.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        p02.setTransactionSuccessful();
                        p02.endTransaction();
                        p02.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i9);
                        i9 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteFullException e8) {
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        v8.f10971f.c(e8, "Error deleting app launch break from local database");
                        this.f10812d = true;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteException e9) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10971f.c(e9, "Error deleting app launch break from local database");
                        this.f10812d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                }
                V v10 = c0650n0.f11229i;
                C0650n0.f(v10);
                v10.f10974i.b("Error deleting app launch break from local database in reasonable time");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125 A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #8 {all -> 0x0094, blocks: (B:95:0x0089, B:97:0x008f, B:66:0x00a4, B:69:0x00ab, B:71:0x00c8, B:74:0x00d3, B:75:0x00fd, B:43:0x0125, B:45:0x012b, B:46:0x012e, B:34:0x015e, B:22:0x0149), top: B:94:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s0(int r20, byte[] r21) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.N.s0(int, byte[]):boolean");
    }
}
