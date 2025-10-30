package S0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f6701e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6702a;

    /* renamed from: b, reason: collision with root package name */
    public final File f6703b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f6704c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f6705d;

    public a(String str, File file, boolean z9) {
        File file2;
        Lock lock;
        this.f6702a = z9;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f6703b = file2;
        HashMap hashMap = f6701e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6704c = lock;
    }

    public final void a(boolean z9) {
        this.f6704c.lock();
        if (z9) {
            File file = this.f6703b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f6705d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e8) {
                this.f6705d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e8);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f6705d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f6704c.unlock();
    }
}
