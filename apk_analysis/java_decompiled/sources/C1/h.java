package C1;

import B7.y;
import Y7.AbstractC0480v;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0561w;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import f5.C1183o;
import i8.w;
import java.util.LinkedHashMap;
import java.util.List;
import o1.C1671f;
import u0.z;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1177a;

    /* renamed from: b, reason: collision with root package name */
    public c f1178b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1179c;

    /* renamed from: d, reason: collision with root package name */
    public E1.a f1180d;

    /* renamed from: e, reason: collision with root package name */
    public List f1181e;

    /* renamed from: f, reason: collision with root package name */
    public final C1183o f1182f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f1183g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1184h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1185i;
    public b j;

    /* renamed from: k, reason: collision with root package name */
    public b f1186k;

    /* renamed from: l, reason: collision with root package name */
    public final C1671f f1187l;

    /* renamed from: m, reason: collision with root package name */
    public D.n f1188m;

    /* renamed from: n, reason: collision with root package name */
    public D1.i f1189n;

    /* renamed from: o, reason: collision with root package name */
    public D1.g f1190o;

    public h(Context context) {
        this.f1177a = context;
        this.f1178b = H1.d.f2947a;
        this.f1179c = null;
        this.f1180d = null;
        this.f1181e = B7.t.f1135a;
        this.f1182f = null;
        this.f1183g = null;
        this.f1184h = true;
        this.f1185i = true;
        this.j = null;
        this.f1186k = null;
        this.f1187l = null;
        this.f1188m = null;
        this.f1189n = null;
        this.f1190o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i a() {
        w wVar;
        q qVar;
        b bVar;
        n nVar;
        ImageView imageView;
        int i9;
        ImageView.ScaleType scaleType;
        Object obj;
        Object obj2 = this.f1179c;
        if (obj2 == null) {
            obj2 = k.f1216b;
        }
        Object obj3 = obj2;
        E1.a aVar = this.f1180d;
        c cVar = this.f1178b;
        Bitmap.Config config = cVar.f1166g;
        D1.d dVar = cVar.f1165f;
        List list = this.f1181e;
        G1.a aVar2 = cVar.f1164e;
        C1183o c1183o = this.f1182f;
        if (c1183o != null) {
            wVar = c1183o.z();
        } else {
            wVar = null;
        }
        if (wVar == null) {
            wVar = H1.f.f2951c;
        } else {
            Bitmap.Config[] configArr = H1.f.f2949a;
        }
        w wVar2 = wVar;
        LinkedHashMap linkedHashMap = this.f1183g;
        if (linkedHashMap != null) {
            qVar = new q(AbstractC1002u1.f0(linkedHashMap));
        } else {
            qVar = null;
        }
        if (qVar == null) {
            qVar = q.f1241b;
        }
        q qVar2 = qVar;
        c cVar2 = this.f1178b;
        boolean z9 = cVar2.f1167h;
        cVar2.getClass();
        b bVar2 = this.j;
        if (bVar2 == null) {
            bVar2 = this.f1178b.f1168i;
        }
        b bVar3 = bVar2;
        b bVar4 = this.f1186k;
        if (bVar4 == null) {
            bVar4 = this.f1178b.j;
        }
        b bVar5 = bVar4;
        c cVar3 = this.f1178b;
        b bVar6 = cVar3.f1169k;
        AbstractC0480v abstractC0480v = cVar3.f1160a;
        f8.d dVar2 = cVar3.f1161b;
        f8.d dVar3 = cVar3.f1162c;
        f8.d dVar4 = cVar3.f1163d;
        D.n nVar2 = this.f1188m;
        Context context = this.f1177a;
        if (nVar2 == null) {
            E1.a aVar3 = this.f1180d;
            if (z.i(aVar3)) {
                obj = aVar3.f1926b.getContext();
            } else {
                obj = context;
            }
            bVar = bVar6;
            while (true) {
                if (obj instanceof InterfaceC0561w) {
                    nVar2 = ((InterfaceC0561w) obj).x();
                    break;
                }
                if (!(obj instanceof ContextWrapper)) {
                    nVar2 = null;
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            if (nVar2 == null) {
                nVar2 = g.f1175b;
            }
        } else {
            bVar = bVar6;
        }
        D.n nVar3 = nVar2;
        D1.i iVar = this.f1189n;
        if (iVar == null) {
            E1.a aVar4 = this.f1180d;
            if (z.i(aVar4)) {
                ImageView imageView2 = aVar4.f1926b;
                if (imageView2 != null && ((scaleType = imageView2.getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                    D1.h hVar = D1.h.f1776c;
                    iVar = new Object();
                } else {
                    iVar = new D1.f(imageView2);
                }
            } else {
                iVar = new D1.c(context);
            }
        }
        D1.i iVar2 = iVar;
        D1.g gVar = this.f1190o;
        if (gVar == null) {
            E1.a aVar5 = this.f1180d;
            if (!z.i(aVar5)) {
                aVar5 = null;
            }
            if (aVar5 != null) {
                imageView = aVar5.f1926b;
            } else {
                imageView = null;
            }
            boolean i10 = z.i(imageView);
            D1.g gVar2 = D1.g.f1774b;
            if (i10) {
                Bitmap.Config[] configArr2 = H1.f.f2949a;
                ImageView.ScaleType scaleType2 = imageView.getScaleType();
                if (scaleType2 == null) {
                    i9 = -1;
                } else {
                    i9 = H1.e.f2948a[scaleType2.ordinal()];
                }
                if (i9 != 1 && i9 != 2 && i9 != 3 && i9 != 4) {
                    gVar = D1.g.f1773a;
                }
            }
            gVar = gVar2;
        }
        D1.g gVar3 = gVar;
        C1671f c1671f = this.f1187l;
        if (c1671f != null) {
            nVar = new n(AbstractC1002u1.f0((LinkedHashMap) c1671f.f21473b));
        } else {
            nVar = null;
        }
        if (nVar == null) {
            nVar = n.f1232b;
        }
        n nVar4 = nVar;
        d dVar5 = new d(this.j, this.f1186k);
        c cVar4 = this.f1178b;
        return new i(this.f1177a, obj3, aVar, config, dVar, list, aVar2, wVar2, qVar2, this.f1184h, z9, false, this.f1185i, bVar3, bVar5, bVar, abstractC0480v, dVar2, dVar3, dVar4, nVar3, iVar2, gVar3, nVar4, dVar5, cVar4);
    }

    public final void b(ImageView imageView) {
        this.f1180d = new E1.a(imageView);
        this.f1188m = null;
        this.f1189n = null;
        this.f1190o = null;
    }

    public h(i iVar, Context context) {
        this.f1177a = context;
        this.f1178b = iVar.f1215z;
        this.f1179c = iVar.f1192b;
        this.f1180d = iVar.f1193c;
        d dVar = iVar.f1214y;
        this.f1181e = iVar.f1196f;
        this.f1182f = iVar.f1198h.d();
        this.f1183g = y.I(iVar.f1199i.f1242a);
        this.f1184h = iVar.j;
        this.f1185i = iVar.f1202m;
        this.j = dVar.f1170a;
        this.f1186k = dVar.f1171b;
        this.f1187l = new C1671f(iVar.f1213x);
        if (iVar.f1191a == context) {
            this.f1188m = iVar.f1210u;
            this.f1189n = iVar.f1211v;
            this.f1190o = iVar.f1212w;
        } else {
            this.f1188m = null;
            this.f1189n = null;
            this.f1190o = null;
        }
    }
}
