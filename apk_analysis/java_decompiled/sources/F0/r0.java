package F0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f2209t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f2210a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2211b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2226r;

    /* renamed from: s, reason: collision with root package name */
    public S f2227s;

    /* renamed from: c, reason: collision with root package name */
    public int f2212c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2213d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2214e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2215f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2216g = -1;

    /* renamed from: h, reason: collision with root package name */
    public r0 f2217h = null;

    /* renamed from: i, reason: collision with root package name */
    public r0 f2218i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2219k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f2220l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2221m = 0;

    /* renamed from: n, reason: collision with root package name */
    public h0 f2222n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2223o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2224p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2225q = -1;

    public r0(View view) {
        if (view != null) {
            this.f2210a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i9) {
        this.j = i9 | this.j;
    }

    public final int b() {
        RecyclerView recyclerView;
        S adapter;
        int K;
        if (this.f2227s == null || (recyclerView = this.f2226r) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.f2226r.K(this)) == -1 || this.f2227s != adapter) {
            return -1;
        }
        return K;
    }

    public final int c() {
        int i9 = this.f2216g;
        if (i9 == -1) {
            return this.f2212c;
        }
        return i9;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.j & 1024) == 0 && (arrayList = this.f2219k) != null && arrayList.size() != 0) {
            return this.f2220l;
        }
        return f2209t;
    }

    public final boolean e() {
        View view = this.f2210a;
        if (view.getParent() != null && view.getParent() != this.f2226r) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = P.Q.f5546a;
            if (!this.f2210a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean i() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f2222n != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void m(int i9, boolean z9) {
        if (this.f2213d == -1) {
            this.f2213d = this.f2212c;
        }
        if (this.f2216g == -1) {
            this.f2216g = this.f2212c;
        }
        if (z9) {
            this.f2216g += i9;
        }
        this.f2212c += i9;
        View view = this.f2210a;
        if (view.getLayoutParams() != null) {
            ((C0099c0) view.getLayoutParams()).f2085c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f10232a1 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f2212c = -1;
        this.f2213d = -1;
        this.f2214e = -1L;
        this.f2216g = -1;
        this.f2221m = 0;
        this.f2217h = null;
        this.f2218i = null;
        ArrayList arrayList = this.f2219k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f2224p = 0;
        this.f2225q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z9) {
        int i9;
        int i10 = this.f2221m;
        if (z9) {
            i9 = i10 - 1;
        } else {
            i9 = i10 + 1;
        }
        this.f2221m = i9;
        if (i9 < 0) {
            this.f2221m = 0;
            if (!RecyclerView.f10232a1) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z9 && i9 == 1) {
            this.j |= 16;
        } else if (z9 && i9 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.f10233b1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z9 + ":" + this);
        }
    }

    public final boolean p() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2212c + " id=" + this.f2214e + ", oldPos=" + this.f2213d + ", pLpos:" + this.f2216g);
        if (j()) {
            sb.append(" scrap ");
            if (this.f2223o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f2221m + ")");
        }
        if ((this.j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2210a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
