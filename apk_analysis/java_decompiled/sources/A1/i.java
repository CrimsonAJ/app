package A1;

import B7.k;
import C3.z;
import N3.M;
import N3.c0;
import N3.d0;
import Q.q;
import U3.r;
import U3.s;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q3.C1902g;

/* loaded from: classes.dex */
public final class i implements z, d0, q {

    /* renamed from: a, reason: collision with root package name */
    public int f24a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25b;

    public /* synthetic */ i(int i9, Object obj) {
        this.f25b = obj;
        this.f24a = i9;
    }

    public void a(long j) {
        int i9 = this.f24a;
        long[] jArr = (long[]) this.f25b;
        if (i9 == jArr.length) {
            this.f25b = Arrays.copyOf(jArr, i9 * 2);
        }
        long[] jArr2 = (long[]) this.f25b;
        int i10 = this.f24a;
        this.f24a = i10 + 1;
        jArr2[i10] = j;
    }

    @Override // N3.d0
    public void b() {
        M m9 = ((s) this.f25b).f7446l;
        if (m9 == null) {
        } else {
            throw m9;
        }
    }

    @Override // C3.z
    public MediaCodecInfo c(int i9) {
        if (((MediaCodecInfo[]) this.f25b) == null) {
            this.f25b = new MediaCodecList(this.f24a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f25b)[i9];
    }

    @Override // N3.d0
    public int d(O0.c cVar, m3.f fVar, int i9) {
        s sVar = (s) this.f25b;
        if (sVar.f7451q) {
            return -3;
        }
        r rVar = (r) sVar.f7440e.get(this.f24a);
        return rVar.f7432c.z(cVar, fVar, i9, rVar.f7433d);
    }

    public void e() {
        Bitmap bitmap;
        WeakReference weakReference;
        this.f24a = 0;
        Iterator it = ((LinkedHashMap) this.f25b).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                h hVar = (h) k.q0(arrayList);
                if (hVar != null && (weakReference = hVar.f21b) != null) {
                    bitmap = (Bitmap) weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = i10 - i9;
                    if (((h) arrayList.get(i11)).f21b.get() == null) {
                        arrayList.remove(i11);
                        i9++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // C3.z
    public boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // Q.q
    public boolean g(View view) {
        ((BottomSheetBehavior) this.f25b).I(this.f24a);
        return true;
    }

    public long h(int i9) {
        if (i9 >= 0 && i9 < this.f24a) {
            return ((long[]) this.f25b)[i9];
        }
        StringBuilder p9 = A0.a.p("Invalid index ", i9, ", size is ");
        p9.append(this.f24a);
        throw new IndexOutOfBoundsException(p9.toString());
    }

    @Override // C3.z
    public int i() {
        if (((MediaCodecInfo[]) this.f25b) == null) {
            this.f25b = new MediaCodecList(this.f24a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f25b).length;
    }

    @Override // N3.d0
    public boolean j() {
        s sVar = (s) this.f25b;
        if (!sVar.f7451q) {
            r rVar = (r) sVar.f7440e.get(this.f24a);
            if (rVar.f7432c.u(rVar.f7433d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public long k(C1902g c1902g) {
        A4.r rVar = (A4.r) this.f25b;
        int i9 = 0;
        c1902g.t((byte[]) rVar.f384c, 0, 1, false);
        int i10 = ((byte[]) rVar.f384c)[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        c1902g.t((byte[]) rVar.f384c, 1, i12, false);
        while (i9 < i12) {
            i9++;
            i13 = (((byte[]) rVar.f384c)[i9] & 255) + (i13 << 8);
        }
        this.f24a = i12 + 1 + this.f24a;
        return i13;
    }

    public synchronized void l(b bVar, Bitmap bitmap, Map map, int i9) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f25b;
            Object obj = linkedHashMap.get(bVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(bVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            h hVar = new h(identityHashCode, new WeakReference(bitmap), map, i9);
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    h hVar2 = (h) arrayList.get(i10);
                    if (i9 >= hVar2.f23d) {
                        if (hVar2.f20a == identityHashCode && hVar2.f21b.get() == bitmap) {
                            arrayList.set(i10, hVar);
                        } else {
                            arrayList.add(i10, hVar);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    arrayList.add(hVar);
                    break;
                }
            }
            int i11 = this.f24a;
            this.f24a = i11 + 1;
            if (i11 >= 10) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // N3.d0
    public int m(long j) {
        s sVar = (s) this.f25b;
        if (sVar.f7451q) {
            return -3;
        }
        r rVar = (r) sVar.f7440e.get(this.f24a);
        c0 c0Var = rVar.f7432c;
        int s9 = c0Var.s(j, rVar.f7433d);
        c0Var.F(s9);
        return s9;
    }

    @Override // C3.z
    public boolean n(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public synchronized void o(int i9) {
        if (i9 >= 10 && i9 != 20) {
            e();
        }
    }

    @Override // C3.z
    public boolean p() {
        return true;
    }

    public i(int i9) {
        switch (i9) {
            case 5:
                this.f25b = new long[32];
                return;
            case 6:
            default:
                this.f25b = new LinkedHashMap();
                return;
            case 7:
                this.f25b = new A4.r(8);
                return;
        }
    }
}
