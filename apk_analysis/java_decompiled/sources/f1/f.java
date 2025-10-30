package f1;

import G0.A;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class f extends A {
    @Override // G0.A
    public final void a(Q0.a db) {
        kotlin.jvm.internal.h.e(db, "db");
        db.f();
        try {
            int i9 = WorkDatabase.f10423l;
            db.l("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f10422k) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db.M();
        } finally {
            db.e();
        }
    }
}
