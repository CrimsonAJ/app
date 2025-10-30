package g0;

import B6.u0;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f17506A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f17507B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f17508C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f17509D;

    /* renamed from: E, reason: collision with root package name */
    public static final C1192d f17510E;

    /* renamed from: F, reason: collision with root package name */
    public static final C1192d[][] f17511F;

    /* renamed from: G, reason: collision with root package name */
    public static final C1192d[] f17512G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f17513H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f17514I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashSet f17515J;
    public static final HashMap K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f17516L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f17517M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f17518N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f17519l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f17520m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f17521n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f17522o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f17523p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f17524q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f17525r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f17526s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f17527t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f17528u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f17529v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f17530w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f17531x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f17532y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f17533z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f17534a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f17535b;

    /* renamed from: c, reason: collision with root package name */
    public int f17536c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f17537d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f17538e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f17539f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17540g;

    /* renamed from: h, reason: collision with root package name */
    public int f17541h;

    /* renamed from: i, reason: collision with root package name */
    public int f17542i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f17543k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f17520m = new int[]{8, 8, 8};
        f17521n = new int[]{8};
        f17522o = new byte[]{-1, -40, -1};
        f17523p = new byte[]{102, 116, 121, 112};
        f17524q = new byte[]{109, 105, 102, 49};
        f17525r = new byte[]{104, 101, 105, 99};
        f17526s = new byte[]{79, 76, 89, 77, 80, 0};
        f17527t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f17528u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f17529v = new byte[]{101, 88, 73, 102};
        f17530w = new byte[]{73, 72, 68, 82};
        f17531x = new byte[]{73, 69, 78, 68};
        f17532y = new byte[]{82, 73, 70, 70};
        f17533z = new byte[]{87, 69, 66, 80};
        f17506A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f17507B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f17508C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f17509D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1192d[] c1192dArr = {new C1192d("NewSubfileType", 254, 4), new C1192d("SubfileType", 255, 4), new C1192d(256, 3, 4, "ImageWidth"), new C1192d(257, 3, 4, "ImageLength"), new C1192d("BitsPerSample", 258, 3), new C1192d("Compression", 259, 3), new C1192d("PhotometricInterpretation", 262, 3), new C1192d("ImageDescription", 270, 2), new C1192d("Make", 271, 2), new C1192d("Model", 272, 2), new C1192d(273, 3, 4, "StripOffsets"), new C1192d("Orientation", 274, 3), new C1192d("SamplesPerPixel", 277, 3), new C1192d(278, 3, 4, "RowsPerStrip"), new C1192d(279, 3, 4, "StripByteCounts"), new C1192d("XResolution", 282, 5), new C1192d("YResolution", 283, 5), new C1192d("PlanarConfiguration", 284, 3), new C1192d("ResolutionUnit", 296, 3), new C1192d("TransferFunction", 301, 3), new C1192d("Software", 305, 2), new C1192d("DateTime", 306, 2), new C1192d("Artist", 315, 2), new C1192d("WhitePoint", 318, 5), new C1192d("PrimaryChromaticities", 319, 5), new C1192d("SubIFDPointer", 330, 4), new C1192d("JPEGInterchangeFormat", 513, 4), new C1192d("JPEGInterchangeFormatLength", 514, 4), new C1192d("YCbCrCoefficients", 529, 5), new C1192d("YCbCrSubSampling", 530, 3), new C1192d("YCbCrPositioning", 531, 3), new C1192d("ReferenceBlackWhite", 532, 5), new C1192d("Copyright", 33432, 2), new C1192d("ExifIFDPointer", 34665, 4), new C1192d("GPSInfoIFDPointer", 34853, 4), new C1192d("SensorTopBorder", 4, 4), new C1192d("SensorLeftBorder", 5, 4), new C1192d("SensorBottomBorder", 6, 4), new C1192d("SensorRightBorder", 7, 4), new C1192d("ISO", 23, 3), new C1192d("JpgFromRaw", 46, 7), new C1192d("Xmp", 700, 1)};
        C1192d[] c1192dArr2 = {new C1192d("ExposureTime", 33434, 5), new C1192d("FNumber", 33437, 5), new C1192d("ExposureProgram", 34850, 3), new C1192d("SpectralSensitivity", 34852, 2), new C1192d("PhotographicSensitivity", 34855, 3), new C1192d("OECF", 34856, 7), new C1192d("SensitivityType", 34864, 3), new C1192d("StandardOutputSensitivity", 34865, 4), new C1192d("RecommendedExposureIndex", 34866, 4), new C1192d("ISOSpeed", 34867, 4), new C1192d("ISOSpeedLatitudeyyy", 34868, 4), new C1192d("ISOSpeedLatitudezzz", 34869, 4), new C1192d("ExifVersion", 36864, 2), new C1192d("DateTimeOriginal", 36867, 2), new C1192d("DateTimeDigitized", 36868, 2), new C1192d("OffsetTime", 36880, 2), new C1192d("OffsetTimeOriginal", 36881, 2), new C1192d("OffsetTimeDigitized", 36882, 2), new C1192d("ComponentsConfiguration", 37121, 7), new C1192d("CompressedBitsPerPixel", 37122, 5), new C1192d("ShutterSpeedValue", 37377, 10), new C1192d("ApertureValue", 37378, 5), new C1192d("BrightnessValue", 37379, 10), new C1192d("ExposureBiasValue", 37380, 10), new C1192d("MaxApertureValue", 37381, 5), new C1192d("SubjectDistance", 37382, 5), new C1192d("MeteringMode", 37383, 3), new C1192d("LightSource", 37384, 3), new C1192d("Flash", 37385, 3), new C1192d("FocalLength", 37386, 5), new C1192d("SubjectArea", 37396, 3), new C1192d("MakerNote", 37500, 7), new C1192d("UserComment", 37510, 7), new C1192d("SubSecTime", 37520, 2), new C1192d("SubSecTimeOriginal", 37521, 2), new C1192d("SubSecTimeDigitized", 37522, 2), new C1192d("FlashpixVersion", 40960, 7), new C1192d("ColorSpace", 40961, 3), new C1192d(40962, 3, 4, "PixelXDimension"), new C1192d(40963, 3, 4, "PixelYDimension"), new C1192d("RelatedSoundFile", 40964, 2), new C1192d("InteroperabilityIFDPointer", 40965, 4), new C1192d("FlashEnergy", 41483, 5), new C1192d("SpatialFrequencyResponse", 41484, 7), new C1192d("FocalPlaneXResolution", 41486, 5), new C1192d("FocalPlaneYResolution", 41487, 5), new C1192d("FocalPlaneResolutionUnit", 41488, 3), new C1192d("SubjectLocation", 41492, 3), new C1192d("ExposureIndex", 41493, 5), new C1192d("SensingMethod", 41495, 3), new C1192d("FileSource", 41728, 7), new C1192d("SceneType", 41729, 7), new C1192d("CFAPattern", 41730, 7), new C1192d("CustomRendered", 41985, 3), new C1192d("ExposureMode", 41986, 3), new C1192d("WhiteBalance", 41987, 3), new C1192d("DigitalZoomRatio", 41988, 5), new C1192d("FocalLengthIn35mmFilm", 41989, 3), new C1192d("SceneCaptureType", 41990, 3), new C1192d("GainControl", 41991, 3), new C1192d("Contrast", 41992, 3), new C1192d("Saturation", 41993, 3), new C1192d("Sharpness", 41994, 3), new C1192d("DeviceSettingDescription", 41995, 7), new C1192d("SubjectDistanceRange", 41996, 3), new C1192d("ImageUniqueID", 42016, 2), new C1192d("CameraOwnerName", 42032, 2), new C1192d("BodySerialNumber", 42033, 2), new C1192d("LensSpecification", 42034, 5), new C1192d("LensMake", 42035, 2), new C1192d("LensModel", 42036, 2), new C1192d("Gamma", 42240, 5), new C1192d("DNGVersion", 50706, 1), new C1192d(50720, 3, 4, "DefaultCropSize")};
        C1192d[] c1192dArr3 = {new C1192d("GPSVersionID", 0, 1), new C1192d("GPSLatitudeRef", 1, 2), new C1192d(2, 5, 10, "GPSLatitude"), new C1192d("GPSLongitudeRef", 3, 2), new C1192d(4, 5, 10, "GPSLongitude"), new C1192d("GPSAltitudeRef", 5, 1), new C1192d("GPSAltitude", 6, 5), new C1192d("GPSTimeStamp", 7, 5), new C1192d("GPSSatellites", 8, 2), new C1192d("GPSStatus", 9, 2), new C1192d("GPSMeasureMode", 10, 2), new C1192d("GPSDOP", 11, 5), new C1192d("GPSSpeedRef", 12, 2), new C1192d("GPSSpeed", 13, 5), new C1192d("GPSTrackRef", 14, 2), new C1192d("GPSTrack", 15, 5), new C1192d("GPSImgDirectionRef", 16, 2), new C1192d("GPSImgDirection", 17, 5), new C1192d("GPSMapDatum", 18, 2), new C1192d("GPSDestLatitudeRef", 19, 2), new C1192d("GPSDestLatitude", 20, 5), new C1192d("GPSDestLongitudeRef", 21, 2), new C1192d("GPSDestLongitude", 22, 5), new C1192d("GPSDestBearingRef", 23, 2), new C1192d("GPSDestBearing", 24, 5), new C1192d("GPSDestDistanceRef", 25, 2), new C1192d("GPSDestDistance", 26, 5), new C1192d("GPSProcessingMethod", 27, 7), new C1192d("GPSAreaInformation", 28, 7), new C1192d("GPSDateStamp", 29, 2), new C1192d("GPSDifferential", 30, 3), new C1192d("GPSHPositioningError", 31, 5)};
        C1192d[] c1192dArr4 = {new C1192d("InteroperabilityIndex", 1, 2)};
        C1192d[] c1192dArr5 = {new C1192d("NewSubfileType", 254, 4), new C1192d("SubfileType", 255, 4), new C1192d(256, 3, 4, "ThumbnailImageWidth"), new C1192d(257, 3, 4, "ThumbnailImageLength"), new C1192d("BitsPerSample", 258, 3), new C1192d("Compression", 259, 3), new C1192d("PhotometricInterpretation", 262, 3), new C1192d("ImageDescription", 270, 2), new C1192d("Make", 271, 2), new C1192d("Model", 272, 2), new C1192d(273, 3, 4, "StripOffsets"), new C1192d("ThumbnailOrientation", 274, 3), new C1192d("SamplesPerPixel", 277, 3), new C1192d(278, 3, 4, "RowsPerStrip"), new C1192d(279, 3, 4, "StripByteCounts"), new C1192d("XResolution", 282, 5), new C1192d("YResolution", 283, 5), new C1192d("PlanarConfiguration", 284, 3), new C1192d("ResolutionUnit", 296, 3), new C1192d("TransferFunction", 301, 3), new C1192d("Software", 305, 2), new C1192d("DateTime", 306, 2), new C1192d("Artist", 315, 2), new C1192d("WhitePoint", 318, 5), new C1192d("PrimaryChromaticities", 319, 5), new C1192d("SubIFDPointer", 330, 4), new C1192d("JPEGInterchangeFormat", 513, 4), new C1192d("JPEGInterchangeFormatLength", 514, 4), new C1192d("YCbCrCoefficients", 529, 5), new C1192d("YCbCrSubSampling", 530, 3), new C1192d("YCbCrPositioning", 531, 3), new C1192d("ReferenceBlackWhite", 532, 5), new C1192d("Copyright", 33432, 2), new C1192d("ExifIFDPointer", 34665, 4), new C1192d("GPSInfoIFDPointer", 34853, 4), new C1192d("DNGVersion", 50706, 1), new C1192d(50720, 3, 4, "DefaultCropSize")};
        f17510E = new C1192d("StripOffsets", 273, 3);
        f17511F = new C1192d[][]{c1192dArr, c1192dArr2, c1192dArr3, c1192dArr4, c1192dArr5, c1192dArr, new C1192d[]{new C1192d("ThumbnailImage", 256, 7), new C1192d("CameraSettingsIFDPointer", 8224, 4), new C1192d("ImageProcessingIFDPointer", 8256, 4)}, new C1192d[]{new C1192d("PreviewImageStart", 257, 4), new C1192d("PreviewImageLength", 258, 4)}, new C1192d[]{new C1192d("AspectFrame", 4371, 3)}, new C1192d[]{new C1192d("ColorSpace", 55, 3)}};
        f17512G = new C1192d[]{new C1192d("SubIFDPointer", 330, 4), new C1192d("ExifIFDPointer", 34665, 4), new C1192d("GPSInfoIFDPointer", 34853, 4), new C1192d("InteroperabilityIFDPointer", 40965, 4), new C1192d("CameraSettingsIFDPointer", 8224, 1), new C1192d("ImageProcessingIFDPointer", 8256, 1)};
        f17513H = new HashMap[10];
        f17514I = new HashMap[10];
        f17515J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f17516L = forName;
        f17517M = "Exif\u0000\u0000".getBytes(forName);
        f17518N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i9 = 0;
        while (true) {
            C1192d[][] c1192dArr6 = f17511F;
            if (i9 < c1192dArr6.length) {
                f17513H[i9] = new HashMap();
                f17514I[i9] = new HashMap();
                for (C1192d c1192d : c1192dArr6[i9]) {
                    f17513H[i9].put(Integer.valueOf(c1192d.f17500a), c1192d);
                    f17514I[i9].put(c1192d.f17501b, c1192d);
                }
                i9++;
            } else {
                HashMap hashMap = K;
                C1192d[] c1192dArr7 = f17512G;
                hashMap.put(Integer.valueOf(c1192dArr7[0].f17500a), 5);
                hashMap.put(Integer.valueOf(c1192dArr7[1].f17500a), 1);
                hashMap.put(Integer.valueOf(c1192dArr7[2].f17500a), 2);
                hashMap.put(Integer.valueOf(c1192dArr7[3].f17500a), 3);
                hashMap.put(Integer.valueOf(c1192dArr7[4].f17500a), 7);
                hashMap.put(Integer.valueOf(c1192dArr7[5].f17500a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:7:0x0039, B:13:0x0056, B:15:0x0061, B:16:0x0077, B:25:0x0068, B:28:0x0070, B:29:0x0074, B:30:0x0081, B:32:0x008a, B:34:0x0090, B:36:0x0096, B:38:0x009c, B:48:0x00aa), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1195g(u1.C2060h r9) {
        /*
            r8 = this;
            r8.<init>()
            g0.d[][] r0 = g0.C1195g.f17511F
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f17537d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.f17538e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f17539f = r1
            r1 = 0
            boolean r2 = g0.C1195g.f17519l
            java.lang.String r3 = "ExifInterface"
            r8.f17535b = r1
            r8.f17534a = r1
            r1 = 0
            r4 = r1
        L21:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r4 >= r5) goto L39
            java.util.HashMap[] r5 = r8.f17537d     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r5[r4] = r6     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r4 = r4 + 1
            goto L21
        L30:
            r9 = move-exception
            goto Lb0
        L33:
            r9 = move-exception
            goto La8
        L36:
            r9 = move-exception
            goto La8
        L39:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r9 = r8.f(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.f17536c = r9     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L81
            if (r9 == r6) goto L81
            if (r9 == r5) goto L81
            if (r9 != r4) goto L56
            goto L81
        L56:
            g0.f r9 = new g0.f     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f17536c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r1 = 12
            if (r0 != r1) goto L65
            r8.d(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L65:
            r1 = 7
            if (r0 != r1) goto L6c
            r8.g(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L6c:
            r1 = 10
            if (r0 != r1) goto L74
            r8.k(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L74:
            r8.j(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L77:
            int r0 = r8.f17541h     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.d(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.u(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L81:
            g0.b r9 = new g0.b     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f17536c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r0 != r7) goto L8e
            r8.e(r9, r1, r1)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L8e:
            if (r0 != r5) goto L94
            r8.h(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L94:
            if (r0 != r6) goto L9a
            r8.i(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L9a:
            if (r0 != r4) goto L9f
            r8.l(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L9f:
            r8.a()
            if (r2 == 0) goto Lbf
        La4:
            r8.p()
            goto Lbf
        La8:
            if (r2 == 0) goto Lb9
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r0, r9)     // Catch: java.lang.Throwable -> L30
            goto Lb9
        Lb0:
            r8.a()
            if (r2 == 0) goto Lb8
            r8.p()
        Lb8:
            throw r9
        Lb9:
            r8.a()
            if (r2 == 0) goto Lbf
            goto La4
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C1195g.<init>(u1.h):void");
    }

    public static ByteOrder q(C1190b c1190b) {
        short readShort = c1190b.readShort();
        boolean z9 = f17519l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z9) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z9) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b9 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f17537d;
        if (b9 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b9.concat("\u0000").getBytes(f17516L);
            hashMap.put("DateTime", new C1191c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C1191c.a(0L, this.f17539f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C1191c.a(0L, this.f17539f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C1191c.a(0L, this.f17539f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C1191c.a(0L, this.f17539f));
        }
    }

    public final String b(String str) {
        C1191c c3 = c(str);
        if (c3 != null) {
            if (!f17515J.contains(str)) {
                return c3.f(this.f17539f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i9 = c3.f17496a;
                if (i9 != 5 && i9 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i9);
                    return null;
                }
                C1193e[] c1193eArr = (C1193e[]) c3.g(this.f17539f);
                if (c1193eArr != null && c1193eArr.length == 3) {
                    C1193e c1193e = c1193eArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) c1193e.f17504a) / ((float) c1193e.f17505b)));
                    C1193e c1193e2 = c1193eArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) c1193e2.f17504a) / ((float) c1193e2.f17505b)));
                    C1193e c1193e3 = c1193eArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c1193e3.f17504a) / ((float) c1193e3.f17505b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1193eArr));
                return null;
            }
            try {
                return Double.toString(c3.d(this.f17539f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C1191c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f17519l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i9 = 0; i9 < f17511F.length; i9++) {
            C1191c c1191c = (C1191c) this.f17537d[i9].get(str);
            if (c1191c != null) {
                return c1191c;
            }
        }
        return null;
    }

    public final void d(C1194f c1194f) {
        String str;
        String str2;
        String str3;
        int i9;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC1197i.a(mediaMetadataRetriever, new C1189a(c1194f));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f17537d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C1191c.c(Integer.parseInt(str), this.f17539f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C1191c.c(Integer.parseInt(str2), this.f17539f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i9 = 1;
                                } else {
                                    i9 = 8;
                                }
                            } else {
                                i9 = 3;
                            }
                        } else {
                            i9 = 6;
                        }
                        hashMapArr[0].put("Orientation", C1191c.c(i9, this.f17539f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c1194f.d(parseInt2);
                            byte[] bArr = new byte[6];
                            c1194f.readFully(bArr);
                            int i10 = parseInt2 + 6;
                            int i11 = parseInt3 - 6;
                            if (Arrays.equals(bArr, f17517M)) {
                                byte[] bArr2 = new byte[i11];
                                c1194f.readFully(bArr2);
                                this.f17541h = i10;
                                r(0, bArr2);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f17519l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void e(C1190b c1190b, int i9, int i10) {
        String str;
        String str2;
        boolean z9 = f17519l;
        if (z9) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c1190b);
        }
        c1190b.f17493c = ByteOrder.BIG_ENDIAN;
        byte readByte = c1190b.readByte();
        byte b9 = -1;
        if (readByte == -1) {
            if (c1190b.readByte() == -40) {
                int i11 = 2;
                int i12 = 2;
                while (true) {
                    byte readByte2 = c1190b.readByte();
                    if (readByte2 == b9) {
                        byte readByte3 = c1190b.readByte();
                        if (z9) {
                            Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                        }
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = c1190b.readUnsignedShort();
                            int i13 = readUnsignedShort - 2;
                            int i14 = i12 + 4;
                            if (z9) {
                                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                            }
                            if (i13 >= 0) {
                                HashMap[] hashMapArr = this.f17537d;
                                int i15 = 0;
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                            default:
                                                switch (readByte3) {
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                    default:
                                                        switch (readByte3) {
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                break;
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                        }
                                                }
                                        }
                                        c1190b.a(1);
                                        HashMap hashMap = hashMapArr[i10];
                                        if (i10 != 4) {
                                            str = "ImageLength";
                                        } else {
                                            str = "ThumbnailImageLength";
                                        }
                                        hashMap.put(str, C1191c.a(c1190b.readUnsignedShort(), this.f17539f));
                                        HashMap hashMap2 = hashMapArr[i10];
                                        if (i10 != 4) {
                                            str2 = "ImageWidth";
                                        } else {
                                            str2 = "ThumbnailImageWidth";
                                        }
                                        hashMap2.put(str2, C1191c.a(c1190b.readUnsignedShort(), this.f17539f));
                                        i13 = readUnsignedShort - 7;
                                    } else {
                                        byte[] bArr = new byte[i13];
                                        c1190b.readFully(bArr);
                                        if (b("UserComment") == null) {
                                            HashMap hashMap3 = hashMapArr[1];
                                            Charset charset = f17516L;
                                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                            hashMap3.put("UserComment", new C1191c(bytes, i11, bytes.length));
                                        }
                                        i13 = 0;
                                    }
                                } else {
                                    byte[] bArr2 = new byte[i13];
                                    c1190b.readFully(bArr2);
                                    int i16 = i14 + i13;
                                    byte[] bArr3 = f17517M;
                                    if (bArr3 != null && i13 >= bArr3.length) {
                                        int i17 = 0;
                                        while (i17 < bArr3.length) {
                                            if (bArr2[i17] == bArr3[i17]) {
                                                i17++;
                                                i15 = 0;
                                            }
                                        }
                                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i13);
                                        this.f17541h = i9 + i14 + bArr3.length;
                                        r(i10, copyOfRange);
                                        u(new C1190b(copyOfRange));
                                        i14 = i16;
                                        i13 = 0;
                                    }
                                    byte[] bArr4 = f17518N;
                                    if (bArr4 != null && i13 >= bArr4.length) {
                                        int i18 = i15;
                                        while (true) {
                                            if (i18 < bArr4.length) {
                                                if (bArr2[i18] == bArr4[i18]) {
                                                    i18++;
                                                }
                                            } else {
                                                int length = i14 + bArr4.length;
                                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i13);
                                                if (b("Xmp") == null) {
                                                    hashMapArr[i15].put("Xmp", new C1191c(length, copyOfRange2, 1, copyOfRange2.length));
                                                }
                                            }
                                        }
                                    }
                                    i14 = i16;
                                    i13 = 0;
                                }
                                if (i13 >= 0) {
                                    c1190b.a(i13);
                                    i12 = i14 + i13;
                                    i11 = 2;
                                    b9 = -1;
                                } else {
                                    throw new IOException("Invalid length");
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                    }
                }
                c1190b.f17493c = this.f17539f;
                return;
            }
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(4:118|119|(7:123|124|125|(3:127|(1:129)(2:138|(1:140))|(3:132|133|134))(1:141)|136|120|121)|144)|117|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|39|40|41|(1:43)(1:80)|44|(1:46)(3:47|(2:48|(2:50|(2:53|54)(1:52))(2:78|79))|(1:56)(3:57|(2:58|(2:60|(1:63)(1:62))(3:68|69|(2:70|(2:72|(1:75)(1:74))(2:76|77))))|(1:66)(1:67)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f0, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f6, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f8, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ca, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fc, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fe, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0101, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C1195g.f(java.io.BufferedInputStream):int");
    }

    public final void g(C1194f c1194f) {
        int i9;
        int i10;
        j(c1194f);
        HashMap[] hashMapArr = this.f17537d;
        C1191c c1191c = (C1191c) hashMapArr[1].get("MakerNote");
        if (c1191c != null) {
            C1194f c1194f2 = new C1194f(c1191c.f17499d);
            c1194f2.f17493c = this.f17539f;
            byte[] bArr = f17526s;
            byte[] bArr2 = new byte[bArr.length];
            c1194f2.readFully(bArr2);
            c1194f2.d(0L);
            byte[] bArr3 = f17527t;
            byte[] bArr4 = new byte[bArr3.length];
            c1194f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1194f2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1194f2.d(12L);
            }
            s(c1194f2, 6);
            C1191c c1191c2 = (C1191c) hashMapArr[7].get("PreviewImageStart");
            C1191c c1191c3 = (C1191c) hashMapArr[7].get("PreviewImageLength");
            if (c1191c2 != null && c1191c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c1191c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c1191c3);
            }
            C1191c c1191c4 = (C1191c) hashMapArr[8].get("AspectFrame");
            if (c1191c4 != null) {
                int[] iArr = (int[]) c1191c4.g(this.f17539f);
                if (iArr != null && iArr.length == 4) {
                    int i11 = iArr[2];
                    int i12 = iArr[0];
                    if (i11 > i12 && (i9 = iArr[3]) > (i10 = iArr[1])) {
                        int i13 = (i11 - i12) + 1;
                        int i14 = (i9 - i10) + 1;
                        if (i13 < i14) {
                            int i15 = i13 + i14;
                            i14 = i15 - i14;
                            i13 = i15 - i14;
                        }
                        C1191c c3 = C1191c.c(i13, this.f17539f);
                        C1191c c9 = C1191c.c(i14, this.f17539f);
                        hashMapArr[0].put("ImageWidth", c3);
                        hashMapArr[0].put("ImageLength", c9);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(C1190b c1190b) {
        if (f17519l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1190b);
        }
        c1190b.f17493c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f17528u;
        c1190b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c1190b.readInt();
                byte[] bArr2 = new byte[4];
                c1190b.readFully(bArr2);
                int i9 = length + 8;
                if (i9 == 16 && !Arrays.equals(bArr2, f17530w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f17531x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f17529v)) {
                    byte[] bArr3 = new byte[readInt];
                    c1190b.readFully(bArr3);
                    int readInt2 = c1190b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f17541h = i9;
                        r(0, bArr3);
                        x();
                        u(new C1190b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = readInt + 4;
                c1190b.a(i10);
                length = i9 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C1190b c1190b) {
        boolean z9 = f17519l;
        if (z9) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c1190b);
        }
        c1190b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c1190b.readFully(bArr);
        c1190b.readFully(bArr2);
        c1190b.readFully(bArr3);
        int i9 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        c1190b.a(i9 - c1190b.f17492b);
        c1190b.readFully(bArr4);
        e(new C1190b(bArr4), i9, 5);
        c1190b.a(i11 - c1190b.f17492b);
        c1190b.f17493c = ByteOrder.BIG_ENDIAN;
        int readInt = c1190b.readInt();
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = c1190b.readUnsignedShort();
            int readUnsignedShort2 = c1190b.readUnsignedShort();
            if (readUnsignedShort == f17510E.f17500a) {
                short readShort = c1190b.readShort();
                short readShort2 = c1190b.readShort();
                C1191c c3 = C1191c.c(readShort, this.f17539f);
                C1191c c9 = C1191c.c(readShort2, this.f17539f);
                HashMap[] hashMapArr = this.f17537d;
                hashMapArr[0].put("ImageLength", c3);
                hashMapArr[0].put("ImageWidth", c9);
                if (z9) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c1190b.a(readUnsignedShort2);
        }
    }

    public final void j(C1194f c1194f) {
        o(c1194f);
        s(c1194f, 0);
        w(c1194f, 0);
        w(c1194f, 5);
        w(c1194f, 4);
        x();
        if (this.f17536c == 8) {
            HashMap[] hashMapArr = this.f17537d;
            C1191c c1191c = (C1191c) hashMapArr[1].get("MakerNote");
            if (c1191c != null) {
                C1194f c1194f2 = new C1194f(c1191c.f17499d);
                c1194f2.f17493c = this.f17539f;
                c1194f2.a(6);
                s(c1194f2, 9);
                C1191c c1191c2 = (C1191c) hashMapArr[9].get("ColorSpace");
                if (c1191c2 != null) {
                    hashMapArr[1].put("ColorSpace", c1191c2);
                }
            }
        }
    }

    public final void k(C1194f c1194f) {
        if (f17519l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1194f);
        }
        j(c1194f);
        HashMap[] hashMapArr = this.f17537d;
        C1191c c1191c = (C1191c) hashMapArr[0].get("JpgFromRaw");
        if (c1191c != null) {
            e(new C1190b(c1191c.f17499d), (int) c1191c.f17498c, 5);
        }
        C1191c c1191c2 = (C1191c) hashMapArr[0].get("ISO");
        C1191c c1191c3 = (C1191c) hashMapArr[1].get("PhotographicSensitivity");
        if (c1191c2 != null && c1191c3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c1191c2);
        }
    }

    public final void l(C1190b c1190b) {
        if (f17519l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1190b);
        }
        c1190b.f17493c = ByteOrder.LITTLE_ENDIAN;
        c1190b.a(f17532y.length);
        int readInt = c1190b.readInt() + 8;
        byte[] bArr = f17533z;
        c1190b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c1190b.readFully(bArr2);
                int readInt2 = c1190b.readInt();
                int i9 = length + 8;
                if (Arrays.equals(f17506A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c1190b.readFully(bArr3);
                    this.f17541h = i9;
                    r(0, bArr3);
                    u(new C1190b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i9 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    c1190b.a(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C1190b c1190b, HashMap hashMap) {
        C1191c c1191c = (C1191c) hashMap.get("JPEGInterchangeFormat");
        C1191c c1191c2 = (C1191c) hashMap.get("JPEGInterchangeFormatLength");
        if (c1191c != null && c1191c2 != null) {
            int e8 = c1191c.e(this.f17539f);
            int e9 = c1191c2.e(this.f17539f);
            if (this.f17536c == 7) {
                e8 += this.f17542i;
            }
            if (e8 > 0 && e9 > 0 && this.f17535b == null && this.f17534a == null) {
                c1190b.a(e8);
                c1190b.readFully(new byte[e9]);
            }
            if (f17519l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e8 + ", length: " + e9);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        C1191c c1191c = (C1191c) hashMap.get("ImageLength");
        C1191c c1191c2 = (C1191c) hashMap.get("ImageWidth");
        if (c1191c != null && c1191c2 != null) {
            int e8 = c1191c.e(this.f17539f);
            int e9 = c1191c2.e(this.f17539f);
            if (e8 <= 512 && e9 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(C1194f c1194f) {
        ByteOrder q9 = q(c1194f);
        this.f17539f = q9;
        c1194f.f17493c = q9;
        int readUnsignedShort = c1194f.readUnsignedShort();
        int i9 = this.f17536c;
        if (i9 != 7 && i9 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c1194f.readInt();
        if (readInt >= 8) {
            int i10 = readInt - 8;
            if (i10 > 0) {
                c1194f.a(i10);
                return;
            }
            return;
        }
        throw new IOException(AbstractC0953k1.j(readInt, "Invalid first Ifd offset: "));
    }

    public final void p() {
        int i9 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f17537d;
            if (i9 < hashMapArr.length) {
                StringBuilder p9 = A0.a.p("The size of tag group[", i9, "]: ");
                p9.append(hashMapArr[i9].size());
                Log.d("ExifInterface", p9.toString());
                for (Map.Entry entry : hashMapArr[i9].entrySet()) {
                    C1191c c1191c = (C1191c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1191c.toString() + ", tagValue: '" + c1191c.f(this.f17539f) + "'");
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void r(int i9, byte[] bArr) {
        C1194f c1194f = new C1194f(bArr);
        o(c1194f);
        s(c1194f, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(g0.C1194f r37, int r38) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C1195g.s(g0.f, int):void");
    }

    public final void t(String str, int i9, String str2) {
        HashMap[] hashMapArr = this.f17537d;
        if (!hashMapArr[i9].isEmpty() && hashMapArr[i9].get(str) != null) {
            HashMap hashMap = hashMapArr[i9];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i9].remove(str);
        }
    }

    public final void u(C1190b c1190b) {
        C1191c c1191c;
        int e8;
        HashMap hashMap = this.f17537d[4];
        C1191c c1191c2 = (C1191c) hashMap.get("Compression");
        if (c1191c2 != null) {
            int e9 = c1191c2.e(this.f17539f);
            if (e9 != 1) {
                if (e9 != 6) {
                    if (e9 != 7) {
                        return;
                    }
                } else {
                    m(c1190b, hashMap);
                    return;
                }
            }
            C1191c c1191c3 = (C1191c) hashMap.get("BitsPerSample");
            if (c1191c3 != null) {
                int[] iArr = (int[]) c1191c3.g(this.f17539f);
                int[] iArr2 = f17520m;
                if (Arrays.equals(iArr2, iArr) || (this.f17536c == 3 && (c1191c = (C1191c) hashMap.get("PhotometricInterpretation")) != null && (((e8 = c1191c.e(this.f17539f)) == 1 && Arrays.equals(iArr, f17521n)) || (e8 == 6 && Arrays.equals(iArr, iArr2))))) {
                    C1191c c1191c4 = (C1191c) hashMap.get("StripOffsets");
                    C1191c c1191c5 = (C1191c) hashMap.get("StripByteCounts");
                    if (c1191c4 != null && c1191c5 != null) {
                        long[] p9 = u0.p(c1191c4.g(this.f17539f));
                        long[] p10 = u0.p(c1191c5.g(this.f17539f));
                        if (p9 != null && p9.length != 0) {
                            if (p10 != null && p10.length != 0) {
                                if (p9.length != p10.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j4 : p10) {
                                    j += j4;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.f17540g = true;
                                int i9 = 0;
                                int i10 = 0;
                                for (int i11 = 0; i11 < p9.length; i11++) {
                                    int i12 = (int) p9[i11];
                                    int i13 = (int) p10[i11];
                                    if (i11 < p9.length - 1 && i12 + i13 != p9[i11 + 1]) {
                                        this.f17540g = false;
                                    }
                                    int i14 = i12 - i9;
                                    if (i14 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        c1190b.a(i14);
                                        int i15 = i9 + i14;
                                        byte[] bArr2 = new byte[i13];
                                        try {
                                            c1190b.readFully(bArr2);
                                            i9 = i15 + i13;
                                            System.arraycopy(bArr2, 0, bArr, i10, i13);
                                            i10 += i13;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.f17540g) {
                                    long j9 = p9[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f17519l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(c1190b, hashMap);
    }

    public final void v(int i9, int i10) {
        HashMap[] hashMapArr = this.f17537d;
        boolean isEmpty = hashMapArr[i9].isEmpty();
        boolean z9 = f17519l;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            C1191c c1191c = (C1191c) hashMapArr[i9].get("ImageLength");
            C1191c c1191c2 = (C1191c) hashMapArr[i9].get("ImageWidth");
            C1191c c1191c3 = (C1191c) hashMapArr[i10].get("ImageLength");
            C1191c c1191c4 = (C1191c) hashMapArr[i10].get("ImageWidth");
            if (c1191c != null && c1191c2 != null) {
                if (c1191c3 != null && c1191c4 != null) {
                    int e8 = c1191c.e(this.f17539f);
                    int e9 = c1191c2.e(this.f17539f);
                    int e10 = c1191c3.e(this.f17539f);
                    int e11 = c1191c4.e(this.f17539f);
                    if (e8 < e10 && e9 < e11) {
                        HashMap hashMap = hashMapArr[i9];
                        hashMapArr[i9] = hashMapArr[i10];
                        hashMapArr[i10] = hashMap;
                        return;
                    }
                    return;
                }
                if (z9) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z9) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z9) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(C1194f c1194f, int i9) {
        C1191c c3;
        C1191c c9;
        HashMap[] hashMapArr = this.f17537d;
        C1191c c1191c = (C1191c) hashMapArr[i9].get("DefaultCropSize");
        C1191c c1191c2 = (C1191c) hashMapArr[i9].get("SensorTopBorder");
        C1191c c1191c3 = (C1191c) hashMapArr[i9].get("SensorLeftBorder");
        C1191c c1191c4 = (C1191c) hashMapArr[i9].get("SensorBottomBorder");
        C1191c c1191c5 = (C1191c) hashMapArr[i9].get("SensorRightBorder");
        if (c1191c != null) {
            if (c1191c.f17496a == 5) {
                C1193e[] c1193eArr = (C1193e[]) c1191c.g(this.f17539f);
                if (c1193eArr != null && c1193eArr.length == 2) {
                    c3 = C1191c.b(c1193eArr[0], this.f17539f);
                    c9 = C1191c.b(c1193eArr[1], this.f17539f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1193eArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c1191c.g(this.f17539f);
                if (iArr != null && iArr.length == 2) {
                    c3 = C1191c.c(iArr[0], this.f17539f);
                    c9 = C1191c.c(iArr[1], this.f17539f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i9].put("ImageWidth", c3);
            hashMapArr[i9].put("ImageLength", c9);
            return;
        }
        if (c1191c2 != null && c1191c3 != null && c1191c4 != null && c1191c5 != null) {
            int e8 = c1191c2.e(this.f17539f);
            int e9 = c1191c4.e(this.f17539f);
            int e10 = c1191c5.e(this.f17539f);
            int e11 = c1191c3.e(this.f17539f);
            if (e9 > e8 && e10 > e11) {
                C1191c c10 = C1191c.c(e9 - e8, this.f17539f);
                C1191c c11 = C1191c.c(e10 - e11, this.f17539f);
                hashMapArr[i9].put("ImageLength", c10);
                hashMapArr[i9].put("ImageWidth", c11);
                return;
            }
            return;
        }
        C1191c c1191c6 = (C1191c) hashMapArr[i9].get("ImageLength");
        C1191c c1191c7 = (C1191c) hashMapArr[i9].get("ImageWidth");
        if (c1191c6 == null || c1191c7 == null) {
            C1191c c1191c8 = (C1191c) hashMapArr[i9].get("JPEGInterchangeFormat");
            C1191c c1191c9 = (C1191c) hashMapArr[i9].get("JPEGInterchangeFormatLength");
            if (c1191c8 != null && c1191c9 != null) {
                int e12 = c1191c8.e(this.f17539f);
                int e13 = c1191c8.e(this.f17539f);
                c1194f.d(e12);
                byte[] bArr = new byte[e13];
                c1194f.readFully(bArr);
                e(new C1190b(bArr), e12, i9);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f17537d;
        C1191c c1191c = (C1191c) hashMapArr[1].get("PixelXDimension");
        C1191c c1191c2 = (C1191c) hashMapArr[1].get("PixelYDimension");
        if (c1191c != null && c1191c2 != null) {
            hashMapArr[0].put("ImageWidth", c1191c);
            hashMapArr[0].put("ImageLength", c1191c2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
