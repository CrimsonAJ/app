package d0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0545f;
import androidx.lifecycle.InterfaceC0561w;
import b5.RunnableC0667u;

/* renamed from: d0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092j implements InterfaceC0545f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D.n f16652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f16653b;

    public C1092j(EmojiCompatInitializer emojiCompatInitializer, D.n nVar) {
        this.f16653b = emojiCompatInitializer;
        this.f16652a = nVar;
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void a(InterfaceC0561w interfaceC0561w) {
        Handler handler;
        this.f16653b.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = AbstractC1084b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new RunnableC0667u(1), 500L);
        this.f16652a.g0(this);
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void b(InterfaceC0561w interfaceC0561w) {
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void c(InterfaceC0561w owner) {
        kotlin.jvm.internal.h.e(owner, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void f(InterfaceC0561w interfaceC0561w) {
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void i(InterfaceC0561w owner) {
        kotlin.jvm.internal.h.e(owner, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void j(InterfaceC0561w interfaceC0561w) {
    }
}
