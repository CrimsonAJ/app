package u0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import co.notix.R;
import java.lang.ref.WeakReference;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032c extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: e, reason: collision with root package name */
    public static final C2032c f23470e = new C2032c(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final C2032c f23471f = new C2032c(1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C2032c f23472g = new C2032c(1, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final C2032c f23473h = new C2032c(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final C2032c f23474i = new C2032c(1, 4);
    public static final C2032c j = new C2032c(1, 5);

    /* renamed from: k, reason: collision with root package name */
    public static final C2032c f23475k = new C2032c(1, 6);

    /* renamed from: l, reason: collision with root package name */
    public static final C2032c f23476l = new C2032c(1, 7);

    /* renamed from: m, reason: collision with root package name */
    public static final C2032c f23477m = new C2032c(1, 8);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2032c(int i9, int i10) {
        super(i9);
        this.f23478d = i10;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f23478d) {
            case 0:
                Context it = (Context) obj;
                kotlin.jvm.internal.h.e(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it2 = (Context) obj;
                kotlin.jvm.internal.h.e(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 2:
                C destination = (C) obj;
                kotlin.jvm.internal.h.e(destination, "destination");
                F f9 = destination.f23375b;
                if (f9 == null || f9.f23388l != destination.f23381h) {
                    return null;
                }
                return f9;
            case 3:
                C destination2 = (C) obj;
                kotlin.jvm.internal.h.e(destination2, "destination");
                F f10 = destination2.f23375b;
                if (f10 == null || f10.f23388l != destination2.f23381h) {
                    return null;
                }
                return f10;
            case 4:
                C it3 = (C) obj;
                kotlin.jvm.internal.h.e(it3, "it");
                return Integer.valueOf(it3.f23381h);
            case 5:
                C it4 = (C) obj;
                kotlin.jvm.internal.h.e(it4, "it");
                return it4.f23375b;
            case 6:
                C it5 = (C) obj;
                kotlin.jvm.internal.h.e(it5, "it");
                if (!(it5 instanceof F)) {
                    return null;
                }
                F f11 = (F) it5;
                return f11.g(f11.f23388l, f11, false, null);
            case 7:
                View it6 = (View) obj;
                kotlin.jvm.internal.h.e(it6, "it");
                Object parent = it6.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it7 = (View) obj;
                kotlin.jvm.internal.h.e(it7, "it");
                Object tag = it7.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (H) ((WeakReference) tag).get();
                }
                if (tag instanceof H) {
                    return (H) tag;
                }
                return null;
        }
    }
}
