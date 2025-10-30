package J0;

import java.util.Locale;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements P0.a, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final Q0.a f3583a;

    public a(Q0.a db) {
        h.e(db, "db");
        this.f3583a = db;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [J0.g, J0.e] */
    @Override // P0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g d0(String sql) {
        h.e(sql, "sql");
        Q0.a db = this.f3583a;
        h.e(db, "db");
        String obj = W7.d.j0(sql).toString();
        if (obj.length() >= 3) {
            String substring = obj.substring(0, 3);
            h.d(substring, "substring(...)");
            String upperCase = substring.toUpperCase(Locale.ROOT);
            h.d(upperCase, "toUpperCase(...)");
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                ?? gVar = new g(db, sql);
                gVar.f3591d = new int[0];
                gVar.f3592e = new long[0];
                gVar.f3593f = new double[0];
                gVar.f3594g = new String[0];
                gVar.f3595h = new byte[0];
                return gVar;
            }
        }
        return new f(db, sql);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f3583a.close();
    }
}
