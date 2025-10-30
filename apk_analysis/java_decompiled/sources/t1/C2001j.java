package t1;

import C1.o;
import android.graphics.Bitmap;

/* renamed from: t1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C2004m f23082r;

    /* renamed from: s, reason: collision with root package name */
    public o f23083s;

    /* renamed from: t, reason: collision with root package name */
    public C1.i f23084t;

    /* renamed from: u, reason: collision with root package name */
    public C1994c f23085u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f23086v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23087w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2004m f23088x;

    /* renamed from: y, reason: collision with root package name */
    public int f23089y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2001j(C2004m c2004m, G7.c cVar) {
        super(cVar);
        this.f23088x = c2004m;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f23087w = obj;
        this.f23089y |= Integer.MIN_VALUE;
        return C2004m.a(this.f23088x, null, 0, this);
    }
}
