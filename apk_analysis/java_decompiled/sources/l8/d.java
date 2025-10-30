package l8;

import A6.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import x8.C2183c;
import x8.I;
import x8.K;
import x8.w;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20620a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f20621b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20622c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20624e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20625f;

    /* renamed from: g, reason: collision with root package name */
    public t f20626g;

    /* renamed from: h, reason: collision with root package name */
    public int f20627h;

    /* renamed from: i, reason: collision with root package name */
    public long f20628i;
    public final /* synthetic */ g j;

    public d(g gVar, String key) {
        kotlin.jvm.internal.h.e(key, "key");
        this.j = gVar;
        this.f20620a = key;
        gVar.getClass();
        this.f20621b = new long[2];
        this.f20622c = new ArrayList();
        this.f20623d = new ArrayList();
        StringBuilder sb = new StringBuilder(key);
        sb.append('.');
        int length = sb.length();
        for (int i9 = 0; i9 < 2; i9++) {
            sb.append(i9);
            this.f20622c.add(new File(this.j.f20640a, sb.toString()));
            sb.append(".tmp");
            this.f20623d.add(new File(this.j.f20640a, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [l8.c] */
    public final e a() {
        byte[] bArr = k8.c.f20141a;
        if (this.f20624e) {
            g gVar = this.j;
            if (gVar.j || (this.f20626g == null && !this.f20625f)) {
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.f20621b.clone();
                int i9 = 0;
                for (int i10 = 0; i10 < 2; i10++) {
                    try {
                        File file = (File) this.f20622c.get(i10);
                        kotlin.jvm.internal.h.e(file, "file");
                        Logger logger = w.f24682a;
                        C2183c c2183c = new C2183c(new FileInputStream(file), K.f24618d);
                        if (!gVar.j) {
                            this.f20627h++;
                            c2183c = new c(c2183c, gVar, this);
                        }
                        arrayList.add(c2183c);
                    } catch (FileNotFoundException unused) {
                        int size = arrayList.size();
                        while (i9 < size) {
                            Object obj = arrayList.get(i9);
                            i9++;
                            k8.c.d((I) obj);
                        }
                        try {
                            gVar.g0(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new e(this.j, this.f20620a, this.f20628i, arrayList, jArr);
            }
            return null;
        }
        return null;
    }
}
