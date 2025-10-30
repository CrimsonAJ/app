package M;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f4658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4660e;

    public /* synthetic */ e(String str, Context context, Object obj, int i9, int i10) {
        this.f4656a = i10;
        this.f4657b = str;
        this.f4658c = context;
        this.f4660e = obj;
        this.f4659d = i9;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i9 = this.f4659d;
        Object obj = this.f4660e;
        Context context = this.f4658c;
        String str = this.f4657b;
        switch (this.f4656a) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, Collections.unmodifiableList(arrayList), i9);
            default:
                try {
                    return h.b(str, context, (List) obj, i9);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
