package A6;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f527a;

    /* renamed from: b, reason: collision with root package name */
    public int f528b;

    public p() {
        this.f527a = new ArrayList();
        this.f528b = 128;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f527a));
    }

    public boolean b() {
        if (this.f528b < this.f527a.size()) {
            return true;
        }
        return false;
    }

    public synchronized boolean c(List list) {
        this.f527a.clear();
        if (list.size() > this.f528b) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f528b, null);
            return this.f527a.addAll(list.subList(0, this.f528b));
        }
        return this.f527a.addAll(list);
    }

    public p(ArrayList arrayList) {
        this.f527a = arrayList;
    }
}
