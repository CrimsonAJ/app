package f1;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class h extends K0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17285c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f17286d;

    public h(Context context, int i9, int i10) {
        super(i9, i10);
        this.f17286d = context;
    }

    @Override // K0.a
    public final void a(Q0.a aVar) {
        Context context = this.f17286d;
        switch (this.f17285c) {
            case 0:
                if (this.f4230b >= 10) {
                    aVar.L(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                aVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    aVar.f();
                    try {
                        aVar.L(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                        aVar.L(new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        aVar.M();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i9 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    aVar.f();
                    try {
                        aVar.L(new Object[]{"next_job_scheduler_id", Integer.valueOf(i9)});
                        aVar.L(new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        aVar.M();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f17286d = context;
    }
}
