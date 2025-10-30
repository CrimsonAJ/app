package k4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: k4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509i extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f20061e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f20062f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f20063g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f20064h;

    /* renamed from: i, reason: collision with root package name */
    public long f20065i;
    public boolean j;

    public C1509i(Context context) {
        super(false);
        this.f20061e = context.getContentResolver();
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f20065i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e8) {
                    throw new C1514n(e8, 2000);
                }
            }
            FileInputStream fileInputStream = this.f20064h;
            int i11 = l4.y.f20553a;
            int read = fileInputStream.read(bArr, i9, i10);
            if (read != -1) {
                long j4 = this.f20065i;
                if (j4 != -1) {
                    this.f20065i = j4 - read;
                }
                c(read);
                return read;
            }
        }
        return -1;
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f20062f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f20064h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f20064h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20063g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e8) {
                        throw new C1514n(e8, 2000);
                    }
                } finally {
                    this.f20063g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                }
            } catch (IOException e9) {
                throw new C1514n(e9, 2000);
            }
        } catch (Throwable th) {
            this.f20064h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f20063g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f20063g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new C1514n(e10, 2000);
                }
            } finally {
                this.f20063g = null;
                if (this.j) {
                    this.j = false;
                    d();
                }
            }
        }
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        int i9;
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        try {
            try {
                Uri uri = c1516p.f20077a;
                this.f20062f = uri;
                h();
                boolean equals = "content".equals(c1516p.f20077a.getScheme());
                ContentResolver contentResolver = this.f20061e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                }
                this.f20063g = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.f20064h = fileInputStream;
                    long j = c1516p.f20081e;
                    if (length != -1 && j > length) {
                        throw new C1514n((Exception) null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f20065i = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f20065i = position;
                                if (position < 0) {
                                    throw new C1514n((Exception) null, 2008);
                                }
                            }
                        } else {
                            long j4 = length - skip;
                            this.f20065i = j4;
                            if (j4 < 0) {
                                throw new C1514n((Exception) null, 2008);
                            }
                        }
                        long j9 = c1516p.f20082f;
                        if (j9 != -1) {
                            long j10 = this.f20065i;
                            if (j10 == -1) {
                                min = j9;
                            } else {
                                min = Math.min(j10, j9);
                            }
                            this.f20065i = min;
                        }
                        this.j = true;
                        i(c1516p);
                        if (j9 != -1) {
                            return j9;
                        }
                        return this.f20065i;
                    }
                    throw new C1514n((Exception) null, 2008);
                }
                i9 = 2000;
                try {
                    throw new C1514n(new IOException("Could not open file descriptor for: " + uri), 2000);
                } catch (IOException e8) {
                    e = e8;
                    if (e instanceof FileNotFoundException) {
                        i9 = 2005;
                    }
                    throw new C1514n(e, i9);
                }
            } catch (IOException e9) {
                e = e9;
                i9 = 2000;
            }
        } catch (C1508h e10) {
            throw e10;
        }
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f20062f;
    }
}
