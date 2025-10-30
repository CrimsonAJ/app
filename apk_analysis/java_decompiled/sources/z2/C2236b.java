package z2;

import F0.K;
import F4.L;
import M0.e;
import com.anilab.data.local.db.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.h;
import s8.n;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2236b extends K {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f25366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2236b(AppDatabase_Impl appDatabase_Impl) {
        super("9ed8f3c2c97c8a40a36b3be1014fb0e6", 1, "689dfbb59b3a7af3dfcbce2845e14715");
        this.f25366d = appDatabase_Impl;
    }

    @Override // F0.K
    public final void a(P0.a connection) {
        h.e(connection, "connection");
        n.m(connection, "CREATE TABLE IF NOT EXISTS `AnimeEntity` (`anime_id` INTEGER NOT NULL, `watch_id` TEXT, `anime_url` TEXT, `update_at` INTEGER, PRIMARY KEY(`anime_id`))");
        n.m(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        n.m(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9ed8f3c2c97c8a40a36b3be1014fb0e6')");
    }

    @Override // F0.K
    public final void c(P0.a connection) {
        h.e(connection, "connection");
        n.m(connection, "DROP TABLE IF EXISTS `AnimeEntity`");
    }

    @Override // F0.K
    public final void s(P0.a connection) {
        h.e(connection, "connection");
    }

    @Override // F0.K
    public final void t(P0.a connection) {
        h.e(connection, "connection");
        this.f25366d.n(connection);
    }

    @Override // F0.K
    public final void u(P0.a connection) {
        h.e(connection, "connection");
    }

    @Override // F0.K
    public final void v(P0.a connection) {
        h.e(connection, "connection");
        n.l(connection);
    }

    @Override // F0.K
    public final L w(P0.a connection) {
        h.e(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anime_id", new M0.b(1, 1, "anime_id", "INTEGER", null, true));
        linkedHashMap.put("watch_id", new M0.b(0, 1, "watch_id", "TEXT", null, false));
        linkedHashMap.put("anime_url", new M0.b(0, 1, "anime_url", "TEXT", null, false));
        linkedHashMap.put("update_at", new M0.b(0, 1, "update_at", "INTEGER", null, false));
        e eVar = new e("AnimeEntity", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        e v8 = Z0.a.v(connection, "AnimeEntity");
        if (!eVar.equals(v8)) {
            return new L(false, "AnimeEntity(com.anilab.data.local.db.AnimeEntity).\n Expected:\n" + eVar + "\n Found:\n" + v8, 1);
        }
        return new L(true, (String) null, 1);
    }
}
