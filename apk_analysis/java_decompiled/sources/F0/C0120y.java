package F0;

import androidx.datastore.preferences.protobuf.AbstractC0533t;
import androidx.datastore.preferences.protobuf.AbstractC0535v;
import androidx.datastore.preferences.protobuf.C0521g;
import androidx.datastore.preferences.protobuf.C0526l;
import androidx.datastore.preferences.protobuf.C0537x;
import androidx.datastore.preferences.protobuf.InterfaceC0534u;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.google.crypto.tink.shaded.protobuf.AbstractC1033d;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1041l;
import com.google.crypto.tink.shaded.protobuf.AbstractC1051w;
import com.google.crypto.tink.shaded.protobuf.AbstractC1054z;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import o7.C1728t;

/* renamed from: F0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2289a;

    /* renamed from: b, reason: collision with root package name */
    public int f2290b;

    /* renamed from: c, reason: collision with root package name */
    public int f2291c;

    /* renamed from: d, reason: collision with root package name */
    public int f2292d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2293e;

    public /* synthetic */ C0120y(int i9) {
        this.f2289a = i9;
    }

    public static void V(int i9) {
        if ((i9 & 3) == 0) {
        } else {
            throw com.google.crypto.tink.shaded.protobuf.B.f();
        }
    }

    public static void W(int i9) {
        if ((i9 & 7) == 0) {
        } else {
            throw com.google.crypto.tink.shaded.protobuf.B.f();
        }
    }

    public void A(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.u()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.u()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void B(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1051w;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            int i9 = this.f2290b & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        abstractC1051w.c(dVar.u());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                abstractC1051w.c(dVar.u());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Integer.valueOf(dVar.u()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Integer.valueOf(dVar.u()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void C(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.v()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.v()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void D(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
            int i10 = this.f2290b & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        i9.c(dVar.v());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                i9.c(dVar.v());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i11 = this.f2290b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Long.valueOf(dVar.v()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Long.valueOf(dVar.v()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void E(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 2) {
            if (i9 != 5) {
                throw C0537x.b();
            }
            do {
                ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.w()));
                if (!dVar.g()) {
                    C8 = dVar.C();
                } else {
                    return;
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        int D8 = dVar.D();
        if ((D8 & 3) == 0) {
            int f9 = dVar.f() + D8;
            do {
                ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.w()));
            } while (dVar.f() < f9);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void F(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1051w;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            int i9 = this.f2290b & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                do {
                    abstractC1051w.c(dVar.w());
                    if (!dVar.g()) {
                        C9 = dVar.C();
                    } else {
                        return;
                    }
                } while (C9 == this.f2290b);
                this.f2292d = C9;
                return;
            }
            int D8 = dVar.D();
            V(D8);
            int f9 = dVar.f() + D8;
            do {
                abstractC1051w.c(dVar.w());
            } while (dVar.f() < f9);
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                list.add(Integer.valueOf(dVar.w()));
                if (!dVar.g()) {
                    C8 = dVar.C();
                } else {
                    return;
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        int D9 = dVar.D();
        V(D9);
        int f10 = dVar.f() + D9;
        do {
            list.add(Integer.valueOf(dVar.w()));
        } while (dVar.f() < f10);
    }

    public void G(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 1) {
            if (i9 == 2) {
                int D8 = dVar.D();
                if ((D8 & 7) == 0) {
                    int f9 = dVar.f() + D8;
                    do {
                        ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.x()));
                    } while (dVar.f() < f9);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.x()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void H(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
            int i10 = this.f2290b & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int D8 = dVar.D();
                    W(D8);
                    int f9 = dVar.f() + D8;
                    do {
                        i9.c(dVar.x());
                    } while (dVar.f() < f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                i9.c(dVar.x());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i11 = this.f2290b & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int D9 = dVar.D();
                W(D9);
                int f10 = dVar.f() + D9;
                do {
                    list.add(Long.valueOf(dVar.x()));
                } while (dVar.f() < f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Long.valueOf(dVar.x()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void I(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.y()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.y()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void J(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1051w;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            int i9 = this.f2290b & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        abstractC1051w.c(dVar.y());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                abstractC1051w.c(dVar.y());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Integer.valueOf(dVar.y()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Integer.valueOf(dVar.y()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void K(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.z()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.z()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void L(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
            int i10 = this.f2290b & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        i9.c(dVar.z());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                i9.c(dVar.z());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i11 = this.f2290b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Long.valueOf(dVar.z()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Long.valueOf(dVar.z()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void M(InterfaceC0534u interfaceC0534u, boolean z9) {
        String A2;
        int C8;
        if ((this.f2290b & 7) != 2) {
            throw C0537x.b();
        }
        do {
            W5.d dVar = (W5.d) this.f2293e;
            if (z9) {
                T(2);
                A2 = dVar.B();
            } else {
                T(2);
                A2 = dVar.A();
            }
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(A2);
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void N(List list, boolean z9) {
        String A2;
        int C8;
        int C9;
        if ((this.f2290b & 7) == 2) {
            boolean z10 = list instanceof com.google.crypto.tink.shaded.protobuf.E;
            W5.d dVar = (W5.d) this.f2293e;
            if (z10 && !z9) {
                com.google.crypto.tink.shaded.protobuf.E e8 = (com.google.crypto.tink.shaded.protobuf.E) list;
                do {
                    e8.j(m());
                    if (!dVar.g()) {
                        C9 = dVar.C();
                    } else {
                        return;
                    }
                } while (C9 == this.f2290b);
                this.f2292d = C9;
                return;
            }
            do {
                if (z9) {
                    T(2);
                    A2 = dVar.B();
                } else {
                    T(2);
                    A2 = dVar.A();
                }
                list.add(A2);
                if (dVar.g()) {
                    return;
                } else {
                    C8 = dVar.C();
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.c();
    }

    public void O(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.D()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.D()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void P(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1051w;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            int i9 = this.f2290b & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        abstractC1051w.c(dVar.D());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                abstractC1051w.c(dVar.D());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Integer.valueOf(dVar.D()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Integer.valueOf(dVar.D()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void Q(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.E()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.E()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void R(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
            int i10 = this.f2290b & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        i9.c(dVar.E());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                i9.c(dVar.E());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i11 = this.f2290b & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Long.valueOf(dVar.E()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Long.valueOf(dVar.E()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void S(int i9) {
        switch (this.f2289a) {
            case 1:
                if (((W5.d) this.f2293e).f() == i9) {
                    return;
                } else {
                    throw C0537x.e();
                }
            default:
                if (((W5.d) this.f2293e).f() == i9) {
                    return;
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.B.g();
                }
        }
    }

    public void T(int i9) {
        switch (this.f2289a) {
            case 1:
                if ((this.f2290b & 7) == i9) {
                    return;
                } else {
                    throw C0537x.b();
                }
            default:
                if ((this.f2290b & 7) == i9) {
                    return;
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
        }
    }

    public boolean U() {
        int i9;
        W5.d dVar = (W5.d) this.f2293e;
        if (!dVar.g() && (i9 = this.f2290b) != this.f2291c) {
            return dVar.F(i9);
        }
        return false;
    }

    public void a(C1728t c1728t) {
        c1728t.f21719c = null;
        c1728t.f21717a = null;
        c1728t.f21718b = null;
        c1728t.f21725i = 1;
        int i9 = this.f2290b;
        if (i9 > 0) {
            int i10 = this.f2292d;
            if ((i10 & 1) == 0) {
                this.f2292d = i10 + 1;
                this.f2290b = i9 - 1;
                this.f2291c++;
            }
        }
        c1728t.f21717a = (C1728t) this.f2293e;
        this.f2293e = c1728t;
        int i11 = this.f2292d;
        int i12 = i11 + 1;
        this.f2292d = i12;
        int i13 = this.f2290b;
        if (i13 > 0 && (i12 & 1) == 0) {
            this.f2292d = i11 + 2;
            this.f2290b = i13 - 1;
            this.f2291c++;
        }
        int i14 = 4;
        while (true) {
            int i15 = i14 - 1;
            if ((this.f2292d & i15) == i15) {
                int i16 = this.f2291c;
                if (i16 == 0) {
                    C1728t c1728t2 = (C1728t) this.f2293e;
                    C1728t c1728t3 = c1728t2.f21717a;
                    C1728t c1728t4 = c1728t3.f21717a;
                    c1728t3.f21717a = c1728t4.f21717a;
                    this.f2293e = c1728t3;
                    c1728t3.f21718b = c1728t4;
                    c1728t3.f21719c = c1728t2;
                    c1728t3.f21725i = c1728t2.f21725i + 1;
                    c1728t4.f21717a = c1728t3;
                    c1728t2.f21717a = c1728t3;
                } else if (i16 == 1) {
                    C1728t c1728t5 = (C1728t) this.f2293e;
                    C1728t c1728t6 = c1728t5.f21717a;
                    this.f2293e = c1728t6;
                    c1728t6.f21719c = c1728t5;
                    c1728t6.f21725i = c1728t5.f21725i + 1;
                    c1728t5.f21717a = c1728t6;
                    this.f2291c = 0;
                } else if (i16 == 2) {
                    this.f2291c = 0;
                }
                i14 *= 2;
            } else {
                return;
            }
        }
    }

    public void b(I0.i iVar) {
        Object[] objArr = (Object[]) this.f2293e;
        int i9 = this.f2291c;
        objArr[i9] = iVar;
        int i10 = this.f2292d & (i9 + 1);
        this.f2291c = i10;
        int i11 = this.f2290b;
        if (i10 == i11) {
            int length = objArr.length;
            int i12 = length - i11;
            int i13 = length << 1;
            if (i13 >= 0) {
                Object[] objArr2 = new Object[i13];
                B7.j.e0(0, i11, length, objArr, objArr2);
                B7.j.e0(i12, 0, this.f2290b, (Object[]) this.f2293e, objArr2);
                this.f2293e = objArr2;
                this.f2290b = 0;
                this.f2291c = length;
                this.f2292d = i13 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void c(int i9, int i10) {
        if (i9 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f2292d;
                int i12 = i11 * 2;
                int[] iArr = (int[]) this.f2293e;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2293e = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i11 * 4];
                    this.f2293e = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.f2293e;
                iArr4[i12] = i9;
                iArr4[i12 + 1] = i10;
                this.f2292d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void d(RecyclerView recyclerView, boolean z9) {
        this.f2292d = 0;
        int[] iArr = (int[]) this.f2293e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.a aVar = recyclerView.f10291n;
        if (recyclerView.f10289m != null && aVar != null && aVar.f10345i) {
            if (z9) {
                if (!recyclerView.f10275e.j()) {
                    aVar.j(recyclerView.f10289m.a(), this);
                }
            } else if (!recyclerView.P()) {
                aVar.i(this.f2290b, this.f2291c, recyclerView.f10250F0, this);
            }
            int i9 = this.f2292d;
            if (i9 > aVar.j) {
                aVar.j = i9;
                aVar.f10346k = z9;
                recyclerView.f10273c.m();
            }
        }
    }

    public int e() {
        switch (this.f2289a) {
            case 1:
                int i9 = this.f2292d;
                if (i9 != 0) {
                    this.f2290b = i9;
                    this.f2292d = 0;
                } else {
                    this.f2290b = ((W5.d) this.f2293e).C();
                }
                int i10 = this.f2290b;
                if (i10 != 0 && i10 != this.f2291c) {
                    return i10 >>> 3;
                }
                return Integer.MAX_VALUE;
            default:
                int i11 = this.f2292d;
                if (i11 != 0) {
                    this.f2290b = i11;
                    this.f2292d = 0;
                } else {
                    this.f2290b = ((W5.d) this.f2293e).C();
                }
                int i12 = this.f2290b;
                if (i12 != 0 && i12 != this.f2291c) {
                    return i12 >>> 3;
                }
                return Integer.MAX_VALUE;
        }
    }

    public void f(Object obj, androidx.datastore.preferences.protobuf.T t7, C0526l c0526l) {
        int i9 = this.f2291c;
        this.f2291c = ((this.f2290b >>> 3) << 3) | 4;
        try {
            t7.e(obj, this, c0526l);
            if (this.f2290b == this.f2291c) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.f2291c = i9;
        }
    }

    public void g(Object obj, com.google.crypto.tink.shaded.protobuf.b0 b0Var, C1043n c1043n) {
        int i9 = this.f2291c;
        this.f2291c = ((this.f2290b >>> 3) << 3) | 4;
        try {
            b0Var.f(obj, this, c1043n);
            if (this.f2290b == this.f2291c) {
            } else {
                throw com.google.crypto.tink.shaded.protobuf.B.f();
            }
        } finally {
            this.f2291c = i9;
        }
    }

    public void h(Object obj, androidx.datastore.preferences.protobuf.T t7, C0526l c0526l) {
        W5.d dVar = (W5.d) this.f2293e;
        int D8 = dVar.D();
        if (dVar.f7931a < 100) {
            int l9 = dVar.l(D8);
            dVar.f7931a++;
            t7.e(obj, this, c0526l);
            dVar.b(0);
            dVar.f7931a--;
            dVar.j(l9);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void i(Object obj, com.google.crypto.tink.shaded.protobuf.b0 b0Var, C1043n c1043n) {
        W5.d dVar = (W5.d) this.f2293e;
        int D8 = dVar.D();
        if (dVar.f7931a < 100) {
            int l9 = dVar.l(D8);
            dVar.f7931a++;
            b0Var.f(obj, this, c1043n);
            dVar.b(0);
            dVar.f7931a--;
            dVar.j(l9);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void j(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Boolean.valueOf(dVar.m()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Boolean.valueOf(dVar.m()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void k(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1033d;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1033d abstractC1033d = (AbstractC1033d) list;
            int i9 = this.f2290b & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        abstractC1033d.c(dVar.m());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                abstractC1033d.c(dVar.m());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Boolean.valueOf(dVar.m()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Boolean.valueOf(dVar.m()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public C0521g l() {
        T(2);
        return ((W5.d) this.f2293e).n();
    }

    public AbstractC1037h m() {
        T(2);
        return ((W5.d) this.f2293e).o();
    }

    public void n(InterfaceC0534u interfaceC0534u) {
        int C8;
        if ((this.f2290b & 7) != 2) {
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(l());
            W5.d dVar = (W5.d) this.f2293e;
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void o(List list) {
        int C8;
        if ((this.f2290b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(m());
            W5.d dVar = (W5.d) this.f2293e;
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void p(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 1) {
            if (i9 == 2) {
                int D8 = dVar.D();
                if ((D8 & 7) == 0) {
                    int f9 = dVar.f() + D8;
                    do {
                        ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Double.valueOf(dVar.p()));
                    } while (dVar.f() < f9);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Double.valueOf(dVar.p()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void q(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1041l;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1041l abstractC1041l = (AbstractC1041l) list;
            int i9 = this.f2290b & 7;
            if (i9 != 1) {
                if (i9 == 2) {
                    int D8 = dVar.D();
                    W(D8);
                    int f9 = dVar.f() + D8;
                    do {
                        abstractC1041l.c(dVar.p());
                    } while (dVar.f() < f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                abstractC1041l.c(dVar.p());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int D9 = dVar.D();
                W(D9);
                int f10 = dVar.f() + D9;
                do {
                    list.add(Double.valueOf(dVar.p()));
                } while (dVar.f() < f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Double.valueOf(dVar.p()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void r(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 0) {
            if (i9 == 2) {
                int f9 = dVar.f() + dVar.D();
                do {
                    ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.q()));
                } while (dVar.f() < f9);
                S(f9);
                return;
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.q()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void s(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1051w;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            int i9 = this.f2290b & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int f9 = dVar.f() + dVar.D();
                    do {
                        abstractC1051w.c(dVar.q());
                    } while (dVar.f() < f9);
                    S(f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                abstractC1051w.c(dVar.q());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int f10 = dVar.f() + dVar.D();
                do {
                    list.add(Integer.valueOf(dVar.q()));
                } while (dVar.f() < f10);
                S(f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Integer.valueOf(dVar.q()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public Object t(androidx.datastore.preferences.protobuf.o0 o0Var, Class cls, C0526l c0526l) {
        int ordinal = o0Var.ordinal();
        W5.d dVar = (W5.d) this.f2293e;
        switch (ordinal) {
            case 0:
                T(1);
                return Double.valueOf(dVar.p());
            case 1:
                T(5);
                return Float.valueOf(dVar.t());
            case 2:
                T(0);
                return Long.valueOf(dVar.v());
            case 3:
                T(0);
                return Long.valueOf(dVar.E());
            case 4:
                T(0);
                return Integer.valueOf(dVar.u());
            case 5:
                T(1);
                return Long.valueOf(dVar.s());
            case 6:
                T(5);
                return Integer.valueOf(dVar.r());
            case 7:
                T(0);
                return Boolean.valueOf(dVar.m());
            case 8:
                T(2);
                return dVar.B();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case R.styleable.GradientColor_android_endX /* 10 */:
                T(2);
                androidx.datastore.preferences.protobuf.T a5 = androidx.datastore.preferences.protobuf.P.f9654c.a(cls);
                AbstractC0533t d9 = a5.d();
                h(d9, a5, c0526l);
                a5.b(d9);
                return d9;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return l();
            case 12:
                T(0);
                return Integer.valueOf(dVar.D());
            case 13:
                T(0);
                return Integer.valueOf(dVar.q());
            case 14:
                T(5);
                return Integer.valueOf(dVar.w());
            case 15:
                T(1);
                return Long.valueOf(dVar.x());
            case 16:
                T(0);
                return Integer.valueOf(dVar.y());
            case 17:
                T(0);
                return Long.valueOf(dVar.z());
        }
    }

    public void u(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 2) {
            if (i9 != 5) {
                throw C0537x.b();
            }
            do {
                ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.r()));
                if (!dVar.g()) {
                    C8 = dVar.C();
                } else {
                    return;
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        int D8 = dVar.D();
        if ((D8 & 3) == 0) {
            int f9 = dVar.f() + D8;
            do {
                ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Integer.valueOf(dVar.r()));
            } while (dVar.f() < f9);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void v(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof AbstractC1051w;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            AbstractC1051w abstractC1051w = (AbstractC1051w) list;
            int i9 = this.f2290b & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                do {
                    abstractC1051w.c(dVar.r());
                    if (!dVar.g()) {
                        C9 = dVar.C();
                    } else {
                        return;
                    }
                } while (C9 == this.f2290b);
                this.f2292d = C9;
                return;
            }
            int D8 = dVar.D();
            V(D8);
            int f9 = dVar.f() + D8;
            do {
                abstractC1051w.c(dVar.r());
            } while (dVar.f() < f9);
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                list.add(Integer.valueOf(dVar.r()));
                if (!dVar.g()) {
                    C8 = dVar.C();
                } else {
                    return;
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        int D9 = dVar.D();
        V(D9);
        int f10 = dVar.f() + D9;
        do {
            list.add(Integer.valueOf(dVar.r()));
        } while (dVar.f() < f10);
    }

    public void w(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 1) {
            if (i9 == 2) {
                int D8 = dVar.D();
                if ((D8 & 7) == 0) {
                    int f9 = dVar.f() + D8;
                    do {
                        ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.s()));
                    } while (dVar.f() < f9);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C0537x.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Long.valueOf(dVar.s()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void x(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.I;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            com.google.crypto.tink.shaded.protobuf.I i9 = (com.google.crypto.tink.shaded.protobuf.I) list;
            int i10 = this.f2290b & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int D8 = dVar.D();
                    W(D8);
                    int f9 = dVar.f() + D8;
                    do {
                        i9.c(dVar.s());
                    } while (dVar.f() < f9);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                i9.c(dVar.s());
                if (!dVar.g()) {
                    C9 = dVar.C();
                } else {
                    return;
                }
            } while (C9 == this.f2290b);
            this.f2292d = C9;
            return;
        }
        int i11 = this.f2290b & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int D9 = dVar.D();
                W(D9);
                int f10 = dVar.f() + D9;
                do {
                    list.add(Long.valueOf(dVar.s()));
                } while (dVar.f() < f10);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.c();
        }
        do {
            list.add(Long.valueOf(dVar.s()));
            if (dVar.g()) {
                return;
            } else {
                C8 = dVar.C();
            }
        } while (C8 == this.f2290b);
        this.f2292d = C8;
    }

    public void y(InterfaceC0534u interfaceC0534u) {
        int C8;
        int i9 = this.f2290b & 7;
        W5.d dVar = (W5.d) this.f2293e;
        if (i9 != 2) {
            if (i9 != 5) {
                throw C0537x.b();
            }
            do {
                ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Float.valueOf(dVar.t()));
                if (!dVar.g()) {
                    C8 = dVar.C();
                } else {
                    return;
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        int D8 = dVar.D();
        if ((D8 & 3) == 0) {
            int f9 = dVar.f() + D8;
            do {
                ((androidx.datastore.preferences.protobuf.Q) interfaceC0534u).add(Float.valueOf(dVar.t()));
            } while (dVar.f() < f9);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void z(List list) {
        int C8;
        int C9;
        boolean z9 = list instanceof com.google.crypto.tink.shaded.protobuf.r;
        W5.d dVar = (W5.d) this.f2293e;
        if (z9) {
            com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) list;
            int i9 = this.f2290b & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.B.c();
                }
                do {
                    rVar.c(dVar.t());
                    if (!dVar.g()) {
                        C9 = dVar.C();
                    } else {
                        return;
                    }
                } while (C9 == this.f2290b);
                this.f2292d = C9;
                return;
            }
            int D8 = dVar.D();
            V(D8);
            int f9 = dVar.f() + D8;
            do {
                rVar.c(dVar.t());
            } while (dVar.f() < f9);
            return;
        }
        int i10 = this.f2290b & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.B.c();
            }
            do {
                list.add(Float.valueOf(dVar.t()));
                if (!dVar.g()) {
                    C8 = dVar.C();
                } else {
                    return;
                }
            } while (C8 == this.f2290b);
            this.f2292d = C8;
            return;
        }
        int D9 = dVar.D();
        V(D9);
        int f10 = dVar.f() + D9;
        do {
            list.add(Float.valueOf(dVar.t()));
        } while (dVar.f() < f10);
    }

    public C0120y(W5.d dVar) {
        this.f2289a = 1;
        this.f2292d = 0;
        Charset charset = AbstractC0535v.f9765a;
        this.f2293e = dVar;
        dVar.f7932b = this;
    }

    public C0120y(W5.d dVar, byte b9) {
        this.f2289a = 2;
        this.f2292d = 0;
        AbstractC1054z.a(dVar, "input");
        this.f2293e = dVar;
        dVar.f7932b = this;
    }
}
