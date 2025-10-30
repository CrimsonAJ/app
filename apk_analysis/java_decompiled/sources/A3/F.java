package A3;

import F0.C0099c0;
import F0.C0104h;
import F0.S;
import F0.r0;
import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import d1.C1101g;
import java.util.ArrayList;
import java.util.HashMap;
import l4.AbstractC1566a;
import o1.C1671f;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class F implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49a;

    /* renamed from: b, reason: collision with root package name */
    public int f50b;

    /* renamed from: c, reason: collision with root package name */
    public Object f51c;

    /* renamed from: d, reason: collision with root package name */
    public Object f52d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53e;

    /* renamed from: f, reason: collision with root package name */
    public Object f54f;

    public /* synthetic */ F(int i9) {
        this.f49a = i9;
    }

    public static void a(String str, int i9, int i10) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z9 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z9 = true;
        }
        AbstractC1566a.j(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z9);
        GLES20.glAttachShader(i9, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        AbstractC1566a.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
    
        if (r29.x() == 21) goto L42;
     */
    @Override // A3.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(A4.r r29) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.F.c(A4.r):void");
    }

    public void d(View view, int i9, boolean z9) {
        int j;
        RecyclerView recyclerView = (RecyclerView) ((C1671f) this.f51c).f21473b;
        if (i9 < 0) {
            j = recyclerView.getChildCount();
        } else {
            j = j(i9);
        }
        ((C0104h) this.f52d).J(j, z9);
        if (z9) {
            m(view);
        }
        recyclerView.addView(view, j);
        r0 N8 = RecyclerView.N(view);
        S s9 = recyclerView.f10289m;
        if (s9 != null && N8 != null) {
            s9.k(N8);
        }
        ArrayList arrayList = recyclerView.f10245C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1101g) recyclerView.f10245C.get(size)).getClass();
                C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0099c0).width != -1 || ((ViewGroup.MarginLayoutParams) c0099c0).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void e(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int j;
        RecyclerView recyclerView = (RecyclerView) ((C1671f) this.f51c).f21473b;
        if (i9 < 0) {
            j = recyclerView.getChildCount();
        } else {
            j = j(i9);
        }
        ((C0104h) this.f52d).J(j, z9);
        if (z9) {
            m(view);
        }
        r0 N8 = RecyclerView.N(view);
        if (N8 != null) {
            if (!N8.k() && !N8.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N8);
                throw new IllegalArgumentException(A0.a.j(recyclerView, sb));
            }
            if (RecyclerView.f10233b1) {
                Log.d("RecyclerView", "reAttach " + N8);
            }
            N8.j &= -257;
        } else if (RecyclerView.f10232a1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(j);
            throw new IllegalArgumentException(A0.a.j(recyclerView, sb2));
        }
        RecyclerView.a(recyclerView, view, j, layoutParams);
    }

    public void f(int i9) {
        int j = j(i9);
        ((C0104h) this.f52d).K(j);
        RecyclerView recyclerView = (RecyclerView) ((C1671f) this.f51c).f21473b;
        View childAt = recyclerView.getChildAt(j);
        if (childAt != null) {
            r0 N8 = RecyclerView.N(childAt);
            if (N8 != null) {
                if (N8.k() && !N8.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N8);
                    throw new IllegalArgumentException(A0.a.j(recyclerView, sb));
                }
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "tmpDetach " + N8);
                }
                N8.a(256);
            }
        } else if (RecyclerView.f10232a1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(j);
            throw new IllegalArgumentException(A0.a.j(recyclerView, sb2));
        }
        RecyclerView.c(recyclerView, j);
    }

    public int g(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f50b, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        AbstractC1566a.i();
        return glGetAttribLocation;
    }

    public View h(int i9) {
        return ((RecyclerView) ((C1671f) this.f51c).f21473b).getChildAt(j(i9));
    }

    public int i() {
        return ((RecyclerView) ((C1671f) this.f51c).f21473b).getChildCount() - ((ArrayList) this.f53e).size();
    }

    public int j(int i9) {
        if (i9 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C1671f) this.f51c).f21473b).getChildCount();
        int i10 = i9;
        while (i10 < childCount) {
            C0104h c0104h = (C0104h) this.f52d;
            int G8 = i9 - (i10 - c0104h.G(i10));
            if (G8 == 0) {
                while (c0104h.I(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += G8;
        }
        return -1;
    }

    public View k(int i9) {
        return ((RecyclerView) ((C1671f) this.f51c).f21473b).getChildAt(i9);
    }

    public int l() {
        return ((RecyclerView) ((C1671f) this.f51c).f21473b).getChildCount();
    }

    public void m(View view) {
        ((ArrayList) this.f53e).add(view);
        C1671f c1671f = (C1671f) this.f51c;
        r0 N8 = RecyclerView.N(view);
        if (N8 != null) {
            int i9 = N8.f2225q;
            View view2 = N8.f2210a;
            if (i9 != -1) {
                N8.f2224p = i9;
            } else {
                N8.f2224p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c1671f.f21473b;
            if (recyclerView.Q()) {
                N8.f2225q = 4;
                recyclerView.f10263S0.add(N8);
            } else {
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void n(int i9) {
        C1671f c1671f = (C1671f) this.f51c;
        int i10 = this.f50b;
        if (i10 != 1) {
            if (i10 != 2) {
                try {
                    int j = j(i9);
                    View childAt = ((RecyclerView) c1671f.f21473b).getChildAt(j);
                    if (childAt != null) {
                        this.f50b = 1;
                        this.f54f = childAt;
                        if (((C0104h) this.f52d).K(j)) {
                            o(childAt);
                        }
                        c1671f.K(j);
                    }
                    this.f50b = 0;
                    this.f54f = null;
                    return;
                } catch (Throwable th) {
                    this.f50b = 0;
                    this.f54f = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void o(View view) {
        if (((ArrayList) this.f53e).remove(view)) {
            C1671f c1671f = (C1671f) this.f51c;
            r0 N8 = RecyclerView.N(view);
            if (N8 != null) {
                int i9 = N8.f2224p;
                RecyclerView recyclerView = (RecyclerView) c1671f.f21473b;
                if (recyclerView.Q()) {
                    N8.f2225q = i9;
                    recyclerView.f10263S0.add(N8);
                } else {
                    N8.f2210a.setImportantForAccessibility(i9);
                }
                N8.f2224p = 0;
            }
        }
    }

    public String toString() {
        switch (this.f49a) {
            case 2:
                return ((C0104h) this.f52d).toString() + ", hidden list:" + ((ArrayList) this.f53e).size();
            default:
                return super.toString();
        }
    }

    public F(C1671f c1671f) {
        this.f49a = 2;
        this.f50b = 0;
        this.f51c = c1671f;
        this.f52d = new C0104h(0);
        this.f53e = new ArrayList();
    }

    public F(String str, String str2) {
        this.f49a = 4;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f50b = glCreateProgram;
        AbstractC1566a.i();
        a(str, glCreateProgram, 35633);
        a(str2, glCreateProgram, 35632);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        AbstractC1566a.j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.f53e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f51c = new d0.w[iArr2[0]];
        for (int i9 = 0; i9 < iArr2[0]; i9++) {
            int i10 = this.f50b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr3, 0);
            int i11 = iArr3[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveAttrib(i10, i9, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (bArr[i12] == 0) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            String str3 = new String(bArr, 0, i11);
            GLES20.glGetAttribLocation(i10, str3);
            d0.w wVar = new d0.w(7);
            ((d0.w[]) this.f51c)[i9] = wVar;
            ((HashMap) this.f53e).put(str3, wVar);
        }
        this.f54f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f50b, 35718, iArr4, 0);
        this.f52d = new e0.c[iArr4[0]];
        for (int i13 = 0; i13 < iArr4[0]; i13++) {
            int i14 = this.f50b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr5, 0);
            int i15 = iArr5[0];
            byte[] bArr2 = new byte[i15];
            GLES20.glGetActiveUniform(i14, i13, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i16 = 0;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (bArr2[i16] == 0) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            String str4 = new String(bArr2, 0, i15);
            GLES20.glGetUniformLocation(i14, str4);
            e0.c cVar = new e0.c(7);
            ((e0.c[]) this.f52d)[i13] = cVar;
            ((HashMap) this.f54f).put(str4, cVar);
        }
        AbstractC1566a.i();
    }

    public F(l3.I i9, q3.w wVar, byte[] bArr, H1.k[] kVarArr, int i10) {
        this.f49a = 5;
        this.f51c = i9;
        this.f52d = wVar;
        this.f53e = bArr;
        this.f54f = kVarArr;
        this.f50b = i10;
    }

    public F(G g9, int i9) {
        this.f49a = 0;
        this.f54f = g9;
        this.f51c = new Z3.f(5, new byte[5]);
        this.f52d = new SparseArray();
        this.f53e = new SparseIntArray();
        this.f50b = i9;
    }

    @Override // A3.B
    public void b(l4.x xVar, InterfaceC1907l interfaceC1907l, I i9) {
    }
}
