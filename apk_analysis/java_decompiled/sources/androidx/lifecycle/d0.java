package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9875a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9876b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9877c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9878d;

    public d0(C0563y registry, EnumC0554o event) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(event, "event");
        this.f9877c = registry;
        this.f9878d = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s4.i iVar;
        Object obj = this.f9877c;
        Object obj2 = this.f9878d;
        switch (this.f9875a) {
            case 0:
                if (!this.f9876b) {
                    ((C0563y) obj).o0((EnumC0554o) obj2);
                    this.f9876b = true;
                    return;
                }
                return;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj2;
                V.d dVar = swipeDismissBehavior.f15830a;
                View view = (View) obj;
                if (dVar != null && dVar.f()) {
                    WeakHashMap weakHashMap = P.Q.f5546a;
                    view.postOnAnimation(this);
                    return;
                } else {
                    if (this.f9876b && (iVar = swipeDismissBehavior.f15831b) != null) {
                        iVar.M(view);
                        return;
                    }
                    return;
                }
        }
    }

    public d0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z9) {
        this.f9878d = swipeDismissBehavior;
        this.f9877c = view;
        this.f9876b = z9;
    }
}
