.class public final Lw3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# static fields
.field public static final c0:[B

.field public static final d0:[B

.field public static final e0:[B

.field public static final f0:[B

.field public static final g0:Ljava/util/UUID;

.field public static final h0:Ljava/util/Map;


# instance fields
.field public A:J

.field public B:J

.field public C:LA1/i;

.field public D:LA1/i;

.field public E:Z

.field public F:Z

.field public G:I

.field public H:J

.field public I:J

.field public J:I

.field public K:I

.field public L:[I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:Z

.field public R:J

.field public S:I

.field public T:I

.field public U:I

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:I

.field public Z:B

.field public final a:Lw3/b;

.field public a0:Z

.field public final b:Lw3/e;

.field public b0:Lq3/l;

.field public final c:Landroid/util/SparseArray;

.field public final d:Z

.field public final e:LA4/r;

.field public final f:LA4/r;

.field public final g:LA4/r;

.field public final h:LA4/r;

.field public final i:LA4/r;

.field public final j:LA4/r;

.field public final k:LA4/r;

.field public final l:LA4/r;

.field public final m:LA4/r;

.field public final n:LA4/r;

.field public o:Ljava/nio/ByteBuffer;

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:Lw3/c;

.field public v:Z

.field public w:I

.field public x:J

.field public y:Z

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lw3/d;->c0:[B

    .line 9
    .line 10
    sget v1, Ll4/y;->a:I

    .line 11
    .line 12
    sget-object v1, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Lw3/d;->d0:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Lw3/d;->e0:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, Lw3/d;->f0:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lw3/d;->g0:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const-string v2, "htc_video_rotA-000"

    .line 62
    .line 63
    const/16 v3, 0x5a

    .line 64
    .line 65
    const-string v4, "htc_video_rotA-090"

    .line 66
    .line 67
    invoke-static {v1, v0, v2, v3, v4}, Lu0/z;->h(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xb4

    .line 71
    .line 72
    const-string v2, "htc_video_rotA-180"

    .line 73
    .line 74
    const/16 v3, 0x10e

    .line 75
    .line 76
    const-string v4, "htc_video_rotA-270"

    .line 77
    .line 78
    invoke-static {v1, v0, v2, v3, v4}, Lu0/z;->h(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lw3/d;->h0:Ljava/util/Map;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 5

    .line 1
    new-instance v0, Lw3/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lw3/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    iput-wide v1, p0, Lw3/d;->q:J

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v3, p0, Lw3/d;->r:J

    .line 19
    .line 20
    iput-wide v3, p0, Lw3/d;->s:J

    .line 21
    .line 22
    iput-wide v3, p0, Lw3/d;->t:J

    .line 23
    .line 24
    iput-wide v1, p0, Lw3/d;->z:J

    .line 25
    .line 26
    iput-wide v1, p0, Lw3/d;->A:J

    .line 27
    .line 28
    iput-wide v3, p0, Lw3/d;->B:J

    .line 29
    .line 30
    iput-object v0, p0, Lw3/d;->a:Lw3/b;

    .line 31
    .line 32
    new-instance v1, Li/G;

    .line 33
    .line 34
    const/16 v2, 0x13

    .line 35
    .line 36
    invoke-direct {v1, v2, p0}, Li/G;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, Lw3/b;->d:Li/G;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    and-int/2addr p1, v0

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    move p1, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    :goto_0
    iput-boolean p1, p0, Lw3/d;->d:Z

    .line 49
    .line 50
    new-instance p1, Lw3/e;

    .line 51
    .line 52
    invoke-direct {p1}, Lw3/e;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lw3/d;->b:Lw3/e;

    .line 56
    .line 57
    new-instance p1, Landroid/util/SparseArray;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lw3/d;->c:Landroid/util/SparseArray;

    .line 63
    .line 64
    new-instance p1, LA4/r;

    .line 65
    .line 66
    const/4 v1, 0x4

    .line 67
    invoke-direct {p1, v1}, LA4/r;-><init>(I)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lw3/d;->g:LA4/r;

    .line 71
    .line 72
    new-instance p1, LA4/r;

    .line 73
    .line 74
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const/4 v3, -0x1

    .line 79
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-direct {p1, v2}, LA4/r;-><init>([B)V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Lw3/d;->h:LA4/r;

    .line 91
    .line 92
    new-instance p1, LA4/r;

    .line 93
    .line 94
    invoke-direct {p1, v1}, LA4/r;-><init>(I)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lw3/d;->i:LA4/r;

    .line 98
    .line 99
    new-instance p1, LA4/r;

    .line 100
    .line 101
    sget-object v2, Ll4/a;->d:[B

    .line 102
    .line 103
    invoke-direct {p1, v2}, LA4/r;-><init>([B)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lw3/d;->e:LA4/r;

    .line 107
    .line 108
    new-instance p1, LA4/r;

    .line 109
    .line 110
    invoke-direct {p1, v1}, LA4/r;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lw3/d;->f:LA4/r;

    .line 114
    .line 115
    new-instance p1, LA4/r;

    .line 116
    .line 117
    const/4 v1, 0x5

    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-direct {p1, v1, v2}, LA4/r;-><init>(IZ)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Lw3/d;->j:LA4/r;

    .line 123
    .line 124
    new-instance p1, LA4/r;

    .line 125
    .line 126
    invoke-direct {p1, v1, v2}, LA4/r;-><init>(IZ)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lw3/d;->k:LA4/r;

    .line 130
    .line 131
    new-instance p1, LA4/r;

    .line 132
    .line 133
    const/16 v1, 0x8

    .line 134
    .line 135
    invoke-direct {p1, v1}, LA4/r;-><init>(I)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, Lw3/d;->l:LA4/r;

    .line 139
    .line 140
    new-instance p1, LA4/r;

    .line 141
    .line 142
    const/4 v1, 0x5

    .line 143
    invoke-direct {p1, v1, v2}, LA4/r;-><init>(IZ)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lw3/d;->m:LA4/r;

    .line 147
    .line 148
    new-instance p1, LA4/r;

    .line 149
    .line 150
    invoke-direct {p1, v1, v2}, LA4/r;-><init>(IZ)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lw3/d;->n:LA4/r;

    .line 154
    .line 155
    new-array p1, v0, [I

    .line 156
    .line 157
    iput-object p1, p0, Lw3/d;->L:[I

    .line 158
    .line 159
    return-void
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public static g(JLjava/lang/String;J)[B
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, p0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    invoke-static {v2}, Ll4/a;->h(Z)V

    .line 16
    .line 17
    .line 18
    const-wide v2, 0xd693a400L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-long v4, p0, v2

    .line 24
    .line 25
    long-to-int v4, v4

    .line 26
    int-to-long v5, v4

    .line 27
    mul-long/2addr v5, v2

    .line 28
    sub-long/2addr p0, v5

    .line 29
    const-wide/32 v2, 0x3938700

    .line 30
    .line 31
    .line 32
    div-long v5, p0, v2

    .line 33
    .line 34
    long-to-int v5, v5

    .line 35
    int-to-long v6, v5

    .line 36
    mul-long/2addr v6, v2

    .line 37
    sub-long/2addr p0, v6

    .line 38
    const-wide/32 v2, 0xf4240

    .line 39
    .line 40
    .line 41
    div-long v6, p0, v2

    .line 42
    .line 43
    long-to-int v6, v6

    .line 44
    int-to-long v7, v6

    .line 45
    mul-long/2addr v7, v2

    .line 46
    sub-long/2addr p0, v7

    .line 47
    div-long/2addr p0, p3

    .line 48
    long-to-int p0, p0

    .line 49
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 v3, 0x4

    .line 68
    new-array v3, v3, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p3, v3, v0

    .line 71
    .line 72
    aput-object p4, v3, v1

    .line 73
    .line 74
    const/4 p3, 0x2

    .line 75
    aput-object v2, v3, p3

    .line 76
    .line 77
    const/4 p3, 0x3

    .line 78
    aput-object p0, v3, p3

    .line 79
    .line 80
    invoke-static {p1, p2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget p1, Ll4/y;->a:I

    .line 85
    .line 86
    sget-object p1, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final b(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lw3/d;->B:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lw3/d;->G:I

    .line 10
    .line 11
    iget-object p2, p0, Lw3/d;->a:Lw3/b;

    .line 12
    .line 13
    iput p1, p2, Lw3/b;->e:I

    .line 14
    .line 15
    iget-object p3, p2, Lw3/b;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p2, p2, Lw3/b;->c:Lw3/e;

    .line 21
    .line 22
    iput p1, p2, Lw3/e;->b:I

    .line 23
    .line 24
    iput p1, p2, Lw3/e;->c:I

    .line 25
    .line 26
    iget-object p2, p0, Lw3/d;->b:Lw3/e;

    .line 27
    .line 28
    iput p1, p2, Lw3/e;->b:I

    .line 29
    .line 30
    iput p1, p2, Lw3/e;->c:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lw3/d;->l()V

    .line 33
    .line 34
    .line 35
    move p2, p1

    .line 36
    :goto_0
    iget-object p3, p0, Lw3/d;->c:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    if-ge p2, p4, :cond_1

    .line 43
    .line 44
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    check-cast p3, Lw3/c;

    .line 49
    .line 50
    iget-object p3, p3, Lw3/c;->T:Lq3/v;

    .line 51
    .line 52
    if-eqz p3, :cond_0

    .line 53
    .line 54
    iput-boolean p1, p3, Lq3/v;->b:Z

    .line 55
    .line 56
    iput p1, p3, Lq3/v;->c:I

    .line 57
    .line 58
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public final c(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw3/d;->C:LA1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lw3/d;->D:LA1/i;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Element "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, " must be in a Cues"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p1, v0}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw3/d;->u:Lw3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Element "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " must be in a TrackEntry"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final e(Lw3/c;JIII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "S_TEXT/WEBVTT"

    .line 6
    .line 7
    const-string v3, "S_TEXT/ASS"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "S_TEXT/UTF8"

    .line 11
    .line 12
    iget-object v6, v1, Lw3/c;->T:Lq3/v;

    .line 13
    .line 14
    const/4 v14, 0x1

    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    iget-object v7, v1, Lw3/c;->X:Lq3/u;

    .line 18
    .line 19
    iget-object v13, v1, Lw3/c;->j:Lq3/t;

    .line 20
    .line 21
    move-wide/from16 v8, p2

    .line 22
    .line 23
    move/from16 v10, p4

    .line 24
    .line 25
    move/from16 v11, p5

    .line 26
    .line 27
    move/from16 v12, p6

    .line 28
    .line 29
    invoke-virtual/range {v6 .. v13}, Lq3/v;->b(Lq3/u;JIIILq3/t;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_7

    .line 33
    .line 34
    :cond_0
    iget-object v6, v1, Lw3/c;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    iget-object v6, v1, Lw3/c;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    iget-object v6, v1, Lw3/c;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    :cond_1
    iget v6, v0, Lw3/d;->K:I

    .line 59
    .line 60
    const-string v7, "MatroskaExtractor"

    .line 61
    .line 62
    if-le v6, v14, :cond_2

    .line 63
    .line 64
    const-string v2, "Skipping subtitle sample in laced block."

    .line 65
    .line 66
    invoke-static {v7, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-wide v8, v0, Lw3/d;->I:J

    .line 71
    .line 72
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    cmp-long v6, v8, v10

    .line 78
    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    const-string v2, "Skipping subtitle sample with no duration."

    .line 82
    .line 83
    invoke-static {v7, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    iget-object v6, v1, Lw3/c;->b:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v7, v0, Lw3/d;->k:LA4/r;

    .line 93
    .line 94
    iget-object v10, v7, LA4/r;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v10, [B

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const-wide/16 v11, 0x3e8

    .line 102
    .line 103
    const/4 v13, -0x1

    .line 104
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    sparse-switch v15, :sswitch_data_0

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :sswitch_0
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    const/4 v13, 0x2

    .line 120
    goto :goto_1

    .line 121
    :sswitch_1
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_6

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    move v13, v14

    .line 129
    goto :goto_1

    .line 130
    :sswitch_2
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_7

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_7
    move v13, v4

    .line 138
    :goto_1
    packed-switch v13, :pswitch_data_0

    .line 139
    .line 140
    .line 141
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 144
    .line 145
    .line 146
    throw v1

    .line 147
    :pswitch_0
    const-string v2, "%02d:%02d:%02d,%03d"

    .line 148
    .line 149
    invoke-static {v8, v9, v2, v11, v12}, Lw3/d;->g(JLjava/lang/String;J)[B

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const/16 v3, 0x13

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :pswitch_1
    const-string v2, "%02d:%02d:%02d.%03d"

    .line 157
    .line 158
    invoke-static {v8, v9, v2, v11, v12}, Lw3/d;->g(JLjava/lang/String;J)[B

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const/16 v3, 0x19

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :pswitch_2
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 166
    .line 167
    const-wide/16 v5, 0x2710

    .line 168
    .line 169
    invoke-static {v8, v9, v2, v5, v6}, Lw3/d;->g(JLjava/lang/String;J)[B

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/16 v3, 0x15

    .line 174
    .line 175
    :goto_2
    array-length v5, v2

    .line 176
    invoke-static {v2, v4, v10, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 177
    .line 178
    .line 179
    iget v2, v7, LA4/r;->a:I

    .line 180
    .line 181
    :goto_3
    iget v3, v7, LA4/r;->b:I

    .line 182
    .line 183
    if-ge v2, v3, :cond_9

    .line 184
    .line 185
    iget-object v3, v7, LA4/r;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v3, [B

    .line 188
    .line 189
    aget-byte v3, v3, v2

    .line 190
    .line 191
    if-nez v3, :cond_8

    .line 192
    .line 193
    invoke-virtual {v7, v2}, LA4/r;->G(I)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    add-int/2addr v2, v14

    .line 198
    goto :goto_3

    .line 199
    :cond_9
    :goto_4
    iget-object v2, v1, Lw3/c;->X:Lq3/u;

    .line 200
    .line 201
    iget v3, v7, LA4/r;->b:I

    .line 202
    .line 203
    invoke-interface {v2, v3, v7}, Lq3/u;->c(ILA4/r;)V

    .line 204
    .line 205
    .line 206
    iget v2, v7, LA4/r;->b:I

    .line 207
    .line 208
    add-int v2, p5, v2

    .line 209
    .line 210
    :goto_5
    const/high16 v3, 0x10000000

    .line 211
    .line 212
    and-int v3, p4, v3

    .line 213
    .line 214
    if-eqz v3, :cond_b

    .line 215
    .line 216
    iget v3, v0, Lw3/d;->K:I

    .line 217
    .line 218
    iget-object v5, v0, Lw3/d;->n:LA4/r;

    .line 219
    .line 220
    if-le v3, v14, :cond_a

    .line 221
    .line 222
    invoke-virtual {v5, v4}, LA4/r;->E(I)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_a
    iget v3, v5, LA4/r;->b:I

    .line 227
    .line 228
    iget-object v4, v1, Lw3/c;->X:Lq3/u;

    .line 229
    .line 230
    invoke-interface {v4, v3, v5}, Lq3/u;->b(ILA4/r;)V

    .line 231
    .line 232
    .line 233
    add-int/2addr v2, v3

    .line 234
    :cond_b
    :goto_6
    move/from16 v19, v2

    .line 235
    .line 236
    iget-object v15, v1, Lw3/c;->X:Lq3/u;

    .line 237
    .line 238
    iget-object v1, v1, Lw3/c;->j:Lq3/t;

    .line 239
    .line 240
    move-wide/from16 v16, p2

    .line 241
    .line 242
    move/from16 v18, p4

    .line 243
    .line 244
    move/from16 v20, p6

    .line 245
    .line 246
    move-object/from16 v21, v1

    .line 247
    .line 248
    invoke-interface/range {v15 .. v21}, Lq3/u;->d(JIIILq3/t;)V

    .line 249
    .line 250
    .line 251
    :goto_7
    iput-boolean v14, v0, Lw3/d;->F:Z

    .line 252
    .line 253
    return-void

    .line 254
    nop

    .line 255
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public final f(Lq3/k;Lc7/j;)I
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "A_MPEG/L2"

    .line 4
    .line 5
    const-string v2, "A_VORBIS"

    .line 6
    .line 7
    const-string v3, "A_TRUEHD"

    .line 8
    .line 9
    const-string v4, "A_MS/ACM"

    .line 10
    .line 11
    const-string v5, "V_MPEG4/ISO/SP"

    .line 12
    .line 13
    const-string v6, "V_MPEG4/ISO/AP"

    .line 14
    .line 15
    const-string v9, "A_OPUS"

    .line 16
    .line 17
    const/16 v16, 0x14

    .line 18
    .line 19
    const/16 v18, 0x2

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    iput-boolean v10, v0, Lw3/d;->F:Z

    .line 23
    .line 24
    const/16 v20, 0x1

    .line 25
    .line 26
    :goto_0
    if-eqz v20, :cond_b2

    .line 27
    .line 28
    iget-boolean v15, v0, Lw3/d;->F:Z

    .line 29
    .line 30
    if-nez v15, :cond_b2

    .line 31
    .line 32
    iget-object v15, v0, Lw3/d;->a:Lw3/b;

    .line 33
    .line 34
    move/from16 v22, v10

    .line 35
    .line 36
    iget-object v10, v15, Lw3/b;->d:Li/G;

    .line 37
    .line 38
    invoke-static {v10}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    iget-object v10, v15, Lw3/b;->b:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v10}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v20

    .line 47
    move-object/from16 v8, v20

    .line 48
    .line 49
    check-cast v8, Lw3/a;

    .line 50
    .line 51
    const/high16 v26, -0x40800000    # -1.0f

    .line 52
    .line 53
    const/16 v27, 0x8

    .line 54
    .line 55
    const/16 v7, 0xae

    .line 56
    .line 57
    const/16 v30, 0x1

    .line 58
    .line 59
    const-wide/16 v32, 0x0

    .line 60
    .line 61
    const/16 v13, 0xa0

    .line 62
    .line 63
    const v14, 0x1c53bb6b

    .line 64
    .line 65
    .line 66
    const-wide/16 v36, -0x1

    .line 67
    .line 68
    if-eqz v8, :cond_86

    .line 69
    .line 70
    move-object/from16 v12, p1

    .line 71
    .line 72
    check-cast v12, Lq3/g;

    .line 73
    .line 74
    invoke-virtual {v12}, Lq3/g;->E()J

    .line 75
    .line 76
    .line 77
    move-result-wide v38

    .line 78
    iget-wide v11, v8, Lw3/a;->b:J

    .line 79
    .line 80
    cmp-long v8, v38, v11

    .line 81
    .line 82
    if-ltz v8, :cond_86

    .line 83
    .line 84
    iget-object v8, v15, Lw3/b;->d:Li/G;

    .line 85
    .line 86
    invoke-virtual {v10}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    check-cast v10, Lw3/a;

    .line 91
    .line 92
    iget v10, v10, Lw3/a;->a:I

    .line 93
    .line 94
    iget-object v8, v8, Li/G;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v8, Lw3/d;

    .line 97
    .line 98
    iget-object v11, v8, Lw3/d;->b0:Lq3/l;

    .line 99
    .line 100
    invoke-static {v11}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v11, v8, Lw3/d;->c:Landroid/util/SparseArray;

    .line 104
    .line 105
    if-eq v10, v13, :cond_7f

    .line 106
    .line 107
    const-string v12, "MatroskaExtractor"

    .line 108
    .line 109
    if-eq v10, v7, :cond_12

    .line 110
    .line 111
    const/16 v7, 0x4dbb

    .line 112
    .line 113
    if-eq v10, v7, :cond_10

    .line 114
    .line 115
    const/16 v7, 0x6240

    .line 116
    .line 117
    if-eq v10, v7, :cond_e

    .line 118
    .line 119
    const/16 v7, 0x6d80

    .line 120
    .line 121
    if-eq v10, v7, :cond_c

    .line 122
    .line 123
    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    const v7, 0x1549a966

    .line 129
    .line 130
    .line 131
    if-eq v10, v7, :cond_9

    .line 132
    .line 133
    const v7, 0x1654ae6b

    .line 134
    .line 135
    .line 136
    if-eq v10, v7, :cond_7

    .line 137
    .line 138
    if-eq v10, v14, :cond_0

    .line 139
    .line 140
    move-object/from16 v48, v1

    .line 141
    .line 142
    move-object/from16 v49, v2

    .line 143
    .line 144
    move-object/from16 v50, v3

    .line 145
    .line 146
    move-object/from16 v39, v6

    .line 147
    .line 148
    move-object/from16 v38, v9

    .line 149
    .line 150
    const/16 v17, 0x19

    .line 151
    .line 152
    const/16 v19, 0xf

    .line 153
    .line 154
    const/16 v24, 0x10

    .line 155
    .line 156
    move-object v6, v5

    .line 157
    move-object v5, v4

    .line 158
    goto/16 :goto_3f

    .line 159
    .line 160
    :cond_0
    iget-boolean v7, v8, Lw3/d;->v:Z

    .line 161
    .line 162
    if-nez v7, :cond_6

    .line 163
    .line 164
    iget-object v7, v8, Lw3/d;->b0:Lq3/l;

    .line 165
    .line 166
    iget-object v10, v8, Lw3/d;->C:LA1/i;

    .line 167
    .line 168
    iget-object v11, v8, Lw3/d;->D:LA1/i;

    .line 169
    .line 170
    iget-wide v13, v8, Lw3/d;->q:J

    .line 171
    .line 172
    cmp-long v13, v13, v36

    .line 173
    .line 174
    if-eqz v13, :cond_1

    .line 175
    .line 176
    iget-wide v13, v8, Lw3/d;->t:J

    .line 177
    .line 178
    cmp-long v13, v13, v25

    .line 179
    .line 180
    if-eqz v13, :cond_1

    .line 181
    .line 182
    if-eqz v10, :cond_1

    .line 183
    .line 184
    iget v13, v10, LA1/i;->a:I

    .line 185
    .line 186
    if-eqz v13, :cond_1

    .line 187
    .line 188
    if-eqz v11, :cond_1

    .line 189
    .line 190
    iget v14, v11, LA1/i;->a:I

    .line 191
    .line 192
    if-eq v14, v13, :cond_2

    .line 193
    .line 194
    :cond_1
    move-object/from16 v48, v3

    .line 195
    .line 196
    move-object/from16 v49, v4

    .line 197
    .line 198
    move-object/from16 v39, v5

    .line 199
    .line 200
    move-object/from16 v38, v6

    .line 201
    .line 202
    goto/16 :goto_4

    .line 203
    .line 204
    :cond_2
    new-array v14, v13, [I

    .line 205
    .line 206
    new-array v15, v13, [J

    .line 207
    .line 208
    new-array v0, v13, [J

    .line 209
    .line 210
    move-object/from16 v38, v6

    .line 211
    .line 212
    new-array v6, v13, [J

    .line 213
    .line 214
    move-object/from16 v39, v5

    .line 215
    .line 216
    move/from16 v5, v22

    .line 217
    .line 218
    :goto_2
    if-ge v5, v13, :cond_3

    .line 219
    .line 220
    invoke-virtual {v10, v5}, LA1/i;->h(I)J

    .line 221
    .line 222
    .line 223
    move-result-wide v25

    .line 224
    aput-wide v25, v6, v5

    .line 225
    .line 226
    move-object/from16 v48, v3

    .line 227
    .line 228
    move-object/from16 v49, v4

    .line 229
    .line 230
    iget-wide v3, v8, Lw3/d;->q:J

    .line 231
    .line 232
    invoke-virtual {v11, v5}, LA1/i;->h(I)J

    .line 233
    .line 234
    .line 235
    move-result-wide v25

    .line 236
    add-long v25, v25, v3

    .line 237
    .line 238
    aput-wide v25, v15, v5

    .line 239
    .line 240
    add-int/lit8 v5, v5, 0x1

    .line 241
    .line 242
    move-object/from16 v3, v48

    .line 243
    .line 244
    move-object/from16 v4, v49

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_3
    move-object/from16 v48, v3

    .line 248
    .line 249
    move-object/from16 v49, v4

    .line 250
    .line 251
    move/from16 v3, v22

    .line 252
    .line 253
    :goto_3
    add-int/lit8 v4, v13, -0x1

    .line 254
    .line 255
    if-ge v3, v4, :cond_4

    .line 256
    .line 257
    add-int/lit8 v4, v3, 0x1

    .line 258
    .line 259
    aget-wide v10, v15, v4

    .line 260
    .line 261
    aget-wide v25, v15, v3

    .line 262
    .line 263
    sub-long v10, v10, v25

    .line 264
    .line 265
    long-to-int v5, v10

    .line 266
    aput v5, v14, v3

    .line 267
    .line 268
    aget-wide v10, v6, v4

    .line 269
    .line 270
    aget-wide v25, v6, v3

    .line 271
    .line 272
    sub-long v10, v10, v25

    .line 273
    .line 274
    aput-wide v10, v0, v3

    .line 275
    .line 276
    move v3, v4

    .line 277
    goto :goto_3

    .line 278
    :cond_4
    iget-wide v10, v8, Lw3/d;->q:J

    .line 279
    .line 280
    move-wide/from16 v25, v10

    .line 281
    .line 282
    iget-wide v10, v8, Lw3/d;->p:J

    .line 283
    .line 284
    add-long v10, v25, v10

    .line 285
    .line 286
    aget-wide v25, v15, v4

    .line 287
    .line 288
    sub-long v10, v10, v25

    .line 289
    .line 290
    long-to-int v3, v10

    .line 291
    aput v3, v14, v4

    .line 292
    .line 293
    iget-wide v10, v8, Lw3/d;->t:J

    .line 294
    .line 295
    aget-wide v25, v6, v4

    .line 296
    .line 297
    sub-long v10, v10, v25

    .line 298
    .line 299
    aput-wide v10, v0, v4

    .line 300
    .line 301
    cmp-long v3, v10, v32

    .line 302
    .line 303
    if-gtz v3, :cond_5

    .line 304
    .line 305
    new-instance v3, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v5, "Discarding last cue point with unexpected duration: "

    .line 308
    .line 309
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v12, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v14, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 323
    .line 324
    .line 325
    move-result-object v14

    .line 326
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 327
    .line 328
    .line 329
    move-result-object v15

    .line 330
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    :cond_5
    new-instance v3, Lq3/f;

    .line 339
    .line 340
    invoke-direct {v3, v14, v15, v0, v6}, Lq3/f;-><init>([I[J[J[J)V

    .line 341
    .line 342
    .line 343
    goto :goto_5

    .line 344
    :goto_4
    new-instance v3, Lq3/m;

    .line 345
    .line 346
    iget-wide v4, v8, Lw3/d;->t:J

    .line 347
    .line 348
    invoke-direct {v3, v4, v5}, Lq3/m;-><init>(J)V

    .line 349
    .line 350
    .line 351
    :goto_5
    invoke-interface {v7, v3}, Lq3/l;->r(Lq3/r;)V

    .line 352
    .line 353
    .line 354
    move/from16 v0, v30

    .line 355
    .line 356
    iput-boolean v0, v8, Lw3/d;->v:Z

    .line 357
    .line 358
    :goto_6
    const/4 v0, 0x0

    .line 359
    goto :goto_7

    .line 360
    :cond_6
    move-object/from16 v48, v3

    .line 361
    .line 362
    move-object/from16 v49, v4

    .line 363
    .line 364
    move-object/from16 v39, v5

    .line 365
    .line 366
    move-object/from16 v38, v6

    .line 367
    .line 368
    goto :goto_6

    .line 369
    :goto_7
    iput-object v0, v8, Lw3/d;->C:LA1/i;

    .line 370
    .line 371
    iput-object v0, v8, Lw3/d;->D:LA1/i;

    .line 372
    .line 373
    :goto_8
    move/from16 v7, v22

    .line 374
    .line 375
    move-object/from16 v6, v39

    .line 376
    .line 377
    move-object/from16 v50, v48

    .line 378
    .line 379
    move-object/from16 v5, v49

    .line 380
    .line 381
    const/16 v17, 0x19

    .line 382
    .line 383
    const/16 v19, 0xf

    .line 384
    .line 385
    const/16 v24, 0x10

    .line 386
    .line 387
    move-object/from16 v48, v1

    .line 388
    .line 389
    move-object/from16 v49, v2

    .line 390
    .line 391
    move-object v2, v9

    .line 392
    move-object/from16 v39, v38

    .line 393
    .line 394
    goto/16 :goto_45

    .line 395
    .line 396
    :cond_7
    move-object/from16 v48, v3

    .line 397
    .line 398
    move-object/from16 v49, v4

    .line 399
    .line 400
    move-object/from16 v39, v5

    .line 401
    .line 402
    move-object/from16 v38, v6

    .line 403
    .line 404
    const/4 v0, 0x0

    .line 405
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-eqz v3, :cond_8

    .line 410
    .line 411
    iget-object v0, v8, Lw3/d;->b0:Lq3/l;

    .line 412
    .line 413
    invoke-interface {v0}, Lq3/l;->i()V

    .line 414
    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_8
    const-string v1, "No valid tracks were found"

    .line 418
    .line 419
    invoke-static {v1, v0}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    throw v0

    .line 424
    :cond_9
    move-object/from16 v48, v3

    .line 425
    .line 426
    move-object/from16 v49, v4

    .line 427
    .line 428
    move-object/from16 v39, v5

    .line 429
    .line 430
    move-object/from16 v38, v6

    .line 431
    .line 432
    iget-wide v3, v8, Lw3/d;->r:J

    .line 433
    .line 434
    cmp-long v0, v3, v25

    .line 435
    .line 436
    if-nez v0, :cond_a

    .line 437
    .line 438
    const-wide/32 v3, 0xf4240

    .line 439
    .line 440
    .line 441
    iput-wide v3, v8, Lw3/d;->r:J

    .line 442
    .line 443
    :cond_a
    iget-wide v3, v8, Lw3/d;->s:J

    .line 444
    .line 445
    cmp-long v0, v3, v25

    .line 446
    .line 447
    if-eqz v0, :cond_b

    .line 448
    .line 449
    invoke-virtual {v8, v3, v4}, Lw3/d;->m(J)J

    .line 450
    .line 451
    .line 452
    move-result-wide v3

    .line 453
    iput-wide v3, v8, Lw3/d;->t:J

    .line 454
    .line 455
    goto :goto_8

    .line 456
    :cond_b
    :goto_9
    move-object/from16 v6, v39

    .line 457
    .line 458
    move-object/from16 v50, v48

    .line 459
    .line 460
    move-object/from16 v5, v49

    .line 461
    .line 462
    const/16 v17, 0x19

    .line 463
    .line 464
    const/16 v19, 0xf

    .line 465
    .line 466
    const/16 v24, 0x10

    .line 467
    .line 468
    move-object/from16 v48, v1

    .line 469
    .line 470
    move-object/from16 v49, v2

    .line 471
    .line 472
    move-object/from16 v39, v38

    .line 473
    .line 474
    move-object/from16 v38, v9

    .line 475
    .line 476
    goto/16 :goto_3f

    .line 477
    .line 478
    :cond_c
    move-object/from16 v48, v3

    .line 479
    .line 480
    move-object/from16 v49, v4

    .line 481
    .line 482
    move-object/from16 v39, v5

    .line 483
    .line 484
    move-object/from16 v38, v6

    .line 485
    .line 486
    invoke-virtual {v8, v10}, Lw3/d;->d(I)V

    .line 487
    .line 488
    .line 489
    iget-object v0, v8, Lw3/d;->u:Lw3/c;

    .line 490
    .line 491
    iget-boolean v3, v0, Lw3/c;->h:Z

    .line 492
    .line 493
    if-eqz v3, :cond_b

    .line 494
    .line 495
    iget-object v0, v0, Lw3/c;->i:[B

    .line 496
    .line 497
    if-nez v0, :cond_d

    .line 498
    .line 499
    goto :goto_9

    .line 500
    :cond_d
    const-string v0, "Combining encryption and compression is not supported"

    .line 501
    .line 502
    const/4 v1, 0x0

    .line 503
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    throw v0

    .line 508
    :cond_e
    move-object/from16 v48, v3

    .line 509
    .line 510
    move-object/from16 v49, v4

    .line 511
    .line 512
    move-object/from16 v39, v5

    .line 513
    .line 514
    move-object/from16 v38, v6

    .line 515
    .line 516
    invoke-virtual {v8, v10}, Lw3/d;->d(I)V

    .line 517
    .line 518
    .line 519
    iget-object v0, v8, Lw3/d;->u:Lw3/c;

    .line 520
    .line 521
    iget-boolean v3, v0, Lw3/c;->h:Z

    .line 522
    .line 523
    if-eqz v3, :cond_b

    .line 524
    .line 525
    iget-object v3, v0, Lw3/c;->j:Lq3/t;

    .line 526
    .line 527
    if-eqz v3, :cond_f

    .line 528
    .line 529
    new-instance v4, Ln3/g;

    .line 530
    .line 531
    new-instance v5, Ln3/f;

    .line 532
    .line 533
    sget-object v6, Lj3/g;->a:Ljava/util/UUID;

    .line 534
    .line 535
    iget-object v3, v3, Lq3/t;->b:[B

    .line 536
    .line 537
    const-string v7, "video/webm"

    .line 538
    .line 539
    const/4 v8, 0x0

    .line 540
    invoke-direct {v5, v6, v8, v7, v3}, Ln3/f;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 541
    .line 542
    .line 543
    const/4 v3, 0x1

    .line 544
    new-array v6, v3, [Ln3/f;

    .line 545
    .line 546
    aput-object v5, v6, v22

    .line 547
    .line 548
    invoke-direct {v4, v6}, Ln3/g;-><init>([Ln3/f;)V

    .line 549
    .line 550
    .line 551
    iput-object v4, v0, Lw3/c;->l:Ln3/g;

    .line 552
    .line 553
    goto/16 :goto_8

    .line 554
    .line 555
    :cond_f
    const/4 v8, 0x0

    .line 556
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    .line 557
    .line 558
    invoke-static {v0, v8}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    throw v0

    .line 563
    :cond_10
    move-object/from16 v48, v3

    .line 564
    .line 565
    move-object/from16 v49, v4

    .line 566
    .line 567
    move-object/from16 v39, v5

    .line 568
    .line 569
    move-object/from16 v38, v6

    .line 570
    .line 571
    iget v0, v8, Lw3/d;->w:I

    .line 572
    .line 573
    const/4 v3, -0x1

    .line 574
    if-eq v0, v3, :cond_11

    .line 575
    .line 576
    iget-wide v3, v8, Lw3/d;->x:J

    .line 577
    .line 578
    cmp-long v5, v3, v36

    .line 579
    .line 580
    if-eqz v5, :cond_11

    .line 581
    .line 582
    if-ne v0, v14, :cond_b

    .line 583
    .line 584
    iput-wide v3, v8, Lw3/d;->z:J

    .line 585
    .line 586
    goto/16 :goto_8

    .line 587
    .line 588
    :cond_11
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    .line 589
    .line 590
    const/4 v1, 0x0

    .line 591
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    throw v0

    .line 596
    :cond_12
    move-object/from16 v48, v3

    .line 597
    .line 598
    move-object/from16 v49, v4

    .line 599
    .line 600
    move-object/from16 v39, v5

    .line 601
    .line 602
    move-object/from16 v38, v6

    .line 603
    .line 604
    iget-object v0, v8, Lw3/d;->u:Lw3/c;

    .line 605
    .line 606
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    iget-object v3, v0, Lw3/c;->b:Ljava/lang/String;

    .line 610
    .line 611
    if-eqz v3, :cond_7e

    .line 612
    .line 613
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    sparse-switch v4, :sswitch_data_0

    .line 618
    .line 619
    .line 620
    :goto_a
    move-object/from16 v7, v38

    .line 621
    .line 622
    move-object/from16 v6, v39

    .line 623
    .line 624
    move-object/from16 v4, v48

    .line 625
    .line 626
    :goto_b
    move-object/from16 v5, v49

    .line 627
    .line 628
    :goto_c
    const/4 v10, -0x1

    .line 629
    goto/16 :goto_f

    .line 630
    .line 631
    :sswitch_0
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-nez v4, :cond_13

    .line 636
    .line 637
    goto :goto_a

    .line 638
    :cond_13
    move-object/from16 v7, v38

    .line 639
    .line 640
    move-object/from16 v6, v39

    .line 641
    .line 642
    move-object/from16 v4, v48

    .line 643
    .line 644
    move-object/from16 v5, v49

    .line 645
    .line 646
    const/16 v10, 0x20

    .line 647
    .line 648
    goto/16 :goto_f

    .line 649
    .line 650
    :sswitch_1
    const-string v4, "A_FLAC"

    .line 651
    .line 652
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    if-nez v4, :cond_14

    .line 657
    .line 658
    goto :goto_a

    .line 659
    :cond_14
    const/16 v4, 0x1f

    .line 660
    .line 661
    goto/16 :goto_d

    .line 662
    .line 663
    :sswitch_2
    const-string v4, "A_EAC3"

    .line 664
    .line 665
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    if-nez v4, :cond_15

    .line 670
    .line 671
    goto :goto_a

    .line 672
    :cond_15
    const/16 v4, 0x1e

    .line 673
    .line 674
    goto/16 :goto_d

    .line 675
    .line 676
    :sswitch_3
    const-string v4, "V_MPEG2"

    .line 677
    .line 678
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    if-nez v4, :cond_16

    .line 683
    .line 684
    goto :goto_a

    .line 685
    :cond_16
    const/16 v4, 0x1d

    .line 686
    .line 687
    goto/16 :goto_d

    .line 688
    .line 689
    :sswitch_4
    const-string v4, "S_TEXT/UTF8"

    .line 690
    .line 691
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-nez v4, :cond_17

    .line 696
    .line 697
    goto :goto_a

    .line 698
    :cond_17
    const/16 v4, 0x1c

    .line 699
    .line 700
    goto/16 :goto_d

    .line 701
    .line 702
    :sswitch_5
    const-string v4, "S_TEXT/WEBVTT"

    .line 703
    .line 704
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    if-nez v4, :cond_18

    .line 709
    .line 710
    goto :goto_a

    .line 711
    :cond_18
    const/16 v4, 0x1b

    .line 712
    .line 713
    goto/16 :goto_d

    .line 714
    .line 715
    :sswitch_6
    const-string v4, "V_MPEGH/ISO/HEVC"

    .line 716
    .line 717
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    if-nez v4, :cond_19

    .line 722
    .line 723
    goto :goto_a

    .line 724
    :cond_19
    const/16 v4, 0x1a

    .line 725
    .line 726
    goto/16 :goto_d

    .line 727
    .line 728
    :sswitch_7
    const-string v4, "S_TEXT/ASS"

    .line 729
    .line 730
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v4

    .line 734
    if-nez v4, :cond_1a

    .line 735
    .line 736
    goto :goto_a

    .line 737
    :cond_1a
    move-object/from16 v7, v38

    .line 738
    .line 739
    move-object/from16 v6, v39

    .line 740
    .line 741
    move-object/from16 v4, v48

    .line 742
    .line 743
    move-object/from16 v5, v49

    .line 744
    .line 745
    const/16 v10, 0x19

    .line 746
    .line 747
    goto/16 :goto_f

    .line 748
    .line 749
    :sswitch_8
    const-string v4, "A_PCM/INT/LIT"

    .line 750
    .line 751
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    if-nez v4, :cond_1b

    .line 756
    .line 757
    goto/16 :goto_a

    .line 758
    .line 759
    :cond_1b
    move-object/from16 v7, v38

    .line 760
    .line 761
    move-object/from16 v6, v39

    .line 762
    .line 763
    move-object/from16 v4, v48

    .line 764
    .line 765
    move-object/from16 v5, v49

    .line 766
    .line 767
    const/16 v10, 0x18

    .line 768
    .line 769
    goto/16 :goto_f

    .line 770
    .line 771
    :sswitch_9
    const-string v4, "A_PCM/INT/BIG"

    .line 772
    .line 773
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    if-nez v4, :cond_1c

    .line 778
    .line 779
    goto/16 :goto_a

    .line 780
    .line 781
    :cond_1c
    const/16 v4, 0x17

    .line 782
    .line 783
    goto/16 :goto_d

    .line 784
    .line 785
    :sswitch_a
    const-string v4, "A_PCM/FLOAT/IEEE"

    .line 786
    .line 787
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    if-nez v4, :cond_1d

    .line 792
    .line 793
    goto/16 :goto_a

    .line 794
    .line 795
    :cond_1d
    const/16 v4, 0x16

    .line 796
    .line 797
    goto/16 :goto_d

    .line 798
    .line 799
    :sswitch_b
    const-string v4, "A_DTS/EXPRESS"

    .line 800
    .line 801
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v4

    .line 805
    if-nez v4, :cond_1e

    .line 806
    .line 807
    goto/16 :goto_a

    .line 808
    .line 809
    :cond_1e
    const/16 v4, 0x15

    .line 810
    .line 811
    goto/16 :goto_d

    .line 812
    .line 813
    :sswitch_c
    const-string v4, "V_THEORA"

    .line 814
    .line 815
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v4

    .line 819
    if-nez v4, :cond_1f

    .line 820
    .line 821
    goto/16 :goto_a

    .line 822
    .line 823
    :cond_1f
    move/from16 v10, v16

    .line 824
    .line 825
    goto/16 :goto_e

    .line 826
    .line 827
    :sswitch_d
    const-string v4, "S_HDMV/PGS"

    .line 828
    .line 829
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v4

    .line 833
    if-nez v4, :cond_20

    .line 834
    .line 835
    goto/16 :goto_a

    .line 836
    .line 837
    :cond_20
    const/16 v4, 0x13

    .line 838
    .line 839
    goto/16 :goto_d

    .line 840
    .line 841
    :sswitch_e
    const-string v4, "V_VP9"

    .line 842
    .line 843
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    if-nez v4, :cond_21

    .line 848
    .line 849
    goto/16 :goto_a

    .line 850
    .line 851
    :cond_21
    const/16 v4, 0x12

    .line 852
    .line 853
    goto/16 :goto_d

    .line 854
    .line 855
    :sswitch_f
    const-string v4, "V_VP8"

    .line 856
    .line 857
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v4

    .line 861
    if-nez v4, :cond_22

    .line 862
    .line 863
    goto/16 :goto_a

    .line 864
    .line 865
    :cond_22
    const/16 v4, 0x11

    .line 866
    .line 867
    goto/16 :goto_d

    .line 868
    .line 869
    :sswitch_10
    const-string v4, "V_AV1"

    .line 870
    .line 871
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v4

    .line 875
    if-nez v4, :cond_23

    .line 876
    .line 877
    goto/16 :goto_a

    .line 878
    .line 879
    :cond_23
    move-object/from16 v7, v38

    .line 880
    .line 881
    move-object/from16 v6, v39

    .line 882
    .line 883
    move-object/from16 v4, v48

    .line 884
    .line 885
    move-object/from16 v5, v49

    .line 886
    .line 887
    const/16 v10, 0x10

    .line 888
    .line 889
    goto/16 :goto_f

    .line 890
    .line 891
    :sswitch_11
    const-string v4, "A_DTS"

    .line 892
    .line 893
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v4

    .line 897
    if-nez v4, :cond_24

    .line 898
    .line 899
    goto/16 :goto_a

    .line 900
    .line 901
    :cond_24
    move-object/from16 v7, v38

    .line 902
    .line 903
    move-object/from16 v6, v39

    .line 904
    .line 905
    move-object/from16 v4, v48

    .line 906
    .line 907
    move-object/from16 v5, v49

    .line 908
    .line 909
    const/16 v10, 0xf

    .line 910
    .line 911
    goto/16 :goto_f

    .line 912
    .line 913
    :sswitch_12
    const-string v4, "A_AC3"

    .line 914
    .line 915
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v4

    .line 919
    if-nez v4, :cond_25

    .line 920
    .line 921
    goto/16 :goto_a

    .line 922
    .line 923
    :cond_25
    const/16 v4, 0xe

    .line 924
    .line 925
    goto/16 :goto_d

    .line 926
    .line 927
    :sswitch_13
    const-string v4, "A_AAC"

    .line 928
    .line 929
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v4

    .line 933
    if-nez v4, :cond_26

    .line 934
    .line 935
    goto/16 :goto_a

    .line 936
    .line 937
    :cond_26
    const/16 v4, 0xd

    .line 938
    .line 939
    goto :goto_d

    .line 940
    :sswitch_14
    const-string v4, "A_DTS/LOSSLESS"

    .line 941
    .line 942
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    if-nez v4, :cond_27

    .line 947
    .line 948
    goto/16 :goto_a

    .line 949
    .line 950
    :cond_27
    const/16 v4, 0xc

    .line 951
    .line 952
    goto :goto_d

    .line 953
    :sswitch_15
    const-string v4, "S_VOBSUB"

    .line 954
    .line 955
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v4

    .line 959
    if-nez v4, :cond_28

    .line 960
    .line 961
    goto/16 :goto_a

    .line 962
    .line 963
    :cond_28
    const/16 v4, 0xb

    .line 964
    .line 965
    goto :goto_d

    .line 966
    :sswitch_16
    const-string v4, "V_MPEG4/ISO/AVC"

    .line 967
    .line 968
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    move-result v4

    .line 972
    if-nez v4, :cond_29

    .line 973
    .line 974
    goto/16 :goto_a

    .line 975
    .line 976
    :cond_29
    const/16 v4, 0xa

    .line 977
    .line 978
    goto :goto_d

    .line 979
    :sswitch_17
    const-string v4, "V_MPEG4/ISO/ASP"

    .line 980
    .line 981
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 982
    .line 983
    .line 984
    move-result v4

    .line 985
    if-nez v4, :cond_2a

    .line 986
    .line 987
    goto/16 :goto_a

    .line 988
    .line 989
    :cond_2a
    const/16 v4, 0x9

    .line 990
    .line 991
    goto :goto_d

    .line 992
    :sswitch_18
    const-string v4, "S_DVBSUB"

    .line 993
    .line 994
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    move-result v4

    .line 998
    if-nez v4, :cond_2b

    .line 999
    .line 1000
    goto/16 :goto_a

    .line 1001
    .line 1002
    :cond_2b
    move/from16 v10, v27

    .line 1003
    .line 1004
    goto :goto_e

    .line 1005
    :sswitch_19
    const-string v4, "V_MS/VFW/FOURCC"

    .line 1006
    .line 1007
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v4

    .line 1011
    if-nez v4, :cond_2c

    .line 1012
    .line 1013
    goto/16 :goto_a

    .line 1014
    .line 1015
    :cond_2c
    const/4 v4, 0x7

    .line 1016
    goto :goto_d

    .line 1017
    :sswitch_1a
    const-string v4, "A_MPEG/L3"

    .line 1018
    .line 1019
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v4

    .line 1023
    if-nez v4, :cond_2d

    .line 1024
    .line 1025
    goto/16 :goto_a

    .line 1026
    .line 1027
    :cond_2d
    const/4 v4, 0x6

    .line 1028
    :goto_d
    move v10, v4

    .line 1029
    :goto_e
    move-object/from16 v7, v38

    .line 1030
    .line 1031
    move-object/from16 v6, v39

    .line 1032
    .line 1033
    move-object/from16 v4, v48

    .line 1034
    .line 1035
    move-object/from16 v5, v49

    .line 1036
    .line 1037
    goto/16 :goto_f

    .line 1038
    .line 1039
    :sswitch_1b
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v4

    .line 1043
    if-nez v4, :cond_2e

    .line 1044
    .line 1045
    goto/16 :goto_a

    .line 1046
    .line 1047
    :cond_2e
    move-object/from16 v7, v38

    .line 1048
    .line 1049
    move-object/from16 v6, v39

    .line 1050
    .line 1051
    move-object/from16 v4, v48

    .line 1052
    .line 1053
    move-object/from16 v5, v49

    .line 1054
    .line 1055
    const/4 v10, 0x5

    .line 1056
    goto/16 :goto_f

    .line 1057
    .line 1058
    :sswitch_1c
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v4

    .line 1062
    if-nez v4, :cond_2f

    .line 1063
    .line 1064
    goto/16 :goto_a

    .line 1065
    .line 1066
    :cond_2f
    move-object/from16 v7, v38

    .line 1067
    .line 1068
    move-object/from16 v6, v39

    .line 1069
    .line 1070
    move-object/from16 v4, v48

    .line 1071
    .line 1072
    move-object/from16 v5, v49

    .line 1073
    .line 1074
    const/4 v10, 0x4

    .line 1075
    goto :goto_f

    .line 1076
    :sswitch_1d
    move-object/from16 v4, v48

    .line 1077
    .line 1078
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v5

    .line 1082
    move-object/from16 v7, v38

    .line 1083
    .line 1084
    move-object/from16 v6, v39

    .line 1085
    .line 1086
    if-nez v5, :cond_30

    .line 1087
    .line 1088
    goto/16 :goto_b

    .line 1089
    .line 1090
    :cond_30
    move-object/from16 v5, v49

    .line 1091
    .line 1092
    const/4 v10, 0x3

    .line 1093
    goto :goto_f

    .line 1094
    :sswitch_1e
    move-object/from16 v4, v48

    .line 1095
    .line 1096
    move-object/from16 v5, v49

    .line 1097
    .line 1098
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v6

    .line 1102
    if-nez v6, :cond_31

    .line 1103
    .line 1104
    move-object/from16 v7, v38

    .line 1105
    .line 1106
    move-object/from16 v6, v39

    .line 1107
    .line 1108
    goto/16 :goto_c

    .line 1109
    .line 1110
    :cond_31
    move/from16 v10, v18

    .line 1111
    .line 1112
    move-object/from16 v7, v38

    .line 1113
    .line 1114
    move-object/from16 v6, v39

    .line 1115
    .line 1116
    goto :goto_f

    .line 1117
    :sswitch_1f
    move-object/from16 v6, v39

    .line 1118
    .line 1119
    move-object/from16 v4, v48

    .line 1120
    .line 1121
    move-object/from16 v5, v49

    .line 1122
    .line 1123
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v7

    .line 1127
    if-nez v7, :cond_32

    .line 1128
    .line 1129
    move-object/from16 v7, v38

    .line 1130
    .line 1131
    goto/16 :goto_c

    .line 1132
    .line 1133
    :cond_32
    move-object/from16 v7, v38

    .line 1134
    .line 1135
    const/4 v10, 0x1

    .line 1136
    goto :goto_f

    .line 1137
    :sswitch_20
    move-object/from16 v7, v38

    .line 1138
    .line 1139
    move-object/from16 v6, v39

    .line 1140
    .line 1141
    move-object/from16 v4, v48

    .line 1142
    .line 1143
    move-object/from16 v5, v49

    .line 1144
    .line 1145
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v10

    .line 1149
    if-nez v10, :cond_33

    .line 1150
    .line 1151
    goto/16 :goto_c

    .line 1152
    .line 1153
    :cond_33
    move/from16 v10, v22

    .line 1154
    .line 1155
    :goto_f
    packed-switch v10, :pswitch_data_0

    .line 1156
    .line 1157
    .line 1158
    move-object/from16 v48, v1

    .line 1159
    .line 1160
    move-object/from16 v49, v2

    .line 1161
    .line 1162
    move-object/from16 v50, v4

    .line 1163
    .line 1164
    move-object/from16 v39, v7

    .line 1165
    .line 1166
    move-object/from16 v38, v9

    .line 1167
    .line 1168
    const/16 v17, 0x19

    .line 1169
    .line 1170
    const/16 v19, 0xf

    .line 1171
    .line 1172
    const/16 v24, 0x10

    .line 1173
    .line 1174
    :goto_10
    const/4 v1, 0x0

    .line 1175
    goto/16 :goto_3d

    .line 1176
    .line 1177
    :pswitch_0
    iget-object v10, v8, Lw3/d;->b0:Lq3/l;

    .line 1178
    .line 1179
    iget v13, v0, Lw3/c;->c:I

    .line 1180
    .line 1181
    const-string v15, "application/dvbsubs"

    .line 1182
    .line 1183
    const-string v14, "application/vobsub"

    .line 1184
    .line 1185
    move/from16 v31, v13

    .line 1186
    .line 1187
    const-string v13, "application/pgs"

    .line 1188
    .line 1189
    move-object/from16 v41, v8

    .line 1190
    .line 1191
    const-string v8, "video/x-unknown"

    .line 1192
    .line 1193
    move-object/from16 v34, v11

    .line 1194
    .line 1195
    const-string v11, "text/x-ssa"

    .line 1196
    .line 1197
    move-object/from16 v32, v10

    .line 1198
    .line 1199
    const-string v10, "text/vtt"

    .line 1200
    .line 1201
    move-object/from16 v33, v15

    .line 1202
    .line 1203
    const-string v15, "application/x-subrip"

    .line 1204
    .line 1205
    move-object/from16 v35, v13

    .line 1206
    .line 1207
    const-string v13, ". Setting mimeType to audio/x-unknown"

    .line 1208
    .line 1209
    const-string v36, "audio/raw"

    .line 1210
    .line 1211
    const-string v37, "audio/x-unknown"

    .line 1212
    .line 1213
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 1214
    .line 1215
    .line 1216
    move-result v38

    .line 1217
    sparse-switch v38, :sswitch_data_1

    .line 1218
    .line 1219
    .line 1220
    :goto_11
    move-object/from16 v38, v9

    .line 1221
    .line 1222
    :goto_12
    const/4 v9, -0x1

    .line 1223
    goto/16 :goto_14

    .line 1224
    .line 1225
    :sswitch_21
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v38

    .line 1229
    if-nez v38, :cond_34

    .line 1230
    .line 1231
    goto :goto_11

    .line 1232
    :cond_34
    move-object/from16 v38, v9

    .line 1233
    .line 1234
    const/16 v9, 0x20

    .line 1235
    .line 1236
    goto/16 :goto_14

    .line 1237
    .line 1238
    :sswitch_22
    move-object/from16 v38, v9

    .line 1239
    .line 1240
    const-string v9, "A_FLAC"

    .line 1241
    .line 1242
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v9

    .line 1246
    if-nez v9, :cond_35

    .line 1247
    .line 1248
    goto/16 :goto_13

    .line 1249
    .line 1250
    :cond_35
    const/16 v9, 0x1f

    .line 1251
    .line 1252
    goto/16 :goto_14

    .line 1253
    .line 1254
    :sswitch_23
    move-object/from16 v38, v9

    .line 1255
    .line 1256
    const-string v9, "A_EAC3"

    .line 1257
    .line 1258
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v9

    .line 1262
    if-nez v9, :cond_36

    .line 1263
    .line 1264
    goto/16 :goto_13

    .line 1265
    .line 1266
    :cond_36
    const/16 v9, 0x1e

    .line 1267
    .line 1268
    goto/16 :goto_14

    .line 1269
    .line 1270
    :sswitch_24
    move-object/from16 v38, v9

    .line 1271
    .line 1272
    const-string v9, "V_MPEG2"

    .line 1273
    .line 1274
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v9

    .line 1278
    if-nez v9, :cond_37

    .line 1279
    .line 1280
    goto/16 :goto_13

    .line 1281
    .line 1282
    :cond_37
    const/16 v9, 0x1d

    .line 1283
    .line 1284
    goto/16 :goto_14

    .line 1285
    .line 1286
    :sswitch_25
    move-object/from16 v38, v9

    .line 1287
    .line 1288
    const-string v9, "S_TEXT/UTF8"

    .line 1289
    .line 1290
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v9

    .line 1294
    if-nez v9, :cond_38

    .line 1295
    .line 1296
    goto/16 :goto_13

    .line 1297
    .line 1298
    :cond_38
    const/16 v9, 0x1c

    .line 1299
    .line 1300
    goto/16 :goto_14

    .line 1301
    .line 1302
    :sswitch_26
    move-object/from16 v38, v9

    .line 1303
    .line 1304
    const-string v9, "S_TEXT/WEBVTT"

    .line 1305
    .line 1306
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1307
    .line 1308
    .line 1309
    move-result v9

    .line 1310
    if-nez v9, :cond_39

    .line 1311
    .line 1312
    goto/16 :goto_13

    .line 1313
    .line 1314
    :cond_39
    const/16 v9, 0x1b

    .line 1315
    .line 1316
    goto/16 :goto_14

    .line 1317
    .line 1318
    :sswitch_27
    move-object/from16 v38, v9

    .line 1319
    .line 1320
    const-string v9, "V_MPEGH/ISO/HEVC"

    .line 1321
    .line 1322
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v9

    .line 1326
    if-nez v9, :cond_3a

    .line 1327
    .line 1328
    goto/16 :goto_13

    .line 1329
    .line 1330
    :cond_3a
    const/16 v9, 0x1a

    .line 1331
    .line 1332
    goto/16 :goto_14

    .line 1333
    .line 1334
    :sswitch_28
    move-object/from16 v38, v9

    .line 1335
    .line 1336
    const-string v9, "S_TEXT/ASS"

    .line 1337
    .line 1338
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v9

    .line 1342
    if-nez v9, :cond_3b

    .line 1343
    .line 1344
    goto/16 :goto_13

    .line 1345
    .line 1346
    :cond_3b
    const/16 v9, 0x19

    .line 1347
    .line 1348
    goto/16 :goto_14

    .line 1349
    .line 1350
    :sswitch_29
    move-object/from16 v38, v9

    .line 1351
    .line 1352
    const-string v9, "A_PCM/INT/LIT"

    .line 1353
    .line 1354
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v9

    .line 1358
    if-nez v9, :cond_3c

    .line 1359
    .line 1360
    goto/16 :goto_13

    .line 1361
    .line 1362
    :cond_3c
    const/16 v9, 0x18

    .line 1363
    .line 1364
    goto/16 :goto_14

    .line 1365
    .line 1366
    :sswitch_2a
    move-object/from16 v38, v9

    .line 1367
    .line 1368
    const-string v9, "A_PCM/INT/BIG"

    .line 1369
    .line 1370
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v9

    .line 1374
    if-nez v9, :cond_3d

    .line 1375
    .line 1376
    goto/16 :goto_13

    .line 1377
    .line 1378
    :cond_3d
    const/16 v9, 0x17

    .line 1379
    .line 1380
    goto/16 :goto_14

    .line 1381
    .line 1382
    :sswitch_2b
    move-object/from16 v38, v9

    .line 1383
    .line 1384
    const-string v9, "A_PCM/FLOAT/IEEE"

    .line 1385
    .line 1386
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v9

    .line 1390
    if-nez v9, :cond_3e

    .line 1391
    .line 1392
    goto/16 :goto_13

    .line 1393
    .line 1394
    :cond_3e
    const/16 v9, 0x16

    .line 1395
    .line 1396
    goto/16 :goto_14

    .line 1397
    .line 1398
    :sswitch_2c
    move-object/from16 v38, v9

    .line 1399
    .line 1400
    const-string v9, "A_DTS/EXPRESS"

    .line 1401
    .line 1402
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1403
    .line 1404
    .line 1405
    move-result v9

    .line 1406
    if-nez v9, :cond_3f

    .line 1407
    .line 1408
    goto/16 :goto_13

    .line 1409
    .line 1410
    :cond_3f
    const/16 v9, 0x15

    .line 1411
    .line 1412
    goto/16 :goto_14

    .line 1413
    .line 1414
    :sswitch_2d
    move-object/from16 v38, v9

    .line 1415
    .line 1416
    const-string v9, "V_THEORA"

    .line 1417
    .line 1418
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v9

    .line 1422
    if-nez v9, :cond_40

    .line 1423
    .line 1424
    goto/16 :goto_13

    .line 1425
    .line 1426
    :cond_40
    move/from16 v9, v16

    .line 1427
    .line 1428
    goto/16 :goto_14

    .line 1429
    .line 1430
    :sswitch_2e
    move-object/from16 v38, v9

    .line 1431
    .line 1432
    const-string v9, "S_HDMV/PGS"

    .line 1433
    .line 1434
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v9

    .line 1438
    if-nez v9, :cond_41

    .line 1439
    .line 1440
    goto/16 :goto_13

    .line 1441
    .line 1442
    :cond_41
    const/16 v9, 0x13

    .line 1443
    .line 1444
    goto/16 :goto_14

    .line 1445
    .line 1446
    :sswitch_2f
    move-object/from16 v38, v9

    .line 1447
    .line 1448
    const-string v9, "V_VP9"

    .line 1449
    .line 1450
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v9

    .line 1454
    if-nez v9, :cond_42

    .line 1455
    .line 1456
    goto/16 :goto_13

    .line 1457
    .line 1458
    :cond_42
    const/16 v9, 0x12

    .line 1459
    .line 1460
    goto/16 :goto_14

    .line 1461
    .line 1462
    :sswitch_30
    move-object/from16 v38, v9

    .line 1463
    .line 1464
    const-string v9, "V_VP8"

    .line 1465
    .line 1466
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v9

    .line 1470
    if-nez v9, :cond_43

    .line 1471
    .line 1472
    goto/16 :goto_13

    .line 1473
    .line 1474
    :cond_43
    const/16 v9, 0x11

    .line 1475
    .line 1476
    goto/16 :goto_14

    .line 1477
    .line 1478
    :sswitch_31
    move-object/from16 v38, v9

    .line 1479
    .line 1480
    const-string v9, "V_AV1"

    .line 1481
    .line 1482
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v9

    .line 1486
    if-nez v9, :cond_44

    .line 1487
    .line 1488
    goto/16 :goto_13

    .line 1489
    .line 1490
    :cond_44
    const/16 v9, 0x10

    .line 1491
    .line 1492
    goto/16 :goto_14

    .line 1493
    .line 1494
    :sswitch_32
    move-object/from16 v38, v9

    .line 1495
    .line 1496
    const-string v9, "A_DTS"

    .line 1497
    .line 1498
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1499
    .line 1500
    .line 1501
    move-result v9

    .line 1502
    if-nez v9, :cond_45

    .line 1503
    .line 1504
    goto/16 :goto_13

    .line 1505
    .line 1506
    :cond_45
    const/16 v9, 0xf

    .line 1507
    .line 1508
    goto/16 :goto_14

    .line 1509
    .line 1510
    :sswitch_33
    move-object/from16 v38, v9

    .line 1511
    .line 1512
    const-string v9, "A_AC3"

    .line 1513
    .line 1514
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1515
    .line 1516
    .line 1517
    move-result v9

    .line 1518
    if-nez v9, :cond_46

    .line 1519
    .line 1520
    goto/16 :goto_13

    .line 1521
    .line 1522
    :cond_46
    const/16 v9, 0xe

    .line 1523
    .line 1524
    goto/16 :goto_14

    .line 1525
    .line 1526
    :sswitch_34
    move-object/from16 v38, v9

    .line 1527
    .line 1528
    const-string v9, "A_AAC"

    .line 1529
    .line 1530
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1531
    .line 1532
    .line 1533
    move-result v9

    .line 1534
    if-nez v9, :cond_47

    .line 1535
    .line 1536
    goto/16 :goto_13

    .line 1537
    .line 1538
    :cond_47
    const/16 v9, 0xd

    .line 1539
    .line 1540
    goto/16 :goto_14

    .line 1541
    .line 1542
    :sswitch_35
    move-object/from16 v38, v9

    .line 1543
    .line 1544
    const-string v9, "A_DTS/LOSSLESS"

    .line 1545
    .line 1546
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1547
    .line 1548
    .line 1549
    move-result v9

    .line 1550
    if-nez v9, :cond_48

    .line 1551
    .line 1552
    goto/16 :goto_13

    .line 1553
    .line 1554
    :cond_48
    const/16 v9, 0xc

    .line 1555
    .line 1556
    goto/16 :goto_14

    .line 1557
    .line 1558
    :sswitch_36
    move-object/from16 v38, v9

    .line 1559
    .line 1560
    const-string v9, "S_VOBSUB"

    .line 1561
    .line 1562
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v9

    .line 1566
    if-nez v9, :cond_49

    .line 1567
    .line 1568
    goto/16 :goto_13

    .line 1569
    .line 1570
    :cond_49
    const/16 v9, 0xb

    .line 1571
    .line 1572
    goto/16 :goto_14

    .line 1573
    .line 1574
    :sswitch_37
    move-object/from16 v38, v9

    .line 1575
    .line 1576
    const-string v9, "V_MPEG4/ISO/AVC"

    .line 1577
    .line 1578
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v9

    .line 1582
    if-nez v9, :cond_4a

    .line 1583
    .line 1584
    goto/16 :goto_13

    .line 1585
    .line 1586
    :cond_4a
    const/16 v9, 0xa

    .line 1587
    .line 1588
    goto/16 :goto_14

    .line 1589
    .line 1590
    :sswitch_38
    move-object/from16 v38, v9

    .line 1591
    .line 1592
    const-string v9, "V_MPEG4/ISO/ASP"

    .line 1593
    .line 1594
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1595
    .line 1596
    .line 1597
    move-result v9

    .line 1598
    if-nez v9, :cond_4b

    .line 1599
    .line 1600
    goto/16 :goto_13

    .line 1601
    .line 1602
    :cond_4b
    const/16 v9, 0x9

    .line 1603
    .line 1604
    goto/16 :goto_14

    .line 1605
    .line 1606
    :sswitch_39
    move-object/from16 v38, v9

    .line 1607
    .line 1608
    const-string v9, "S_DVBSUB"

    .line 1609
    .line 1610
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v9

    .line 1614
    if-nez v9, :cond_4c

    .line 1615
    .line 1616
    goto/16 :goto_13

    .line 1617
    .line 1618
    :cond_4c
    move/from16 v9, v27

    .line 1619
    .line 1620
    goto/16 :goto_14

    .line 1621
    .line 1622
    :sswitch_3a
    move-object/from16 v38, v9

    .line 1623
    .line 1624
    const-string v9, "V_MS/VFW/FOURCC"

    .line 1625
    .line 1626
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v9

    .line 1630
    if-nez v9, :cond_4d

    .line 1631
    .line 1632
    goto :goto_13

    .line 1633
    :cond_4d
    const/4 v9, 0x7

    .line 1634
    goto :goto_14

    .line 1635
    :sswitch_3b
    move-object/from16 v38, v9

    .line 1636
    .line 1637
    const-string v9, "A_MPEG/L3"

    .line 1638
    .line 1639
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v9

    .line 1643
    if-nez v9, :cond_4e

    .line 1644
    .line 1645
    goto :goto_13

    .line 1646
    :cond_4e
    const/4 v9, 0x6

    .line 1647
    goto :goto_14

    .line 1648
    :sswitch_3c
    move-object/from16 v38, v9

    .line 1649
    .line 1650
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1651
    .line 1652
    .line 1653
    move-result v9

    .line 1654
    if-nez v9, :cond_4f

    .line 1655
    .line 1656
    goto :goto_13

    .line 1657
    :cond_4f
    const/4 v9, 0x5

    .line 1658
    goto :goto_14

    .line 1659
    :sswitch_3d
    move-object/from16 v38, v9

    .line 1660
    .line 1661
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1662
    .line 1663
    .line 1664
    move-result v9

    .line 1665
    if-nez v9, :cond_50

    .line 1666
    .line 1667
    goto :goto_13

    .line 1668
    :cond_50
    const/4 v9, 0x4

    .line 1669
    goto :goto_14

    .line 1670
    :sswitch_3e
    move-object/from16 v38, v9

    .line 1671
    .line 1672
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    move-result v9

    .line 1676
    if-nez v9, :cond_51

    .line 1677
    .line 1678
    goto :goto_13

    .line 1679
    :cond_51
    const/4 v9, 0x3

    .line 1680
    goto :goto_14

    .line 1681
    :sswitch_3f
    move-object/from16 v38, v9

    .line 1682
    .line 1683
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v9

    .line 1687
    if-nez v9, :cond_52

    .line 1688
    .line 1689
    goto :goto_13

    .line 1690
    :cond_52
    move/from16 v9, v18

    .line 1691
    .line 1692
    goto :goto_14

    .line 1693
    :sswitch_40
    move-object/from16 v38, v9

    .line 1694
    .line 1695
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1696
    .line 1697
    .line 1698
    move-result v9

    .line 1699
    if-nez v9, :cond_53

    .line 1700
    .line 1701
    goto :goto_13

    .line 1702
    :cond_53
    const/4 v9, 0x1

    .line 1703
    goto :goto_14

    .line 1704
    :sswitch_41
    move-object/from16 v38, v9

    .line 1705
    .line 1706
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1707
    .line 1708
    .line 1709
    move-result v9

    .line 1710
    if-nez v9, :cond_54

    .line 1711
    .line 1712
    :goto_13
    goto/16 :goto_12

    .line 1713
    .line 1714
    :cond_54
    move/from16 v9, v22

    .line 1715
    .line 1716
    :goto_14
    packed-switch v9, :pswitch_data_1

    .line 1717
    .line 1718
    .line 1719
    const-string v0, "Unrecognized codec identifier."

    .line 1720
    .line 1721
    const/4 v1, 0x0

    .line 1722
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    throw v0

    .line 1727
    :pswitch_1
    new-instance v3, Ljava/util/ArrayList;

    .line 1728
    .line 1729
    const/4 v8, 0x3

    .line 1730
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1731
    .line 1732
    .line 1733
    iget-object v8, v0, Lw3/c;->b:Ljava/lang/String;

    .line 1734
    .line 1735
    invoke-virtual {v0, v8}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 1736
    .line 1737
    .line 1738
    move-result-object v8

    .line 1739
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1740
    .line 1741
    .line 1742
    invoke-static/range {v27 .. v27}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v8

    .line 1746
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1747
    .line 1748
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v8

    .line 1752
    iget-wide v12, v0, Lw3/c;->R:J

    .line 1753
    .line 1754
    invoke-virtual {v8, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v8

    .line 1758
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 1759
    .line 1760
    .line 1761
    move-result-object v8

    .line 1762
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1763
    .line 1764
    .line 1765
    invoke-static/range {v27 .. v27}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v8

    .line 1769
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v8

    .line 1773
    iget-wide v12, v0, Lw3/c;->S:J

    .line 1774
    .line 1775
    invoke-virtual {v8, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v8

    .line 1779
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 1780
    .line 1781
    .line 1782
    move-result-object v8

    .line 1783
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1784
    .line 1785
    .line 1786
    const-string v8, "audio/opus"

    .line 1787
    .line 1788
    const/16 v9, 0x1680

    .line 1789
    .line 1790
    move-object/from16 v48, v1

    .line 1791
    .line 1792
    move-object/from16 v39, v7

    .line 1793
    .line 1794
    const/4 v1, -0x1

    .line 1795
    :goto_15
    const/4 v12, 0x0

    .line 1796
    :goto_16
    const/16 v19, 0xf

    .line 1797
    .line 1798
    const/16 v24, 0x10

    .line 1799
    .line 1800
    move-object v7, v3

    .line 1801
    :goto_17
    const/16 v3, 0x18

    .line 1802
    .line 1803
    goto/16 :goto_30

    .line 1804
    .line 1805
    :pswitch_2
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 1806
    .line 1807
    .line 1808
    move-result-object v3

    .line 1809
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v3

    .line 1813
    const-string v8, "audio/flac"

    .line 1814
    .line 1815
    move-object/from16 v48, v1

    .line 1816
    .line 1817
    move-object/from16 v39, v7

    .line 1818
    .line 1819
    :goto_18
    const/4 v1, -0x1

    .line 1820
    const/4 v9, -0x1

    .line 1821
    goto :goto_15

    .line 1822
    :pswitch_3
    const-string v8, "audio/eac3"

    .line 1823
    .line 1824
    :goto_19
    :pswitch_4
    move-object/from16 v48, v1

    .line 1825
    .line 1826
    move-object/from16 v39, v7

    .line 1827
    .line 1828
    :goto_1a
    const/4 v1, -0x1

    .line 1829
    :goto_1b
    const/16 v3, 0x18

    .line 1830
    .line 1831
    const/4 v7, 0x0

    .line 1832
    const/4 v9, -0x1

    .line 1833
    const/4 v12, 0x0

    .line 1834
    :goto_1c
    const/16 v19, 0xf

    .line 1835
    .line 1836
    :goto_1d
    const/16 v24, 0x10

    .line 1837
    .line 1838
    goto/16 :goto_30

    .line 1839
    .line 1840
    :pswitch_5
    const-string v8, "video/mpeg2"

    .line 1841
    .line 1842
    goto :goto_19

    .line 1843
    :pswitch_6
    move-object/from16 v48, v1

    .line 1844
    .line 1845
    move-object/from16 v39, v7

    .line 1846
    .line 1847
    move-object v8, v15

    .line 1848
    goto :goto_1a

    .line 1849
    :pswitch_7
    move-object/from16 v48, v1

    .line 1850
    .line 1851
    move-object/from16 v39, v7

    .line 1852
    .line 1853
    move-object v8, v10

    .line 1854
    goto :goto_1a

    .line 1855
    :pswitch_8
    new-instance v8, LA4/r;

    .line 1856
    .line 1857
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 1858
    .line 1859
    .line 1860
    move-result-object v3

    .line 1861
    invoke-direct {v8, v3}, LA4/r;-><init>([B)V

    .line 1862
    .line 1863
    .line 1864
    invoke-static {v8}, Lm4/e;->a(LA4/r;)Lm4/e;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v3

    .line 1868
    iget v8, v3, Lm4/e;->b:I

    .line 1869
    .line 1870
    iput v8, v0, Lw3/c;->Y:I

    .line 1871
    .line 1872
    const-string v8, "video/hevc"

    .line 1873
    .line 1874
    iget-object v9, v3, Lm4/e;->a:Ljava/util/List;

    .line 1875
    .line 1876
    iget-object v3, v3, Lm4/e;->d:Ljava/lang/String;

    .line 1877
    .line 1878
    move-object/from16 v48, v1

    .line 1879
    .line 1880
    move-object v12, v3

    .line 1881
    move-object/from16 v39, v7

    .line 1882
    .line 1883
    move-object v7, v9

    .line 1884
    const/4 v1, -0x1

    .line 1885
    const/16 v3, 0x18

    .line 1886
    .line 1887
    const/4 v9, -0x1

    .line 1888
    goto :goto_1c

    .line 1889
    :pswitch_9
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 1890
    .line 1891
    .line 1892
    move-result-object v3

    .line 1893
    sget-object v8, Lw3/d;->d0:[B

    .line 1894
    .line 1895
    invoke-static {v8, v3}, LP5/F;->t(Ljava/lang/Object;Ljava/lang/Object;)LP5/S;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v3

    .line 1899
    move-object/from16 v48, v1

    .line 1900
    .line 1901
    move-object/from16 v39, v7

    .line 1902
    .line 1903
    move-object v8, v11

    .line 1904
    goto :goto_18

    .line 1905
    :pswitch_a
    iget v3, v0, Lw3/c;->P:I

    .line 1906
    .line 1907
    invoke-static {v3}, Ll4/y;->w(I)I

    .line 1908
    .line 1909
    .line 1910
    move-result v3

    .line 1911
    if-nez v3, :cond_55

    .line 1912
    .line 1913
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1914
    .line 1915
    const-string v8, "Unsupported little endian PCM bit depth: "

    .line 1916
    .line 1917
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1918
    .line 1919
    .line 1920
    iget v8, v0, Lw3/c;->P:I

    .line 1921
    .line 1922
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1926
    .line 1927
    .line 1928
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v3

    .line 1932
    invoke-static {v12, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 1933
    .line 1934
    .line 1935
    :goto_1e
    move-object/from16 v48, v1

    .line 1936
    .line 1937
    move-object/from16 v39, v7

    .line 1938
    .line 1939
    move-object/from16 v8, v37

    .line 1940
    .line 1941
    goto :goto_1a

    .line 1942
    :cond_55
    :goto_1f
    move-object/from16 v48, v1

    .line 1943
    .line 1944
    move v1, v3

    .line 1945
    move-object/from16 v39, v7

    .line 1946
    .line 1947
    move-object/from16 v8, v36

    .line 1948
    .line 1949
    goto :goto_1b

    .line 1950
    :pswitch_b
    iget v3, v0, Lw3/c;->P:I

    .line 1951
    .line 1952
    move/from16 v8, v27

    .line 1953
    .line 1954
    if-ne v3, v8, :cond_56

    .line 1955
    .line 1956
    move-object/from16 v48, v1

    .line 1957
    .line 1958
    move-object/from16 v39, v7

    .line 1959
    .line 1960
    move-object/from16 v8, v36

    .line 1961
    .line 1962
    const/4 v1, 0x3

    .line 1963
    goto/16 :goto_1b

    .line 1964
    .line 1965
    :cond_56
    const/16 v8, 0x10

    .line 1966
    .line 1967
    if-ne v3, v8, :cond_57

    .line 1968
    .line 1969
    const/high16 v3, 0x10000000

    .line 1970
    .line 1971
    goto :goto_1f

    .line 1972
    :cond_57
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1973
    .line 1974
    const-string v8, "Unsupported big endian PCM bit depth: "

    .line 1975
    .line 1976
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1977
    .line 1978
    .line 1979
    iget v8, v0, Lw3/c;->P:I

    .line 1980
    .line 1981
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1982
    .line 1983
    .line 1984
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1985
    .line 1986
    .line 1987
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v3

    .line 1991
    invoke-static {v12, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 1992
    .line 1993
    .line 1994
    goto :goto_1e

    .line 1995
    :pswitch_c
    iget v3, v0, Lw3/c;->P:I

    .line 1996
    .line 1997
    const/16 v9, 0x20

    .line 1998
    .line 1999
    if-ne v3, v9, :cond_58

    .line 2000
    .line 2001
    move-object/from16 v48, v1

    .line 2002
    .line 2003
    move-object/from16 v39, v7

    .line 2004
    .line 2005
    move-object/from16 v8, v36

    .line 2006
    .line 2007
    const/4 v1, 0x4

    .line 2008
    goto/16 :goto_1b

    .line 2009
    .line 2010
    :cond_58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2011
    .line 2012
    const-string v8, "Unsupported floating point PCM bit depth: "

    .line 2013
    .line 2014
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2015
    .line 2016
    .line 2017
    iget v8, v0, Lw3/c;->P:I

    .line 2018
    .line 2019
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2023
    .line 2024
    .line 2025
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v3

    .line 2029
    invoke-static {v12, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 2030
    .line 2031
    .line 2032
    goto :goto_1e

    .line 2033
    :pswitch_d
    move-object/from16 v48, v1

    .line 2034
    .line 2035
    move-object/from16 v39, v7

    .line 2036
    .line 2037
    move-object/from16 v8, v35

    .line 2038
    .line 2039
    goto/16 :goto_1a

    .line 2040
    .line 2041
    :pswitch_e
    const/16 v9, 0x20

    .line 2042
    .line 2043
    const-string v8, "video/x-vnd.on2.vp9"

    .line 2044
    .line 2045
    goto/16 :goto_19

    .line 2046
    .line 2047
    :pswitch_f
    const/16 v9, 0x20

    .line 2048
    .line 2049
    const-string v8, "video/x-vnd.on2.vp8"

    .line 2050
    .line 2051
    goto/16 :goto_19

    .line 2052
    .line 2053
    :pswitch_10
    const/16 v9, 0x20

    .line 2054
    .line 2055
    const-string v8, "video/av01"

    .line 2056
    .line 2057
    goto/16 :goto_19

    .line 2058
    .line 2059
    :pswitch_11
    const/16 v9, 0x20

    .line 2060
    .line 2061
    const-string v8, "audio/vnd.dts"

    .line 2062
    .line 2063
    goto/16 :goto_19

    .line 2064
    .line 2065
    :pswitch_12
    const/16 v9, 0x20

    .line 2066
    .line 2067
    const-string v8, "audio/ac3"

    .line 2068
    .line 2069
    goto/16 :goto_19

    .line 2070
    .line 2071
    :pswitch_13
    const/16 v9, 0x20

    .line 2072
    .line 2073
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2074
    .line 2075
    .line 2076
    move-result-object v3

    .line 2077
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v3

    .line 2081
    iget-object v8, v0, Lw3/c;->k:[B

    .line 2082
    .line 2083
    new-instance v12, LZ3/f;

    .line 2084
    .line 2085
    array-length v13, v8

    .line 2086
    invoke-direct {v12, v13, v8}, LZ3/f;-><init>(I[B)V

    .line 2087
    .line 2088
    .line 2089
    move/from16 v8, v22

    .line 2090
    .line 2091
    invoke-static {v12, v8}, Ll3/a;->i(LZ3/f;Z)LA4/r;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v12

    .line 2095
    iget v8, v12, LA4/r;->a:I

    .line 2096
    .line 2097
    iput v8, v0, Lw3/c;->Q:I

    .line 2098
    .line 2099
    iget v8, v12, LA4/r;->b:I

    .line 2100
    .line 2101
    iput v8, v0, Lw3/c;->O:I

    .line 2102
    .line 2103
    const-string v8, "audio/mp4a-latm"

    .line 2104
    .line 2105
    iget-object v12, v12, LA4/r;->c:Ljava/lang/Object;

    .line 2106
    .line 2107
    check-cast v12, Ljava/lang/String;

    .line 2108
    .line 2109
    move-object/from16 v48, v1

    .line 2110
    .line 2111
    move-object/from16 v39, v7

    .line 2112
    .line 2113
    const/4 v1, -0x1

    .line 2114
    const/4 v9, -0x1

    .line 2115
    goto/16 :goto_16

    .line 2116
    .line 2117
    :pswitch_14
    const/16 v9, 0x20

    .line 2118
    .line 2119
    const-string v8, "audio/vnd.dts.hd"

    .line 2120
    .line 2121
    goto/16 :goto_19

    .line 2122
    .line 2123
    :pswitch_15
    const/16 v9, 0x20

    .line 2124
    .line 2125
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2126
    .line 2127
    .line 2128
    move-result-object v3

    .line 2129
    invoke-static {v3}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v3

    .line 2133
    move-object/from16 v48, v1

    .line 2134
    .line 2135
    move-object/from16 v39, v7

    .line 2136
    .line 2137
    move-object v8, v14

    .line 2138
    goto/16 :goto_18

    .line 2139
    .line 2140
    :pswitch_16
    const/16 v9, 0x20

    .line 2141
    .line 2142
    new-instance v8, LA4/r;

    .line 2143
    .line 2144
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2145
    .line 2146
    .line 2147
    move-result-object v3

    .line 2148
    invoke-direct {v8, v3}, LA4/r;-><init>([B)V

    .line 2149
    .line 2150
    .line 2151
    invoke-static {v8}, Lm4/a;->a(LA4/r;)Lm4/a;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v3

    .line 2155
    iget v8, v3, Lm4/a;->b:I

    .line 2156
    .line 2157
    iput v8, v0, Lw3/c;->Y:I

    .line 2158
    .line 2159
    iget-object v8, v3, Lm4/a;->a:Ljava/util/ArrayList;

    .line 2160
    .line 2161
    const-string v12, "video/avc"

    .line 2162
    .line 2163
    iget-object v3, v3, Lm4/a;->f:Ljava/lang/String;

    .line 2164
    .line 2165
    move-object/from16 v48, v1

    .line 2166
    .line 2167
    move-object/from16 v39, v7

    .line 2168
    .line 2169
    move-object v7, v8

    .line 2170
    move-object v8, v12

    .line 2171
    const/4 v1, -0x1

    .line 2172
    const/4 v9, -0x1

    .line 2173
    const/16 v19, 0xf

    .line 2174
    .line 2175
    const/16 v24, 0x10

    .line 2176
    .line 2177
    move-object v12, v3

    .line 2178
    goto/16 :goto_17

    .line 2179
    .line 2180
    :pswitch_17
    const/4 v8, 0x4

    .line 2181
    const/16 v9, 0x20

    .line 2182
    .line 2183
    new-array v12, v8, [B

    .line 2184
    .line 2185
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2186
    .line 2187
    .line 2188
    move-result-object v3

    .line 2189
    const/4 v13, 0x0

    .line 2190
    invoke-static {v3, v13, v12, v13, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2191
    .line 2192
    .line 2193
    invoke-static {v12}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v3

    .line 2197
    move-object/from16 v48, v1

    .line 2198
    .line 2199
    move-object/from16 v39, v7

    .line 2200
    .line 2201
    move-object/from16 v8, v33

    .line 2202
    .line 2203
    goto/16 :goto_18

    .line 2204
    .line 2205
    :pswitch_18
    const/16 v9, 0x20

    .line 2206
    .line 2207
    new-instance v13, LA4/r;

    .line 2208
    .line 2209
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2210
    .line 2211
    .line 2212
    move-result-object v3

    .line 2213
    invoke-direct {v13, v3}, LA4/r;-><init>([B)V

    .line 2214
    .line 2215
    .line 2216
    const/16 v3, 0x10

    .line 2217
    .line 2218
    :try_start_0
    invoke-virtual {v13, v3}, LA4/r;->I(I)V

    .line 2219
    .line 2220
    .line 2221
    invoke-virtual {v13}, LA4/r;->n()J

    .line 2222
    .line 2223
    .line 2224
    move-result-wide v23

    .line 2225
    const-wide/32 v36, 0x58564944

    .line 2226
    .line 2227
    .line 2228
    cmp-long v20, v23, v36

    .line 2229
    .line 2230
    if-nez v20, :cond_59

    .line 2231
    .line 2232
    new-instance v8, Landroid/util/Pair;

    .line 2233
    .line 2234
    const-string v12, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2235
    .line 2236
    const/4 v13, 0x0

    .line 2237
    :try_start_1
    invoke-direct {v8, v12, v13}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 2238
    .line 2239
    .line 2240
    :goto_20
    const/4 v12, 0x0

    .line 2241
    const/16 v13, 0xf

    .line 2242
    .line 2243
    goto/16 :goto_24

    .line 2244
    .line 2245
    :catch_0
    move-object v12, v13

    .line 2246
    goto/16 :goto_25

    .line 2247
    .line 2248
    :catch_1
    const/4 v12, 0x0

    .line 2249
    goto/16 :goto_25

    .line 2250
    .line 2251
    :cond_59
    const-wide/32 v36, 0x33363248

    .line 2252
    .line 2253
    .line 2254
    cmp-long v20, v23, v36

    .line 2255
    .line 2256
    if-nez v20, :cond_5a

    .line 2257
    .line 2258
    :try_start_2
    new-instance v8, Landroid/util/Pair;

    .line 2259
    .line 2260
    const-string v12, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2261
    .line 2262
    const/4 v13, 0x0

    .line 2263
    :try_start_3
    invoke-direct {v8, v12, v13}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    .line 2264
    .line 2265
    .line 2266
    goto :goto_20

    .line 2267
    :cond_5a
    const-wide/32 v36, 0x31435657

    .line 2268
    .line 2269
    .line 2270
    cmp-long v20, v23, v36

    .line 2271
    .line 2272
    if-nez v20, :cond_5e

    .line 2273
    .line 2274
    :try_start_4
    iget v8, v13, LA4/r;->a:I

    .line 2275
    .line 2276
    add-int/lit8 v8, v8, 0x14

    .line 2277
    .line 2278
    iget-object v12, v13, LA4/r;->c:Ljava/lang/Object;

    .line 2279
    .line 2280
    check-cast v12, [B

    .line 2281
    .line 2282
    :goto_21
    array-length v13, v12

    .line 2283
    const/16 v21, 0x4

    .line 2284
    .line 2285
    add-int/lit8 v13, v13, -0x4

    .line 2286
    .line 2287
    if-ge v8, v13, :cond_5d

    .line 2288
    .line 2289
    aget-byte v13, v12, v8

    .line 2290
    .line 2291
    if-nez v13, :cond_5c

    .line 2292
    .line 2293
    const/4 v13, 0x1

    .line 2294
    add-int/lit8 v20, v8, 0x1

    .line 2295
    .line 2296
    aget-byte v20, v12, v20

    .line 2297
    .line 2298
    if-nez v20, :cond_5c

    .line 2299
    .line 2300
    add-int/lit8 v20, v8, 0x2

    .line 2301
    .line 2302
    aget-byte v3, v12, v20

    .line 2303
    .line 2304
    if-ne v3, v13, :cond_5c

    .line 2305
    .line 2306
    const/16 v28, 0x3

    .line 2307
    .line 2308
    add-int/lit8 v3, v8, 0x3

    .line 2309
    .line 2310
    aget-byte v3, v12, v3

    .line 2311
    .line 2312
    const/16 v13, 0xf

    .line 2313
    .line 2314
    if-ne v3, v13, :cond_5b

    .line 2315
    .line 2316
    array-length v3, v12

    .line 2317
    invoke-static {v12, v8, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 2318
    .line 2319
    .line 2320
    move-result-object v3

    .line 2321
    new-instance v8, Landroid/util/Pair;

    .line 2322
    .line 2323
    const-string v12, "video/wvc1"

    .line 2324
    .line 2325
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v3

    .line 2329
    invoke-direct {v8, v12, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2330
    .line 2331
    .line 2332
    const/4 v12, 0x0

    .line 2333
    goto :goto_24

    .line 2334
    :cond_5b
    :goto_22
    const/16 v30, 0x1

    .line 2335
    .line 2336
    goto :goto_23

    .line 2337
    :cond_5c
    const/16 v13, 0xf

    .line 2338
    .line 2339
    goto :goto_22

    .line 2340
    :goto_23
    add-int/lit8 v8, v8, 0x1

    .line 2341
    .line 2342
    const/16 v3, 0x10

    .line 2343
    .line 2344
    goto :goto_21

    .line 2345
    :cond_5d
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_1

    .line 2346
    .line 2347
    const/4 v1, 0x0

    .line 2348
    :try_start_5
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_2

    .line 2352
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_1

    .line 2353
    :catch_2
    move-object v12, v1

    .line 2354
    goto :goto_25

    .line 2355
    :cond_5e
    const/16 v13, 0xf

    .line 2356
    .line 2357
    const-string v3, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 2358
    .line 2359
    invoke-static {v12, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 2360
    .line 2361
    .line 2362
    new-instance v3, Landroid/util/Pair;

    .line 2363
    .line 2364
    const/4 v12, 0x0

    .line 2365
    invoke-direct {v3, v8, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2366
    .line 2367
    .line 2368
    move-object v8, v3

    .line 2369
    :goto_24
    iget-object v3, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2370
    .line 2371
    check-cast v3, Ljava/lang/String;

    .line 2372
    .line 2373
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2374
    .line 2375
    move-object/from16 v40, v8

    .line 2376
    .line 2377
    check-cast v40, Ljava/util/List;

    .line 2378
    .line 2379
    move-object/from16 v48, v1

    .line 2380
    .line 2381
    move-object v8, v3

    .line 2382
    move-object/from16 v39, v7

    .line 2383
    .line 2384
    move/from16 v19, v13

    .line 2385
    .line 2386
    move-object/from16 v7, v40

    .line 2387
    .line 2388
    const/4 v1, -0x1

    .line 2389
    const/16 v3, 0x18

    .line 2390
    .line 2391
    const/4 v9, -0x1

    .line 2392
    goto/16 :goto_1d

    .line 2393
    .line 2394
    :goto_25
    const-string v0, "Error parsing FourCC private data"

    .line 2395
    .line 2396
    invoke-static {v0, v12}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2397
    .line 2398
    .line 2399
    move-result-object v0

    .line 2400
    throw v0

    .line 2401
    :pswitch_19
    const/16 v9, 0x20

    .line 2402
    .line 2403
    const/16 v13, 0xf

    .line 2404
    .line 2405
    const-string v8, "audio/mpeg"

    .line 2406
    .line 2407
    :goto_26
    move-object/from16 v48, v1

    .line 2408
    .line 2409
    move-object/from16 v39, v7

    .line 2410
    .line 2411
    move/from16 v19, v13

    .line 2412
    .line 2413
    const/4 v1, -0x1

    .line 2414
    const/16 v3, 0x18

    .line 2415
    .line 2416
    const/4 v7, 0x0

    .line 2417
    const/16 v9, 0x1000

    .line 2418
    .line 2419
    const/4 v12, 0x0

    .line 2420
    goto/16 :goto_1d

    .line 2421
    .line 2422
    :pswitch_1a
    const/16 v9, 0x20

    .line 2423
    .line 2424
    const/16 v13, 0xf

    .line 2425
    .line 2426
    const-string v8, "audio/mpeg-L2"

    .line 2427
    .line 2428
    goto :goto_26

    .line 2429
    :pswitch_1b
    const/16 v9, 0x20

    .line 2430
    .line 2431
    const/16 v13, 0xf

    .line 2432
    .line 2433
    const/16 v24, 0x10

    .line 2434
    .line 2435
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2436
    .line 2437
    .line 2438
    move-result-object v3

    .line 2439
    const-string v8, "Error parsing vorbis codec private"

    .line 2440
    .line 2441
    const/16 v22, 0x0

    .line 2442
    .line 2443
    :try_start_7
    aget-byte v12, v3, v22

    .line 2444
    .line 2445
    move/from16 v9, v18

    .line 2446
    .line 2447
    if-ne v12, v9, :cond_64

    .line 2448
    .line 2449
    const/4 v9, 0x0

    .line 2450
    const/4 v12, 0x1

    .line 2451
    :goto_27
    aget-byte v13, v3, v12

    .line 2452
    .line 2453
    move-object/from16 v39, v7

    .line 2454
    .line 2455
    const/16 v7, 0xff

    .line 2456
    .line 2457
    and-int/2addr v13, v7

    .line 2458
    if-ne v13, v7, :cond_5f

    .line 2459
    .line 2460
    add-int/2addr v9, v7

    .line 2461
    const/16 v30, 0x1

    .line 2462
    .line 2463
    add-int/lit8 v12, v12, 0x1

    .line 2464
    .line 2465
    move-object/from16 v7, v39

    .line 2466
    .line 2467
    goto :goto_27

    .line 2468
    :cond_5f
    const/4 v7, 0x1

    .line 2469
    add-int/2addr v12, v7

    .line 2470
    add-int/2addr v9, v13

    .line 2471
    move/from16 v30, v7

    .line 2472
    .line 2473
    const/4 v13, 0x0

    .line 2474
    :goto_28
    aget-byte v7, v3, v12

    .line 2475
    .line 2476
    move-object/from16 v48, v1

    .line 2477
    .line 2478
    const/16 v1, 0xff

    .line 2479
    .line 2480
    and-int/2addr v7, v1

    .line 2481
    if-ne v7, v1, :cond_60

    .line 2482
    .line 2483
    add-int/2addr v13, v1

    .line 2484
    add-int/lit8 v12, v12, 0x1

    .line 2485
    .line 2486
    move-object/from16 v1, v48

    .line 2487
    .line 2488
    goto :goto_28

    .line 2489
    :cond_60
    add-int/lit8 v12, v12, 0x1

    .line 2490
    .line 2491
    add-int/2addr v13, v7

    .line 2492
    aget-byte v7, v3, v12

    .line 2493
    .line 2494
    move/from16 v1, v30

    .line 2495
    .line 2496
    if-ne v7, v1, :cond_63

    .line 2497
    .line 2498
    new-array v1, v9, [B

    .line 2499
    .line 2500
    const/4 v7, 0x0

    .line 2501
    invoke-static {v3, v12, v1, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2502
    .line 2503
    .line 2504
    add-int/2addr v12, v9

    .line 2505
    aget-byte v7, v3, v12

    .line 2506
    .line 2507
    const/4 v9, 0x3

    .line 2508
    if-ne v7, v9, :cond_62

    .line 2509
    .line 2510
    add-int/2addr v12, v13

    .line 2511
    aget-byte v7, v3, v12

    .line 2512
    .line 2513
    const/4 v9, 0x5

    .line 2514
    if-ne v7, v9, :cond_61

    .line 2515
    .line 2516
    array-length v7, v3

    .line 2517
    sub-int/2addr v7, v12

    .line 2518
    new-array v7, v7, [B

    .line 2519
    .line 2520
    array-length v9, v3

    .line 2521
    sub-int/2addr v9, v12

    .line 2522
    const/4 v13, 0x0

    .line 2523
    invoke-static {v3, v12, v7, v13, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2524
    .line 2525
    .line 2526
    new-instance v3, Ljava/util/ArrayList;

    .line 2527
    .line 2528
    const/4 v9, 0x2

    .line 2529
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 2530
    .line 2531
    .line 2532
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2533
    .line 2534
    .line 2535
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_3

    .line 2536
    .line 2537
    .line 2538
    const-string v8, "audio/vorbis"

    .line 2539
    .line 2540
    const/16 v1, 0x2000

    .line 2541
    .line 2542
    move v9, v1

    .line 2543
    move-object v7, v3

    .line 2544
    const/4 v1, -0x1

    .line 2545
    const/16 v3, 0x18

    .line 2546
    .line 2547
    :goto_29
    const/4 v12, 0x0

    .line 2548
    const/16 v19, 0xf

    .line 2549
    .line 2550
    goto/16 :goto_30

    .line 2551
    .line 2552
    :catch_3
    const/4 v1, 0x0

    .line 2553
    goto :goto_2a

    .line 2554
    :cond_61
    const/4 v1, 0x0

    .line 2555
    :try_start_8
    invoke-static {v8, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v0

    .line 2559
    throw v0

    .line 2560
    :cond_62
    const/4 v1, 0x0

    .line 2561
    invoke-static {v8, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v0

    .line 2565
    throw v0

    .line 2566
    :cond_63
    const/4 v1, 0x0

    .line 2567
    invoke-static {v8, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2568
    .line 2569
    .line 2570
    move-result-object v0

    .line 2571
    throw v0

    .line 2572
    :cond_64
    const/4 v1, 0x0

    .line 2573
    invoke-static {v8, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v0

    .line 2577
    throw v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 2578
    :catch_4
    :goto_2a
    invoke-static {v8, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v0

    .line 2582
    throw v0

    .line 2583
    :pswitch_1c
    move-object/from16 v48, v1

    .line 2584
    .line 2585
    move-object/from16 v39, v7

    .line 2586
    .line 2587
    const/16 v24, 0x10

    .line 2588
    .line 2589
    new-instance v1, Lq3/v;

    .line 2590
    .line 2591
    invoke-direct {v1}, Lq3/v;-><init>()V

    .line 2592
    .line 2593
    .line 2594
    iput-object v1, v0, Lw3/c;->T:Lq3/v;

    .line 2595
    .line 2596
    const-string v8, "audio/true-hd"

    .line 2597
    .line 2598
    const/4 v1, -0x1

    .line 2599
    const/16 v3, 0x18

    .line 2600
    .line 2601
    const/4 v7, 0x0

    .line 2602
    const/4 v9, -0x1

    .line 2603
    goto :goto_29

    .line 2604
    :pswitch_1d
    move-object/from16 v48, v1

    .line 2605
    .line 2606
    move-object/from16 v39, v7

    .line 2607
    .line 2608
    const/16 v19, 0xf

    .line 2609
    .line 2610
    const/16 v24, 0x10

    .line 2611
    .line 2612
    new-instance v1, LA4/r;

    .line 2613
    .line 2614
    invoke-virtual {v0, v3}, Lw3/c;->a(Ljava/lang/String;)[B

    .line 2615
    .line 2616
    .line 2617
    move-result-object v3

    .line 2618
    invoke-direct {v1, v3}, LA4/r;-><init>([B)V

    .line 2619
    .line 2620
    .line 2621
    :try_start_9
    invoke-virtual {v1}, LA4/r;->p()I

    .line 2622
    .line 2623
    .line 2624
    move-result v3

    .line 2625
    const/4 v7, 0x1

    .line 2626
    if-ne v3, v7, :cond_65

    .line 2627
    .line 2628
    const/16 v3, 0x18

    .line 2629
    .line 2630
    goto :goto_2b

    .line 2631
    :cond_65
    const v7, 0xfffe

    .line 2632
    .line 2633
    .line 2634
    if-ne v3, v7, :cond_67

    .line 2635
    .line 2636
    const/16 v3, 0x18

    .line 2637
    .line 2638
    invoke-virtual {v1, v3}, LA4/r;->H(I)V

    .line 2639
    .line 2640
    .line 2641
    invoke-virtual {v1}, LA4/r;->q()J

    .line 2642
    .line 2643
    .line 2644
    move-result-wide v7

    .line 2645
    sget-object v9, Lw3/d;->g0:Ljava/util/UUID;

    .line 2646
    .line 2647
    invoke-virtual {v9}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 2648
    .line 2649
    .line 2650
    move-result-wide v42

    .line 2651
    cmp-long v7, v7, v42

    .line 2652
    .line 2653
    if-nez v7, :cond_68

    .line 2654
    .line 2655
    invoke-virtual {v1}, LA4/r;->q()J

    .line 2656
    .line 2657
    .line 2658
    move-result-wide v7

    .line 2659
    invoke-virtual {v9}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 2660
    .line 2661
    .line 2662
    move-result-wide v42
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_5

    .line 2663
    cmp-long v1, v7, v42

    .line 2664
    .line 2665
    if-nez v1, :cond_68

    .line 2666
    .line 2667
    :goto_2b
    iget v1, v0, Lw3/c;->P:I

    .line 2668
    .line 2669
    invoke-static {v1}, Ll4/y;->w(I)I

    .line 2670
    .line 2671
    .line 2672
    move-result v1

    .line 2673
    if-nez v1, :cond_66

    .line 2674
    .line 2675
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2676
    .line 2677
    const-string v7, "Unsupported PCM bit depth: "

    .line 2678
    .line 2679
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2680
    .line 2681
    .line 2682
    iget v7, v0, Lw3/c;->P:I

    .line 2683
    .line 2684
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2685
    .line 2686
    .line 2687
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2688
    .line 2689
    .line 2690
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v1

    .line 2694
    invoke-static {v12, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 2695
    .line 2696
    .line 2697
    :goto_2c
    move-object/from16 v8, v37

    .line 2698
    .line 2699
    const/4 v1, -0x1

    .line 2700
    :goto_2d
    const/4 v7, 0x0

    .line 2701
    :goto_2e
    const/4 v9, -0x1

    .line 2702
    const/4 v12, 0x0

    .line 2703
    goto :goto_30

    .line 2704
    :cond_66
    move-object/from16 v8, v36

    .line 2705
    .line 2706
    goto :goto_2d

    .line 2707
    :cond_67
    const/16 v3, 0x18

    .line 2708
    .line 2709
    :cond_68
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    .line 2710
    .line 2711
    invoke-static {v12, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 2712
    .line 2713
    .line 2714
    goto :goto_2c

    .line 2715
    :catch_5
    const-string v0, "Error parsing MS/ACM codec private"

    .line 2716
    .line 2717
    const/4 v1, 0x0

    .line 2718
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 2719
    .line 2720
    .line 2721
    move-result-object v0

    .line 2722
    throw v0

    .line 2723
    :pswitch_1e
    move-object/from16 v48, v1

    .line 2724
    .line 2725
    move-object/from16 v39, v7

    .line 2726
    .line 2727
    const/16 v3, 0x18

    .line 2728
    .line 2729
    const/16 v19, 0xf

    .line 2730
    .line 2731
    const/16 v24, 0x10

    .line 2732
    .line 2733
    iget-object v1, v0, Lw3/c;->k:[B

    .line 2734
    .line 2735
    if-nez v1, :cond_69

    .line 2736
    .line 2737
    const/4 v1, 0x0

    .line 2738
    goto :goto_2f

    .line 2739
    :cond_69
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v1

    .line 2743
    :goto_2f
    const-string v8, "video/mp4v-es"

    .line 2744
    .line 2745
    move-object v7, v1

    .line 2746
    const/4 v1, -0x1

    .line 2747
    goto :goto_2e

    .line 2748
    :goto_30
    iget-object v13, v0, Lw3/c;->N:[B

    .line 2749
    .line 2750
    if-eqz v13, :cond_6a

    .line 2751
    .line 2752
    new-instance v3, LA4/r;

    .line 2753
    .line 2754
    invoke-direct {v3, v13}, LA4/r;-><init>([B)V

    .line 2755
    .line 2756
    .line 2757
    invoke-static {v3}, LQ2/i;->a(LA4/r;)LQ2/i;

    .line 2758
    .line 2759
    .line 2760
    move-result-object v3

    .line 2761
    if-eqz v3, :cond_6a

    .line 2762
    .line 2763
    iget-object v12, v3, LQ2/i;->a:Ljava/lang/String;

    .line 2764
    .line 2765
    const-string v8, "video/dolby-vision"

    .line 2766
    .line 2767
    :cond_6a
    iget-boolean v3, v0, Lw3/c;->V:Z

    .line 2768
    .line 2769
    iget-boolean v13, v0, Lw3/c;->U:Z

    .line 2770
    .line 2771
    if-eqz v13, :cond_6b

    .line 2772
    .line 2773
    const/4 v13, 0x2

    .line 2774
    goto :goto_31

    .line 2775
    :cond_6b
    const/4 v13, 0x0

    .line 2776
    :goto_31
    or-int/2addr v3, v13

    .line 2777
    new-instance v13, Lj3/L;

    .line 2778
    .line 2779
    invoke-direct {v13}, Lj3/L;-><init>()V

    .line 2780
    .line 2781
    .line 2782
    invoke-static {v8}, Ll4/n;->j(Ljava/lang/String;)Z

    .line 2783
    .line 2784
    .line 2785
    move-result v20

    .line 2786
    move-object/from16 v49, v2

    .line 2787
    .line 2788
    sget-object v2, Lw3/d;->h0:Ljava/util/Map;

    .line 2789
    .line 2790
    if-eqz v20, :cond_6c

    .line 2791
    .line 2792
    iget v10, v0, Lw3/c;->O:I

    .line 2793
    .line 2794
    iput v10, v13, Lj3/L;->x:I

    .line 2795
    .line 2796
    iget v10, v0, Lw3/c;->Q:I

    .line 2797
    .line 2798
    iput v10, v13, Lj3/L;->y:I

    .line 2799
    .line 2800
    iput v1, v13, Lj3/L;->z:I

    .line 2801
    .line 2802
    move-object/from16 v50, v4

    .line 2803
    .line 2804
    const/4 v1, 0x1

    .line 2805
    :goto_32
    const/16 v17, 0x19

    .line 2806
    .line 2807
    goto/16 :goto_3c

    .line 2808
    .line 2809
    :cond_6c
    invoke-static {v8}, Ll4/n;->l(Ljava/lang/String;)Z

    .line 2810
    .line 2811
    .line 2812
    move-result v1

    .line 2813
    if-eqz v1, :cond_7a

    .line 2814
    .line 2815
    iget v1, v0, Lw3/c;->q:I

    .line 2816
    .line 2817
    if-nez v1, :cond_6f

    .line 2818
    .line 2819
    iget v1, v0, Lw3/c;->o:I

    .line 2820
    .line 2821
    const/4 v10, -0x1

    .line 2822
    if-ne v1, v10, :cond_6d

    .line 2823
    .line 2824
    iget v1, v0, Lw3/c;->m:I

    .line 2825
    .line 2826
    :cond_6d
    iput v1, v0, Lw3/c;->o:I

    .line 2827
    .line 2828
    iget v1, v0, Lw3/c;->p:I

    .line 2829
    .line 2830
    if-ne v1, v10, :cond_6e

    .line 2831
    .line 2832
    iget v1, v0, Lw3/c;->n:I

    .line 2833
    .line 2834
    :cond_6e
    iput v1, v0, Lw3/c;->p:I

    .line 2835
    .line 2836
    goto :goto_33

    .line 2837
    :cond_6f
    const/4 v10, -0x1

    .line 2838
    :goto_33
    iget v1, v0, Lw3/c;->o:I

    .line 2839
    .line 2840
    if-eq v1, v10, :cond_70

    .line 2841
    .line 2842
    iget v11, v0, Lw3/c;->p:I

    .line 2843
    .line 2844
    if-eq v11, v10, :cond_70

    .line 2845
    .line 2846
    iget v10, v0, Lw3/c;->n:I

    .line 2847
    .line 2848
    mul-int/2addr v10, v1

    .line 2849
    int-to-float v1, v10

    .line 2850
    iget v10, v0, Lw3/c;->m:I

    .line 2851
    .line 2852
    mul-int/2addr v10, v11

    .line 2853
    int-to-float v10, v10

    .line 2854
    div-float/2addr v1, v10

    .line 2855
    goto :goto_34

    .line 2856
    :cond_70
    move/from16 v1, v26

    .line 2857
    .line 2858
    :goto_34
    iget-boolean v10, v0, Lw3/c;->x:Z

    .line 2859
    .line 2860
    if-eqz v10, :cond_73

    .line 2861
    .line 2862
    iget v10, v0, Lw3/c;->D:F

    .line 2863
    .line 2864
    cmpl-float v10, v10, v26

    .line 2865
    .line 2866
    if-eqz v10, :cond_71

    .line 2867
    .line 2868
    iget v10, v0, Lw3/c;->E:F

    .line 2869
    .line 2870
    cmpl-float v10, v10, v26

    .line 2871
    .line 2872
    if-eqz v10, :cond_71

    .line 2873
    .line 2874
    iget v10, v0, Lw3/c;->F:F

    .line 2875
    .line 2876
    cmpl-float v10, v10, v26

    .line 2877
    .line 2878
    if-eqz v10, :cond_71

    .line 2879
    .line 2880
    iget v10, v0, Lw3/c;->G:F

    .line 2881
    .line 2882
    cmpl-float v10, v10, v26

    .line 2883
    .line 2884
    if-eqz v10, :cond_71

    .line 2885
    .line 2886
    iget v10, v0, Lw3/c;->H:F

    .line 2887
    .line 2888
    cmpl-float v10, v10, v26

    .line 2889
    .line 2890
    if-eqz v10, :cond_71

    .line 2891
    .line 2892
    iget v10, v0, Lw3/c;->I:F

    .line 2893
    .line 2894
    cmpl-float v10, v10, v26

    .line 2895
    .line 2896
    if-eqz v10, :cond_71

    .line 2897
    .line 2898
    iget v10, v0, Lw3/c;->J:F

    .line 2899
    .line 2900
    cmpl-float v10, v10, v26

    .line 2901
    .line 2902
    if-eqz v10, :cond_71

    .line 2903
    .line 2904
    iget v10, v0, Lw3/c;->K:F

    .line 2905
    .line 2906
    cmpl-float v10, v10, v26

    .line 2907
    .line 2908
    if-eqz v10, :cond_71

    .line 2909
    .line 2910
    iget v10, v0, Lw3/c;->L:F

    .line 2911
    .line 2912
    cmpl-float v10, v10, v26

    .line 2913
    .line 2914
    if-eqz v10, :cond_71

    .line 2915
    .line 2916
    iget v10, v0, Lw3/c;->M:F

    .line 2917
    .line 2918
    cmpl-float v10, v10, v26

    .line 2919
    .line 2920
    if-nez v10, :cond_72

    .line 2921
    .line 2922
    :cond_71
    const/16 v10, 0x19

    .line 2923
    .line 2924
    goto/16 :goto_35

    .line 2925
    .line 2926
    :cond_72
    const/16 v10, 0x19

    .line 2927
    .line 2928
    new-array v11, v10, [B

    .line 2929
    .line 2930
    invoke-static {v11}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2931
    .line 2932
    .line 2933
    move-result-object v14

    .line 2934
    sget-object v15, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2935
    .line 2936
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v14

    .line 2940
    const/4 v15, 0x0

    .line 2941
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 2942
    .line 2943
    .line 2944
    iget v15, v0, Lw3/c;->D:F

    .line 2945
    .line 2946
    const v17, 0x47435000    # 50000.0f

    .line 2947
    .line 2948
    .line 2949
    mul-float v15, v15, v17

    .line 2950
    .line 2951
    const/high16 v20, 0x3f000000    # 0.5f

    .line 2952
    .line 2953
    add-float v15, v15, v20

    .line 2954
    .line 2955
    float-to-int v15, v15

    .line 2956
    int-to-short v15, v15

    .line 2957
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2958
    .line 2959
    .line 2960
    iget v15, v0, Lw3/c;->E:F

    .line 2961
    .line 2962
    mul-float v15, v15, v17

    .line 2963
    .line 2964
    add-float v15, v15, v20

    .line 2965
    .line 2966
    float-to-int v15, v15

    .line 2967
    int-to-short v15, v15

    .line 2968
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2969
    .line 2970
    .line 2971
    iget v15, v0, Lw3/c;->F:F

    .line 2972
    .line 2973
    mul-float v15, v15, v17

    .line 2974
    .line 2975
    add-float v15, v15, v20

    .line 2976
    .line 2977
    float-to-int v15, v15

    .line 2978
    int-to-short v15, v15

    .line 2979
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2980
    .line 2981
    .line 2982
    iget v15, v0, Lw3/c;->G:F

    .line 2983
    .line 2984
    mul-float v15, v15, v17

    .line 2985
    .line 2986
    add-float v15, v15, v20

    .line 2987
    .line 2988
    float-to-int v15, v15

    .line 2989
    int-to-short v15, v15

    .line 2990
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2991
    .line 2992
    .line 2993
    iget v15, v0, Lw3/c;->H:F

    .line 2994
    .line 2995
    mul-float v15, v15, v17

    .line 2996
    .line 2997
    add-float v15, v15, v20

    .line 2998
    .line 2999
    float-to-int v15, v15

    .line 3000
    int-to-short v15, v15

    .line 3001
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3002
    .line 3003
    .line 3004
    iget v15, v0, Lw3/c;->I:F

    .line 3005
    .line 3006
    mul-float v15, v15, v17

    .line 3007
    .line 3008
    add-float v15, v15, v20

    .line 3009
    .line 3010
    float-to-int v15, v15

    .line 3011
    int-to-short v15, v15

    .line 3012
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3013
    .line 3014
    .line 3015
    iget v15, v0, Lw3/c;->J:F

    .line 3016
    .line 3017
    mul-float v15, v15, v17

    .line 3018
    .line 3019
    add-float v15, v15, v20

    .line 3020
    .line 3021
    float-to-int v15, v15

    .line 3022
    int-to-short v15, v15

    .line 3023
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3024
    .line 3025
    .line 3026
    iget v15, v0, Lw3/c;->K:F

    .line 3027
    .line 3028
    mul-float v15, v15, v17

    .line 3029
    .line 3030
    add-float v15, v15, v20

    .line 3031
    .line 3032
    float-to-int v15, v15

    .line 3033
    int-to-short v15, v15

    .line 3034
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3035
    .line 3036
    .line 3037
    iget v15, v0, Lw3/c;->L:F

    .line 3038
    .line 3039
    add-float v15, v15, v20

    .line 3040
    .line 3041
    float-to-int v15, v15

    .line 3042
    int-to-short v15, v15

    .line 3043
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3044
    .line 3045
    .line 3046
    iget v15, v0, Lw3/c;->M:F

    .line 3047
    .line 3048
    add-float v15, v15, v20

    .line 3049
    .line 3050
    float-to-int v15, v15

    .line 3051
    int-to-short v15, v15

    .line 3052
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3053
    .line 3054
    .line 3055
    iget v15, v0, Lw3/c;->B:I

    .line 3056
    .line 3057
    int-to-short v15, v15

    .line 3058
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3059
    .line 3060
    .line 3061
    iget v15, v0, Lw3/c;->C:I

    .line 3062
    .line 3063
    int-to-short v15, v15

    .line 3064
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3065
    .line 3066
    .line 3067
    goto :goto_36

    .line 3068
    :goto_35
    const/4 v11, 0x0

    .line 3069
    :goto_36
    new-instance v14, Lm4/b;

    .line 3070
    .line 3071
    iget v15, v0, Lw3/c;->y:I

    .line 3072
    .line 3073
    iget v10, v0, Lw3/c;->A:I

    .line 3074
    .line 3075
    move-object/from16 v50, v4

    .line 3076
    .line 3077
    iget v4, v0, Lw3/c;->z:I

    .line 3078
    .line 3079
    invoke-direct {v14, v15, v10, v4, v11}, Lm4/b;-><init>(III[B)V

    .line 3080
    .line 3081
    .line 3082
    goto :goto_37

    .line 3083
    :cond_73
    move-object/from16 v50, v4

    .line 3084
    .line 3085
    const/4 v14, 0x0

    .line 3086
    :goto_37
    iget-object v4, v0, Lw3/c;->a:Ljava/lang/String;

    .line 3087
    .line 3088
    if-eqz v4, :cond_74

    .line 3089
    .line 3090
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 3091
    .line 3092
    .line 3093
    move-result v4

    .line 3094
    if-eqz v4, :cond_74

    .line 3095
    .line 3096
    iget-object v4, v0, Lw3/c;->a:Ljava/lang/String;

    .line 3097
    .line 3098
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3099
    .line 3100
    .line 3101
    move-result-object v4

    .line 3102
    check-cast v4, Ljava/lang/Integer;

    .line 3103
    .line 3104
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 3105
    .line 3106
    .line 3107
    move-result v4

    .line 3108
    goto :goto_38

    .line 3109
    :cond_74
    const/4 v4, -0x1

    .line 3110
    :goto_38
    iget v10, v0, Lw3/c;->r:I

    .line 3111
    .line 3112
    if-nez v10, :cond_79

    .line 3113
    .line 3114
    iget v10, v0, Lw3/c;->s:F

    .line 3115
    .line 3116
    const/4 v11, 0x0

    .line 3117
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3118
    .line 3119
    .line 3120
    move-result v10

    .line 3121
    if-nez v10, :cond_79

    .line 3122
    .line 3123
    iget v10, v0, Lw3/c;->t:F

    .line 3124
    .line 3125
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3126
    .line 3127
    .line 3128
    move-result v10

    .line 3129
    if-nez v10, :cond_79

    .line 3130
    .line 3131
    iget v10, v0, Lw3/c;->u:F

    .line 3132
    .line 3133
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3134
    .line 3135
    .line 3136
    move-result v10

    .line 3137
    if-nez v10, :cond_75

    .line 3138
    .line 3139
    const/4 v4, 0x0

    .line 3140
    goto :goto_3a

    .line 3141
    :cond_75
    iget v10, v0, Lw3/c;->t:F

    .line 3142
    .line 3143
    const/high16 v11, 0x42b40000    # 90.0f

    .line 3144
    .line 3145
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3146
    .line 3147
    .line 3148
    move-result v10

    .line 3149
    if-nez v10, :cond_76

    .line 3150
    .line 3151
    const/16 v4, 0x5a

    .line 3152
    .line 3153
    goto :goto_3a

    .line 3154
    :cond_76
    iget v10, v0, Lw3/c;->t:F

    .line 3155
    .line 3156
    const/high16 v11, -0x3ccc0000    # -180.0f

    .line 3157
    .line 3158
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3159
    .line 3160
    .line 3161
    move-result v10

    .line 3162
    if-eqz v10, :cond_78

    .line 3163
    .line 3164
    iget v10, v0, Lw3/c;->t:F

    .line 3165
    .line 3166
    const/high16 v11, 0x43340000    # 180.0f

    .line 3167
    .line 3168
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3169
    .line 3170
    .line 3171
    move-result v10

    .line 3172
    if-nez v10, :cond_77

    .line 3173
    .line 3174
    goto :goto_39

    .line 3175
    :cond_77
    iget v10, v0, Lw3/c;->t:F

    .line 3176
    .line 3177
    const/high16 v11, -0x3d4c0000    # -90.0f

    .line 3178
    .line 3179
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    .line 3180
    .line 3181
    .line 3182
    move-result v10

    .line 3183
    if-nez v10, :cond_79

    .line 3184
    .line 3185
    const/16 v4, 0x10e

    .line 3186
    .line 3187
    goto :goto_3a

    .line 3188
    :cond_78
    :goto_39
    const/16 v4, 0xb4

    .line 3189
    .line 3190
    :cond_79
    :goto_3a
    iget v10, v0, Lw3/c;->m:I

    .line 3191
    .line 3192
    iput v10, v13, Lj3/L;->p:I

    .line 3193
    .line 3194
    iget v10, v0, Lw3/c;->n:I

    .line 3195
    .line 3196
    iput v10, v13, Lj3/L;->q:I

    .line 3197
    .line 3198
    iput v1, v13, Lj3/L;->t:F

    .line 3199
    .line 3200
    iput v4, v13, Lj3/L;->s:I

    .line 3201
    .line 3202
    iget-object v1, v0, Lw3/c;->v:[B

    .line 3203
    .line 3204
    iput-object v1, v13, Lj3/L;->u:[B

    .line 3205
    .line 3206
    iget v1, v0, Lw3/c;->w:I

    .line 3207
    .line 3208
    iput v1, v13, Lj3/L;->v:I

    .line 3209
    .line 3210
    iput-object v14, v13, Lj3/L;->w:Lm4/b;

    .line 3211
    .line 3212
    const/4 v1, 0x2

    .line 3213
    goto/16 :goto_32

    .line 3214
    .line 3215
    :cond_7a
    move-object/from16 v50, v4

    .line 3216
    .line 3217
    const/16 v17, 0x19

    .line 3218
    .line 3219
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3220
    .line 3221
    .line 3222
    move-result v1

    .line 3223
    if-nez v1, :cond_7c

    .line 3224
    .line 3225
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3226
    .line 3227
    .line 3228
    move-result v1

    .line 3229
    if-nez v1, :cond_7c

    .line 3230
    .line 3231
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3232
    .line 3233
    .line 3234
    move-result v1

    .line 3235
    if-nez v1, :cond_7c

    .line 3236
    .line 3237
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3238
    .line 3239
    .line 3240
    move-result v1

    .line 3241
    if-nez v1, :cond_7c

    .line 3242
    .line 3243
    move-object/from16 v1, v35

    .line 3244
    .line 3245
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3246
    .line 3247
    .line 3248
    move-result v1

    .line 3249
    if-nez v1, :cond_7c

    .line 3250
    .line 3251
    move-object/from16 v1, v33

    .line 3252
    .line 3253
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3254
    .line 3255
    .line 3256
    move-result v1

    .line 3257
    if-eqz v1, :cond_7b

    .line 3258
    .line 3259
    goto :goto_3b

    .line 3260
    :cond_7b
    const-string v0, "Unexpected MIME type."

    .line 3261
    .line 3262
    const/4 v1, 0x0

    .line 3263
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 3264
    .line 3265
    .line 3266
    move-result-object v0

    .line 3267
    throw v0

    .line 3268
    :cond_7c
    :goto_3b
    const/4 v1, 0x3

    .line 3269
    :goto_3c
    iget-object v4, v0, Lw3/c;->a:Ljava/lang/String;

    .line 3270
    .line 3271
    if-eqz v4, :cond_7d

    .line 3272
    .line 3273
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 3274
    .line 3275
    .line 3276
    move-result v2

    .line 3277
    if-nez v2, :cond_7d

    .line 3278
    .line 3279
    iget-object v2, v0, Lw3/c;->a:Ljava/lang/String;

    .line 3280
    .line 3281
    iput-object v2, v13, Lj3/L;->b:Ljava/lang/String;

    .line 3282
    .line 3283
    :cond_7d
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 3284
    .line 3285
    .line 3286
    move-result-object v2

    .line 3287
    iput-object v2, v13, Lj3/L;->a:Ljava/lang/String;

    .line 3288
    .line 3289
    iput-object v8, v13, Lj3/L;->k:Ljava/lang/String;

    .line 3290
    .line 3291
    iput v9, v13, Lj3/L;->l:I

    .line 3292
    .line 3293
    iget-object v2, v0, Lw3/c;->W:Ljava/lang/String;

    .line 3294
    .line 3295
    iput-object v2, v13, Lj3/L;->c:Ljava/lang/String;

    .line 3296
    .line 3297
    iput v3, v13, Lj3/L;->d:I

    .line 3298
    .line 3299
    iput-object v7, v13, Lj3/L;->m:Ljava/util/List;

    .line 3300
    .line 3301
    iput-object v12, v13, Lj3/L;->h:Ljava/lang/String;

    .line 3302
    .line 3303
    iget-object v2, v0, Lw3/c;->l:Ln3/g;

    .line 3304
    .line 3305
    iput-object v2, v13, Lj3/L;->n:Ln3/g;

    .line 3306
    .line 3307
    invoke-virtual {v13}, Lj3/L;->a()Lj3/M;

    .line 3308
    .line 3309
    .line 3310
    move-result-object v2

    .line 3311
    iget v3, v0, Lw3/c;->c:I

    .line 3312
    .line 3313
    move-object/from16 v4, v32

    .line 3314
    .line 3315
    invoke-interface {v4, v3, v1}, Lq3/l;->u(II)Lq3/u;

    .line 3316
    .line 3317
    .line 3318
    move-result-object v1

    .line 3319
    iput-object v1, v0, Lw3/c;->X:Lq3/u;

    .line 3320
    .line 3321
    invoke-interface {v1, v2}, Lq3/u;->e(Lj3/M;)V

    .line 3322
    .line 3323
    .line 3324
    iget v1, v0, Lw3/c;->c:I

    .line 3325
    .line 3326
    move-object/from16 v2, v34

    .line 3327
    .line 3328
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3329
    .line 3330
    .line 3331
    move-object/from16 v8, v41

    .line 3332
    .line 3333
    goto/16 :goto_10

    .line 3334
    .line 3335
    :goto_3d
    iput-object v1, v8, Lw3/d;->u:Lw3/c;

    .line 3336
    .line 3337
    :goto_3e
    move-object/from16 v2, v38

    .line 3338
    .line 3339
    const/4 v7, 0x0

    .line 3340
    goto/16 :goto_45

    .line 3341
    .line 3342
    :cond_7e
    const/4 v1, 0x0

    .line 3343
    const-string v0, "CodecId is missing in TrackEntry element"

    .line 3344
    .line 3345
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 3346
    .line 3347
    .line 3348
    move-result-object v0

    .line 3349
    throw v0

    .line 3350
    :cond_7f
    move-object/from16 v48, v1

    .line 3351
    .line 3352
    move-object/from16 v49, v2

    .line 3353
    .line 3354
    move-object/from16 v50, v3

    .line 3355
    .line 3356
    move-object/from16 v39, v6

    .line 3357
    .line 3358
    move-object/from16 v38, v9

    .line 3359
    .line 3360
    move-object v2, v11

    .line 3361
    const/16 v17, 0x19

    .line 3362
    .line 3363
    const/16 v19, 0xf

    .line 3364
    .line 3365
    const/16 v24, 0x10

    .line 3366
    .line 3367
    move-object v6, v5

    .line 3368
    move-object v5, v4

    .line 3369
    iget v0, v8, Lw3/d;->G:I

    .line 3370
    .line 3371
    const/4 v9, 0x2

    .line 3372
    if-eq v0, v9, :cond_80

    .line 3373
    .line 3374
    :goto_3f
    goto :goto_3e

    .line 3375
    :cond_80
    iget v0, v8, Lw3/d;->M:I

    .line 3376
    .line 3377
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 3378
    .line 3379
    .line 3380
    move-result-object v0

    .line 3381
    check-cast v0, Lw3/c;

    .line 3382
    .line 3383
    iget-object v1, v0, Lw3/c;->X:Lq3/u;

    .line 3384
    .line 3385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3386
    .line 3387
    .line 3388
    iget-wide v1, v8, Lw3/d;->R:J

    .line 3389
    .line 3390
    cmp-long v1, v1, v32

    .line 3391
    .line 3392
    if-lez v1, :cond_81

    .line 3393
    .line 3394
    iget-object v1, v0, Lw3/c;->b:Ljava/lang/String;

    .line 3395
    .line 3396
    move-object/from16 v2, v38

    .line 3397
    .line 3398
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3399
    .line 3400
    .line 3401
    move-result v1

    .line 3402
    if-eqz v1, :cond_82

    .line 3403
    .line 3404
    const/16 v27, 0x8

    .line 3405
    .line 3406
    invoke-static/range {v27 .. v27}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3407
    .line 3408
    .line 3409
    move-result-object v1

    .line 3410
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 3411
    .line 3412
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3413
    .line 3414
    .line 3415
    move-result-object v1

    .line 3416
    iget-wide v3, v8, Lw3/d;->R:J

    .line 3417
    .line 3418
    invoke-virtual {v1, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 3419
    .line 3420
    .line 3421
    move-result-object v1

    .line 3422
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 3423
    .line 3424
    .line 3425
    move-result-object v1

    .line 3426
    iget-object v3, v8, Lw3/d;->n:LA4/r;

    .line 3427
    .line 3428
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3429
    .line 3430
    .line 3431
    array-length v4, v1

    .line 3432
    invoke-virtual {v3, v4, v1}, LA4/r;->F(I[B)V

    .line 3433
    .line 3434
    .line 3435
    goto :goto_40

    .line 3436
    :cond_81
    move-object/from16 v2, v38

    .line 3437
    .line 3438
    :cond_82
    :goto_40
    const/4 v1, 0x0

    .line 3439
    const/4 v3, 0x0

    .line 3440
    :goto_41
    iget v4, v8, Lw3/d;->K:I

    .line 3441
    .line 3442
    if-ge v1, v4, :cond_83

    .line 3443
    .line 3444
    iget-object v4, v8, Lw3/d;->L:[I

    .line 3445
    .line 3446
    aget v4, v4, v1

    .line 3447
    .line 3448
    add-int/2addr v3, v4

    .line 3449
    const/16 v30, 0x1

    .line 3450
    .line 3451
    add-int/lit8 v1, v1, 0x1

    .line 3452
    .line 3453
    goto :goto_41

    .line 3454
    :cond_83
    const/4 v1, 0x0

    .line 3455
    :goto_42
    iget v4, v8, Lw3/d;->K:I

    .line 3456
    .line 3457
    if-ge v1, v4, :cond_85

    .line 3458
    .line 3459
    iget-wide v9, v8, Lw3/d;->H:J

    .line 3460
    .line 3461
    iget v4, v0, Lw3/c;->e:I

    .line 3462
    .line 3463
    mul-int/2addr v4, v1

    .line 3464
    const/16 v7, 0x3e8

    .line 3465
    .line 3466
    div-int/2addr v4, v7

    .line 3467
    int-to-long v11, v4

    .line 3468
    add-long v43, v9, v11

    .line 3469
    .line 3470
    iget v4, v8, Lw3/d;->O:I

    .line 3471
    .line 3472
    if-nez v1, :cond_84

    .line 3473
    .line 3474
    iget-boolean v7, v8, Lw3/d;->Q:Z

    .line 3475
    .line 3476
    if-nez v7, :cond_84

    .line 3477
    .line 3478
    const/16 v30, 0x1

    .line 3479
    .line 3480
    or-int/lit8 v4, v4, 0x1

    .line 3481
    .line 3482
    :goto_43
    move/from16 v45, v4

    .line 3483
    .line 3484
    goto :goto_44

    .line 3485
    :cond_84
    const/16 v30, 0x1

    .line 3486
    .line 3487
    goto :goto_43

    .line 3488
    :goto_44
    iget-object v4, v8, Lw3/d;->L:[I

    .line 3489
    .line 3490
    aget v46, v4, v1

    .line 3491
    .line 3492
    sub-int v47, v3, v46

    .line 3493
    .line 3494
    move-object/from16 v42, v0

    .line 3495
    .line 3496
    move-object/from16 v41, v8

    .line 3497
    .line 3498
    invoke-virtual/range {v41 .. v47}, Lw3/d;->e(Lw3/c;JIII)V

    .line 3499
    .line 3500
    .line 3501
    add-int/lit8 v1, v1, 0x1

    .line 3502
    .line 3503
    move/from16 v3, v47

    .line 3504
    .line 3505
    goto :goto_42

    .line 3506
    :cond_85
    const/4 v7, 0x0

    .line 3507
    iput v7, v8, Lw3/d;->G:I

    .line 3508
    .line 3509
    :goto_45
    move-object/from16 v38, v39

    .line 3510
    .line 3511
    const/4 v4, 0x5

    .line 3512
    const/16 v9, 0x8

    .line 3513
    .line 3514
    const/4 v12, 0x4

    .line 3515
    :goto_46
    const/16 v20, 0x1

    .line 3516
    .line 3517
    goto/16 :goto_5c

    .line 3518
    .line 3519
    :cond_86
    move-object/from16 v48, v1

    .line 3520
    .line 3521
    move-object/from16 v49, v2

    .line 3522
    .line 3523
    move-object/from16 v50, v3

    .line 3524
    .line 3525
    move-object/from16 v38, v6

    .line 3526
    .line 3527
    move v0, v7

    .line 3528
    move-object v2, v9

    .line 3529
    move/from16 v7, v22

    .line 3530
    .line 3531
    const/16 v17, 0x19

    .line 3532
    .line 3533
    const/16 v19, 0xf

    .line 3534
    .line 3535
    const/16 v24, 0x10

    .line 3536
    .line 3537
    move-object v6, v5

    .line 3538
    move-object v5, v4

    .line 3539
    iget v1, v15, Lw3/b;->e:I

    .line 3540
    .line 3541
    const v3, 0x1f43b675

    .line 3542
    .line 3543
    .line 3544
    iget-object v4, v15, Lw3/b;->c:Lw3/e;

    .line 3545
    .line 3546
    if-nez v1, :cond_8c

    .line 3547
    .line 3548
    move-object/from16 v1, p1

    .line 3549
    .line 3550
    check-cast v1, Lq3/g;

    .line 3551
    .line 3552
    const/4 v8, 0x1

    .line 3553
    const/4 v9, 0x4

    .line 3554
    invoke-virtual {v4, v1, v8, v7, v9}, Lw3/e;->c(Lq3/g;ZZI)J

    .line 3555
    .line 3556
    .line 3557
    move-result-wide v11

    .line 3558
    const-wide/16 v21, -0x2

    .line 3559
    .line 3560
    cmp-long v8, v11, v21

    .line 3561
    .line 3562
    if-nez v8, :cond_89

    .line 3563
    .line 3564
    invoke-virtual {v1}, Lq3/g;->m()V

    .line 3565
    .line 3566
    .line 3567
    :goto_47
    iget-object v8, v15, Lw3/b;->a:[B

    .line 3568
    .line 3569
    invoke-interface {v1, v8, v7, v9}, Lq3/k;->B([BII)V

    .line 3570
    .line 3571
    .line 3572
    aget-byte v11, v8, v7

    .line 3573
    .line 3574
    invoke-static {v11}, Lw3/e;->b(I)I

    .line 3575
    .line 3576
    .line 3577
    move-result v11

    .line 3578
    const/4 v12, -0x1

    .line 3579
    if-eq v11, v12, :cond_8a

    .line 3580
    .line 3581
    if-gt v11, v9, :cond_8a

    .line 3582
    .line 3583
    invoke-static {v11, v7, v8}, Lw3/e;->a(IZ[B)J

    .line 3584
    .line 3585
    .line 3586
    move-result-wide v8

    .line 3587
    long-to-int v7, v8

    .line 3588
    iget-object v8, v15, Lw3/b;->d:Li/G;

    .line 3589
    .line 3590
    iget-object v8, v8, Li/G;->b:Ljava/lang/Object;

    .line 3591
    .line 3592
    check-cast v8, Lw3/d;

    .line 3593
    .line 3594
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3595
    .line 3596
    .line 3597
    const v8, 0x1549a966

    .line 3598
    .line 3599
    .line 3600
    if-eq v7, v8, :cond_88

    .line 3601
    .line 3602
    if-eq v7, v3, :cond_88

    .line 3603
    .line 3604
    if-eq v7, v14, :cond_88

    .line 3605
    .line 3606
    const v9, 0x1654ae6b

    .line 3607
    .line 3608
    .line 3609
    if-ne v7, v9, :cond_87

    .line 3610
    .line 3611
    goto :goto_49

    .line 3612
    :cond_87
    :goto_48
    const/4 v7, 0x1

    .line 3613
    goto :goto_4a

    .line 3614
    :cond_88
    :goto_49
    invoke-interface {v1, v11}, Lq3/k;->n(I)V

    .line 3615
    .line 3616
    .line 3617
    int-to-long v11, v7

    .line 3618
    :cond_89
    const/4 v7, 0x1

    .line 3619
    goto :goto_4b

    .line 3620
    :cond_8a
    const v8, 0x1549a966

    .line 3621
    .line 3622
    .line 3623
    const v9, 0x1654ae6b

    .line 3624
    .line 3625
    .line 3626
    goto :goto_48

    .line 3627
    :goto_4a
    invoke-interface {v1, v7}, Lq3/k;->n(I)V

    .line 3628
    .line 3629
    .line 3630
    const/4 v7, 0x0

    .line 3631
    const/4 v9, 0x4

    .line 3632
    goto :goto_47

    .line 3633
    :goto_4b
    cmp-long v1, v11, v36

    .line 3634
    .line 3635
    if-nez v1, :cond_8b

    .line 3636
    .line 3637
    const/4 v4, 0x5

    .line 3638
    const/16 v9, 0x8

    .line 3639
    .line 3640
    const/4 v12, 0x4

    .line 3641
    const/16 v20, 0x0

    .line 3642
    .line 3643
    goto/16 :goto_5c

    .line 3644
    .line 3645
    :cond_8b
    long-to-int v1, v11

    .line 3646
    iput v1, v15, Lw3/b;->f:I

    .line 3647
    .line 3648
    iput v7, v15, Lw3/b;->e:I

    .line 3649
    .line 3650
    goto :goto_4c

    .line 3651
    :cond_8c
    const/4 v7, 0x1

    .line 3652
    :goto_4c
    iget v1, v15, Lw3/b;->e:I

    .line 3653
    .line 3654
    if-ne v1, v7, :cond_8d

    .line 3655
    .line 3656
    move-object/from16 v1, p1

    .line 3657
    .line 3658
    check-cast v1, Lq3/g;

    .line 3659
    .line 3660
    const/4 v8, 0x0

    .line 3661
    const/16 v9, 0x8

    .line 3662
    .line 3663
    invoke-virtual {v4, v1, v8, v7, v9}, Lw3/e;->c(Lq3/g;ZZI)J

    .line 3664
    .line 3665
    .line 3666
    move-result-wide v11

    .line 3667
    iput-wide v11, v15, Lw3/b;->g:J

    .line 3668
    .line 3669
    const/4 v1, 0x2

    .line 3670
    iput v1, v15, Lw3/b;->e:I

    .line 3671
    .line 3672
    goto :goto_4d

    .line 3673
    :cond_8d
    const/16 v9, 0x8

    .line 3674
    .line 3675
    :goto_4d
    iget-object v1, v15, Lw3/b;->d:Li/G;

    .line 3676
    .line 3677
    iget v4, v15, Lw3/b;->f:I

    .line 3678
    .line 3679
    iget-object v1, v1, Li/G;->b:Ljava/lang/Object;

    .line 3680
    .line 3681
    check-cast v1, Lw3/d;

    .line 3682
    .line 3683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3684
    .line 3685
    .line 3686
    sparse-switch v4, :sswitch_data_2

    .line 3687
    .line 3688
    .line 3689
    const/4 v1, 0x0

    .line 3690
    goto :goto_4e

    .line 3691
    :sswitch_42
    const/4 v1, 0x5

    .line 3692
    goto :goto_4e

    .line 3693
    :sswitch_43
    const/4 v1, 0x4

    .line 3694
    goto :goto_4e

    .line 3695
    :sswitch_44
    const/4 v1, 0x1

    .line 3696
    goto :goto_4e

    .line 3697
    :sswitch_45
    const/4 v1, 0x3

    .line 3698
    goto :goto_4e

    .line 3699
    :sswitch_46
    const/4 v1, 0x2

    .line 3700
    :goto_4e
    if-eqz v1, :cond_b1

    .line 3701
    .line 3702
    const/4 v7, 0x1

    .line 3703
    if-eq v1, v7, :cond_a1

    .line 3704
    .line 3705
    const-wide/16 v3, 0x8

    .line 3706
    .line 3707
    const/4 v7, 0x2

    .line 3708
    if-eq v1, v7, :cond_9f

    .line 3709
    .line 3710
    const/4 v8, 0x3

    .line 3711
    if-eq v1, v8, :cond_95

    .line 3712
    .line 3713
    const/4 v0, 0x4

    .line 3714
    if-eq v1, v0, :cond_94

    .line 3715
    .line 3716
    const/4 v0, 0x5

    .line 3717
    if-ne v1, v0, :cond_93

    .line 3718
    .line 3719
    iget-wide v0, v15, Lw3/b;->g:J

    .line 3720
    .line 3721
    const-wide/16 v10, 0x4

    .line 3722
    .line 3723
    cmp-long v10, v0, v10

    .line 3724
    .line 3725
    if-eqz v10, :cond_8f

    .line 3726
    .line 3727
    cmp-long v3, v0, v3

    .line 3728
    .line 3729
    if-nez v3, :cond_8e

    .line 3730
    .line 3731
    goto :goto_4f

    .line 3732
    :cond_8e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3733
    .line 3734
    const-string v1, "Invalid float size: "

    .line 3735
    .line 3736
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3737
    .line 3738
    .line 3739
    iget-wide v1, v15, Lw3/b;->g:J

    .line 3740
    .line 3741
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3742
    .line 3743
    .line 3744
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3745
    .line 3746
    .line 3747
    move-result-object v0

    .line 3748
    const/4 v1, 0x0

    .line 3749
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 3750
    .line 3751
    .line 3752
    move-result-object v0

    .line 3753
    throw v0

    .line 3754
    :cond_8f
    :goto_4f
    iget-object v3, v15, Lw3/b;->d:Li/G;

    .line 3755
    .line 3756
    iget v4, v15, Lw3/b;->f:I

    .line 3757
    .line 3758
    long-to-int v0, v0

    .line 3759
    move-object/from16 v1, p1

    .line 3760
    .line 3761
    check-cast v1, Lq3/g;

    .line 3762
    .line 3763
    invoke-virtual {v15, v1, v0}, Lw3/b;->a(Lq3/g;I)J

    .line 3764
    .line 3765
    .line 3766
    move-result-wide v10

    .line 3767
    const/4 v12, 0x4

    .line 3768
    if-ne v0, v12, :cond_90

    .line 3769
    .line 3770
    long-to-int v0, v10

    .line 3771
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 3772
    .line 3773
    .line 3774
    move-result v0

    .line 3775
    float-to-double v0, v0

    .line 3776
    goto :goto_50

    .line 3777
    :cond_90
    invoke-static {v10, v11}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 3778
    .line 3779
    .line 3780
    move-result-wide v0

    .line 3781
    :goto_50
    iget-object v3, v3, Li/G;->b:Ljava/lang/Object;

    .line 3782
    .line 3783
    check-cast v3, Lw3/d;

    .line 3784
    .line 3785
    const/16 v10, 0xb5

    .line 3786
    .line 3787
    if-eq v4, v10, :cond_92

    .line 3788
    .line 3789
    const/16 v10, 0x4489

    .line 3790
    .line 3791
    if-eq v4, v10, :cond_91

    .line 3792
    .line 3793
    packed-switch v4, :pswitch_data_2

    .line 3794
    .line 3795
    .line 3796
    packed-switch v4, :pswitch_data_3

    .line 3797
    .line 3798
    .line 3799
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3800
    .line 3801
    .line 3802
    :goto_51
    const/4 v13, 0x0

    .line 3803
    goto/16 :goto_52

    .line 3804
    .line 3805
    :pswitch_1f
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3806
    .line 3807
    .line 3808
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3809
    .line 3810
    double-to-float v0, v0

    .line 3811
    iput v0, v3, Lw3/c;->u:F

    .line 3812
    .line 3813
    goto :goto_51

    .line 3814
    :pswitch_20
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3815
    .line 3816
    .line 3817
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3818
    .line 3819
    double-to-float v0, v0

    .line 3820
    iput v0, v3, Lw3/c;->t:F

    .line 3821
    .line 3822
    goto :goto_51

    .line 3823
    :pswitch_21
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3824
    .line 3825
    .line 3826
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3827
    .line 3828
    double-to-float v0, v0

    .line 3829
    iput v0, v3, Lw3/c;->s:F

    .line 3830
    .line 3831
    goto :goto_51

    .line 3832
    :pswitch_22
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3833
    .line 3834
    .line 3835
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3836
    .line 3837
    double-to-float v0, v0

    .line 3838
    iput v0, v3, Lw3/c;->M:F

    .line 3839
    .line 3840
    goto :goto_51

    .line 3841
    :pswitch_23
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3842
    .line 3843
    .line 3844
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3845
    .line 3846
    double-to-float v0, v0

    .line 3847
    iput v0, v3, Lw3/c;->L:F

    .line 3848
    .line 3849
    goto :goto_51

    .line 3850
    :pswitch_24
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3851
    .line 3852
    .line 3853
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3854
    .line 3855
    double-to-float v0, v0

    .line 3856
    iput v0, v3, Lw3/c;->K:F

    .line 3857
    .line 3858
    goto :goto_51

    .line 3859
    :pswitch_25
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3860
    .line 3861
    .line 3862
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3863
    .line 3864
    double-to-float v0, v0

    .line 3865
    iput v0, v3, Lw3/c;->J:F

    .line 3866
    .line 3867
    goto :goto_51

    .line 3868
    :pswitch_26
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3869
    .line 3870
    .line 3871
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3872
    .line 3873
    double-to-float v0, v0

    .line 3874
    iput v0, v3, Lw3/c;->I:F

    .line 3875
    .line 3876
    goto :goto_51

    .line 3877
    :pswitch_27
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3878
    .line 3879
    .line 3880
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3881
    .line 3882
    double-to-float v0, v0

    .line 3883
    iput v0, v3, Lw3/c;->H:F

    .line 3884
    .line 3885
    goto :goto_51

    .line 3886
    :pswitch_28
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3887
    .line 3888
    .line 3889
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3890
    .line 3891
    double-to-float v0, v0

    .line 3892
    iput v0, v3, Lw3/c;->G:F

    .line 3893
    .line 3894
    goto :goto_51

    .line 3895
    :pswitch_29
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3896
    .line 3897
    .line 3898
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3899
    .line 3900
    double-to-float v0, v0

    .line 3901
    iput v0, v3, Lw3/c;->F:F

    .line 3902
    .line 3903
    goto :goto_51

    .line 3904
    :pswitch_2a
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3905
    .line 3906
    .line 3907
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3908
    .line 3909
    double-to-float v0, v0

    .line 3910
    iput v0, v3, Lw3/c;->E:F

    .line 3911
    .line 3912
    goto :goto_51

    .line 3913
    :pswitch_2b
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3914
    .line 3915
    .line 3916
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3917
    .line 3918
    double-to-float v0, v0

    .line 3919
    iput v0, v3, Lw3/c;->D:F

    .line 3920
    .line 3921
    goto :goto_51

    .line 3922
    :cond_91
    double-to-long v0, v0

    .line 3923
    iput-wide v0, v3, Lw3/d;->s:J

    .line 3924
    .line 3925
    goto :goto_51

    .line 3926
    :cond_92
    invoke-virtual {v3, v4}, Lw3/d;->d(I)V

    .line 3927
    .line 3928
    .line 3929
    iget-object v3, v3, Lw3/d;->u:Lw3/c;

    .line 3930
    .line 3931
    double-to-int v0, v0

    .line 3932
    iput v0, v3, Lw3/c;->Q:I

    .line 3933
    .line 3934
    goto/16 :goto_51

    .line 3935
    .line 3936
    :goto_52
    iput v13, v15, Lw3/b;->e:I

    .line 3937
    .line 3938
    :goto_53
    const/4 v4, 0x5

    .line 3939
    goto/16 :goto_46

    .line 3940
    .line 3941
    :cond_93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3942
    .line 3943
    const-string v2, "Invalid element type "

    .line 3944
    .line 3945
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3946
    .line 3947
    .line 3948
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3949
    .line 3950
    .line 3951
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3952
    .line 3953
    .line 3954
    move-result-object v0

    .line 3955
    const/4 v1, 0x0

    .line 3956
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 3957
    .line 3958
    .line 3959
    move-result-object v0

    .line 3960
    throw v0

    .line 3961
    :cond_94
    move v12, v0

    .line 3962
    iget-object v0, v15, Lw3/b;->d:Li/G;

    .line 3963
    .line 3964
    iget v1, v15, Lw3/b;->f:I

    .line 3965
    .line 3966
    iget-wide v3, v15, Lw3/b;->g:J

    .line 3967
    .line 3968
    long-to-int v3, v3

    .line 3969
    move-object/from16 v4, p1

    .line 3970
    .line 3971
    check-cast v4, Lq3/g;

    .line 3972
    .line 3973
    invoke-virtual {v0, v1, v3, v4}, Li/G;->i(IILq3/g;)V

    .line 3974
    .line 3975
    .line 3976
    const/4 v13, 0x0

    .line 3977
    iput v13, v15, Lw3/b;->e:I

    .line 3978
    .line 3979
    goto :goto_53

    .line 3980
    :cond_95
    const/4 v12, 0x4

    .line 3981
    iget-wide v0, v15, Lw3/b;->g:J

    .line 3982
    .line 3983
    const-wide/32 v3, 0x7fffffff

    .line 3984
    .line 3985
    .line 3986
    cmp-long v3, v0, v3

    .line 3987
    .line 3988
    if-gtz v3, :cond_9e

    .line 3989
    .line 3990
    iget-object v3, v15, Lw3/b;->d:Li/G;

    .line 3991
    .line 3992
    iget v4, v15, Lw3/b;->f:I

    .line 3993
    .line 3994
    long-to-int v0, v0

    .line 3995
    if-nez v0, :cond_96

    .line 3996
    .line 3997
    const-string v0, ""

    .line 3998
    .line 3999
    goto :goto_55

    .line 4000
    :cond_96
    new-array v1, v0, [B

    .line 4001
    .line 4002
    move-object/from16 v10, p1

    .line 4003
    .line 4004
    check-cast v10, Lq3/g;

    .line 4005
    .line 4006
    const/4 v13, 0x0

    .line 4007
    invoke-virtual {v10, v1, v13, v0}, Lq3/g;->readFully([BII)V

    .line 4008
    .line 4009
    .line 4010
    :goto_54
    if-lez v0, :cond_97

    .line 4011
    .line 4012
    const/16 v30, 0x1

    .line 4013
    .line 4014
    add-int/lit8 v10, v0, -0x1

    .line 4015
    .line 4016
    aget-byte v10, v1, v10

    .line 4017
    .line 4018
    if-nez v10, :cond_97

    .line 4019
    .line 4020
    const/16 v29, -0x1

    .line 4021
    .line 4022
    add-int/lit8 v0, v0, -0x1

    .line 4023
    .line 4024
    goto :goto_54

    .line 4025
    :cond_97
    new-instance v10, Ljava/lang/String;

    .line 4026
    .line 4027
    invoke-direct {v10, v1, v13, v0}, Ljava/lang/String;-><init>([BII)V

    .line 4028
    .line 4029
    .line 4030
    move-object v0, v10

    .line 4031
    :goto_55
    iget-object v1, v3, Li/G;->b:Ljava/lang/Object;

    .line 4032
    .line 4033
    check-cast v1, Lw3/d;

    .line 4034
    .line 4035
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4036
    .line 4037
    .line 4038
    const/16 v3, 0x86

    .line 4039
    .line 4040
    if-eq v4, v3, :cond_9d

    .line 4041
    .line 4042
    const/16 v3, 0x4282

    .line 4043
    .line 4044
    if-eq v4, v3, :cond_9b

    .line 4045
    .line 4046
    const/16 v3, 0x536e

    .line 4047
    .line 4048
    if-eq v4, v3, :cond_9a

    .line 4049
    .line 4050
    const v3, 0x22b59c

    .line 4051
    .line 4052
    .line 4053
    if-eq v4, v3, :cond_98

    .line 4054
    .line 4055
    goto :goto_56

    .line 4056
    :cond_98
    invoke-virtual {v1, v4}, Lw3/d;->d(I)V

    .line 4057
    .line 4058
    .line 4059
    iget-object v1, v1, Lw3/d;->u:Lw3/c;

    .line 4060
    .line 4061
    iput-object v0, v1, Lw3/c;->W:Ljava/lang/String;

    .line 4062
    .line 4063
    :cond_99
    :goto_56
    const/4 v13, 0x0

    .line 4064
    goto :goto_57

    .line 4065
    :cond_9a
    invoke-virtual {v1, v4}, Lw3/d;->d(I)V

    .line 4066
    .line 4067
    .line 4068
    iget-object v1, v1, Lw3/d;->u:Lw3/c;

    .line 4069
    .line 4070
    iput-object v0, v1, Lw3/c;->a:Ljava/lang/String;

    .line 4071
    .line 4072
    goto :goto_56

    .line 4073
    :cond_9b
    const-string v1, "webm"

    .line 4074
    .line 4075
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4076
    .line 4077
    .line 4078
    move-result v1

    .line 4079
    if-nez v1, :cond_99

    .line 4080
    .line 4081
    const-string v1, "matroska"

    .line 4082
    .line 4083
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4084
    .line 4085
    .line 4086
    move-result v1

    .line 4087
    if-eqz v1, :cond_9c

    .line 4088
    .line 4089
    goto :goto_56

    .line 4090
    :cond_9c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4091
    .line 4092
    const-string v2, "DocType "

    .line 4093
    .line 4094
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4095
    .line 4096
    .line 4097
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4098
    .line 4099
    .line 4100
    const-string v0, " not supported"

    .line 4101
    .line 4102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4103
    .line 4104
    .line 4105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4106
    .line 4107
    .line 4108
    move-result-object v0

    .line 4109
    const/4 v1, 0x0

    .line 4110
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 4111
    .line 4112
    .line 4113
    move-result-object v0

    .line 4114
    throw v0

    .line 4115
    :cond_9d
    invoke-virtual {v1, v4}, Lw3/d;->d(I)V

    .line 4116
    .line 4117
    .line 4118
    iget-object v1, v1, Lw3/d;->u:Lw3/c;

    .line 4119
    .line 4120
    iput-object v0, v1, Lw3/c;->b:Ljava/lang/String;

    .line 4121
    .line 4122
    goto :goto_56

    .line 4123
    :goto_57
    iput v13, v15, Lw3/b;->e:I

    .line 4124
    .line 4125
    goto/16 :goto_53

    .line 4126
    .line 4127
    :cond_9e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4128
    .line 4129
    const-string v1, "String element size: "

    .line 4130
    .line 4131
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4132
    .line 4133
    .line 4134
    iget-wide v1, v15, Lw3/b;->g:J

    .line 4135
    .line 4136
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4137
    .line 4138
    .line 4139
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4140
    .line 4141
    .line 4142
    move-result-object v0

    .line 4143
    const/4 v1, 0x0

    .line 4144
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 4145
    .line 4146
    .line 4147
    move-result-object v0

    .line 4148
    throw v0

    .line 4149
    :cond_9f
    const/4 v8, 0x3

    .line 4150
    const/4 v12, 0x4

    .line 4151
    iget-wide v0, v15, Lw3/b;->g:J

    .line 4152
    .line 4153
    cmp-long v3, v0, v3

    .line 4154
    .line 4155
    if-gtz v3, :cond_a0

    .line 4156
    .line 4157
    iget-object v3, v15, Lw3/b;->d:Li/G;

    .line 4158
    .line 4159
    iget v4, v15, Lw3/b;->f:I

    .line 4160
    .line 4161
    long-to-int v0, v0

    .line 4162
    move-object/from16 v1, p1

    .line 4163
    .line 4164
    check-cast v1, Lq3/g;

    .line 4165
    .line 4166
    invoke-virtual {v15, v1, v0}, Lw3/b;->a(Lq3/g;I)J

    .line 4167
    .line 4168
    .line 4169
    move-result-wide v0

    .line 4170
    invoke-virtual {v3, v0, v1, v4}, Li/G;->p(JI)V

    .line 4171
    .line 4172
    .line 4173
    const/4 v13, 0x0

    .line 4174
    iput v13, v15, Lw3/b;->e:I

    .line 4175
    .line 4176
    goto/16 :goto_53

    .line 4177
    .line 4178
    :cond_a0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4179
    .line 4180
    const-string v1, "Invalid integer size: "

    .line 4181
    .line 4182
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4183
    .line 4184
    .line 4185
    iget-wide v1, v15, Lw3/b;->g:J

    .line 4186
    .line 4187
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4188
    .line 4189
    .line 4190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4191
    .line 4192
    .line 4193
    move-result-object v0

    .line 4194
    const/4 v1, 0x0

    .line 4195
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 4196
    .line 4197
    .line 4198
    move-result-object v0

    .line 4199
    throw v0

    .line 4200
    :cond_a1
    const/4 v7, 0x2

    .line 4201
    const/4 v8, 0x3

    .line 4202
    const/4 v12, 0x4

    .line 4203
    move-object/from16 v1, p1

    .line 4204
    .line 4205
    check-cast v1, Lq3/g;

    .line 4206
    .line 4207
    invoke-virtual {v1}, Lq3/g;->E()J

    .line 4208
    .line 4209
    .line 4210
    move-result-wide v7

    .line 4211
    iget-wide v3, v15, Lw3/b;->g:J

    .line 4212
    .line 4213
    add-long/2addr v3, v7

    .line 4214
    new-instance v11, Lw3/a;

    .line 4215
    .line 4216
    iget v1, v15, Lw3/b;->f:I

    .line 4217
    .line 4218
    invoke-direct {v11, v3, v4, v1}, Lw3/a;-><init>(JI)V

    .line 4219
    .line 4220
    .line 4221
    invoke-virtual {v10, v11}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 4222
    .line 4223
    .line 4224
    iget-object v1, v15, Lw3/b;->d:Li/G;

    .line 4225
    .line 4226
    iget v3, v15, Lw3/b;->f:I

    .line 4227
    .line 4228
    iget-wide v10, v15, Lw3/b;->g:J

    .line 4229
    .line 4230
    iget-object v1, v1, Li/G;->b:Ljava/lang/Object;

    .line 4231
    .line 4232
    check-cast v1, Lw3/d;

    .line 4233
    .line 4234
    iget-object v4, v1, Lw3/d;->b0:Lq3/l;

    .line 4235
    .line 4236
    invoke-static {v4}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4237
    .line 4238
    .line 4239
    if-eq v3, v13, :cond_ae

    .line 4240
    .line 4241
    if-eq v3, v0, :cond_ad

    .line 4242
    .line 4243
    const/16 v0, 0xbb

    .line 4244
    .line 4245
    if-eq v3, v0, :cond_ac

    .line 4246
    .line 4247
    const/16 v0, 0x4dbb

    .line 4248
    .line 4249
    if-eq v3, v0, :cond_ab

    .line 4250
    .line 4251
    const/16 v0, 0x5035

    .line 4252
    .line 4253
    if-eq v3, v0, :cond_aa

    .line 4254
    .line 4255
    const/16 v0, 0x55d0

    .line 4256
    .line 4257
    if-eq v3, v0, :cond_a9

    .line 4258
    .line 4259
    const v0, 0x18538067

    .line 4260
    .line 4261
    .line 4262
    if-eq v3, v0, :cond_a6

    .line 4263
    .line 4264
    if-eq v3, v14, :cond_a5

    .line 4265
    .line 4266
    const v0, 0x1f43b675

    .line 4267
    .line 4268
    .line 4269
    if-eq v3, v0, :cond_a2

    .line 4270
    .line 4271
    goto :goto_58

    .line 4272
    :cond_a2
    iget-boolean v0, v1, Lw3/d;->v:Z

    .line 4273
    .line 4274
    if-nez v0, :cond_a3

    .line 4275
    .line 4276
    iget-boolean v0, v1, Lw3/d;->d:Z

    .line 4277
    .line 4278
    if-eqz v0, :cond_a4

    .line 4279
    .line 4280
    iget-wide v3, v1, Lw3/d;->z:J

    .line 4281
    .line 4282
    cmp-long v0, v3, v36

    .line 4283
    .line 4284
    if-eqz v0, :cond_a4

    .line 4285
    .line 4286
    const/4 v7, 0x1

    .line 4287
    iput-boolean v7, v1, Lw3/d;->y:Z

    .line 4288
    .line 4289
    :cond_a3
    :goto_58
    const/4 v4, 0x5

    .line 4290
    :goto_59
    const/4 v13, 0x0

    .line 4291
    goto/16 :goto_5b

    .line 4292
    .line 4293
    :cond_a4
    const/4 v7, 0x1

    .line 4294
    iget-object v0, v1, Lw3/d;->b0:Lq3/l;

    .line 4295
    .line 4296
    new-instance v3, Lq3/m;

    .line 4297
    .line 4298
    iget-wide v10, v1, Lw3/d;->t:J

    .line 4299
    .line 4300
    invoke-direct {v3, v10, v11}, Lq3/m;-><init>(J)V

    .line 4301
    .line 4302
    .line 4303
    invoke-interface {v0, v3}, Lq3/l;->r(Lq3/r;)V

    .line 4304
    .line 4305
    .line 4306
    iput-boolean v7, v1, Lw3/d;->v:Z

    .line 4307
    .line 4308
    goto :goto_58

    .line 4309
    :cond_a5
    new-instance v0, LA1/i;

    .line 4310
    .line 4311
    const/4 v4, 0x5

    .line 4312
    invoke-direct {v0, v4}, LA1/i;-><init>(I)V

    .line 4313
    .line 4314
    .line 4315
    iput-object v0, v1, Lw3/d;->C:LA1/i;

    .line 4316
    .line 4317
    new-instance v0, LA1/i;

    .line 4318
    .line 4319
    invoke-direct {v0, v4}, LA1/i;-><init>(I)V

    .line 4320
    .line 4321
    .line 4322
    iput-object v0, v1, Lw3/d;->D:LA1/i;

    .line 4323
    .line 4324
    goto :goto_59

    .line 4325
    :cond_a6
    const/4 v4, 0x5

    .line 4326
    iget-wide v13, v1, Lw3/d;->q:J

    .line 4327
    .line 4328
    cmp-long v0, v13, v36

    .line 4329
    .line 4330
    if-eqz v0, :cond_a8

    .line 4331
    .line 4332
    cmp-long v0, v13, v7

    .line 4333
    .line 4334
    if-nez v0, :cond_a7

    .line 4335
    .line 4336
    goto :goto_5a

    .line 4337
    :cond_a7
    const-string v0, "Multiple Segment elements not supported"

    .line 4338
    .line 4339
    const/4 v1, 0x0

    .line 4340
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 4341
    .line 4342
    .line 4343
    move-result-object v0

    .line 4344
    throw v0

    .line 4345
    :cond_a8
    :goto_5a
    iput-wide v7, v1, Lw3/d;->q:J

    .line 4346
    .line 4347
    iput-wide v10, v1, Lw3/d;->p:J

    .line 4348
    .line 4349
    goto :goto_59

    .line 4350
    :cond_a9
    const/4 v4, 0x5

    .line 4351
    invoke-virtual {v1, v3}, Lw3/d;->d(I)V

    .line 4352
    .line 4353
    .line 4354
    iget-object v0, v1, Lw3/d;->u:Lw3/c;

    .line 4355
    .line 4356
    const/4 v7, 0x1

    .line 4357
    iput-boolean v7, v0, Lw3/c;->x:Z

    .line 4358
    .line 4359
    goto :goto_59

    .line 4360
    :cond_aa
    const/4 v4, 0x5

    .line 4361
    const/4 v7, 0x1

    .line 4362
    invoke-virtual {v1, v3}, Lw3/d;->d(I)V

    .line 4363
    .line 4364
    .line 4365
    iget-object v0, v1, Lw3/d;->u:Lw3/c;

    .line 4366
    .line 4367
    iput-boolean v7, v0, Lw3/c;->h:Z

    .line 4368
    .line 4369
    goto :goto_59

    .line 4370
    :cond_ab
    const/4 v3, -0x1

    .line 4371
    const/4 v4, 0x5

    .line 4372
    iput v3, v1, Lw3/d;->w:I

    .line 4373
    .line 4374
    move-wide/from16 v7, v36

    .line 4375
    .line 4376
    iput-wide v7, v1, Lw3/d;->x:J

    .line 4377
    .line 4378
    goto :goto_59

    .line 4379
    :cond_ac
    const/4 v3, -0x1

    .line 4380
    const/4 v4, 0x5

    .line 4381
    const/4 v13, 0x0

    .line 4382
    iput-boolean v13, v1, Lw3/d;->E:Z

    .line 4383
    .line 4384
    goto :goto_5b

    .line 4385
    :cond_ad
    const/4 v3, -0x1

    .line 4386
    const/4 v4, 0x5

    .line 4387
    const/4 v13, 0x0

    .line 4388
    new-instance v0, Lw3/c;

    .line 4389
    .line 4390
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4391
    .line 4392
    .line 4393
    iput v3, v0, Lw3/c;->m:I

    .line 4394
    .line 4395
    iput v3, v0, Lw3/c;->n:I

    .line 4396
    .line 4397
    iput v3, v0, Lw3/c;->o:I

    .line 4398
    .line 4399
    iput v3, v0, Lw3/c;->p:I

    .line 4400
    .line 4401
    iput v13, v0, Lw3/c;->q:I

    .line 4402
    .line 4403
    iput v3, v0, Lw3/c;->r:I

    .line 4404
    .line 4405
    const/4 v11, 0x0

    .line 4406
    iput v11, v0, Lw3/c;->s:F

    .line 4407
    .line 4408
    iput v11, v0, Lw3/c;->t:F

    .line 4409
    .line 4410
    iput v11, v0, Lw3/c;->u:F

    .line 4411
    .line 4412
    const/4 v8, 0x0

    .line 4413
    iput-object v8, v0, Lw3/c;->v:[B

    .line 4414
    .line 4415
    iput v3, v0, Lw3/c;->w:I

    .line 4416
    .line 4417
    iput-boolean v13, v0, Lw3/c;->x:Z

    .line 4418
    .line 4419
    iput v3, v0, Lw3/c;->y:I

    .line 4420
    .line 4421
    iput v3, v0, Lw3/c;->z:I

    .line 4422
    .line 4423
    iput v3, v0, Lw3/c;->A:I

    .line 4424
    .line 4425
    const/16 v7, 0x3e8

    .line 4426
    .line 4427
    iput v7, v0, Lw3/c;->B:I

    .line 4428
    .line 4429
    const/16 v3, 0xc8

    .line 4430
    .line 4431
    iput v3, v0, Lw3/c;->C:I

    .line 4432
    .line 4433
    move/from16 v3, v26

    .line 4434
    .line 4435
    iput v3, v0, Lw3/c;->D:F

    .line 4436
    .line 4437
    iput v3, v0, Lw3/c;->E:F

    .line 4438
    .line 4439
    iput v3, v0, Lw3/c;->F:F

    .line 4440
    .line 4441
    iput v3, v0, Lw3/c;->G:F

    .line 4442
    .line 4443
    iput v3, v0, Lw3/c;->H:F

    .line 4444
    .line 4445
    iput v3, v0, Lw3/c;->I:F

    .line 4446
    .line 4447
    iput v3, v0, Lw3/c;->J:F

    .line 4448
    .line 4449
    iput v3, v0, Lw3/c;->K:F

    .line 4450
    .line 4451
    iput v3, v0, Lw3/c;->L:F

    .line 4452
    .line 4453
    iput v3, v0, Lw3/c;->M:F

    .line 4454
    .line 4455
    const/4 v7, 0x1

    .line 4456
    iput v7, v0, Lw3/c;->O:I

    .line 4457
    .line 4458
    const/4 v3, -0x1

    .line 4459
    iput v3, v0, Lw3/c;->P:I

    .line 4460
    .line 4461
    const/16 v3, 0x1f40

    .line 4462
    .line 4463
    iput v3, v0, Lw3/c;->Q:I

    .line 4464
    .line 4465
    move-wide/from16 v10, v32

    .line 4466
    .line 4467
    iput-wide v10, v0, Lw3/c;->R:J

    .line 4468
    .line 4469
    iput-wide v10, v0, Lw3/c;->S:J

    .line 4470
    .line 4471
    iput-boolean v7, v0, Lw3/c;->V:Z

    .line 4472
    .line 4473
    const-string v3, "eng"

    .line 4474
    .line 4475
    iput-object v3, v0, Lw3/c;->W:Ljava/lang/String;

    .line 4476
    .line 4477
    iput-object v0, v1, Lw3/d;->u:Lw3/c;

    .line 4478
    .line 4479
    goto/16 :goto_59

    .line 4480
    .line 4481
    :cond_ae
    move-wide/from16 v10, v32

    .line 4482
    .line 4483
    const/4 v4, 0x5

    .line 4484
    const/4 v13, 0x0

    .line 4485
    iput-boolean v13, v1, Lw3/d;->Q:Z

    .line 4486
    .line 4487
    iput-wide v10, v1, Lw3/d;->R:J

    .line 4488
    .line 4489
    :goto_5b
    iput v13, v15, Lw3/b;->e:I

    .line 4490
    .line 4491
    goto/16 :goto_46

    .line 4492
    .line 4493
    :goto_5c
    if-eqz v20, :cond_af

    .line 4494
    .line 4495
    move-object/from16 v0, p1

    .line 4496
    .line 4497
    check-cast v0, Lq3/g;

    .line 4498
    .line 4499
    invoke-virtual {v0}, Lq3/g;->E()J

    .line 4500
    .line 4501
    .line 4502
    move-result-wide v0

    .line 4503
    move-object/from16 v3, p0

    .line 4504
    .line 4505
    move-object/from16 v7, p2

    .line 4506
    .line 4507
    invoke-virtual {v3, v7, v0, v1}, Lw3/d;->h(Lc7/j;J)Z

    .line 4508
    .line 4509
    .line 4510
    move-result v0

    .line 4511
    if-eqz v0, :cond_b0

    .line 4512
    .line 4513
    const/16 v30, 0x1

    .line 4514
    .line 4515
    return v30

    .line 4516
    :cond_af
    move-object/from16 v3, p0

    .line 4517
    .line 4518
    move-object/from16 v7, p2

    .line 4519
    .line 4520
    :cond_b0
    move-object v9, v2

    .line 4521
    move-object v0, v3

    .line 4522
    move-object v4, v5

    .line 4523
    move-object v5, v6

    .line 4524
    move-object/from16 v6, v38

    .line 4525
    .line 4526
    move-object/from16 v1, v48

    .line 4527
    .line 4528
    move-object/from16 v2, v49

    .line 4529
    .line 4530
    move-object/from16 v3, v50

    .line 4531
    .line 4532
    const/4 v10, 0x0

    .line 4533
    const/16 v18, 0x2

    .line 4534
    .line 4535
    goto/16 :goto_0

    .line 4536
    .line 4537
    :cond_b1
    const/4 v4, 0x5

    .line 4538
    const/4 v12, 0x4

    .line 4539
    move-object/from16 v3, p0

    .line 4540
    .line 4541
    move-object/from16 v7, p2

    .line 4542
    .line 4543
    iget-wide v0, v15, Lw3/b;->g:J

    .line 4544
    .line 4545
    long-to-int v0, v0

    .line 4546
    move-object/from16 v1, p1

    .line 4547
    .line 4548
    check-cast v1, Lq3/g;

    .line 4549
    .line 4550
    invoke-virtual {v1, v0}, Lq3/g;->n(I)V

    .line 4551
    .line 4552
    .line 4553
    const/4 v13, 0x0

    .line 4554
    iput v13, v15, Lw3/b;->e:I

    .line 4555
    .line 4556
    move-object v9, v2

    .line 4557
    move-object v0, v3

    .line 4558
    move-object v4, v5

    .line 4559
    move-object v5, v6

    .line 4560
    move-object/from16 v6, v38

    .line 4561
    .line 4562
    move-object/from16 v1, v48

    .line 4563
    .line 4564
    move-object/from16 v2, v49

    .line 4565
    .line 4566
    move-object/from16 v3, v50

    .line 4567
    .line 4568
    const/16 v18, 0x2

    .line 4569
    .line 4570
    const/16 v22, 0x0

    .line 4571
    .line 4572
    goto/16 :goto_1

    .line 4573
    .line 4574
    :cond_b2
    move-object v3, v0

    .line 4575
    if-nez v20, :cond_b5

    .line 4576
    .line 4577
    const/4 v10, 0x0

    .line 4578
    :goto_5d
    iget-object v0, v3, Lw3/d;->c:Landroid/util/SparseArray;

    .line 4579
    .line 4580
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4581
    .line 4582
    .line 4583
    move-result v1

    .line 4584
    if-ge v10, v1, :cond_b4

    .line 4585
    .line 4586
    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 4587
    .line 4588
    .line 4589
    move-result-object v0

    .line 4590
    check-cast v0, Lw3/c;

    .line 4591
    .line 4592
    iget-object v1, v0, Lw3/c;->X:Lq3/u;

    .line 4593
    .line 4594
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4595
    .line 4596
    .line 4597
    iget-object v1, v0, Lw3/c;->T:Lq3/v;

    .line 4598
    .line 4599
    if-eqz v1, :cond_b3

    .line 4600
    .line 4601
    iget-object v2, v0, Lw3/c;->X:Lq3/u;

    .line 4602
    .line 4603
    iget-object v0, v0, Lw3/c;->j:Lq3/t;

    .line 4604
    .line 4605
    invoke-virtual {v1, v2, v0}, Lq3/v;->a(Lq3/u;Lq3/t;)V

    .line 4606
    .line 4607
    .line 4608
    :cond_b3
    const/16 v30, 0x1

    .line 4609
    .line 4610
    add-int/lit8 v10, v10, 0x1

    .line 4611
    .line 4612
    goto :goto_5d

    .line 4613
    :cond_b4
    const/16 v29, -0x1

    .line 4614
    .line 4615
    return v29

    .line 4616
    :cond_b5
    const/16 v22, 0x0

    .line 4617
    .line 4618
    return v22

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_41
        -0x7ce7f3b0 -> :sswitch_40
        -0x76567dc0 -> :sswitch_3f
        -0x6a615338 -> :sswitch_3e
        -0x672350af -> :sswitch_3d
        -0x585f4fce -> :sswitch_3c
        -0x585f4fcd -> :sswitch_3b
        -0x51dc40b2 -> :sswitch_3a
        -0x37a9c464 -> :sswitch_39
        -0x2016c535 -> :sswitch_38
        -0x2016c4e5 -> :sswitch_37
        -0x19552dbd -> :sswitch_36
        -0x1538b2ba -> :sswitch_35
        0x3c02325 -> :sswitch_34
        0x3c02353 -> :sswitch_33
        0x3c030c5 -> :sswitch_32
        0x4e81333 -> :sswitch_31
        0x4e86155 -> :sswitch_30
        0x4e86156 -> :sswitch_2f
        0x5e8da3e -> :sswitch_2e
        0x1a8350d6 -> :sswitch_2d
        0x2056f406 -> :sswitch_2c
        0x25e26ee2 -> :sswitch_2b
        0x2b45174d -> :sswitch_2a
        0x2b453ce4 -> :sswitch_29
        0x2c0618eb -> :sswitch_28
        0x32fdf009 -> :sswitch_27
        0x3e4ca2d8 -> :sswitch_26
        0x54c61e47 -> :sswitch_25
        0x6bd6c624 -> :sswitch_24
        0x7446132a -> :sswitch_23
        0x7446b0a6 -> :sswitch_22
        0x744ad97d -> :sswitch_21
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1e
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x83 -> :sswitch_46
        0x86 -> :sswitch_45
        0x88 -> :sswitch_46
        0x9b -> :sswitch_46
        0x9f -> :sswitch_46
        0xa0 -> :sswitch_44
        0xa1 -> :sswitch_43
        0xa3 -> :sswitch_43
        0xa5 -> :sswitch_43
        0xa6 -> :sswitch_44
        0xae -> :sswitch_44
        0xb0 -> :sswitch_46
        0xb3 -> :sswitch_46
        0xb5 -> :sswitch_42
        0xb7 -> :sswitch_44
        0xba -> :sswitch_46
        0xbb -> :sswitch_44
        0xd7 -> :sswitch_46
        0xe0 -> :sswitch_44
        0xe1 -> :sswitch_44
        0xe7 -> :sswitch_46
        0xee -> :sswitch_46
        0xf1 -> :sswitch_46
        0xfb -> :sswitch_46
        0x41e4 -> :sswitch_44
        0x41e7 -> :sswitch_46
        0x41ed -> :sswitch_43
        0x4254 -> :sswitch_46
        0x4255 -> :sswitch_43
        0x4282 -> :sswitch_45
        0x4285 -> :sswitch_46
        0x42f7 -> :sswitch_46
        0x4489 -> :sswitch_42
        0x47e1 -> :sswitch_46
        0x47e2 -> :sswitch_43
        0x47e7 -> :sswitch_44
        0x47e8 -> :sswitch_46
        0x4dbb -> :sswitch_44
        0x5031 -> :sswitch_46
        0x5032 -> :sswitch_46
        0x5034 -> :sswitch_44
        0x5035 -> :sswitch_44
        0x536e -> :sswitch_45
        0x53ab -> :sswitch_43
        0x53ac -> :sswitch_46
        0x53b8 -> :sswitch_46
        0x54b0 -> :sswitch_46
        0x54b2 -> :sswitch_46
        0x54ba -> :sswitch_46
        0x55aa -> :sswitch_46
        0x55b0 -> :sswitch_44
        0x55b9 -> :sswitch_46
        0x55ba -> :sswitch_46
        0x55bb -> :sswitch_46
        0x55bc -> :sswitch_46
        0x55bd -> :sswitch_46
        0x55d0 -> :sswitch_44
        0x55d1 -> :sswitch_42
        0x55d2 -> :sswitch_42
        0x55d3 -> :sswitch_42
        0x55d4 -> :sswitch_42
        0x55d5 -> :sswitch_42
        0x55d6 -> :sswitch_42
        0x55d7 -> :sswitch_42
        0x55d8 -> :sswitch_42
        0x55d9 -> :sswitch_42
        0x55da -> :sswitch_42
        0x55ee -> :sswitch_46
        0x56aa -> :sswitch_46
        0x56bb -> :sswitch_46
        0x6240 -> :sswitch_44
        0x6264 -> :sswitch_46
        0x63a2 -> :sswitch_43
        0x6d80 -> :sswitch_44
        0x75a1 -> :sswitch_44
        0x75a2 -> :sswitch_46
        0x7670 -> :sswitch_44
        0x7671 -> :sswitch_46
        0x7672 -> :sswitch_43
        0x7673 -> :sswitch_42
        0x7674 -> :sswitch_42
        0x7675 -> :sswitch_42
        0x22b59c -> :sswitch_45
        0x23e383 -> :sswitch_46
        0x2ad7b1 -> :sswitch_46
        0x114d9b74 -> :sswitch_44
        0x1549a966 -> :sswitch_44
        0x1654ae6b -> :sswitch_44
        0x18538067 -> :sswitch_44
        0x1a45dfa3 -> :sswitch_44
        0x1c53bb6b -> :sswitch_44
        0x1f43b675 -> :sswitch_44
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55d1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7673
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch
.end method

.method public final h(Lc7/j;J)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lw3/d;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-wide p2, p0, Lw3/d;->A:J

    .line 8
    .line 9
    iget-wide p2, p0, Lw3/d;->z:J

    .line 10
    .line 11
    iput-wide p2, p1, Lc7/j;->a:J

    .line 12
    .line 13
    iput-boolean v2, p0, Lw3/d;->y:Z

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-boolean p2, p0, Lw3/d;->v:Z

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-wide p2, p0, Lw3/d;->A:J

    .line 21
    .line 22
    const-wide/16 v3, -0x1

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-wide p2, p1, Lc7/j;->a:J

    .line 29
    .line 30
    iput-wide v3, p0, Lw3/d;->A:J

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    return v2
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final i(Lq3/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/d;->b0:Lq3/l;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final j(Lq3/k;)Z
    .locals 16

    .line 1
    new-instance v0, LA1/i;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, LA1/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    check-cast v1, Lq3/g;

    .line 10
    .line 11
    const-wide/16 v2, -0x1

    .line 12
    .line 13
    iget-wide v4, v1, Lq3/g;->c:J

    .line 14
    .line 15
    cmp-long v2, v4, v2

    .line 16
    .line 17
    const-wide/16 v6, 0x400

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    cmp-long v3, v4, v6

    .line 22
    .line 23
    if-lez v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide v6, v4

    .line 27
    :cond_1
    :goto_0
    long-to-int v3, v6

    .line 28
    iget-object v6, v0, LA1/i;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v6, LA4/r;

    .line 31
    .line 32
    iget-object v7, v6, LA4/r;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v7, [B

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x4

    .line 38
    invoke-virtual {v1, v7, v8, v9, v8}, Lq3/g;->t([BIIZ)Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6}, LA4/r;->y()J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    iput v9, v0, LA1/i;->a:I

    .line 46
    .line 47
    :goto_1
    const-wide/32 v12, 0x1a45dfa3

    .line 48
    .line 49
    .line 50
    cmp-long v7, v10, v12

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v7, :cond_3

    .line 54
    .line 55
    iget v7, v0, LA1/i;->a:I

    .line 56
    .line 57
    add-int/2addr v7, v9

    .line 58
    iput v7, v0, LA1/i;->a:I

    .line 59
    .line 60
    if-ne v7, v3, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    iget-object v7, v6, LA4/r;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, [B

    .line 66
    .line 67
    invoke-virtual {v1, v7, v8, v9, v8}, Lq3/g;->t([BIIZ)Z

    .line 68
    .line 69
    .line 70
    const/16 v7, 0x8

    .line 71
    .line 72
    shl-long v9, v10, v7

    .line 73
    .line 74
    const-wide/16 v11, -0x100

    .line 75
    .line 76
    and-long/2addr v9, v11

    .line 77
    iget-object v7, v6, LA4/r;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v7, [B

    .line 80
    .line 81
    aget-byte v7, v7, v8

    .line 82
    .line 83
    and-int/lit16 v7, v7, 0xff

    .line 84
    .line 85
    int-to-long v11, v7

    .line 86
    or-long/2addr v9, v11

    .line 87
    move-wide v10, v9

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {v0, v1}, LA1/i;->k(Lq3/g;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    iget v3, v0, LA1/i;->a:I

    .line 94
    .line 95
    int-to-long v10, v3

    .line 96
    const-wide/high16 v12, -0x8000000000000000L

    .line 97
    .line 98
    cmp-long v3, v6, v12

    .line 99
    .line 100
    if-eqz v3, :cond_8

    .line 101
    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    add-long v2, v10, v6

    .line 105
    .line 106
    cmp-long v2, v2, v4

    .line 107
    .line 108
    if-ltz v2, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    :goto_2
    iget v2, v0, LA1/i;->a:I

    .line 112
    .line 113
    int-to-long v2, v2

    .line 114
    add-long v4, v10, v6

    .line 115
    .line 116
    cmp-long v2, v2, v4

    .line 117
    .line 118
    if-gez v2, :cond_7

    .line 119
    .line 120
    invoke-virtual {v0, v1}, LA1/i;->k(Lq3/g;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    cmp-long v2, v2, v12

    .line 125
    .line 126
    if-nez v2, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-virtual {v0, v1}, LA1/i;->k(Lq3/g;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    cmp-long v4, v2, v4

    .line 136
    .line 137
    if-ltz v4, :cond_8

    .line 138
    .line 139
    const-wide/32 v14, 0x7fffffff

    .line 140
    .line 141
    .line 142
    cmp-long v5, v2, v14

    .line 143
    .line 144
    if-lez v5, :cond_6

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    if-eqz v4, :cond_4

    .line 148
    .line 149
    long-to-int v2, v2

    .line 150
    invoke-virtual {v1, v2, v8}, Lq3/g;->c(IZ)Z

    .line 151
    .line 152
    .line 153
    iget v3, v0, LA1/i;->a:I

    .line 154
    .line 155
    add-int/2addr v3, v2

    .line 156
    iput v3, v0, LA1/i;->a:I

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    if-nez v2, :cond_8

    .line 160
    .line 161
    return v9

    .line 162
    :cond_8
    :goto_3
    return v8
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public final k(Lq3/g;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lw3/d;->g:LA4/r;

    .line 2
    .line 3
    iget v1, v0, LA4/r;->b:I

    .line 4
    .line 5
    if-lt v1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, LA4/r;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [B

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-ge v2, p2, :cond_1

    .line 14
    .line 15
    array-length v1, v1

    .line 16
    mul-int/lit8 v1, v1, 0x2

    .line 17
    .line 18
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, LA4/r;->f(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v1, v0, LA4/r;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, [B

    .line 28
    .line 29
    iget v2, v0, LA4/r;->b:I

    .line 30
    .line 31
    sub-int v3, p2, v2

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {p1, v1, v2, v3, v4}, Lq3/g;->e([BIIZ)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, LA4/r;->G(I)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final l()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lw3/d;->S:I

    .line 3
    .line 4
    iput v0, p0, Lw3/d;->T:I

    .line 5
    .line 6
    iput v0, p0, Lw3/d;->U:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lw3/d;->V:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lw3/d;->W:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lw3/d;->X:Z

    .line 13
    .line 14
    iput v0, p0, Lw3/d;->Y:I

    .line 15
    .line 16
    iput-byte v0, p0, Lw3/d;->Z:B

    .line 17
    .line 18
    iput-boolean v0, p0, Lw3/d;->a0:Z

    .line 19
    .line 20
    iget-object v1, p0, Lw3/d;->j:LA4/r;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LA4/r;->E(I)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final m(J)J
    .locals 6

    .line 1
    iget-wide v2, p0, Lw3/d;->r:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v2, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    move-wide v0, p1

    .line 15
    invoke-static/range {v0 .. v5}, Ll4/y;->O(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    return-wide p1

    .line 20
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p1, p2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    throw p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final n(Lq3/g;Lw3/c;IZ)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v2, Lw3/c;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v5, "S_TEXT/UTF8"

    .line 12
    .line 13
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    sget-object v2, Lw3/d;->c0:[B

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lw3/d;->o(Lq3/g;[BI)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, Lw3/d;->T:I

    .line 25
    .line 26
    invoke-virtual {v0}, Lw3/d;->l()V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const-string v4, "S_TEXT/ASS"

    .line 31
    .line 32
    iget-object v5, v2, Lw3/c;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    sget-object v2, Lw3/d;->e0:[B

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Lw3/d;->o(Lq3/g;[BI)V

    .line 43
    .line 44
    .line 45
    iget v1, v0, Lw3/d;->T:I

    .line 46
    .line 47
    invoke-virtual {v0}, Lw3/d;->l()V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    const-string v4, "S_TEXT/WEBVTT"

    .line 52
    .line 53
    iget-object v5, v2, Lw3/c;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    sget-object v2, Lw3/d;->f0:[B

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, v3}, Lw3/d;->o(Lq3/g;[BI)V

    .line 64
    .line 65
    .line 66
    iget v1, v0, Lw3/d;->T:I

    .line 67
    .line 68
    invoke-virtual {v0}, Lw3/d;->l()V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_2
    iget-object v4, v2, Lw3/c;->X:Lq3/u;

    .line 73
    .line 74
    iget-boolean v5, v0, Lw3/d;->V:Z

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x4

    .line 78
    const/4 v8, 0x1

    .line 79
    iget-object v9, v0, Lw3/d;->j:LA4/r;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    if-nez v5, :cond_13

    .line 83
    .line 84
    iget-boolean v5, v2, Lw3/c;->h:Z

    .line 85
    .line 86
    iget-object v11, v0, Lw3/d;->g:LA4/r;

    .line 87
    .line 88
    if-eqz v5, :cond_e

    .line 89
    .line 90
    iget v5, v0, Lw3/d;->O:I

    .line 91
    .line 92
    const v12, -0x40000001    # -1.9999999f

    .line 93
    .line 94
    .line 95
    and-int/2addr v5, v12

    .line 96
    iput v5, v0, Lw3/d;->O:I

    .line 97
    .line 98
    iget-boolean v5, v0, Lw3/d;->W:Z

    .line 99
    .line 100
    const/16 v12, 0x80

    .line 101
    .line 102
    if-nez v5, :cond_4

    .line 103
    .line 104
    iget-object v5, v11, LA4/r;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, [B

    .line 107
    .line 108
    invoke-virtual {v1, v5, v10, v8, v10}, Lq3/g;->e([BIIZ)Z

    .line 109
    .line 110
    .line 111
    iget v5, v0, Lw3/d;->S:I

    .line 112
    .line 113
    add-int/2addr v5, v8

    .line 114
    iput v5, v0, Lw3/d;->S:I

    .line 115
    .line 116
    iget-object v5, v11, LA4/r;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, [B

    .line 119
    .line 120
    aget-byte v5, v5, v10

    .line 121
    .line 122
    and-int/lit16 v13, v5, 0x80

    .line 123
    .line 124
    if-eq v13, v12, :cond_3

    .line 125
    .line 126
    iput-byte v5, v0, Lw3/d;->Z:B

    .line 127
    .line 128
    iput-boolean v8, v0, Lw3/d;->W:Z

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    const-string v1, "Extension bit is set in signal byte"

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    invoke-static {v1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    throw v1

    .line 139
    :cond_4
    :goto_0
    iget-byte v5, v0, Lw3/d;->Z:B

    .line 140
    .line 141
    and-int/lit8 v13, v5, 0x1

    .line 142
    .line 143
    if-ne v13, v8, :cond_f

    .line 144
    .line 145
    and-int/2addr v5, v6

    .line 146
    if-ne v5, v6, :cond_5

    .line 147
    .line 148
    move v5, v8

    .line 149
    goto :goto_1

    .line 150
    :cond_5
    move v5, v10

    .line 151
    :goto_1
    iget v13, v0, Lw3/d;->O:I

    .line 152
    .line 153
    const/high16 v14, 0x40000000    # 2.0f

    .line 154
    .line 155
    or-int/2addr v13, v14

    .line 156
    iput v13, v0, Lw3/d;->O:I

    .line 157
    .line 158
    iget-boolean v13, v0, Lw3/d;->a0:Z

    .line 159
    .line 160
    if-nez v13, :cond_7

    .line 161
    .line 162
    iget-object v13, v0, Lw3/d;->l:LA4/r;

    .line 163
    .line 164
    iget-object v14, v13, LA4/r;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v14, [B

    .line 167
    .line 168
    const/16 v15, 0x8

    .line 169
    .line 170
    invoke-virtual {v1, v14, v10, v15, v10}, Lq3/g;->e([BIIZ)Z

    .line 171
    .line 172
    .line 173
    iget v14, v0, Lw3/d;->S:I

    .line 174
    .line 175
    add-int/2addr v14, v15

    .line 176
    iput v14, v0, Lw3/d;->S:I

    .line 177
    .line 178
    iput-boolean v8, v0, Lw3/d;->a0:Z

    .line 179
    .line 180
    iget-object v14, v11, LA4/r;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v14, [B

    .line 183
    .line 184
    if-eqz v5, :cond_6

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    move v12, v10

    .line 188
    :goto_2
    or-int/2addr v12, v15

    .line 189
    int-to-byte v12, v12

    .line 190
    aput-byte v12, v14, v10

    .line 191
    .line 192
    invoke-virtual {v11, v10}, LA4/r;->H(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v4, v8, v11}, Lq3/u;->b(ILA4/r;)V

    .line 196
    .line 197
    .line 198
    iget v12, v0, Lw3/d;->T:I

    .line 199
    .line 200
    add-int/2addr v12, v8

    .line 201
    iput v12, v0, Lw3/d;->T:I

    .line 202
    .line 203
    invoke-virtual {v13, v10}, LA4/r;->H(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v4, v15, v13}, Lq3/u;->b(ILA4/r;)V

    .line 207
    .line 208
    .line 209
    iget v12, v0, Lw3/d;->T:I

    .line 210
    .line 211
    add-int/2addr v12, v15

    .line 212
    iput v12, v0, Lw3/d;->T:I

    .line 213
    .line 214
    :cond_7
    if-eqz v5, :cond_f

    .line 215
    .line 216
    iget-boolean v5, v0, Lw3/d;->X:Z

    .line 217
    .line 218
    if-nez v5, :cond_8

    .line 219
    .line 220
    iget-object v5, v11, LA4/r;->c:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v5, [B

    .line 223
    .line 224
    invoke-virtual {v1, v5, v10, v8, v10}, Lq3/g;->e([BIIZ)Z

    .line 225
    .line 226
    .line 227
    iget v5, v0, Lw3/d;->S:I

    .line 228
    .line 229
    add-int/2addr v5, v8

    .line 230
    iput v5, v0, Lw3/d;->S:I

    .line 231
    .line 232
    invoke-virtual {v11, v10}, LA4/r;->H(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v11}, LA4/r;->x()I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    iput v5, v0, Lw3/d;->Y:I

    .line 240
    .line 241
    iput-boolean v8, v0, Lw3/d;->X:Z

    .line 242
    .line 243
    :cond_8
    iget v5, v0, Lw3/d;->Y:I

    .line 244
    .line 245
    mul-int/2addr v5, v7

    .line 246
    invoke-virtual {v11, v5}, LA4/r;->E(I)V

    .line 247
    .line 248
    .line 249
    iget-object v12, v11, LA4/r;->c:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v12, [B

    .line 252
    .line 253
    invoke-virtual {v1, v12, v10, v5, v10}, Lq3/g;->e([BIIZ)Z

    .line 254
    .line 255
    .line 256
    iget v12, v0, Lw3/d;->S:I

    .line 257
    .line 258
    add-int/2addr v12, v5

    .line 259
    iput v12, v0, Lw3/d;->S:I

    .line 260
    .line 261
    iget v5, v0, Lw3/d;->Y:I

    .line 262
    .line 263
    div-int/2addr v5, v6

    .line 264
    add-int/2addr v5, v8

    .line 265
    int-to-short v5, v5

    .line 266
    mul-int/lit8 v12, v5, 0x6

    .line 267
    .line 268
    add-int/2addr v12, v6

    .line 269
    iget-object v13, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 270
    .line 271
    if-eqz v13, :cond_9

    .line 272
    .line 273
    invoke-virtual {v13}, Ljava/nio/Buffer;->capacity()I

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-ge v13, v12, :cond_a

    .line 278
    .line 279
    :cond_9
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 280
    .line 281
    .line 282
    move-result-object v13

    .line 283
    iput-object v13, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    :cond_a
    iget-object v13, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 286
    .line 287
    invoke-virtual {v13, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 288
    .line 289
    .line 290
    iget-object v13, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 291
    .line 292
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 293
    .line 294
    .line 295
    move v5, v10

    .line 296
    move v13, v5

    .line 297
    :goto_3
    iget v14, v0, Lw3/d;->Y:I

    .line 298
    .line 299
    if-ge v5, v14, :cond_c

    .line 300
    .line 301
    invoke-virtual {v11}, LA4/r;->A()I

    .line 302
    .line 303
    .line 304
    move-result v14

    .line 305
    rem-int/lit8 v15, v5, 0x2

    .line 306
    .line 307
    if-nez v15, :cond_b

    .line 308
    .line 309
    iget-object v15, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 310
    .line 311
    sub-int v13, v14, v13

    .line 312
    .line 313
    int-to-short v13, v13

    .line 314
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 315
    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_b
    iget-object v15, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 319
    .line 320
    sub-int v13, v14, v13

    .line 321
    .line 322
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 323
    .line 324
    .line 325
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 326
    .line 327
    move v13, v14

    .line 328
    goto :goto_3

    .line 329
    :cond_c
    iget v5, v0, Lw3/d;->S:I

    .line 330
    .line 331
    sub-int v5, v3, v5

    .line 332
    .line 333
    sub-int/2addr v5, v13

    .line 334
    rem-int/2addr v14, v6

    .line 335
    if-ne v14, v8, :cond_d

    .line 336
    .line 337
    iget-object v13, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 338
    .line 339
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_d
    iget-object v13, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 344
    .line 345
    int-to-short v5, v5

    .line 346
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 347
    .line 348
    .line 349
    iget-object v5, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 350
    .line 351
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 352
    .line 353
    .line 354
    :goto_5
    iget-object v5, v0, Lw3/d;->o:Ljava/nio/ByteBuffer;

    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    iget-object v13, v0, Lw3/d;->m:LA4/r;

    .line 361
    .line 362
    invoke-virtual {v13, v12, v5}, LA4/r;->F(I[B)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v4, v12, v13}, Lq3/u;->b(ILA4/r;)V

    .line 366
    .line 367
    .line 368
    iget v5, v0, Lw3/d;->T:I

    .line 369
    .line 370
    add-int/2addr v5, v12

    .line 371
    iput v5, v0, Lw3/d;->T:I

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_e
    iget-object v5, v2, Lw3/c;->i:[B

    .line 375
    .line 376
    if-eqz v5, :cond_f

    .line 377
    .line 378
    array-length v12, v5

    .line 379
    invoke-virtual {v9, v12, v5}, LA4/r;->F(I[B)V

    .line 380
    .line 381
    .line 382
    :cond_f
    :goto_6
    iget-object v5, v2, Lw3/c;->b:Ljava/lang/String;

    .line 383
    .line 384
    const-string v12, "A_OPUS"

    .line 385
    .line 386
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    if-eqz v5, :cond_10

    .line 391
    .line 392
    move/from16 v5, p4

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_10
    iget v5, v2, Lw3/c;->f:I

    .line 396
    .line 397
    if-lez v5, :cond_11

    .line 398
    .line 399
    move v5, v8

    .line 400
    goto :goto_7

    .line 401
    :cond_11
    move v5, v10

    .line 402
    :goto_7
    if-eqz v5, :cond_12

    .line 403
    .line 404
    iget v5, v0, Lw3/d;->O:I

    .line 405
    .line 406
    const/high16 v12, 0x10000000

    .line 407
    .line 408
    or-int/2addr v5, v12

    .line 409
    iput v5, v0, Lw3/d;->O:I

    .line 410
    .line 411
    iget-object v5, v0, Lw3/d;->n:LA4/r;

    .line 412
    .line 413
    invoke-virtual {v5, v10}, LA4/r;->E(I)V

    .line 414
    .line 415
    .line 416
    iget v5, v9, LA4/r;->b:I

    .line 417
    .line 418
    add-int/2addr v5, v3

    .line 419
    iget v12, v0, Lw3/d;->S:I

    .line 420
    .line 421
    sub-int/2addr v5, v12

    .line 422
    invoke-virtual {v11, v7}, LA4/r;->E(I)V

    .line 423
    .line 424
    .line 425
    iget-object v12, v11, LA4/r;->c:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v12, [B

    .line 428
    .line 429
    shr-int/lit8 v13, v5, 0x18

    .line 430
    .line 431
    and-int/lit16 v13, v13, 0xff

    .line 432
    .line 433
    int-to-byte v13, v13

    .line 434
    aput-byte v13, v12, v10

    .line 435
    .line 436
    shr-int/lit8 v13, v5, 0x10

    .line 437
    .line 438
    and-int/lit16 v13, v13, 0xff

    .line 439
    .line 440
    int-to-byte v13, v13

    .line 441
    aput-byte v13, v12, v8

    .line 442
    .line 443
    shr-int/lit8 v13, v5, 0x8

    .line 444
    .line 445
    and-int/lit16 v13, v13, 0xff

    .line 446
    .line 447
    int-to-byte v13, v13

    .line 448
    aput-byte v13, v12, v6

    .line 449
    .line 450
    and-int/lit16 v5, v5, 0xff

    .line 451
    .line 452
    int-to-byte v5, v5

    .line 453
    const/4 v13, 0x3

    .line 454
    aput-byte v5, v12, v13

    .line 455
    .line 456
    invoke-interface {v4, v7, v11}, Lq3/u;->b(ILA4/r;)V

    .line 457
    .line 458
    .line 459
    iget v5, v0, Lw3/d;->T:I

    .line 460
    .line 461
    add-int/2addr v5, v7

    .line 462
    iput v5, v0, Lw3/d;->T:I

    .line 463
    .line 464
    :cond_12
    iput-boolean v8, v0, Lw3/d;->V:Z

    .line 465
    .line 466
    :cond_13
    iget v5, v9, LA4/r;->b:I

    .line 467
    .line 468
    add-int/2addr v3, v5

    .line 469
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 470
    .line 471
    iget-object v11, v2, Lw3/c;->b:Ljava/lang/String;

    .line 472
    .line 473
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    if-nez v5, :cond_18

    .line 478
    .line 479
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 480
    .line 481
    iget-object v11, v2, Lw3/c;->b:Ljava/lang/String;

    .line 482
    .line 483
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    if-eqz v5, :cond_14

    .line 488
    .line 489
    goto :goto_b

    .line 490
    :cond_14
    iget-object v5, v2, Lw3/c;->T:Lq3/v;

    .line 491
    .line 492
    if-eqz v5, :cond_16

    .line 493
    .line 494
    iget v5, v9, LA4/r;->b:I

    .line 495
    .line 496
    if-nez v5, :cond_15

    .line 497
    .line 498
    goto :goto_8

    .line 499
    :cond_15
    move v8, v10

    .line 500
    :goto_8
    invoke-static {v8}, Ll4/a;->m(Z)V

    .line 501
    .line 502
    .line 503
    iget-object v5, v2, Lw3/c;->T:Lq3/v;

    .line 504
    .line 505
    invoke-virtual {v5, v1}, Lq3/v;->c(Lq3/k;)V

    .line 506
    .line 507
    .line 508
    :cond_16
    :goto_9
    iget v5, v0, Lw3/d;->S:I

    .line 509
    .line 510
    if-ge v5, v3, :cond_1c

    .line 511
    .line 512
    sub-int v5, v3, v5

    .line 513
    .line 514
    invoke-virtual {v9}, LA4/r;->e()I

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-lez v6, :cond_17

    .line 519
    .line 520
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    invoke-interface {v4, v5, v9}, Lq3/u;->c(ILA4/r;)V

    .line 525
    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_17
    invoke-interface {v4, v1, v5, v10}, Lq3/u;->a(Lk4/j;IZ)I

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    :goto_a
    iget v6, v0, Lw3/d;->S:I

    .line 533
    .line 534
    add-int/2addr v6, v5

    .line 535
    iput v6, v0, Lw3/d;->S:I

    .line 536
    .line 537
    iget v6, v0, Lw3/d;->T:I

    .line 538
    .line 539
    add-int/2addr v6, v5

    .line 540
    iput v6, v0, Lw3/d;->T:I

    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_18
    :goto_b
    iget-object v5, v0, Lw3/d;->f:LA4/r;

    .line 544
    .line 545
    iget-object v11, v5, LA4/r;->c:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v11, [B

    .line 548
    .line 549
    aput-byte v10, v11, v10

    .line 550
    .line 551
    aput-byte v10, v11, v8

    .line 552
    .line 553
    aput-byte v10, v11, v6

    .line 554
    .line 555
    iget v6, v2, Lw3/c;->Y:I

    .line 556
    .line 557
    rsub-int/lit8 v8, v6, 0x4

    .line 558
    .line 559
    :goto_c
    iget v12, v0, Lw3/d;->S:I

    .line 560
    .line 561
    if-ge v12, v3, :cond_1c

    .line 562
    .line 563
    iget v12, v0, Lw3/d;->U:I

    .line 564
    .line 565
    if-nez v12, :cond_1a

    .line 566
    .line 567
    invoke-virtual {v9}, LA4/r;->e()I

    .line 568
    .line 569
    .line 570
    move-result v12

    .line 571
    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    .line 572
    .line 573
    .line 574
    move-result v12

    .line 575
    add-int v13, v8, v12

    .line 576
    .line 577
    sub-int v14, v6, v12

    .line 578
    .line 579
    invoke-virtual {v1, v11, v13, v14, v10}, Lq3/g;->e([BIIZ)Z

    .line 580
    .line 581
    .line 582
    if-lez v12, :cond_19

    .line 583
    .line 584
    invoke-virtual {v9, v11, v8, v12}, LA4/r;->h([BII)V

    .line 585
    .line 586
    .line 587
    :cond_19
    iget v12, v0, Lw3/d;->S:I

    .line 588
    .line 589
    add-int/2addr v12, v6

    .line 590
    iput v12, v0, Lw3/d;->S:I

    .line 591
    .line 592
    invoke-virtual {v5, v10}, LA4/r;->H(I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v5}, LA4/r;->A()I

    .line 596
    .line 597
    .line 598
    move-result v12

    .line 599
    iput v12, v0, Lw3/d;->U:I

    .line 600
    .line 601
    iget-object v12, v0, Lw3/d;->e:LA4/r;

    .line 602
    .line 603
    invoke-virtual {v12, v10}, LA4/r;->H(I)V

    .line 604
    .line 605
    .line 606
    invoke-interface {v4, v7, v12}, Lq3/u;->c(ILA4/r;)V

    .line 607
    .line 608
    .line 609
    iget v12, v0, Lw3/d;->T:I

    .line 610
    .line 611
    add-int/2addr v12, v7

    .line 612
    iput v12, v0, Lw3/d;->T:I

    .line 613
    .line 614
    goto :goto_c

    .line 615
    :cond_1a
    invoke-virtual {v9}, LA4/r;->e()I

    .line 616
    .line 617
    .line 618
    move-result v13

    .line 619
    if-lez v13, :cond_1b

    .line 620
    .line 621
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 622
    .line 623
    .line 624
    move-result v12

    .line 625
    invoke-interface {v4, v12, v9}, Lq3/u;->c(ILA4/r;)V

    .line 626
    .line 627
    .line 628
    goto :goto_d

    .line 629
    :cond_1b
    invoke-interface {v4, v1, v12, v10}, Lq3/u;->a(Lk4/j;IZ)I

    .line 630
    .line 631
    .line 632
    move-result v12

    .line 633
    :goto_d
    iget v13, v0, Lw3/d;->S:I

    .line 634
    .line 635
    add-int/2addr v13, v12

    .line 636
    iput v13, v0, Lw3/d;->S:I

    .line 637
    .line 638
    iget v13, v0, Lw3/d;->T:I

    .line 639
    .line 640
    add-int/2addr v13, v12

    .line 641
    iput v13, v0, Lw3/d;->T:I

    .line 642
    .line 643
    iget v13, v0, Lw3/d;->U:I

    .line 644
    .line 645
    sub-int/2addr v13, v12

    .line 646
    iput v13, v0, Lw3/d;->U:I

    .line 647
    .line 648
    goto :goto_c

    .line 649
    :cond_1c
    const-string v1, "A_VORBIS"

    .line 650
    .line 651
    iget-object v2, v2, Lw3/c;->b:Ljava/lang/String;

    .line 652
    .line 653
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-eqz v1, :cond_1d

    .line 658
    .line 659
    iget-object v1, v0, Lw3/d;->h:LA4/r;

    .line 660
    .line 661
    invoke-virtual {v1, v10}, LA4/r;->H(I)V

    .line 662
    .line 663
    .line 664
    invoke-interface {v4, v7, v1}, Lq3/u;->c(ILA4/r;)V

    .line 665
    .line 666
    .line 667
    iget v1, v0, Lw3/d;->T:I

    .line 668
    .line 669
    add-int/2addr v1, v7

    .line 670
    iput v1, v0, Lw3/d;->T:I

    .line 671
    .line 672
    :cond_1d
    iget v1, v0, Lw3/d;->T:I

    .line 673
    .line 674
    invoke-virtual {v0}, Lw3/d;->l()V

    .line 675
    .line 676
    .line 677
    return v1
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
.end method

.method public final o(Lq3/g;[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, Lw3/d;->k:LA4/r;

    .line 4
    .line 5
    iget-object v2, v1, LA4/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, [B

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    const/4 v4, 0x0

    .line 11
    if-ge v3, v0, :cond_0

    .line 12
    .line 13
    add-int v2, v0, p3

    .line 14
    .line 15
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    array-length v3, v2

    .line 20
    invoke-virtual {v1, v3, v2}, LA4/r;->F(I[B)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    array-length v3, p2

    .line 25
    invoke-static {p2, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v2, v1, LA4/r;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, [B

    .line 31
    .line 32
    array-length p2, p2

    .line 33
    invoke-virtual {p1, v2, p2, p3, v4}, Lq3/g;->e([BIIZ)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v4}, LA4/r;->H(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, LA4/r;->G(I)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method
