package y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: d, reason: collision with root package name */
    public final l f24707d;

    /* renamed from: f, reason: collision with root package name */
    public int f24709f;

    /* renamed from: g, reason: collision with root package name */
    public int f24710g;

    /* renamed from: a, reason: collision with root package name */
    public l f24704a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24705b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24706c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f24708e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f24711h = 1;

    /* renamed from: i, reason: collision with root package name */
    public f f24712i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f24713k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f24714l = new ArrayList();

    public e(l lVar) {
        this.f24707d = lVar;
    }

    @Override // y.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f24714l;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((e) obj).j) {
                return;
            }
        }
        this.f24706c = true;
        l lVar = this.f24704a;
        if (lVar != null) {
            lVar.a(this);
        }
        if (this.f24705b) {
            this.f24707d.a(this);
            return;
        }
        int size2 = arrayList.size();
        e eVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            e eVar2 = (e) obj2;
            if (!(eVar2 instanceof f)) {
                i9++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i9 == 1 && eVar.j) {
            f fVar = this.f24712i;
            if (fVar != null) {
                if (fVar.j) {
                    this.f24709f = this.f24711h * fVar.f24710g;
                } else {
                    return;
                }
            }
            d(eVar.f24710g + this.f24709f);
        }
        l lVar2 = this.f24704a;
        if (lVar2 != null) {
            lVar2.a(this);
        }
    }

    public final void b(l lVar) {
        this.f24713k.add(lVar);
        if (this.j) {
            lVar.a(lVar);
        }
    }

    public final void c() {
        this.f24714l.clear();
        this.f24713k.clear();
        this.j = false;
        this.f24710g = 0;
        this.f24706c = false;
        this.f24705b = false;
    }

    public void d(int i9) {
        if (!this.j) {
            this.j = true;
            this.f24710g = i9;
            ArrayList arrayList = this.f24713k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24707d.f24722b.f24366W);
        sb.append(":");
        switch (this.f24708e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.f24710g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f24714l.size());
        sb.append(":d=");
        sb.append(this.f24713k.size());
        sb.append(">");
        return sb.toString();
    }
}
