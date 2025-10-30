package u0;

import B6.u0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class L extends T {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23436r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i9, boolean z9) {
        super(z9);
        this.f23436r = i9;
    }

    public static float[] g(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        return new float[]{((Number) T.f23450i.d(value)).floatValue()};
    }

    public static int[] h(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        return new int[]{((Number) T.f23443b.d(value)).intValue()};
    }

    public static long[] i(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        return new long[]{((Number) T.f23447f.d(value)).longValue()};
    }

    public static boolean[] j(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        return new boolean[]{((Boolean) T.f23452l.d(value)).booleanValue()};
    }

    @Override // u0.T
    public final Object a(String str, Bundle bundle) {
        switch (this.f23436r) {
            case 0:
                return (boolean[]) z.d(bundle, "bundle", str, "key", str);
            case 1:
                boolean[] zArr = (boolean[]) z.d(bundle, "bundle", str, "key", str);
                if (zArr != null) {
                    kotlin.jvm.internal.h.e(zArr, "<this>");
                    int length = zArr.length;
                    if (length != 0) {
                        if (length != 1) {
                            ArrayList arrayList = new ArrayList(zArr.length);
                            for (boolean z9 : zArr) {
                                arrayList.add(Boolean.valueOf(z9));
                            }
                            return arrayList;
                        }
                        return u0.D(Boolean.valueOf(zArr[0]));
                    }
                    return B7.t.f1135a;
                }
                return null;
            case 2:
                return (float[]) z.d(bundle, "bundle", str, "key", str);
            case 3:
                float[] fArr = (float[]) z.d(bundle, "bundle", str, "key", str);
                if (fArr != null) {
                    kotlin.jvm.internal.h.e(fArr, "<this>");
                    int length2 = fArr.length;
                    if (length2 != 0) {
                        if (length2 != 1) {
                            ArrayList arrayList2 = new ArrayList(fArr.length);
                            for (float f9 : fArr) {
                                arrayList2.add(Float.valueOf(f9));
                            }
                            return arrayList2;
                        }
                        return u0.D(Float.valueOf(fArr[0]));
                    }
                    return B7.t.f1135a;
                }
                return null;
            case 4:
                return (int[]) z.d(bundle, "bundle", str, "key", str);
            case 5:
                int[] iArr = (int[]) z.d(bundle, "bundle", str, "key", str);
                if (iArr != null) {
                    kotlin.jvm.internal.h.e(iArr, "<this>");
                    int length3 = iArr.length;
                    if (length3 != 0) {
                        if (length3 != 1) {
                            ArrayList arrayList3 = new ArrayList(iArr.length);
                            for (int i9 : iArr) {
                                arrayList3.add(Integer.valueOf(i9));
                            }
                            return arrayList3;
                        }
                        return u0.D(Integer.valueOf(iArr[0]));
                    }
                    return B7.t.f1135a;
                }
                return null;
            case 6:
                return (long[]) z.d(bundle, "bundle", str, "key", str);
            case 7:
                long[] jArr = (long[]) z.d(bundle, "bundle", str, "key", str);
                if (jArr != null) {
                    kotlin.jvm.internal.h.e(jArr, "<this>");
                    int length4 = jArr.length;
                    if (length4 != 0) {
                        if (length4 != 1) {
                            ArrayList arrayList4 = new ArrayList(jArr.length);
                            for (long j : jArr) {
                                arrayList4.add(Long.valueOf(j));
                            }
                            return arrayList4;
                        }
                        return u0.D(Long.valueOf(jArr[0]));
                    }
                    return B7.t.f1135a;
                }
                return null;
            case 8:
                return (String[]) z.d(bundle, "bundle", str, "key", str);
            default:
                String[] strArr = (String[]) z.d(bundle, "bundle", str, "key", str);
                if (strArr != null) {
                    return B7.j.o0(strArr);
                }
                return null;
        }
    }

    @Override // u0.T
    public final String b() {
        switch (this.f23436r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // u0.T
    public final Object c(Object obj, String str) {
        switch (this.f23436r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] j = j(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(j, 0, copyOf, length, 1);
                    kotlin.jvm.internal.h.b(copyOf);
                    return copyOf;
                }
                return j(str);
            case 1:
                List list = (List) obj;
                M m9 = T.f23452l;
                if (list != null) {
                    return B7.k.y0(list, u0.D(m9.d(str)));
                }
                return u0.D(m9.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] g9 = g(str);
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(g9, 0, copyOf2, length2, 1);
                    kotlin.jvm.internal.h.b(copyOf2);
                    return copyOf2;
                }
                return g(str);
            case 3:
                List list2 = (List) obj;
                M m10 = T.f23450i;
                if (list2 != null) {
                    return B7.k.y0(list2, u0.D(m10.d(str)));
                }
                return u0.D(m10.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] h7 = h(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(h7, 0, copyOf3, length3, 1);
                    kotlin.jvm.internal.h.b(copyOf3);
                    return copyOf3;
                }
                return h(str);
            case 5:
                List list3 = (List) obj;
                M m11 = T.f23443b;
                if (list3 != null) {
                    return B7.k.y0(list3, u0.D(m11.d(str)));
                }
                return u0.D(m11.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] i9 = i(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(i9, 0, copyOf4, length4, 1);
                    kotlin.jvm.internal.h.b(copyOf4);
                    return copyOf4;
                }
                return i(str);
            case 7:
                List list4 = (List) obj;
                M m12 = T.f23447f;
                if (list4 != null) {
                    return B7.k.y0(list4, u0.D(m12.d(str)));
                }
                return u0.D(m12.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    kotlin.jvm.internal.h.b(copyOf5);
                    return (String[]) copyOf5;
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return B7.k.y0(list5, u0.D(str));
                }
                return u0.D(str);
        }
    }

    @Override // u0.T
    public final Object d(String value) {
        switch (this.f23436r) {
            case 0:
                return j(value);
            case 1:
                kotlin.jvm.internal.h.e(value, "value");
                return u0.D(T.f23452l.d(value));
            case 2:
                return g(value);
            case 3:
                kotlin.jvm.internal.h.e(value, "value");
                return u0.D(T.f23450i.d(value));
            case 4:
                return h(value);
            case 5:
                kotlin.jvm.internal.h.e(value, "value");
                return u0.D(T.f23443b.d(value));
            case 6:
                return i(value);
            case 7:
                kotlin.jvm.internal.h.e(value, "value");
                return u0.D(T.f23447f.d(value));
            case 8:
                kotlin.jvm.internal.h.e(value, "value");
                return new String[]{value};
            default:
                kotlin.jvm.internal.h.e(value, "value");
                return u0.D(value);
        }
    }

    @Override // u0.T
    public final void e(Bundle bundle, String key, Object obj) {
        boolean[] zArr;
        float[] fArr;
        int[] iArr;
        long[] jArr;
        String[] strArr;
        switch (this.f23436r) {
            case 0:
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                return;
            case 1:
                List list = (List) obj;
                kotlin.jvm.internal.h.e(key, "key");
                if (list != null) {
                    kotlin.jvm.internal.h.e(list, "<this>");
                    zArr = new boolean[list.size()];
                    Iterator it = list.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        zArr[i9] = ((Boolean) it.next()).booleanValue();
                        i9++;
                    }
                } else {
                    zArr = null;
                }
                bundle.putBooleanArray(key, zArr);
                return;
            case 2:
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                return;
            case 3:
                List list2 = (List) obj;
                kotlin.jvm.internal.h.e(key, "key");
                if (list2 != null) {
                    fArr = new float[list2.size()];
                    Iterator it2 = list2.iterator();
                    int i10 = 0;
                    while (it2.hasNext()) {
                        fArr[i10] = ((Number) it2.next()).floatValue();
                        i10++;
                    }
                } else {
                    fArr = null;
                }
                bundle.putFloatArray(key, fArr);
                return;
            case 4:
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                return;
            case 5:
                List list3 = (List) obj;
                kotlin.jvm.internal.h.e(key, "key");
                if (list3 != null) {
                    iArr = B7.k.G0(list3);
                } else {
                    iArr = null;
                }
                bundle.putIntArray(key, iArr);
                return;
            case 6:
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                return;
            case 7:
                List list4 = (List) obj;
                kotlin.jvm.internal.h.e(key, "key");
                if (list4 != null) {
                    jArr = new long[list4.size()];
                    Iterator it3 = list4.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        jArr[i11] = ((Number) it3.next()).longValue();
                        i11++;
                    }
                } else {
                    jArr = null;
                }
                bundle.putLongArray(key, jArr);
                return;
            case 8:
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                return;
            default:
                List list5 = (List) obj;
                kotlin.jvm.internal.h.e(key, "key");
                if (list5 != null) {
                    strArr = (String[]) list5.toArray(new String[0]);
                } else {
                    strArr = null;
                }
                bundle.putStringArray(key, strArr);
                return;
        }
    }
}
