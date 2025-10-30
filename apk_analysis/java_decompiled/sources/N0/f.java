package N0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0551l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.h;
import p.C1819s;
import r.C1920b;
import r.C1921c;
import r.C1924f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4820a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4821b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4822c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4823d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f4824e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4825f;

    public /* synthetic */ f(TextView textView) {
        this.f4824e = null;
        this.f4825f = null;
        this.f4820a = false;
        this.f4821b = false;
        this.f4823d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f4823d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f4820a || this.f4821b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f4820a) {
                    mutate.setTintList((ColorStateList) this.f4824e);
                }
                if (this.f4821b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f4825f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C1819s c1819s = (C1819s) this.f4823d;
        Drawable checkMarkDrawable = c1819s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f4820a || this.f4821b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f4820a) {
                    mutate.setTintList((ColorStateList) this.f4824e);
                }
                if (this.f4821b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f4825f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c1819s.getDrawableState());
                }
                c1819s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.f4821b) {
            Bundle bundle = (Bundle) this.f4824e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f4824e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f4824e;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f4824e = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public e d() {
        String str;
        e eVar;
        Iterator it = ((C1924f) this.f4823d).iterator();
        do {
            C1920b c1920b = (C1920b) it;
            if (c1920b.hasNext()) {
                Map.Entry components = (Map.Entry) c1920b.next();
                h.d(components, "components");
                str = (String) components.getKey();
                eVar = (e) components.getValue();
            } else {
                return null;
            }
        } while (!h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f4823d
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = h.AbstractC1260a.f17816m
            b5.G1 r7 = b5.G1.w(r0, r9, r3, r10)
            java.lang.Object r0 = r7.f10718c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f10718c
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            P.Q.l(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r10 == 0) goto L3e
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3e
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r9 = a.AbstractC0485a.q(r10, r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3b:
            r0 = move-exception
            r9 = r0
            goto L7b
        L3e:
            boolean r9 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            int r9 = r0.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b
            android.graphics.drawable.Drawable r9 = a.AbstractC0485a.q(r10, r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b
        L55:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            android.content.res.ColorStateList r9 = r7.n(r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3b
        L63:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L77
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = p.AbstractC1800i0.c(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3b
        L77:
            r7.y()
            return
        L7b:
            r7.y()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.f.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, e provider) {
        Object obj;
        h.e(provider, "provider");
        C1924f c1924f = (C1924f) this.f4823d;
        C1921c b9 = c1924f.b(str);
        if (b9 != null) {
            obj = b9.f22579b;
        } else {
            C1921c c1921c = new C1921c(str, provider);
            c1924f.f22588d++;
            C1921c c1921c2 = c1924f.f22586b;
            if (c1921c2 == null) {
                c1924f.f22585a = c1921c;
                c1924f.f22586b = c1921c;
            } else {
                c1921c2.f22580c = c1921c;
                c1921c.f22581d = c1921c2;
                c1924f.f22586b = c1921c;
            }
            obj = null;
        }
        if (((e) obj) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (this.f4822c) {
            a aVar = (a) this.f4825f;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f4825f = aVar;
            try {
                C0551l.class.getDeclaredConstructor(null);
                a aVar2 = (a) this.f4825f;
                if (aVar2 != null) {
                    ((LinkedHashSet) aVar2.f4815b).add(C0551l.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e8) {
                throw new IllegalArgumentException("Class " + C0551l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public f() {
        this.f4823d = new C1924f();
        this.f4822c = true;
    }
}
